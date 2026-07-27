package arraysquestions.java;

import java.util.HashMap;

public class arraysp_2 {
    // rever an arrays

    static void reversearray(int [] arr) {
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while (i<=j){
            // swap
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            // i ki value ko badho;
            i++;

            //j ki value ko dec kro

            j--;
        }
        // print kra do
        for(int ans : arr)
            System.out.println("the rev. arrays is "+ans);

    }

    //shift elemnet by 1 position
    static void shiftelement(int [] brr){
        // store the value of last element in temprory variable
        int n = brr.length;
        int temp = brr[n-1];

        //shift value by one positon
        for(int i =n-1; i>0;i--){

            brr[i] = brr[i-i];

        }
        // temp value ko last value dedo
        brr[0]= temp;
        for(int s : brr){
            System.out.println(s );
        }

    }
    // altenate extreme
    static void altext(int [] err) {

        int n = err.length;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (i == j) {
                System.out.println(err[i]);

            } else {
                //i<j
                System.out.println(err[i]);
                i++;
                System.out.println(err[j]);
                j--;

            }
        }
    }

    // mode of the array
    static int getmode(int [] grr){
        //create an hash map
        HashMap<Integer,Integer> freq= new HashMap<>();

        for(int num : grr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        //kon kitne bar store ho raha hai
        //        for(int i : freq.keySet()){
        //            //i -> will represent key
        //            System.out.println(i + " -> " +freq.get(i));
        //        }

        //freq vala num
        //let kiya store krne krliye
        int maxfreq= -1; // kyu ki frequency kabhi negative nhi hosakti hai
        int maxfreqwalikey = -1;

        for(int key: freq.keySet()){ // sarre key return krega
            int currentkey=key; // simply store the current no
            int currentkeykifrequency=freq.get(key); // isme frequency ko store krega
            if(currentkeykifrequency>maxfreq){
                //mujhe new max mil gya
                maxfreq=currentkeykifrequency;
                maxfreqwalikey=currentkey;
            }
        }
        //jab loop se bhar aange toh max wali key ready hogi
        return maxfreqwalikey;

    }
    //higest and lowest element  with the freq.
    static  int [] highestlowestfreq(int[] hrr){

        HashMap<Integer,Integer> freq= new HashMap<>();

        for(int num : hrr){
            freq.put(num,freq.getOrDefault(num,0)+1);

        }
        //hash map is ready
        int highestfreq = Integer.MIN_VALUE; // it is the smallest integer possible.
        int hightnum=-1; //Stores the number with highest frequency.

        for(int key : freq.keySet()){
            int currentkey=key;
            int currentfreq=freq.get(key);
            if (currentfreq >highestfreq){
                //highest ko update krdo
                highestfreq = currentfreq;
                hightnum= currentkey;

            }

        }
        int lowestfreq=Integer.MAX_VALUE;
        int lowestnum=-1;
        for(int key:freq.keySet()){
            int currentkey=key;
            int currentfreq=freq.get(key);

            if (currentfreq<lowestfreq){
                //its time to update
                lowestfreq=currentfreq;
                lowestnum = currentkey;

            }

        }

        int [] ns={hightnum,lowestnum};
        return ns;


    }










    static void main() {
        int hrr[] = {1,2,2,3,3,4,4,5,5,5};
        int ns[] = highestlowestfreq(hrr);
        System.out.println("highest freq num = "+ ns[0]);
        System.out.println("low freq num = "+ ns[1]);





        int[] grr = {1, 2, 3, 1, 1, 3, 4, 5, 5, 5, 1};
        int ans = getmode(grr);
        System.out.println(ans);
        //  getmode(grr);


        int err[]={1,2,3,4,5,6};
        altext(err);

        int[] brr ={10,20,30,40,50,60,70};
        shiftelement(brr);


        int []arr={1,2,3,4,5};
        reversearray(arr);




    }}



