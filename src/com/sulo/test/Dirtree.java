package com.sulo.test;

import java.io.File;

public class Dirtree {
	public static void main(String[] args) {
		File file = new File("d:/");
		getDirTree(file,1);
	}

	private static void getDirTree(File file, int level) {
		String preStr = "";
		for (int i = 0; i < level; i++) {
			preStr += "-";
		}
		if(file.isDirectory()){
			System.out.println(preStr+file.getName());
			File[] files = file.listFiles();
			if(files!=null){
				for (File file2 : files) {
					getDirTree(file2, level++);
				}
			}
		}
		if(file.isFile()){
			//System.out.println(file.getName());
		}
	}
}
