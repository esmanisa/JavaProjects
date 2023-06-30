package ornek;

public class IkiBasamakliSayi extends Sayilar{

	int bs;
	public IkiBasamakliSayi(int sayi) {
		super(sayi);
		bs=2;
	}

	@Override
	public void topla() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int[] SayiBaBul() {
		int[] dizi=new int[bs];
		int kalan, syc=0;
		
		while(sayi>0)
		{
			kalan = sayi%10;
			sayi = sayi/10;
			dizi[syc]=kalan;
			syc++;
		}
		return dizi;
	}

	@Override
	public void sayiBilgisi() {
		// TODO Auto-generated method stub
		
	}

}
