package thread306.day01;
/**
 * �������̵߳ķ���������:
 * 1)ͨ���̳�Thread������ʵ�ֶ��߳�
 *      1.����һ������̳�Thread��
 *      2.��дrun����
 *      3.���������һ������
 *      4.����start����
 * 2)
 * @author Administrator
 *
 */
class TestThread1 extends Thread {
	public void run(){
		for(int i=1;i<=100;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
public class MyThread1{
	public static void main(String[] args){
		TestThread1 thread1 = new TestThread1();
		thread1.start();
		for(int i=1;i<=100;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}