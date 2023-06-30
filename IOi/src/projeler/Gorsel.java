package projeler;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Gorsel {
	static LinkedList <Integer> alinan_byte=new LinkedList<>();
	
	static void read() {
		int alinan_byte2;
		try (FileInputStream fis=new FileInputStream("sky.jpg")){
			while((alinan_byte2=fis.read()) !=-1)
			{
				alinan_byte.add(alinan_byte2);
			}
			
			
		} catch (IOException e) {
			System.out.println("Dosya okunurken bir hata oluþtu."+e);
		}
	}
	
	static void copy(String isim)
	{
		try (FileOutputStream fos=new FileOutputStream(isim)){
			for( int alinanByte: alinan_byte)
			{
				fos.write(alinanByte);

			}
		} catch (FileNotFoundException e) {
			System.out.println("Kopyalama sýrasýnda bir hata oluþtu."+e);
		} catch (IOException e1) {
			System.out.println("Kopyalama sýrasýnda bir hata oluþtu."+e1);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Kopyalayacaðýnýz görselin adý: ");
		String dosya_adi=scanner.nextLine();
		
		String dosya_yolu = "C:\\Users\\user\\Documents";
		dosya_adi += ".jpg";
		
		dosya_yolu+=dosya_adi;
		
		read();
		copy(dosya_yolu);
		
		System.out.println("Görsel baþarý ile kopyalandý.");
	}
}
