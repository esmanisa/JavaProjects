package GirisCikis;

import java.io.*;

public class FileRederExample {
	public static void main(String[] args) throws IOException{
		FileReader fr=new FileReader("tarih.txt");
		LineNumberReader lnr=new LineNumberReader(fr);
		String str;
		int a;
		
		while ((str=lnr.readLine())!=null) {
			a=lnr.getLineNumber();
			System.out.print(a+". satýr ");
			System.out.println(str);
		}
		fr.close();
		lnr.close();
	}
}
