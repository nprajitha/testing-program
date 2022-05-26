package test;


abstract  class phone
{
	 abstract void call();
	void msg()
	{
		System.out.println("message");
	}
	
}
class smartphone extends phone
{

	@Override
	void call() {
		System.out.println("calling smart ");
		
	}
	
}
class tablet extends phone
{

	@Override
	void call() 
	{
		System.out.println("calling tablet ");
	}
	
}
public class Abstractiontest {

	public static void main(String[] args) 
	{
		phone p=new smartphone();
          p.call();
          p.msg();
          
	}

}
