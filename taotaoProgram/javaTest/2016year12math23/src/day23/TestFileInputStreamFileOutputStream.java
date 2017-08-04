package day23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class TestFileInputStreamFileOutputStream {
	@Test
	//�ļ����
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
				//����һ
				//i<len,����ʹ��bs.length
//				for (int i = 0; i < len; i++) {
//					System.out.print((char)bs[i]);
//				}
				//������
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
	//ʹ��try-catch�ķ�ʽ��������쳣��������֤���Ĺرղ���һ������ִ��
	//@Test
	public void testFileInputStream1(){
		//2. ����һ��FileInputStream����
		FileInputStream fis = null;
		try {
			//1. ����һ��File����
			File file = new File("hello.txt");
			fis = new FileInputStream(file);
			//3. ����FileInputStream��������ȡfile�ļ�������
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
	
	//��Ӳ�̴��ڵ�һ���ļ��У���ȡ�����ݵ�����ʹ��FileInputStream
	//@Test
	public void testFileInputStream() throws IOException{
		//1. ����һ��File����
		File file = new File("hello.txt");
		//2. ����һ��FileInputStream����
		FileInputStream fis = new FileInputStream(file);
		//3. ����FileInputStream��������ȡfile�ļ�������
		int b = fis.read();
		while (b!=-1) {
			System.out.print((char)b);
			b = fis.read();
			
		}
		fis.close();
	}
}
