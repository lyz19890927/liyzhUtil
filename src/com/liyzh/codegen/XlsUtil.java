/**
 * Copyright (c) 2014
 * Tanry Electronic Technology Co., Ltd.
 * ChangSha, China
 * 
 * All Rights Reserved.
 * 
 * First created on Sep 15, 2014 by liyzh
 * Last edited on Sep 15, 2014 by liyzh
 * 
 * 说明： TODO
 */
package com.liyzh.codegen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.liyzh.excel.ExcelOperate;
import com.liyzh.java.regex.Snake2Camel;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class XlsUtil {

	static String parent = "F:/Personal/ws_util/liyzhUtil/web/codegen/";
	static String tpath = parent + "template";
	static String mpath = parent + "model";
	static String currentModelPath;
	static Configuration cfg;
	static Map<String, Object> model;

	public static void main(String[] args) throws Exception {

		/* 一般在应用的整个生命周期中你仅需要执行一下代码一次 */
		/* 创建一个合适的configuration */
		cfg = new Configuration();

		// 设置模板加载的方式
		cfg.setDirectoryForTemplateLoading(new File(tpath));

		/* 创建一个数据模型Create a data model */
		model = new HashMap<String, Object>();

		File mdir = new File(mpath);
		if (mdir.isDirectory()) {
			String[] dirs = mdir.list();
			for (String dir : dirs) {
				processModel(mpath + "/" + dir);
			}
		}

	}

	public static void processModel(String path) throws FileNotFoundException,
			IOException, TemplateException {
		currentModelPath = path;
		File file = new File(path, "col.xls");
		List<Map<String, String>> colLst = processCol(file);
		model.put("colLst", colLst);

		model = JsonConfig.fillModel(path + "/" + "config.json", model);

		/* 而以下代码你通常会在一个应用生命周期中执行多次 */
		/* 获取或创建一个模版 */
		File tdir = new File(tpath);
		if (tdir.isDirectory()) {
			String[] files = tdir.list();
			for (String fileName : files) {
				processTemplate(fileName);
			}
		}
	}

	/**
	 * @param file
	 * @throws IOException 
	 * @throws TemplateException 
	 */
	private static void processTemplate(String fileName) throws IOException,
			TemplateException {
		String outfileName = processForOutputFilepath(model, fileName, cfg);
		Template temp = cfg.getTemplate(fileName);

		/* 合并数据模型和模版 */
		String gdir = currentModelPath + "/generate";
		new File(gdir).mkdir();
		FileOutputStream fos = new FileOutputStream(new File(gdir, outfileName));
		Writer out = new OutputStreamWriter(fos);
		temp.process(model, out);
		out.flush();
	}

	/** 处理文件路径的变量变成输出路径 */
	public static String processForOutputFilepath(
			Map<String, Object> filePathModel, String templateFile,
			Configuration conf) throws IOException {
		return FreemarkerHelper.processTemplateString(templateFile,
				filePathModel, conf);
	}

	public static List<Map<String, String>> processCol(File file)
			throws FileNotFoundException, IOException {
		String[][] result = ExcelOperate.getData(file, 0);

		int rowLength = result.length;
		List<Map<String, String>> colLst = new ArrayList<Map<String, String>>();
		for (int i = 1; i < rowLength; i++) {
			String snake = result[i][0];
			String lcamel = Snake2Camel.snakeToLowerCamel(snake);
			String ucamel = Snake2Camel.snakeToUpperCamel(snake);
			Map<String, String> col = new HashMap<String, String>();
			col.put("lcamel", lcamel);
			col.put("ucamel", ucamel);
			col.put("type", result[i][1]);
			colLst.add(col);
		}
		return colLst;
	}
}