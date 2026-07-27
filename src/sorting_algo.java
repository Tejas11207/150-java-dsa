public class sorting_algo {

    static void bubblesort(int arr[]) {
        int n =arr.length;
        // mera i fix rahega 0 th idex pe
        // jo kaam krna hai voh krega j and j+1
        // mera j bhi 0 th index pe set hoga nd j+1 loop me itrate hoga then  j and j+1 dono aage aaabadge and campare krnge i se then swap
        for(int i=0;i<n-1;i++){
            for(int j =0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;


                }
            }

        }

    }
    static void selectionsort(int arr[]){
        //outerloop for rounds
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            int minIndex = i;
            //inner loop -> comparison arr[j] and arr[minindex]
            // loop runhie krunga mai arr[j] and arr[minIndex] ke sath
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; //i just want to store the values

                }

            }


            //jab saare comparison complete hojaye
            // toh main minIndex vali value ko correct position pr place krduga
            //swap arr[i] , arr[minIndex]
            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=arr[i];


        }
    }

    static void insertionsort(int[]arr) {
        int n =arr.length;
        for(int i =1;i<n;i++){
            int curr=i;
            int prev=i-1;
            int currValue=arr[i];
            //shifting;
            while(prev>=0 && currValue<arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;

            }
            //ab humare pss ek khaali jagah aa chuki haio
            //place the current value
            arr[prev+1]=currValue;
        }

    }


    static void main() {
        int arr[]={2,5,6,7,3,1,};
        //bubblesort(arr);
        //selectionsort(arr);
        insertionsort(arr);

        System.out.println("print the arrays");
        for(int val:arr){
            System.out.println(val+" " );
        }
    }
}
