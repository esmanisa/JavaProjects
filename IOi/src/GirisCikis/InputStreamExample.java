package GirisCikis;

//https://docs.oracle.com/javase/7/docs/api/java/io/package-summary.html

import java.io.*;

public class InputStreamExample {
	public static void main(String[] args) throws FileNotFoundException {
		int okunan_byte;
		String str = "";
	
		try (FileInputStream fis=new FileInputStream("veri.txt");){
			do {
				okunan_byte=fis.read();
				
				if(okunan_byte!=-1) {
					str+=(char)okunan_byte;
					System.out.println(str);
				}
				
			} while (okunan_byte!=-1);
			
			fis.close();
			
		} catch (FileNotFoundException ex) {
			System.out.println("Dosya okuma sýrasýnda bir hata oluþtu.");
		}catch (IOException ex) {
			System.out.println("Dosya okuma sýrasýnda bir hata oluþtu.");
		}
	}
}
