package QUEUE;

import java.util.*;

public class QUEUE_WITH_ARRAY {



    public class Main {

        static class MyQueue {

            // Data members
            int arr[];
            int front;
            int rear;
            int size;
            int capacity;

            // Constructor
            public MyQueue(int n) {
                arr = new int[n];
                front = 0;
                capacity = n;
                rear = -1;
                size = 0;


            }

            // Insert element at rear
            public boolean enqueue(int x) {
                if (!isEmpty()) {
                    return false;
                } else {
                    rear++;
                    arr[rear] = x;
                    size++;
                    return true;

                }


            }

            // Remove element from front
            public int dequeue() {

                if (isEmpty()) {
                    return -1;

                } else {
                    int removeValue = arr[front];

                    arr[front] = -1; // dummy value

                    front++;
                    size++;

                    return removeValue;


                }

            }

            // Get front element
            public int getFront() {

                if (isEmpty()) {
                    return -1;

                } else {
                    return arr[front];

                }
            }

            public int getRear() {

                if (isEmpty()) {
                    return -1;

                } else {
                    return arr[rear];
                }

            }


            // Check if queue is empty
            public boolean isEmpty() {
                if (size == 0) return true;

                else return false;

            }

            // Get current size
            public boolean size() {

                if (rear == capacity - 1) {
                    return true;

                } else {
                    return false;

                }


            }

            public static void main() {

                MyQueue q = new MyQueue(5);

                System.out.println(q.enqueue(10));


                System.out.println(q.enqueue(20));


                System.out.println(q.enqueue(30));

                System.out.println("front" + q.getFront());
                System.out.println("rear" + q.getRear());
                System.out.println("size" + q.size());

                System.out.println("remove " + q.dequeue());

                System.out.println("front" + q.getFront());
                System.out.println("rear" + q.isEmpty());


            }
        }
    }
    }
