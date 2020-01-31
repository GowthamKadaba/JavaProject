package byteBybyte;

import java.util.Stack;

public class SortStacks {

    private Stack sortStack(Stack<Integer> stack){
        if (stack == null || stack.isEmpty()){
            return stack;
        }

        Stack<Integer> newStack = new Stack<>();
        newStack.push(stack.pop());
        while (!stack.isEmpty()){
            Integer temp = stack.pop();
            while (!newStack.isEmpty() && newStack.peek() < temp){
                stack.push(newStack.pop());
            }
            newStack.push(temp);
        }

        return newStack;
    }


    public static void main(String[] args) {
        SortStacks ss = new SortStacks();
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(2);
        stack.push(3);
        stack.push(1);

        System.out.println("Input  - " + stack);
        System.out.println("Output - " + ss.sortStack(stack));


    }
}
