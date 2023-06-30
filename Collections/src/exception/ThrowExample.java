package exception;

public class ThrowExample {
	public static void main(String[] args)
	{
		//throw new ArrayIndexOutOfBoundsException();
		try {
			islem_yap();
		} catch (Exception e) {
			System.out.println("Programda hata oluþtu "+e);
		}
	}
	static void islem_yap() throws InterruptedException
	{
		System.out.println("...");
		throw new InterruptedException();
	}
}
