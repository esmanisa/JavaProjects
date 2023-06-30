package Liste;

import java.util.LinkedList;
import java.util.Queue;

/*offer()->kuyruða eleman ekler
 * poll()->kuyruktan eleman çýkarýr, eleman yoksa null deðeri döner*/

public class QueueExample {
	public static void main(String[] args)
	{
		Queue<String>q1=new LinkedList();
		q1.offer("a");
		q1.offer("b");
		q1.offer("c");
		q1.offer("d");
		
		System.out.println("q1 size "+q1.size());
		System.out.println("q1 depolanan ilk eleman: "+q1.element());  //kuyrukta eleman yoksa hata fýrlatýlýr.
		
		while(!q1.isEmpty())
		{
			System.out.println("Kuyruktaki eleman siliniyor."+q1.poll());
		}
		
		System.out.println("q1 depolanan ilk eleman: "+q1.peek()); //kuyrukta eleman yoksa null döndürür.

	}
}
