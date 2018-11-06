package demos.DataStructures;

import java.util.Stack;

public class _08_Stacks {
	public static void main(String[] args) {

		Stack<String> myStack = new Stack<String>();

		myStack.push("23");
		myStack.push("Michael");
		myStack.push("Jordan");

		System.out.println(myStack);

		System.out.println(myStack.pop()); // pop() removes the element

		System.out.println(myStack.peek()); // peek() does NOT remove the element

		System.out.println(myStack);
	}
}
