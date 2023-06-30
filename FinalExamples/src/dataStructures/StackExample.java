package dataStructures;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack <Integer> s1=new Stack<Integer>();
		Stack <Integer> s2=new Stack<Integer>();
		Stack <Integer> s3=new Stack<Integer>();
		
		
		s1.push(0);
		s1.push(3);
		s1.push(5);
		s1.push(8);
		s1.push(10);
		
		s2.push(1);
		s2.push(2);
		s2.push(4);
		s2.push(6);
		s2.push(9);
		s2.push(11);
		s2.push(12);
		
		ekle(s1, s2, s3);
		
		for(Integer i:s3)
			System.out.println(i);

	}
	
	public static void ekle(Stack <Integer> s1, Stack <Integer> s2, Stack <Integer> s3)
	{
		while (!s1.isEmpty() && !s2.isEmpty())
		{
			int d1 = (int) s1.pop();
			int d2 = (int) s2.pop();
			
			if(d1<d2)
			{
				s3.push(d2);
				s3.push(d1);
				System.out.println(d2+" "+d1);
			}
			else
			{
				s3.push(d1);
				s3.push(d2);
				System.out.println(d1+" "+d2);
			}
		}
		if(!s1.isEmpty())
		{
			while(!s1.isEmpty())
			{
				int deger = s1.pop();
				int peek=s3.pop();
				if(peek < deger)
				{
					s3.push(peek);
					s3.push(deger);
				}
				System.out.println(deger);
			}
		}
		else if(!s2.isEmpty())
		{
			int deger = s2.pop();
			int peek=s3.pop();
			if(peek < deger)
			{
				s3.push(deger);
				s3.push(peek);
			}
			else
			{
				s3.push(peek);
				s3.push(deger);
			}
			System.out.println(deger);
		}
	}

}
