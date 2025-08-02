package stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4); // thêm vào
        System.out.println(myStack.peek()); // in ra phần tử trên cùng
        System.out.println(myStack.pop()); // lấy ra phần tử trên cùng
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
