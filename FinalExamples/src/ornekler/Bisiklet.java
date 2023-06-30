package ornekler;

public class Bisiklet {
	public String renk;
	public int vites, hiz;
	
	public Bisiklet(String renk, int vites, int hiz) {
		super();
		this.renk = renk;
		this.vites = vites;
		this.hiz = hiz;
	}
	
	public static void main(String[] args)
	{
		Bisiklet bmx=new Bisiklet("siyah", 18, 6);
		Bisiklet pinkyo = new Bisiklet("beyaz", 12, 8);
		System.out.println(bmx.renk+","+bmx.vites+","+bmx.hiz);
		System.out.println(pinkyo.renk+","+pinkyo.vites+","+pinkyo.hiz);
		bmx = pinkyo;
		pinkyo.vites = 6;
		System.out.println(bmx.renk+","+bmx.vites+","+bmx.hiz);
		System.out.println(pinkyo.renk+","+pinkyo.vites+","+pinkyo.hiz);
		pinkyo = bmx;
		pinkyo.hiz=10;
		System.out.println(bmx.renk+","+bmx.vites+","+bmx.hiz);
		System.out.println(pinkyo.renk+","+pinkyo.vites+","+pinkyo.hiz);
	
	}
}
