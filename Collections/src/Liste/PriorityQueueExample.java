package Liste;

import java.util.PriorityQueue;
import java.util.Queue;

/*Integer sýnýfýnda en küçük sayý daha öncelikli
 * Sting sýnýfýnda ise alfabetik sýranýn baþýnda olan daha önceliklidir*/
public class PriorityQueueExample {

	public static void main(String[] args) {
		Queue<String> q1=new PriorityQueue<>();
		
		q1.offer("s");
		q1.offer("f");
		q1.offer("v");
		q1.offer("x");
		System.out.println(q1.size());
		
		for (int i=0;i<4;i++)
			System.out.println("Veri siliniyor: "+q1.poll());
		
		Queue<Integer> q2=new PriorityQueue<>();
		
		q2.offer(6);
		q2.offer(2);
		q2.offer(4);
		q2.offer(5);
		
		for (int i=0;i<q2.size();i++)
			System.out.println("Veri siliniyor: "+i+" "+q2.poll());
	}

}
