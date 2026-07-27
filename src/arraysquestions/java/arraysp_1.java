package arraysquestions.java;

import java.util.HashMap;

public class arraysp_1 {

    //1  find the avg of the array
    static double getavg(int[] arr) {

        double sum = 0;
        for (int i = 0; i <= arr.length; i++) {
            double value = arr[i];
            sum = sum + value;
            return sum;


        }
        double size = arr.length;
        double avg = sum / size;
        return avg;

    }

    // 2  multiply wacr element of arrays by 10;
    static int[] multiplyby10(int[] arrr) {
        int size = arrr.length;
        int newarray[] = new int[arrr.length];

        for (int i = 0; i < arrr.length; i++) {
            int elemnet = arrr[i] * 10;
            newarray[i] = elemnet;

        }
        return newarray;


    }


    // 3 find the target element linersearch
    static boolean findelement(int xrr[], int target) {
        // boolean isliye use kiya kyuki mujhe true and flase me ans chaiye tha
        for (int i = 0; i < xrr.length; i++) {
            if (xrr[i] == target) {
                return true;
            }
        }
        // agar poora arrya travel nhi kr paiye to flase,
        // ek baar bhi target nhi mila


        return false;

    }

    // 4 max element find

    static int maxelement(int brr[]) {
        int max = brr[0];
        for (int i = 0; i < +brr.length; i++) {
            if (max < brr[i]) {
                max = brr[i];
            }


        } // jab meain yaha pochunga , toh poora array compare ho chuka hoga and maxi ke anadr sabsr badi value hogi
        return max;

    }

    static int[] postiveNegativeSum(int[] urr) {
        int positivesum = 0;
        int negativesum = 0;
        for (int i = 0; i < urr.length; i++) {
            if (urr[i] > 0) {
                //num is positive
                positivesum = positivesum + urr[i];

            } else {
                //num is negative
                negativesum = negativesum + urr[i];

            }

        }
        int[] jaw = {positivesum, negativesum}; //dono ko indexing de hue hai posi-0th and neg = 1th
        return jaw;

    }

    static int[] countzeroone(int[] lrr) {
        int countzero = 0;
        int countone = 0;
        for (int i = 0; i < lrr.length; i++) {
            if (lrr[i] == 0) {
                countzero = countzero + lrr[i];
            } else {
                countone = countone + lrr[i];
            }
        }
        int[] solution = {countzero, countone};
        return solution;

    }

    static int unsortedelement(int[] srr) {
        for (int i = 0; i <= srr.length; i++) {
            if (srr[i + 1] < srr[i]) {
                return srr[i + 1];
            }
        }

        // jis casr me main loop se bahar ajiunga
        return -1;
    }

    static void swapelements(int[] wrr) {


        for (int i = 0; i <= wrr.length-1;i+=2) {
            int temp = wrr[i];
            wrr[i] = wrr[i + 1];
            wrr[i + 1] = temp;

        }


}
    static void intersecrtingelement(int[]mrr,int[]nrr){


        for(int i =0;i<=mrr.length-1;i++) {

            for (int j = 0; j <= nrr.length-1; j++) {
              if(mrr[i]==nrr[j])
              {
                  System.out.println("the common element is "+mrr[i]);
                  break;
               }
            }
        }}

//    static  int []  altextreamelements(int [] err){
//
//        int min= err[0];
//        int max= err[1];
//        for(int i =0;i<err.length;i++){
//            if(err[i+1]>err[i]){
//
//                max = err[i+i];
//                    int temp = min;
//                    min=max;
//                    max = temp;
//            }
//        }
//
//        return lu;
//
//    }



    static void main() {
//        int []err= {1,2,3,4,5,6};
//        int []lu = altextreamelements(err);
//        System.out.println(lu);



        int[] mrr = {1, 2, 3, 4, 5};
        int[] nrr = {4, 5, 6, 7, 8};
        intersecrtingelement(mrr, nrr);


        int wrr[] = {1, 2, 3, 4, 5, 6};
        swapelements(wrr);
        for (int num : wrr) {
            System.out.println(num + " ");
        }


        int[] srr = {1, 2, 3, 5, 4, 6, 7};
        System.out.println(unsortedelement(srr));


        int[] lrr = {0, 1, 1, 0, 1, 0, 1, 0};
        int solution[] = countzeroone(lrr);
        System.out.println("0 = " + solution[0]);
        System.out.println("1 =" + solution[1]);

        int[] urr = {1, -2, -4, 9, -8, 10};
        int[] jaw = postiveNegativeSum(urr);
        System.out.println("positive sum: " + jaw[0]);
        System.out.println("negative sum :" + jaw[1]);


        int brr[] = {1, 2, 3, 4, 5};
        int solve = maxelement(brr);
        System.out.println(solve);

        int xrr[] = {1, 2, 3, 4, 5, 6, 7};
        boolean anss = findelement(xrr, 7);
        System.out.println(anss);


        int[] arrr = {1, 2, 3, 4, 5};
        int ans[] = multiplyby10(arrr);
        System.out.println("printing the arrays");
        for (int i : ans) {
            System.out.println(i);

        }


        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(getavg(arr));
      }

    public static class arraysp_2 {



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
}


