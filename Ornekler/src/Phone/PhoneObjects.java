package Phone;

public class PhoneObjects {
	public static void main(String[] args)
	{
		SmartPhone s1=new SmartPhone("Samsung", "S5", "Uzay mavisi", 32, 1.6);
		SmartPhone s2=new SmartPhone("Xiaomi", "Redmi Note 8", "Beyaz", 16, 1.4);
		SmartPhone s3=new SmartPhone("Apple", "IPhone 8", "SÝyah", 8, 2.0);
		
		s1.bilgileriYazdir();
		s1.hafizaDegerlendir(32);
		System.out.println();
		
		s2.bilgileriYazdir();
		s2.hafizaDegerlendir(16);
		System.out.println();
		
		s3.bilgileriYazdir();
		s3.hafizaDegerlendir(8);
		System.out.println();
		
	}
}
