package Seminar_4;
// 1) Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в
// очередь и выводит на консоль содержимое очереди.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {
    public static void main(String[] args) {
        int[] array = { 1, 4, 7, 4, 8, 9 };
        Stack<Integer> stack = getStack(array);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");

        }
        System.out.println();
        Queue<Integer> queue = getQueue(array);
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
    }

    public static Stack<Integer> getStack(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (Integer elem : array) {
            stack.push(elem);
        }
        return stack;
    }

    public static Queue<Integer> getQueue(int[] array) {
        Queue<Integer> queue = new LinkedList<>();
        for (Integer elem : array) {
            queue.add(elem);
        }
        return queue;
    }
}