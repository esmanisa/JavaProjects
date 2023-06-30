package Ornek2;

public class AnaSayfa {

	public static void main(String[] args) {

		Thread th1=new Thread(new ThreadOrnek2(61));
		Thread th2=new Thread(new ThreadOrnek2(61));
		
		th1.start();
		th2.start(); //multithreading
		
	}

}
