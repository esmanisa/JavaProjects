package quiz;

public class Isci extends Calisan implements Maas{

	public String gorev;
	
	public Isci(String ad, String soyad, int yas, int cs) {
		super(ad, soyad, yas, cs);
		this.gorev = "���i";
	}
	
	@Override
	public double ZamOraniHesapla() {
		double zam_oran = ((cs*100) + (2*this.yas)/3);
		return zam_oran;
	}

	
	@Override
	public double MaasHesapla() {
		double zam_oran�=ZamOraniHesapla();
		double maas = 3000 + zam_oran�;
		return maas;
	}
}
