package exception;

public class Hata3 {

	public static void main(String[] args) {
		try {
			int x=12;
			int y=2;
			String c=null;
			
			System.out.println("x/y: "+(x/y));
			System.out.println("Str boyut "+c.length());
		}catch (Exception e) {
			System.out.println("Bir hata oluþtu.");
		} finally {
			System.out.println("Always run this row.");
		}

	}

}
