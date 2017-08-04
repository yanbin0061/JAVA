package com.hdu.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Readfile {
	public static void readFileByLine(int index ,String finame){
		File file = new File(finame);
		BufferedReader reader = null;
		int[] arrays = new int[index];
		StringBuffer stringBuffer = new StringBuffer();
		try {
			reader = new BufferedReader(new FileReader(file));
			String tempStr = null;
			int line = 1;
			
 			while((tempStr=reader.readLine())!=null){
				System.out.println(tempStr);
				stringBuffer.append(tempStr).append(" ");
			}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String strs = stringBuffer.toString();
		System.out.println(strs);
		String[] ss = strs.split(" ");
		for (int i = 0; i < ss.length; i++) {
			arrays[i]= Integer.parseInt(ss[i]);
		}
		System.out.println(Arrays.toString(ss));
		System.out.println(Arrays.toString(arrays));
	}
	
}
