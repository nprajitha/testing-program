package test;

public class Stacktest 
{
	int size;
	int []a;
	int top;
	public Stacktest(int s)
	{
		size=s;
		a=new int [size];
		top=-1;
	}
	public boolean isFull()
	{
		return top==size-1;
		
	}
    public boolean isEmpty()
    {
		return top==-1;
    	
    }
    public int peek()
    {
    	return a[top];
    }
    public void push(int item)
    {
    	if(isFull())
    	{
    		System.out.println("elments can't be  insert");
    	}
    	else
    	{
    		top++;
    		a[top]=item;
    		System.out.println("elments can insert");
    	}
    }
    public void pop()
    {
    	if(isEmpty())
    	{
    		System.out.println(" no elments left in stack");
    	}
    	else {
    		top--;
    	}
    }
    
    public void Dispaly()
    {
    	while(top>-1)
    	{
    		System.out.println(a[top]);
    		top--;
    	}
    }
    
	public static void main(String[] args) 
	{
		Stacktest st=new Stacktest(5);
		st.push(34);
		st.push(30);
		st.push(94);
		st.push(78);
		st.push(3);
		st.Dispaly();

	}

}
