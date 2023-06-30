package ornekler;

public class Cikti {

	public static void main(String[] args) {

		int sayac=1;
		for(;;)
		{
			System.out.println("D, ");
			try {
				System.out.println("F, ");
				if(sayac==1)
					break;
			}catch (Exception e) {
				System.out.println("J, ");
			} finally {
				System.out.println("K, ");
			}
			System.out.println("N, ");
		}
		System.out.println("P, ");
	}

}
