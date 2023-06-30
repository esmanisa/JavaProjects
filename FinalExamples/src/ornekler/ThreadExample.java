package ornekler;

public class ThreadExample {

	public static void main(String[] args)
	{
		Gorevli g1=new Gorevli("Görevli-A");
		Gorevli g2=new Gorevli("Görevli-B");
		
		g1.start();
		g2.start();
		System.out.println("Ýþ parçacýklarý çalýþmaya baþladý.");
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
			System.out.println(isim+" -->"+i+" çalýþýyor.");
			
		}
	}
}
