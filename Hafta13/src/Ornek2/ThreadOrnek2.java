package Ornek2;

public class ThreadOrnek2 implements Runnable{

	public int sayi;
	
	
	
	public ThreadOrnek2(int sayi) {
		super();
		this.sayi = sayi;
	}



	@Override
	public void run() {
		
		int syc=0, tahmin;
		synchronized (Thread.class) { // b�yle yaparsak multithreadingin bir anlam� kalmaz hepdi ayn� anda �al���r.
			do {
				tahmin = (int)(Math.random()*100+1);
				syc++;
				System.out.println(Thread.currentThread().getName()+" Tahmin: "+tahmin);
				
			} while (sayi!=tahmin);
			
			System.out.println(Thread.currentThread().getName()+" do�ru tahmin etti. Deneme say�s�: "+syc);
		}
	}
			
}
		