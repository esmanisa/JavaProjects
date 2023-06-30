package exception;

public class CokluHata {
	public static void main(String[] args)
	{
		try {
			byte bArray[]=new byte[3];
			//bArray[5]=10;
			//bArray[2]=(byte)(50/0);
			String str=null;
			System.out.println("String boyut: "+str.length());
			
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dizinin boyutunu aþtýnýz.");
		}catch (ArithmeticException e) {
			System.out.println("Tanýmsýz ifade");
		}
		catch (Exception e) {
			System.out.println("Programda bir hata oluþtu.");
		}
	}
}
