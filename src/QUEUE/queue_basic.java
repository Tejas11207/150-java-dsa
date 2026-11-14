package QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;

public class queue_basic {

    public  static  void main(){


    //crete the queue

    Deque<Integer> q = new ArrayDeque<>();

    // insertion
        q.offer(10);

        // inside the  q -> front -> 10  and rear -> rear -> 10 ;

        //System.out.println("the queue is " + q);

        // some more insertion

        q.offer(20);

        // inside the  q -> front -> 10  and rear -> rear -> 20 ;

        q.offer(30);

        // inside the  q -> front -> 10  and rear -> rear -> 30 ;

        System.out.println( " queue is " + q);


        // deletion  or removal from the queue
        System.out.println(  "after removal "+ q.poll());

        // remove  the front element always
        //now front -> 20  and  rear -> 30;

       // System.out.println(q);

        if(q.isEmpty()){
            System.out.println("q is empty ");
        }
        else System.out.println("q is not empty ");










    }



}
