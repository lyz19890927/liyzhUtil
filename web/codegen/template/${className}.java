/**
 * Copyright (c) 2014
 * Tanry Electronic Technology Co., Ltd.
 * ChangSha, China
 * 
 * All Rights Reserved.
 * 
 * First created on ${date} by ${author}
 * Last edited on ${date} by ${author}
 * 
 * 说明：${comment}
 */
package pojo.${package};

public class ${className} {	
	<#list colLst as col>
	/**
	 * ${col.name}
	 */
	private ${col.type} ${col.lcamel};
	</#list>

	<#list colLst as col>
	public ${col.type} get${col.ucamel}() {
		return this.${col.lcamel};
	}

	public void set${col.ucamel}(${col.type} ${col.lcamel}) {
		this.${col.lcamel} = ${col.lcamel};
	}

	</#list>
}