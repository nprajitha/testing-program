package test;
// using extending thread class
public class Threadexample extends Thread{
	public void run() { //running
		System.out.println("threading is running");
	}//dead 

	public static void main(String[] args)
	{
		Threadexample t=new Threadexample();//newborn
		 t.start();//runnable
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("completed");
          
	}

}
