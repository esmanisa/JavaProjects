package GirisCikis;

import java.io.*;

public class BufferedWriterExample {

	public static void main(String[] args) {
		try (BufferedWriter bw=new BufferedWriter(new FileWriter("data.txt"))){
			bw.write("Ger�e�i s�ylemekten korkmay�n�z.");
			
		} catch (IOException e) {
			System.out.println("Bir hata olu�tu..");
		}

	}

}
