package test;

public class ThreadWithInterface implements Runnable {
	@Override
	public void run() {
		System.out.println("thread"+this.hashCode());
	}

	public static void main(String[] args) 
	{
		ThreadWithInterface t1=new ThreadWithInterface ();
		Thread t2=new Thread(t1);
		t2.start();

	}

	

}
