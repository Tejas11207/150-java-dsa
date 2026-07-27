package java_collection_framework.collectionframework1;

import java.util.*;


public class colletionframework2 {

    static void main() {


        // ab ye pura queue -  me remove aage se hoga ,insert piche se hoga ek line jaisa
        // most of the method are same as list
        // fifo = first in first out

        Queue<Integer> que = new ArrayDeque<>();
        // kuch method which are matters\

        que.add(10); // see .add method kr sakte hai but exception throw krdeta hai if queue empty hai toh



        // in dsa we use offer
        que.offer(20);
        que.offer(40);
        que.offer(39);

        System.out.println(que);


        que.peek();
        System.out.println("peek"+que.peek());
        que.remove(); //see .remove method kr sakte hai but exception throw krdeta hai if queue empty hai toh
        System.out.println("remove "+ que);
        //use poll method


        System.out.println("poll"+que.poll());


        // using arrya deque -- aage se bhi insert sakta hai piche se bhi and also aage se bhi remove hosakta hia and piche se bhi

        Deque<Integer> dq = new ArrayDeque<>();

        // many methods are same as privouse ones

        // dq me yeh saare methods chalc sakte hai bcuz diff hai queue se and line ke starting and end me dono side me se kuch bhi hosakte hai
        dq.addFirst(20);
        dq.addFirst(30);
        dq.addFirst(40);

        System.out.println("dq add first"+ dq);

        dq.addLast(50);
        dq.addLast(90);
        System.out.println("dq add last "+dq);

        dq.removeFirst();
        System.out.println("after removeing the first elemnt"+dq);

        dq.removeLast();
        System.out.println("after removing the first element from the last"+ dq);


        // stack /queue operation using arrays deque

        Stack<Integer> st = new Stack<>();

        st.push(24);
        st.push(13);
        st.push(20);

        System.out.println("elements in st"+st);


        System.out.println("pop "+st.pop());

        st.add(90);
        st.remove(1);

        // priority queue - jiski priority jada hai voh apna kaam kr ke nikal jaayega

        Queue<Integer>pq =new PriorityQueue<>();

       // priority queue default behaviour -> Interger -> less value -> high priority -> minheap

        pq.offer(20);
        pq.offer(99);
        pq.offer(10);
        pq.offer(89);
        pq.offer(79);

        System.out.println(pq);  // 10 sabse aage

        System.out.println("polled element"+pq.poll());
        System.out.println(pq); // 10 remove

        //ab 20 min value -> izzat jyda
        System.out.println(pq);
        System.out.println(pq.poll());

        // maxheap ->integers ->maxvalue -> high priority
        // lamda funtion bananapadega

        Queue<Integer>pqmax =new PriorityQueue<>((a,b)->b-a); //lamda funtion

        pqmax.offer(20);
        pqmax.offer(99);
        pqmax.offer(10);
        pqmax.offer(89);
        pqmax.offer(79);

        System.out.println(pqmax); //99 show krega

        System.out.println("poll value"+pqmax.poll());
        System.out.println(pqmax);


        // sets

        // hash sets = unique value hie store kr ta hai means same element ko ek hie baar store krta hai na ki 2 ya 3 baar depends on the usser
         // and store kisi bhi order me kr saktha hai
        //methods are same we study pri,


        Set<Integer> hs= new HashSet<>();

        hs.add(20);
        hs.add(20); // 20 ko ek hie baar store krega
        hs.add(10);
        hs.add(30);
        hs.add(40);

        System.out.println(hs);


        Set<Integer> hs1= new HashSet<>();
        Set<Integer> hs2= new HashSet<>();

        hs1.add(90);
        hs1.add(21);
        hs1.add(14);
        hs1.add(69);
        System.out.println(hs1);



        hs2.add(14);
        hs2.add(60);
        hs2.add(21);
        hs2.add(86);

       hs1.retainAll(hs2); // retain all means hs1 and hs2 ke aandar jo common value hai vo hs1 me aajyega and print hoga
        System.out.println("comman of hs1 AND HS2"+hs1);

        System.out.println(
                hs1.containsAll(hs2)); //containsAll hs1 pura hs2 ke equal hai means dono me same elements hai - flase ans

        System.out.println("subset"+hs2.containsAll(hs1)); //true
        System.out.println("union"+hs1.addAll(hs2));
        System.out.println("difference"+hs1.removeAll(hs2));

        Set<Integer> hs3= new LinkedHashSet<>();

            // order me aayega ans means jis order me value input ushie order me value aayegi
        hs3.add(20);
        hs3.add(20); // 20 ko ek hie baar store krega
        hs3.add(10);
        hs3.add(30);
        hs3.add(40);

        System.out.println(hs3);

        Set<Integer> hs4= new TreeSet<>();
        // chote se bada  asscending order

        hs4.add(20);
        hs4.add(20); // 20 ko ek hie baar store krega
        hs4.add(10);
        hs4.add(30);
        hs4.add(40);

        System.out.println(hs4);

        // union - addAll() /-true false
        //intersection-retainAll()
        // Difference - removeAll();
        //suset-containsAll()








    }}

