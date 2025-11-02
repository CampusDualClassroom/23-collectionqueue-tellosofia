package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise {
    public static Queue<String> createQueue() {
        Queue<String> myQueue = new LinkedList<>();

        myQueue.offer("Smith");
        myQueue.offer("Montessori");
        myQueue.offer("Peralta");
        myQueue.offer("House");

        return myQueue;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        while (!queue.isEmpty()){
            System.out.println("Polled element: " + queue.poll());
        }
//        for (int i = 0; i <= queue.size() + 2; i++) {
//            System.out.println(queue.peek());
//            queue.poll();
//        }
    }

    public static void main(String[] args) {
        printAndEmptyQueue(createQueue());
    }
}
