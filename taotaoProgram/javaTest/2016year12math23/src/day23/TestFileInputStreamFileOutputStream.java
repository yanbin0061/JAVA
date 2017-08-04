package day23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class TestFileInputStreamFileOutputStream {
	@Test
	//文件输出
	public void testFileOutputStream(){
		File file = new File("hello.txt");
		System.out.println(file.exists());
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			fos.write(new String("I love my school!").getBytes());
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if (fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	//@Test
	public void testFileInputStream2(){
		FileInputStream fis = null;
		try {
			File file = new File("hello.txt");
			fis = new FileInputStream(file);
			byte[] bs = new byte[5];
			int len;
			while((len = fis.read(bs))!=-1){
				//方法一
				//i<len,不能使用bs.length
//				for (int i = 0; i < len; i++) {
//					System.out.print((char)bs[i]);
//				}
				//方法二
				String strs = new String(bs, 0, len);
				System.out.print(strs);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	//使用try-catch的方式处理如此异常更合理：保证流的关闭操作一定可以执行
	//@Test
	public void testFileInputStream1(){
		//2. 穿件一个FileInputStream对象
		FileInputStream fis = null;
		try {
			//1. 创建一个File对象
			File file = new File("hello.txt");
			fis = new FileInputStream(file);
			//3. 调用FileInputStream方法，读取file文件的内容
			int b ;
			while ((b = fis.read())!=-1) {
				System.out.print((char)b);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//从硬盘存在的一个文件中，读取其内容到程序，使用FileInputStream
	//@Test
	public void testFileInputStream() throws IOException{
		//1. 创建一个File对象
		File file = new File("hello.txt");
		//2. 穿件一个FileInputStream对象
		FileInputStream fis = new FileInputStream(file);
		//3. 调用FileInputStream方法，读取file文件的内容
		int b = fis.read();
		while (b!=-1) {
			System.out.print((char)b);
			b = fis.read();
			
		}
		fis.close();
	}
}
