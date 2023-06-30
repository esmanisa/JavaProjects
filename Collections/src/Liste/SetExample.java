package Liste;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
 * add()
 * clear()
 * remove(int index)
 * remove(Object o) */
public class SetExample {
	public static void main(String[] args)
	{
		HashSet<Integer>hst1=new HashSet();
		/*hst1.add(16);
		hst1.add(10);
		hst1.add(12);
		hst1.add(14);
		
		for(Integer i:hst1)
			System.out.println("�yelik y�l�-"+i);*/
		
		/*veriler rastgele depolan�r ->hashset
		 * veriler alfabetik ya da s�ral� depolan�r ->treeset*/
		
		TreeSet<String>t1=new TreeSet<String>();
		t1.add("Kaz�m Karabekir");
		t1.add("Merve Tan");
		t1.add("Burak Ak");
		t1.add("Nisa Berk");
		
		for(String s:t1)
			System.out.println("�ye-"+s);
		
		System.out.println(" ");
		
		LinkedHashSet<String> l1=new LinkedHashSet<>();
		l1.add("Kaz�m Karabekir");
		l1.add("Merve Tan");
		l1.add("Burak Ak");
		l1.add("Nisa Berk");
		
		for(String s:l1)
			System.out.println("�ye-"+s);
	}
}
