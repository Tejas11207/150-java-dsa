package java_collection_framework.collectionframework1;

import javax.naming.InsufficientResourcesException;
import java.util.*;
import java.lang.Object;

public class colletionframework1 {

    // yeh pura list ke hisab se tha

    public static void main() {
        List<Integer> list1 = new ArrayList<>();
        // single single item hum ek  list me kese daale sakte hai with the help of add
        list1.add(12);
        list1.add(13);
        list1.add(69);
        list1.add(38);
        list1.add(45);
        list1.add(79);
        System.out.println(list1);
        System.out.println("before remove the iteams " + list1);

        list1.remove(5); //79 remove
        System.out.println("after remove the iteam" + list1);


        // list 2

        List<Integer> list2 = new ArrayList<>();
        list2.add(49);
        list2.add(79);
        list2.add(8);
        list2.add(11);
        list2.add(7);

        // kisi bhi element ko access krne ke liye use hota hai get keyword index likhna padgega

        System.out.println("the element which we want to access " + list2.get(3)); // 11

        // now mujhe kisi element ko change bhi toh krna hoga to use set index , changed value
        System.out.println("the changed element is " + list2.set(2, 100));


        System.out.println(list2);
        // both vale opetation
        // now jo list2 ke elements hai usko mujhe list 1 me lana hai
        list1.addAll(list2);

        System.out.println("list 1 ke aandar list2" + list1); // list2 ke sare element ko list1 me daal diya

        // now mujhe list1 ke anadr se list 2 ke elements kohaatna hai
        list1.removeAll(list2);
        System.out.println("after removing the list 2 " + list1);

        // now list ke aandar ke elements ko kitne hai ho dekhne ke liye
        System.out.println("size of list 1 " + list1.size()); //5
        System.out.println("size of list 2" + list2.size()); //5

        // now mujhe list ko arrays me chane krna hai toh toarray use
        Object arr[] = list2.toArray();
        for (Object obj : arr) {
            System.out.println(" change the lst into array" + obj);
        }

        // contains  -  if merei list me koi element present hai voh mujhe check krna hai toh usse return true or false

        System.out.println(list1.contains(13));

        // iterator - its is a method to travel in any particular datatype like arrays ,list , etc

        Iterator<Integer> it = list1.iterator();


        while (it.hasNext()) {
            System.out.println("elemnets" + it.next());
        }

        // sorting

        List<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(1);
        list3.add(0);
        list3.add(3);

        System.out.println("before sorting the list" + list3);

        Collections.sort(list3); // collection .sort likhna padega

        System.out.println("after sorting the list " + list3); //asscinding me sort

        //descending order
        Collections.sort(list3, Collections.reverseOrder());
        System.out.println( "revese list"+ list3);

        // clone of the list  yeh shallow clon banye ga naki deep clone

//        ArrayList<Integer>newlist= (ArrayList<Integer>)list3.clone();
//        System.out.println(("the clone list is "+ newlist);

        ArrayList<Integer>newlist = new ArrayList<>();
        newlist.ensureCapacity(100); // yehh mere aarays ki capacity ko define krega means itne toh capicty hone hie chaiye

        System.out.println(newlist.isEmpty()); //obs newlist empty hie hia
        System.out.println(list3.indexOf(2)); // kisi bhi element ka index dekhne ke liye use kro indexof



        // linklist ke kuch methods- jo arrayslist me thee voh sarre toh hai but cloan nhi hai and 1 or koi thats all

            // and ye kuch or method

        LinkedList<Integer>link = new LinkedList<>();
        link.add(10);
        link.add(20);
        link.add(30);
        System.out.println(link);

        link.addFirst(1); // add krega element ko first place pe
        link.addLast(90); // add krega elemnet ko last place pe

        System.out.println("new link " + link);

        link.removeFirst(); //pehle element ko remove krega
        link.removeLast(); // last element ko remove krega
        System.out.println("new new link"+ link);

        System.out.println(link.getFirst()); // pehel elemnt ko print kr ega
        System.out.println(link.getLast()); // last element ko print krega

        System.out.println("the peek"+link.peek()); // return the first elemnt head of the link list

        System.out.println("befroe the poll"+link);
        System.out.println("poll"+link.poll()); // return and remove the first elemnt of the list
        System.out.println("after the poll"+link);

        //offer=addlast

        // vector = arrays ,link list  the methods are  the same
        Vector<Integer>vec =new Vector<>();


        // stack - same methods of AS array list, link list
        // lifo = last in first out'

        // stack ke apne kuch method;

        Stack<Integer> stack= new Stack<>();

        stack.add(90);
        stack.add(20);
        stack.add(40);
        System.out.println(stack);

        stack.push(10); // puch method ek elemnt of stack me daalega mean element ko add kregab lifo = list me krega add

        System.out.println("puched stack"+stack);

        stack.pop();
        System.out.println("poped stack"+stack); // last elemnt ko remove krdega

        System.out.println("peek elemnt of the stack"+stack.peek()); // pehla elemnt of the stack ko print krega

        System.out.println(stack.search(20)); // kis index pe mera elemnt hai vo batega
        System.out.println(stack.empty()); // empty much baatega ki mera stack khali hai ya nhi



    }

}
