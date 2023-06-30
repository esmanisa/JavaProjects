package Liste;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> v1=new Vector();
		
		v1.add("Kazým Karabekir");
		v1.add("Merve Tan");
		v1.add("Burak Ak");
		v1.add("Nisa Berk");
		
		Iterator i1=v1.iterator();
		
		while(i1.hasNext())
			System.out.println("Üye-"+i1.next());
		
		System.out.println(" ");
		
		String [] array=new String[4];
		v1.toArray(array);
		
		for(int i=0;i<array.length;i++)
			System.out.println("Üye-"+array[i]);
	}

}
