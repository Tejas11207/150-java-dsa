package LinkedList;

import java.security.PrivateKey;

public class Douby_Link_List {


    // structure of doubly LL

        static class Node{

            int data ;
            Node prev ;
            Node next ;

            Node(int data ){
                this.data = data ;
                this.prev =null;
                this.next = null ;
            }

        }

        private  Node head ;

        private  Node tail ;

        private  int size ;

    Douby_Link_List(){

        this.head = null;
        this.tail = null;
        this.size  = 0;

    }


    public  void inserAtHead(int data){

        Node newnode = new Node(data);
        if(head ==null && tail ==null){

            head  = newnode;
            tail  = newnode;

        }
        else {

            newnode.next = head;
            head.prev = newnode;
            // head update
            head  = newnode;
        }
        // 1 node and hue hai toh size of LL bhi inc
        size ++;

    }

    public  void insetAtTail(int data) {

        Node newnode = new Node(data);

        if (head == null && tail == null) {

            head = newnode;
            tail = newnode;


        } else {
            newnode.prev = tail;
            tail.next = newnode;

            // update the tail

            tail = newnode;
        }

        // inc the size bcuz humnne  ek node inc ke hai

        size++;

    }


        public void printList(){

            // ek variable me head ko store kr diya node  temp me
            Node temp= head ;

            // loop chala do
            while( temp !=null){

                System.out.print(temp.data + " ->");

                // temp  me dusre vale ka add honna chahiye after printing the previous vala
                temp = temp.next;

            }
            System.out.println();

        }




    public void insterAtPosition(int position,int data){

        if(position<1 || position >size +1){
            System.out.println("invalid position to insert node");
            return;

        }
        if(position ==1){
            inserAtHead(data);
        }
        if(position == size +1){
            insetAtTail(data);
            return;
        }

        // in b/w khani pr node ko insert krna bol h

        Node temp = head;

        for(int i = 1 ; i<=position-2;i++){

            temp = temp.next;

        }
        // ab mera temp prevNode pr aa chuka hai

        Node prevNode= temp ; // naa, kran
        Node nextNode = prevNode.next;
        Node currNode = new Node(data); // create a new node

        // change the link

        currNode.prev = prevNode;
        prevNode.next = currNode.next;
        currNode.next = nextNode;

        nextNode.prev = currNode;

        // 1 size inc hue hai
        size ++;


    }
    public void BackwardList(){

        // ek variable me head ko store kr diya node  temp me
        Node temp= tail ;

        // loop chala do
        while( temp !=null){

            System.out.print( "<-"+temp.data);

            // temp  me dusre vale ka add honna chahiye after printing the previous vala
            temp = temp.prev;

        }
        System.out.println();

    }

    // searching

    public boolean searching(int target){

        if(head == null){
            System.out.println("no nodes are present ");
            return  false;
        }
        Node temp = head;

        while(temp != null){

            if(temp.data ==target){
                return  true;
            }
            else {
                temp =temp.next;

            }
        }
        return  false ;

    }
    public void deleteHead(){

        if(head == null){
            System.out.println("no need to delete");
            return;
        }

        // single node
        if(head == tail){
            head = null;
            tail = null;
            // bhulna nhi hain
            size = 0;
            return;
        }

        // LL has more than 1 node ;
        head = head.next; // pehele mene head ko aage kiya , dusri node pe leke gaya
        head.prev  = null; // then dusri node ke prev ko null krdiya , and mere pehle vali node ko java garbage collector me utha liya

        // size update;
        size --;
    }

    public void deletetail(){


        if(head == null){
            System.out.println("no need to delete");
            return;
        }

        // single node
        if(head == tail){
            head = null;
            tail = null;
            // bhulna nhi hain
            size = 0;
            return;
        }
        // LL has more than 1 node ;

        Node currNode = tail;
        Node prevNode = tail.prev;

        // link change

        prevNode.next = null;
        currNode.prev= null;

        // update the tail
        tail = prevNode;

        // size update kro
        size --;


    }
    public void deleteAtPosition(int position){

        if(position <1 || position >size +1){
            System.out.println("not posible ");
            return;
        }
        if(head ==null){
            System.out.println("no need to delete ");
            return;

        }
        if(position == 1 ){
            deleteHead();
        }
        if(position == size ){
            deletetail();
            return;
        }

        // koi b/w wali postion se node kod delete krna h

        // first reach to that position
        Node currNode = head ;
        for(int i =1; i<=position -1 ;i++){
            currNode = currNode.next;
        }
        // currNode is at the right place , i.e at the node
        // which is to be delete

        Node prevNode = currNode.prev;
        Node nextNode = currNode.next;

        // change linkss

        prevNode.next = nextNode;
        nextNode.prev =  prevNode;
        currNode.prev = null;
        currNode.next = null;

        // size update
        size --;
        



    }








    static void main() {

        Douby_Link_List mylist = new  Douby_Link_List();

        mylist.inserAtHead(10);
        mylist.printList();

        mylist.inserAtHead(20);
        mylist.printList();

        mylist.inserAtHead(30);
        mylist.printList();


        mylist.inserAtHead(40);
        mylist.printList();

        mylist.BackwardList();



    }





       

}
