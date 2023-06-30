package Liste;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class IslemCamparable {
	public static void main(String[] args)
	{
		LinkedList<String> l1=new LinkedList();
		
		l1.add("Zafer");
		l1.add("Miray");
		l1.add("G�l");
		l1.add("Ahmet");
		
		Collections.sort(l1);
		
		for(String s:l1)
			System.out.println("De�er: "+s);
		
		System.out.println(" ");
		
		LinkedList<Integer> l2=new LinkedList();
		
		l2.add(2);
		l2.add(7);
		l2.add(8);
		l2.add(4);
		
		//Collections.sort(l2);
		Collections.sort(l2, new Siralama());
		
		
		for(Integer i:l2)
			System.out.println("De�er: "+i);
		
	}
}

class Siralama implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		return -o1.compareTo(o2); // b�y�kten k����e s�ralama  yi kald�r�nca k���kten b�y��e do�ru s�ralama
	}
	
}