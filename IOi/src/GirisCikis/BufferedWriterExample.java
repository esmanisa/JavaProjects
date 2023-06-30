package GirisCikis;

import java.io.*;

public class BufferedWriterExample {

	public static void main(String[] args) {
		try (BufferedWriter bw=new BufferedWriter(new FileWriter("data.txt"))){
			bw.write("Gerçeði söylemekten korkmayýnýz.");
			
		} catch (IOException e) {
			System.out.println("Bir hata oluþtu..");
		}

	}

}
