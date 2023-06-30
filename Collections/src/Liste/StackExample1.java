package Liste;

import java.util.Stack;

public class StackExample1 {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("Londra");
		stack.push("Moskova");
		stack.push("Ankara");
		stack.push("Paris");
		stack.push("Viyana");
		System.out.println(stack);
		System.out.println(stack.search("Ankara"));
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);

	}

}
