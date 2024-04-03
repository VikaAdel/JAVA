package Seminar_4;
// Реализовать стэк с помощью массива.
// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().

public class ArrayStack {
    static int[] stackArray;
    static int capacity;
    static int top;

    public static void main(String[] args) {
        capacity = 5;
        stackArray = new int[capacity];
        top = -1;

        System.out.println(size());
        System.out.println(empty());
        push(3);
        push(4);
        push(8);

        System.out.println(empty());
        System.out.println(size());
        System.out.println(pop());
        System.out.println(size());
        System.out.println(peek());

    }

    public static int size() {
        return top + 1;

    }

    public static boolean empty() {
        return top == -1;

    }

    public static void push(int num) {
        stackArray[++top] = num;
    }

    public static int peek() {
        return stackArray[top];
    }

    public static int pop() {
        return stackArray[top--];
    }
}
