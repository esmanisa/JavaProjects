package yeni;

public class Hesaplama {
	public class Toplama { //Dahili uye sinif
		public int toplamaYap(int a, int b) {
		return a+b ;
	}
} // end of class Toplama
	public static void main(String args[]) {
		Hesaplama.Toplama ht = new Hesaplama().new Toplama() ;
		int sonuc = ht.toplamaYap(3,5);
		System.out.println("Sonuc = " + sonuc );
	}
} // end of class Hesapla
