package thread306.day01;
/**
 * 创建多线程的方法有两种:
 * 1)通过继承Thread的类来实现多线程
 *      1.创建一个子类继承Thread类
 *      2.重写run方法
 *      3.创建子类的一个对象
 *      4.调用start方法
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