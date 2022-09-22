package com.masai.q1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len = 5;
        Random random = new Random();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(len);
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Random number generated:");
        for (int i = 0; i < len; i++) {
            Integer randomNumber = new Integer(random.nextInt(100));
            linkedList.add(new Integer(randomNumber));
            priorityQueue.add(new Integer(randomNumber));
            System.out.println(i + ": " + randomNumber);
        }
        System.out.println("Number in linkedList:");
        for (int i = 0; i < len; i++) {
            Integer item = linkedList.poll();
            System.out.println(i + ": " + item);
        }
        System.out.println("Number in priorityQueue:");
        for (int i = 0; i < len; i++) {
            Integer item = priorityQueue.poll();
            System.out.println(i + ": " + item);
        }

	}

}
