package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class exmple {

	public static void main(String[] args) throws IOException 
	{
     FileReader fr= new FileReader("C:\\Users\\vamsiraji\\eclipse-workspace1\\Examples\\reversefile.txt");
         BufferedReader br=new BufferedReader(fr);
         String str;
         while((str=br.readLine())!=null)
         {
        	 System.out.println(str);
         }
         StringBuffer sb=new StringBuffer(str);
          sb =sb.reverse();
          String s=sb.toString();
          PrintWriter pw =new PrintWriter("rr.txt");
          pw.println(s);
          pw.close();
		
          
         
	}

}
