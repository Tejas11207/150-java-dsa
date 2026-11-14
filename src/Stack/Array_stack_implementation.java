package Stack;

public class Array_stack_implementation {

    static  class myStack {


        // create stack
        private int[] arr;
        private int capacity;
        private int top;

        // ctor

        public myStack(int capacity) {
            this.capacity = capacity;
            this.arr = new int[capacity];
            this.top = -1;  // initial on -1 so our stack is empty ;


        }

        public void push(int value){
            if(top == capacity-1){

                System.out.println("the stack is overflow");

            }
            else{
                top++;  // top ko aage kro
                arr[top]=value; // top ko value ke equal kr do

            }


        }
        public  void pop(){
            if(top ==-1){
                System.out.println("the stack is overflow");
            }
            else{
                arr[top] = -1;
                top--; // top ko piche kro
                 // new down grade vale value assigne kro

            }
        }
        public int peek(){
            if(top ==-1) {
                System.out.println("the stack is empty");
            }
            else{
                return arr[top];

            }
            return  -1;

        }
        public  int getSize(){
            // size = current number of element inside the stack
            return  top+1;
            // kyunki size array me size hamesha ek kaam hoti hain
        }
        public  int getCapacity(){
            return  this.capacity;

        }
        public boolean checkEmpty(){
            if(top ==-1){
                return true ;

            }
            else

                return false;

        }


    }

    // traversal using stack

    public  static  void printStack(myStack st){
        while(!st.checkEmpty()){
            System.out.println(st.peek() + " ");
            st.pop();

        }
    }



    static void main() {

        myStack st = new myStack(3);
        st.push(10);
        System.out.println("size of stack " + st.getSize());

        st.push(20);
        st.push(30);
        System.out.println("size of stack "+ st.getSize());

        printStack(st);
//
//        st.push((40));
//        st.push(50);
//        System.out.println("size of stack " + st.getSize());
//
//        st.pop();
//        System.out.println("pop stack"+ st.getSize());
//
//        st.pop();
//
//
//        System.out.println("pop stack" +st.peek());
//
//        st.peek();
//        System.out.println("peek of stack");
//        System.out.println(st.checkEmpty());


    }

}
