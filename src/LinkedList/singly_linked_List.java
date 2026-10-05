package LinkedList;

import javax.print.DocFlavor;
import java.util.LinkedList;

public class singly_linked_List {


    // this is the bolier plate of the linkedList
    // static class hai excute hona hie hoga ;

    // creating the node
    static  class Node {

        int data ;
        Node  next ;

        // ctor ;
        Node(int data){
            this .data = data;
            this.next =null;  // next stores the data of the next node


        }
    }
        // ye humne node ka data liya ;
        private  Node head ; //  node  ka head
        private  Node tail;  // node ka tail
        private  int size ;

        // ctor ;

    public  singly_linked_List(){

        //starting me head and tail both are null
        this.head = null;
        this.tail = null;
        this.size = 0;

    }

    /// insetion in linekdlist


    // null toh mera khali rahega
    // as mention in the node BP
    // data ko insert krna hota hai
    public void insertAtHead(int data){

        // new node creat ke
        Node newNode = new Node(data);

        // if my LL is empty -> head and tail ko new node pr point krdo
        // check krna mere existing node is empty or not
        if(head ==null && tail == null){
            //place vala method
            head = newNode;
            tail = newNode;

        }
        else {
            // attach krdo vala method
            newNode.next  =head ;
            head = newNode ;

        }
        // inc. the size ko linkedList

        size++;

    }

    /// insert at end
    public void insertAtTail( int data){

        Node newNode = new Node(data);

        // list empty hai
        // toh mujhe mera tail and head ek hie node me hoga is me new node place krta hi toh
        if(head ==null && tail ==null){

            head= newNode;
            tail= newNode;

        }
        else {

            //mere exisiting node ke null ko me join krt  hu new node ke head se

            tail.next = newNode;
            tail = newNode;

        }
        size++; // update toh krna hie hoga ek new node add hue hai toh size ko bhi toh update krna hoga


    }

    /// insert at position

    public void insertAtPosition(int position,int data) {

        // Node newnode = new Node(data);

        //base case -- if ye output hua toh me return krjaunga

        if (position < 1 || position > size + 1) {
            //isnertion posibel hie nhi hia
            System.out.println("insertion is not posibile  at this size ");
            return;

        }
        if (position == 1) {
            // if meri position first hie hai toh
            // voh to mai pehle se kr chuka hu
            insertAtHead(data);
            return;
        }
        if (position == size + 1) {
            // if meri position tail  hai toh
            // voh  bhi mai kr chuka hu;
            insertAtTail(data);
            return;
        }
        //middle me kahin pr bhi insert krna chahte ho
        Node prevNode = head;
        //move prevNode by (position-2) steps , to reach to the previous node of the destination location
        for (int i = 1; i < position - 2; i++) {

            prevNode = prevNode.next;
        }

        Node newnode = new Node(data);

        newnode = prevNode.next;
        prevNode.next = newnode;

        //inc the size
        size++;


    }

    /// travel on linkedList
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

    /// some utility function

    public int getSize(){

        return  size ;

    }

    public  boolean isEmpty(){
        return head == null;

    }

    /// head
    public  int getHead(){

        if(head ==null){
            return  -1;

        }else {
            return  head.data;

        }
    }

    ///tail
    public int getTail(){

        if(tail == null){
            return -1;

        }
        return tail.data;
    }

    /// clear
    public  int clear(){

        if(head == null && tail ==null){
            return -1;

        }else {
            head =null;
            tail =null;
            return  1 ;


        }
    }

    ///searching
    public boolean search(int target){

        Node temp = head;

        while (temp != null){

            if(temp.data== target){
                 return  true;

            }
            else {

                temp = temp.next;

            }
        }
        // agar main yaya pohoch gya
        // iska matlb h LL poori traverse hochuki h
        // and kahin pr bhi target nhi mila
        // return false kro

        return  false ;

    }

    /// find the position of the element

    public int findPosition(int target){

        Node temp = head ;

        int position = 1 ; // inital



        while(temp != null){

            if(temp.data == target){

                return  position;

            }
            else {

                temp = temp.next ;

                position++;

            }
        }
        // agar ayah pouch gya toh iska matb hain \
        // entiree LL travel ho chuki hai and target nahi mila
        return -1 ;



    }

    ///updating using postions
    public void updateAtposition(int position,int newData){

        Node temp= head ;
        //take temp to the positiob given in input ;
        if(position <1  || position >size+1){
            System.out.println("invalid position in given input ");
            return;
        }

        for(int i = 1  ; i <=position-1 ;i++){
            temp = temp.next;

        }
        //ab mere temp , excat position wali node pr hai
        // replace old data with new ;

        temp.data = newData;

    }

