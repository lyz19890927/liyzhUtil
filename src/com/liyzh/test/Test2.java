package com.liyzh.test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		String a = "4028802f0cd33740010cd7555e7b0008, 4028802f0fc6ac91010fc6dd88280001, 40288096142c06d001142c1d6bdf0004, 4028803c0da5d3c9010da5d9a8600005, 4028803c0da5d3c9010da5db28490006, 4028802f0f9890fa010f98f33b54000a, 4028802f101ed88501101f6212ce005e, 402881f935606a4801356070796c000a, 40288093269ba8e101269bce86970008, 402880a318cf2c7b0118cf393a750002, 40288093269ba8e101269bd25552000b, 40288093269ba8e101269bd09a63000a, 402880a61896aaec011896bcc39d000b, 402881f935606a480135607079620008, 4028802f0cd33740010cd753c4b10006, 4028802f0cd33740010cd7611c96001c, 4028802f105c386301105c4244ee0001, 402880962717aa45012718d4f3f9000a, 4028802f0e0c6af6010e0d0ab6840023, 402881e639d7f7cc0139d7f96f520002, 402880a318e431b50118e43944820002, 402881f935606a480135607079580007, 4028802f0cd33740010cd7611c96000b, 40288096142c06d001142c1cd7500003, 402880a0163c4b2d01163c5ef7b60055, 4028802f0fc2f08a010fc2f453ee0001, 402880992a6422db012a643d7579000f, 402881e4276267b10127626cce990005, 402880a318dedb580118deec491a0006, 4028805e284202d5012842074cb00003, 4028802f0e0c6af6010e0d0ab6840010, 4028803c0e87d8fd010e87e1de170001, 4028803c0e87d8fd010e87e1de170004, 402880a318cf2c7b0118cf37f2e20001, 4028802f0cd33740010cd758c0920009, 402881e4276267b10127626c6d010004, 4028ff813a9048e9013a9050e9c6000a, 402881f935606a4801356070796c0009, 4028802f0fc6f5ab010fc7164231000c, 40288082199e11e601199e3512460073, 40280962377ce3f801377cf585d5000f, admin, 4028802f0cd33740010cd74e9e360003, 40288096142c06d001142c1e38370005, 4028ff813a9048e9013a904fb0250009, 402881e4276267b10127626d27c50006, 402881e4276267b10127626ad77c0003, 4028802f10145bba0110145e2f820001, 402881f935606a480135607079440006, 4028802f0cd33740010cd7603c38000a";
		String[] lstA = a.split(",");
		String b = "40280962377ce3f801377cfa38b70017, 4028802f0cd33740010cd7555e7b0008, 4028802f0fc6ac91010fc6dd88280001, 40288096142c06d001142c1d6bdf0004, 4028803c0da5d3c9010da5d9a8600005, 4028803c0da5d3c9010da5db28490006, 402881f83782bfa0013783056f62002c, 40280962377ce3f801377cf60f390010, 4028802f101ed88501101f6212ce005e, 4028802f0f9890fa010f98f33b54000a, 8a1da118395bc6db0139716c55960079, 8a1da118395bc6db01397160f4fd0075, 402881f935606a4801356070796c000a, 40288093269ba8e101269bce86970008, 402880a318cf2c7b0118cf393a750002, 40288093269ba8e101269bd25552000b, 402881f83782bfa001378300c3280020, 402880a61896aaec011896bcc39d000b, 8a1da118395bc6db01396b1ff47f004f, 40288093269ba8e101269bd09a63000a, 402881f935606a480135607079620008, 402809cf397022d501397065d6050004, 4028802f0cd33740010cd753c4b10006, 402881f83782bfa0013782fa12f00019, 4028802f0cd33740010cd7611c96001c, 4028802f105c386301105c4244ee0001, 402809cf397022d501397067a4c70005, 8a1da1af3aaa3bcc013aaa510fe80003, 402880962717aa45012718d4f3f9000a, 4028802f0e0c6af6010e0d0ab6840023, 40280962377ce3f801377cf54c66000e, 8a1da118395bc6db0139716c2ef30078, 40280962377ce3f801377cf70c850013, 402881e639d7f7cc0139d7f96f520002, 402881f935606a480135607079580007, 402880a318e431b50118e43944820002, 40280962377ce3f801377cfa05d00016, 4028802f0cd33740010cd7611c96000b, 402880a0163c4b2d01163c5ef7b60055, 40288096142c06d001142c1cd7500003, 402881e4276267b10127626cce990005, 402880992a6422db012a643d7579000f, 4028802f0fc2f08a010fc2f453ee0001, 8a1da11839c2cf3c0139c3c5ca5c0007, 402881e7377e1d6801377e1fc2430005, 4028805e284202d5012842074cb00003, 402881f83782bfa0013783091eed0030, 402880a318dedb580118deec491a0006, 40280962377ce3f801377cf50403000d, 8a1da118395bc6db013971612e7c0076, 4028802f0e0c6af6010e0d0ab6840010, 4028803c0e87d8fd010e87e1de170001, 402880a318cf2c7b0118cf37f2e20001, 4028803c0e87d8fd010e87e1de170004, 402881e4276267b10127626c6d010004, 4028802f0cd33740010cd758c0920009, 4028ff813a9048e9013a9050e9c6000a, 402881f935606a4801356070796c0009, 8a1da11839c2cf3c0139cdb3fcaa0018, 4028802f0fc6f5ab010fc7164231000c, 40288082199e11e601199e3512460073, 40280962377ce3f801377cf6b5f90012, 40280962377ce3f801377cf585d5000f, 40280962377ce3f801377cfc4dbc0019, 4028802f0cd33740010cd74e9e360003, 402881f83782bfa001378305a150002d, 4028ff813a9048e9013a904fb0250009, 40288096142c06d001142c1e38370005, 402881e4276267b10127626d27c50006, 4028802f10145bba0110145e2f820001, 402881e4276267b10127626ad77c0003, 402881f83782bfa001378308e57e002f, 402881f935606a480135607079440006, 4028802f0cd33740010cd7603c38000a";
		String[] lstB = b.split(",");
		List<String> lista = new ArrayList<String>();
		for (String s : lstB) {
			if (Test2.contains(lstA, s)) {
				System.out.println(s);
			} else {
				lista.add(s);
			}
		}
		System.out.println();
		System.out.println(lista);
	}

	public static boolean contains(String[] arr, String str) {
		for (String s : arr) {
			if (s.equals(str)) {
				return true;
			}
		}
		return false;
	}
}
