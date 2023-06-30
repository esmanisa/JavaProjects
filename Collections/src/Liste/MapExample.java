package Liste;

import java.util.HashMap;
import java.util.Map;

//Collections de�il
//Key-value ile �al���r
public class MapExample {
	//HashMap
	public static void main(String[] args)
	{
		HashMap<Integer,String> hashMap=new HashMap<Integer, String>();
		
		hashMap.put(36, "Kars");
		hashMap.put(01, "Adana");
		hashMap.put(06, "Ankara");
		hashMap.put(68, "Aksaray");
		hashMap.put(15, "Burdur");
		hashMap.put(07, "Antalya");
		hashMap.put(34, "�stanbul");
		hashMap.put(35, "�zmir");
		
		for(Integer i:hashMap.keySet())
			System.out.println("Plaka(K): "+i+" -> "+"Kent(V): "+hashMap.get(i));
		
		hashMap.remove(15);
		
		System.out.println(" ");
		System.out.println("Kentler "+hashMap);
		
		hashMap.put(34, "Edirne");
		System.out.println(" ");
		
		System.out.println("Kentler: "+hashMap);
		
		System.out.println("Kars depoland� m�? "+hashMap.containsKey(36));
		
		for(Map.Entry<Integer, String> m2:hashMap.entrySet())
			System.out.println("Plaka(K): "+m2.getKey()+" Kent(V): "+m2.getValue());
	}
}
