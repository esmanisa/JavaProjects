package Generics;

public class SayilarveUlkeler <T>{
	public static void main(String[] args) {
		String [] ulkeler= {"Türkiye", "Almanya", "Ýngiltere", "Azerbaycan"};
		Integer [] sayilar= {34,6,16,15};
		
		ekrana_bastir(ulkeler);
		ekrana_bastir(sayilar);
	}
	public static <T2> void ekrana_bastir(T2[] c1) {
		for(T2 k:c1)
		{
			System.out.println(k);
		}
	}
}
