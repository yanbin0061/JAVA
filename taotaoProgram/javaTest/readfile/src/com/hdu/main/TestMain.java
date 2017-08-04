package com.hdu.main;

import com.hdu.utils.Readfile;

public class TestMain {

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		String namefile = "X:\\taotaoProgram\\javaTest\\readfile\\case0.txt";
		int index = 2000;
		Readfile.readFileByLine(index, namefile);
	}

}
