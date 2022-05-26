package test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OutputStreamtest {

	public static void main(String[] args) throws IOException 
	{
		File f=new File("reversefile.txt");
		  f.createNewFile();
		 PrintWriter pw =new PrintWriter("reversefile.txt") ;
		 pw.write("hello world");
		 pw.flush();
		 pw.close();
		 
		 
		  
	}

}

