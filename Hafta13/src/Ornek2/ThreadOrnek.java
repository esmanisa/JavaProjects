package Ornek2;

public class ThreadOrnek extends Thread{
	
	public ThreadOrnek()
	{
		System.out.println(this.getName()+" oluþturuldu.");
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(this.getName()+" yazdýrýlan: "+i);
		}
	}
	
	
	
}
