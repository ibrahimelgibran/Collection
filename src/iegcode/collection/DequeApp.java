package iegcode.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        // stack tumpukkan, masuk paling belakang, kalo keluar paling belakang dulu. semoga tau

        Deque<String> stack = new LinkedList<>();

        stack.add("Ibrahim");
        stack.add("El");
        stack.add("Gibran");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        System.out.println("================");
        // queue antrian. masuknya paling belakang dulu kebalikkan sama polllast.

        Deque<String> queue = new LinkedList<>();

        queue.offerLast("Ibrahim");
        queue.offerLast("El");
        queue.offerLast("Gibran");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
    }
}
