package Phone;

public class SmartPhone {
	private String marka;
	private String model;
	private String renk;
	private int hafiza;
	private double hiz;
	
	public SmartPhone(String marka, String model, String renk, int hafiza, double hiz) {
		super();
		this.marka = marka;
		this.model = model;
		this.renk = renk;
		this.hafiza = hafiza;
		this.hiz = hiz;
	}
	public SmartPhone(String marka, String model, int hafiza) {
		super();
		this.marka = marka;
		this.model = model;
		this.hafiza = hafiza;
	}
	public SmartPhone() {
		super();
		this.marka = "Belirtilmedi";
		this.model = "Belirtilmedi";
		this.renk = "Belirtilmedi";
		this.hafiza = 0;
		this.hiz = 0;
	}
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public int getHafiza() {
		return hafiza;
	}
	public void setHafiza(int hafiza) {
		this.hafiza = hafiza;
	}
	public double getHiz() {
		return hiz;
	}
	public void setHiz(double hiz) {
		this.hiz = hiz;
	}
	
	public void bilgileriYazdir()
	{
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println(marka+" "+model+" olan telefon "+renk+" "+hafiza+" "+hiz+" özelliklerine sahiptir.");
		System.out.println("----------------------------------------------------------------------------------");
	}
	
	public void hafizaDegerlendir(int hafiza)
	{
		if (hafiza < 16)
			System.out.println("Hafiza düþük...");
		else
			System.out.println("Hafiza iyi");
	}
}
