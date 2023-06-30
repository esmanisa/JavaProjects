package Projects;

public class AracGecisUstunlugu implements Comparable<AracGecisUstunlugu>{
	private String surucu_ad;
	private String arac_turu;
	private int gecis_ustunlugu;
	
	public AracGecisUstunlugu(String surucu_ad, String arac_turu) {
		this.surucu_ad = surucu_ad;
		this.arac_turu = arac_turu;
		
		if(arac_turu.equals("Kargo"))
			this.gecis_ustunlugu = 1;
		else if(arac_turu.equals("Polis"))
			this.gecis_ustunlugu=2;
		else if(arac_turu.equals("Ýtfaiye"))
			this.gecis_ustunlugu=3;
		else if(arac_turu.equals("Ambulans"))
			this.gecis_ustunlugu=4;
		else
			this.gecis_ustunlugu=0;
	}

	@Override
	public int compareTo(AracGecisUstunlugu o) {
		if(this.gecis_ustunlugu<o.gecis_ustunlugu)
			return 2;
		else if(this.gecis_ustunlugu>o.gecis_ustunlugu)
			return -2;
		return 0;
	}

	@Override
	public String toString() {
		
		String aracBilgi="Sürücü adý: "+surucu_ad+"\nAraç türü: "+arac_turu;
		
		return aracBilgi;
	}
	
	
}
