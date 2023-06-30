package otomasyon;

public class Servis{
	private int servisID;
	private static int count=0;
	private String servisGuzergah;
	private int depNo;

	public Servis(int depNo, String servisGuzergah) {
		this.depNo = depNo;
		this.servisID = ++count;
		this.servisGuzergah = servisGuzergah;
	}
	
	public int getDepNo() {
		return depNo;
	}

	public void setDepNo(int depNo) {
		this.depNo = depNo;
	}

	public int getServisID() {
		return this.servisID;
	}
	
	public void setServisID(int servisID) {
		this.servisID = servisID;
	}
	
	public String getServisGuzergah() {
		return servisGuzergah;
	}
	
	public void setServisGuzergah(String servisGuzergah) {
		this.servisGuzergah = servisGuzergah;
	}
	
	
}
