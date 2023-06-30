package ornekler;

public class recursiveSum {
	public static int toplam(int n)
	{
		if (n==1)
		{
			return 1;
		}
		if (n%2!=0)
		{
			return (n+toplam(n-2));
		}
		else
		{
			return toplam(n-1);
		}
	}
	
	public static String cevir2likTabana(int decimal)
	{
		int kalan;
	    String binaryNum ="";
	    
	    while (decimal != 0)
	    {
	    	kalan = decimal % 2;
	        decimal /= 2;
	        binaryNum = kalan+binaryNum;
	    }
	    return binaryNum;
	}
	
	public static int yanyanaMaxTirnakSayisi(String ifade)
	{
		int sonuc=0;
		char isaret = '"';
		
		for(int i=0;i<ifade.length();i++)
		{
			if (ifade.charAt(i) == isaret)
				sonuc++;
		}
		
		return sonuc;
	}
	
	static int sonuc=0;
	
	public static int say7(int n)
	{
		int sayi;
		while (n>0)
		{
			sayi = n%10;
			
			if (sayi==7)
				sonuc++;
			
			return say7(n/10);
		}
		return sonuc;
	}
	
	public static void main(String[] args)
	{
		System.out.println(toplam(12));
		//System.out.println(cevir2likTabana(32));
		//System.out.println(say7(125));
	}
}
