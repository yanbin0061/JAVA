package thread306.day01;

class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=100;i++){
			if (i%2==0) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
}
class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=100;i++){
			if (i%2!=0) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
}
public class MyThread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		thread1.start();
		thread2.start();
		new Thread(){
			public void run() {
				for(int i=0;i<=100;i++){
					System.out.println(Thread.currentThread().getName()+"**"+i);
				}
			};
		}.start();

	}

}
