package Liste;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FirmaTreeMapExample {
	public static void main(String[] args)
	{
		TreeMap<Integer, String> tMap=new TreeMap<Integer, String>();
		
		tMap.put(3, "Hakan");
		tMap.put(9, "Sude");
		tMap.put(1, "Burak");
		tMap.put(12, "�a�la");
		
		for(Integer i:tMap.keySet())
			System.out.println("Numara(K): "+i+"->�al��an(V): "+tMap.get(i));
		
		System.out.println(" ");
		
		System.out.println("De�er: "+tMap.descendingKeySet());
		System.out.println(" ");

		LinkedHashMap<Integer, String> kMap=new LinkedHashMap();
		
		kMap.put(1, "OCAK");
		kMap.put(3, "MART");
		kMap.put(2,	"�UBAT");
		kMap.put(6, "HAZ�RAN");
		
		for(Map.Entry<Integer, String> m2:kMap.entrySet())
			System.out.println(m2.getKey()+". ay -> "+m2.getValue());
		
		Map<Integer, String>t2Map=new TreeMap<Integer, String>();
		t2Map.put(2, "Ka�an");
		t2Map.put(4, "Buse");
		t2Map.put(3, "Veli");
		
		System.out.println("Anahtar ->"+t2Map.keySet());
	}
}
