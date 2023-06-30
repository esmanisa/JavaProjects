package GirisCikis;

import java.io.*;

public class OutputStreamExample {

	public static void main(String[] args) throws IOException{
		
		File file=new File("veri1.txt");
		file.createNewFile();
		
		PrintStream pts=new PrintStream("veri1.txt");
		
		String x="PrintStream, OutputStream soyut s�n�f�n�n bir alt s�n�f�d�r.";
		pts.print(x);
		
		pts.close();
		
		File f=new File("veri2.txt");
		f.createNewFile();
		
		FileOutputStream fos=new FileOutputStream(f);
		
		String str="Input-Output";
		
		byte [] str2=str.getBytes();
		
		for(int i=0;i<str2.length;i++) {
			fos.write(str2[i]);
		}
		
		int okunan_byte;
		String str3="";
		
		FileInputStream fis=new FileInputStream("veri2.txt");
		
		while((okunan_byte=fis.read())!=-1)
		{
			str3+=(char)okunan_byte;
		}
		System.out.println(str3);
	}

}
