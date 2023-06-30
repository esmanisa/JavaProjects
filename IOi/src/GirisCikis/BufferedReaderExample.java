package GirisCikis;

import java.io.*;

public class BufferedReaderExample{
	public static void main(String[] argv)  throws IOException{
		File f=new File("Data.txt");
		f.createNewFile();
		FileOutputStream fos=new FileOutputStream(f);
		String str="Kotlin, Java sanal makinesini kullanýr.\n"
				+ "Java Sanal Makinasý\n";
		
		byte[] str2=str.getBytes();
		for(int i=0; i<str2.length;i++)
		{
			fos.write(str2[i]);
		}
		
		FileReader fr=new FileReader("Data.txt");
		BufferedReader br=new BufferedReader(fr);
		String str3=null;
		
		while((str3=br.readLine())!=null)
		{
			System.out.println(str3);
		}
	}
}
