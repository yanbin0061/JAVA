package day23;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.junit.Test;

public class TestFile {
	@Test
	public void test3() throws IOException{
		File file1 = new File("hello1.txt");
		System.out.println(file1.exists());
		if (!file1.exists()) {
			boolean b = file1.createNewFile();
			System.out.println(b);
		}
		File file = new File("X:\\taotaoProgram");
		String[] strs = file.list();
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		System.out.println();
		File[] files = file.listFiles();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
	}
	//@Test
	public void test2(){
		//具体的文件，绝对路径
		File file = new File("X:\\taotaoProgram\\javaTest\\2016year12math23\\helloWord.txt");
	    //具体的文件，相对路径
		File file1 = new File("hello.txt");
		System.err.println(file1.exists());
		System.err.println(file1.canWrite());
		System.err.println(file1.canRead());
		System.err.println(file1.isFile());
		System.err.println(file1.isDirectory());
		System.err.println(new Date(file1.lastModified()));
		System.err.println(file1.length());
	}
	//@Test
	public void test1(){
		//具体的文件，绝对路径
		File file = new File("X:\\taotaoProgram\\javaTest\\2016year12math23\\helloWord.txt");
	    //具体的文件，相对路径
		File file1 = new File("hello.txt");
		//文件夹，绝对路径
		File file2 = new File("X:\\taotaoProgram\\javaTest\\2016year12math23\\hello");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.err.println(file.getAbsolutePath());
		System.err.println(file.getParent());
		System.err.println(file.getAbsoluteFile());
		System.err.println();
		System.out.println(file2.getName());
		System.out.println(file2.getPath());
		System.err.println(file2.getAbsolutePath());
		System.err.println(file2.getParent());
		System.err.println(file2.getAbsoluteFile());
	}
}
