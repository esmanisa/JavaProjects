package GirisCikis;

import java.io.*;

public class ReaderExample {
	public static void main(String[] args) throws IOException{
		
		File f=new File("tarih.txt");
		
		f.createNewFile();
		
		FileOutputStream fos=new FileOutputStream(f);
		String str="Bilgisayarlar tarih boyunca çok farklý biçimlerde karþýmýza çýkmýþlardýr.\n";
		
		byte [] str2=str.getBytes();
		
		for(int i=0;i<str2.length;i++)
		{
			fos.write(str2[i]);
		}
		
		FileReader fr=new FileReader("tarih.txt");
		
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}
}
