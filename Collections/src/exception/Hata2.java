package exception_generics;

public class Hata2 {

	public static void main(String[] args) {

		try {
			int x[]=new int[3];
			x[0]=1;
			x[1]=2;
			x[2]=3;
			
			System.out.println("^. index: "+x[3]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dizinin boyutunu aþtýnýz..");
		}
		
		try {
			int a=7/0;
			String b=null;
			System.out.println("Stringin boyutu: "+b.length());
		} catch (Exception e) {
			System.out.println("Çalýþma sýrasýnda bir hata oluþtu.");
			e.printStackTrace();
		}
	}

}
