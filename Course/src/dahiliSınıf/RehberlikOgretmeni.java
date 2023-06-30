package dahiliSınıf;

public class RehberlikOgretmeni implements EgitimKurumu {

	String son_calistigi_kurum(String son_calistigi_kurum)
	{
		return son_calistigi_kurum;
	}
	
	@Override
	public int yas(int basvuran_yasi) {
		return basvuran_yasi;
	}

	@Override
	public int egitim_tecrübe(int basvuran_tecrube) {
		return basvuran_tecrube;
	}

	@Override
	public String medeni_hal(String medeni_hal) {
		return medeni_hal;
	}

}