    ///update the first occ of value ;

    public boolean updatevalue(int oldValue , int newValue){

        Node temp = head ;

        while(temp != null){

            if(temp.data == oldValue){
                temp.data = newValue;
                return  true ; // for the first occ which is  given in the question if not the chalte hai not req. return true

            }
            // move to next node;
            temp =temp.next;

        }
        // agar main yaha pahuchh gaya ;
        // iska matlb hai LL me mujhe kahin pe bhi oldVALUE  NHI MILI
        return  false;

    }

    /// delete at head
    /// delete first node ;

    public void deleteHead(){

        if(head == null){

            System.out.println( " LL is already empty , cannot delete anything from it ");


            return;
        }
        // main logic

        head = head.next ;

        size --;

        // be cautious -> check whether after deleteion LL has become empty or not ;

        if(head ==null){
            tail = null;
        }

    }

    /// delete at the tail
    public void deleteTail(){

        // check the ll is empty or mot

        if(head ==null){
            System.out.println(" LL is empty all ready ");
            return;
        }

        // check for the single node
        if(head == tail){
            head = null;
            tail =null;
            size = 0;
            return;

        }
        // for norma; >1 length wali LL ke liye
        Node temp = head;

        for(int i = 1 ;i<=size -2 ; i++){
            temp  = temp.next;

        }
        // now temp is pointing at 2nd last node of LL
        temp.next = null;
        tail = temp;

        // update the size ;
        size --;

    }

    public void deleteAtposition(int position){

        if(position <1 || position > size +1){

            System.out.println("invalid position , cant delete node");
            return;

        }

        if(position ==1 ){
            deleteHead();
            return;

        }
        if(position==size){
            deleteTail();
            return;

        }
        // varible setup -> prev,curr,forward

        Node prev = head;

        // prev ko position -2 steps move krunga toh main  node to delete ke just piche vali node pr pahuch jaunga

        for(int i =1 ; i<position-2; i++){

            prev= prev.next;


        }
        Node curr = prev.next;
        Node forward  = curr.next;

        // main logic
        prev.next = forward;
        curr.next = null;

        // size update
        size--;

    }
    public boolean deleteValue(int target){

        if(head ==null)
        {
            System.out.println("deletion not posible , no nodes to delete");
            return  false;


        }
        if(head.data==target){
            deleteHead();
            return true;

        }
        Node prev = head;
        Node curr = null;

        while(curr!=null){

            if(curr.data == target){
                //deletion ka logic lagao
                Node forward = curr.next;

                if(tail == curr){
                    // tail update
                    tail = prev ;

                }
                size -- ;
                return  true;

            }
            else{
                prev = prev.next;
                curr = curr.next;

            }
        }
        return  false;

    }







    static void main() {

        singly_linked_List myList = new singly_linked_List();

        if(myList.isEmpty()){
            System.out.println("list is empty ");
        }

        System.out.println("size ko LL "+myList.getSize());

        // inerstion chalu ko

        myList.insertAtHead(10);
        myList.printList();

        myList.insertAtHead(20);
        myList.printList();

        myList.insertAtHead(30);
        myList.printList();

        myList.insertAtHead(40);
        myList.printList();

        // insertAt tail

        myList.insertAtTail(300);
        myList.printList();

        myList.insertAtTail(400);
        myList.printList();

        myList.insertAtTail(500);
        myList.printList();


        //place at  the middle

        myList.insertAtPosition(1,45);
        myList.printList();

        myList.insertAtPosition(2,85);
        myList.printList();

        myList.insertAtPosition(5,905);
        myList.printList();

        // head

        System.out.println("head" + myList.getHead() );

        //tail
        System.out.println("head" + myList.getTail() );


        // target
        System.out.println("my target is " +  myList.search(40));

        // find the postion of the target

        System.out.println("the position of target " + myList.findPosition(30));

        myList.updateAtposition(3,50);
        myList.printList();

        myList.updatevalue(10,69);
        myList.printList();

        myList.deleteHead();
        myList.printList();

        myList.deleteHead();
        myList.printList();


        myList.deleteHead();
        myList.printList();
//
//        myList.deleteTail();
//
//        System.out.println( "size of ll " + myList.getSize());
//        myList.printList();

        myList.deleteAtposition(2);
        System.out.println("size of ll " + myList.getSize());
        myList.printList();


        myList.deleteValue(20);
        myList.printList();



























    }

}
