package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class printMiddleElementOfStack {

    public static  void printMiddelElementFromStack(Deque<Integer> st,int count,int size){

        // base case
        if(count == size /2){
            int middleElement = st.peek();
            System.out.println("middle emelent from stack "+ middleElement);
            return;
        }
        // 1 case main solve krunga bakki recurion samabhal lega
        st.pop();
        count++; // pop krunga toh fir count increment

        // baki recursion
        printMiddelElementFromStack(st,count,size);


    }
    static void main() {

        Deque<Integer> st = new ArrayDeque<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int count=0;
        int size = st.size();
        printMiddelElementFromStack(st ,count,size);

    }
}
