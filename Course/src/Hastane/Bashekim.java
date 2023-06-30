package Hastane;

public class Bashekim extends Isgucu{

	private String unvan;
	private String uzmanlik_alani;
	private int hizmet_suresi;
	
	
	public Bashekim(String ad, String soyad, int i, String unvan, String uzmanlik_alani, int hizmet_suresi) {
		super(ad, soyad, i);
		this.unvan=unvan;
		this.uzmanlik_alani=uzmanlik_alani;
		this.hizmet_suresi=hizmet_suresi;
	}
	
	void calis() throws InterruptedException
	{
		String a1="Ba�hekim "+getAd()+" doktorlar�n y�ll�k izinlerini denetliyor...";
		Thread.sleep(3000);
		String a2="Ba�hekim "+getAd()+"laboratuvar hizmetlerini denetliyor...";
		Thread.sleep(3000);
		System.out.println(a1);
		System.out.println(a2);
		
	}

	@Override
	void yaka_kart�_oku() {
		super.yaka_kart�_oku();
		System.out.println("Unvan: "+unvan);
		System.out.println("Uzmanl�k Alan�: "+uzmanlik_alani);
		System.out.println("Hizmet S�resi: "+hizmet_suresi);
	}
	
	
}
