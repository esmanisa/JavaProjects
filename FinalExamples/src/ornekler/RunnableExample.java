package ornekler;

class OgretimUyesi implements Runnable{

	public String isim;
	
	public OgretimUyesi(String isim) {
		this.isim = isim;
	}
	
	@Override
	public void run() {

		try {
			for(int i=0;i<5;i++)
			{
				System.out.println("Profes�r ders anlatiyor. "+i);
			}
		} catch (Exception e) {
			System.out.println("Bir hata olu�tu"+e);
		}
	}
}

class Profesor extends OgretimUyesi
{

	public Profesor(String isim) {
		super(isim);
	}
	
	void ders() {
		System.out.println(isim+" g�revinin ba��nda.");
	}
	
}

public class RunnableExample {
	public static void main(String[] args)
	{
		Profesor p1=new Profesor("Can");
		Thread t1=new Thread(p1);
		t1.start();
		p1.ders();
		
	}
}
