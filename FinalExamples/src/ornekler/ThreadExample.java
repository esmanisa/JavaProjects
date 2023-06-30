package ornekler;

public class ThreadExample {

	public static void main(String[] args)
	{
		Gorevli g1=new Gorevli("G�revli-A");
		Gorevli g2=new Gorevli("G�revli-B");
		
		g1.start();
		g2.start();
		System.out.println("�� par�ac�klar� �al��maya ba�lad�.");
	}
}

class Gorevli extends Thread {
	public String isim;
	public Gorevli(String isim)
	{
		this.isim = isim;
	}
	@Override
	public void run() {
		super.run();
		
		for(int i=0;i<3;i++)
		{
			System.out.println(isim+" -->"+i+" �al���yor.");
			
		}
	}
}
