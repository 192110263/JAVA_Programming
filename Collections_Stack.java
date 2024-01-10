package Day_2;

import java.util.LinkedList;
import java.util.Scanner;

public class Collections_Stack {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);

        push(stack, "Apple");
        push(stack, "Banana");
        push(stack, "Cherry");

        while(!stack.isEmpty()){
            System.out.print(stack.pop());
    }
    private static void push(LinkedList<String> stack, String element) {
        stack.push(element);
    }
}