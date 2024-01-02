package iegcode.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {

        // Queue<String> queue = new ArrayDeque<>();
        // Queue<String> queue = new PriorityQueue<>(); berurutan
         Queue<String> queue = new LinkedList<>();

        queue.add("Ibrahim");
        queue.add("El");
        queue.add("Gibran");

        for (String next = queue.poll(); next != null; next = queue.poll()){
            System.out.println(next);
        }

        System.out.println(queue.size());
    }
}
