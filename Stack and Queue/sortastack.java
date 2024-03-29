package Stack and Queue;

public class sortastack {
    public static void sortedInsert(Stack<Integer> stack, int current) {
		if (stack.empty() == true || current > stack.peek()) {
			stack.push(current);
			return;
		}

		// Remove the top element
		int top = stack.peek();
		stack.pop();
		// Recursion for the remaining elements in the stack
		sortedInsert(stack, current);
		// Insert the popped element back in the stack
		stack.push(top);
	}

	// Recursive method to sort a stack
	public static void sortStack(Stack<Integer> stack) {
		// Base case: stack is empty
		if (stack.empty() == true) {
			return;
		}

		// Remove the top element
		int top = stack.peek();
		stack.pop();
		// Recursion for the remaining elements in the stack
		sortStack(stack);
		// Insert the popped element back in the sorted stack
		sortedInsert(stack, top);
	}
}
