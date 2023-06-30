package ornekler;

import java.io.*;

public class Yazdir {

	public static void main(String[] args) throws IOException {
		
		/*File f=new File("sayi.txt");
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("sayi.txt"));
		
		if(!f.exists())
			f.createNewFile();
		
		for(int i=0; i<101;i+=2)
		{
			bw.write(i+"\n");
		}
		bw.close();*/
		
		BufferedReader br=new BufferedReader(new FileReader("sayi.txt"));
		
		String line;
		while((line = br.readLine())!=null)
		{
			System.out.println(line);
		}
		br.close();
	}

}
