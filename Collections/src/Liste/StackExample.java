package Liste;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		//vector sýnýfýndan türetilmiþtir kalýtým
		Stack<String>s1=new Stack<String>();
		
		s1.push("a");
		s1.push("b");
		s1.push("c");
		s1.push("d");
		
		for(String s2:s1)
			System.out.println("Deðer: "+s2);
		System.out.println(" ");
		System.out.println("Son depolanan eleman: "+s1.peek());
		System.out.println(" ");
		System.out.println("Eleman çýkarýldý: "+s1.pop());
		System.out.println(" ");
		
	}

}
