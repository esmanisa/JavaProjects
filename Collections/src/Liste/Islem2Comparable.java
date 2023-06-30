package Liste;

import java.util.PriorityQueue;

class NesneSirala implements Comparable<NesneSirala>
{
	private String isim;
	private int siraNumarasi;
	
	public NesneSirala(String isim, int siraNumarasi) {
		this.isim = isim;
		this.siraNumarasi = siraNumarasi;
	}

	@Override
	public int compareTo(NesneSirala o) {
		if(this.siraNumarasi<o.siraNumarasi)
			return -2;
		else if(this.siraNumarasi>o.siraNumarasi)
			return 2;
		
		return 0;
	}

	@Override
	public String toString() {
		return "NesneSirala [isim=" + isim + ", siraNumarasi=" + siraNumarasi + "]";
	}

}

public class Islem2Comparable {
	public static void main(String[] args)
	{
		PriorityQueue<NesneSirala> q1=new PriorityQueue<NesneSirala>();
		
		q1.offer(new NesneSirala("Zafer",1));
		q1.offer(new NesneSirala("Miray",4));
		q1.offer(new NesneSirala("Gül",2));
		q1.offer(new NesneSirala("Ahmet",3));
		
		for(int i=0;i<4;i++)
			System.out.println("Veri siliniyor: "+q1.poll());
	}
}
