package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class testing {

	public static void main(String[] args) throws IOException {
		
		Reader f=new FileReader("C:\\Users\\vamsiraji\\eclipse-workspace1\\Examples\\rr.txt");
		//Scanner in=new Scanner(f);
		BufferedReader br=new BufferedReader(f);
		//PrintWriter pw =new PrintWriter("pp.txt");
		ArrayList list = new ArrayList();
		String line;
		while((line=br.readLine())!=null)
		{
			list.add(line);
		}
		f.close();
		Collections.reverse(list);
		PrintWriter pw =new PrintWriter("pp.txt");
		Iterator it =list.iterator();
		while(it.hasNext());
		{
			pw.println((String)it.next());
		}
		pw.close();
		System.out.println("file copied");
	}

}
