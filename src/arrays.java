import java.sql.SQLOutput;
import java.time.chrono.MinguoDate;
import java.util.Scanner;

public class arrays {

    static void main() {

        // 4 - find out the min no / lowest value in an arrays ;
        int xrr[]={-5,-9,-8,-18,5,19,67};
        int v=xrr.length;
        int minvalue= xrr[0];
        for(int s=0;s<v;s++)
        {
            if (xrr[s]<minvalue) {
                // min value update
                minvalue=xrr[s];}

        }
        System.out.println(minvalue);


        // 3 - find out the greatest no / max value in an array

        int brr[]={2,-5,6,29,56};
        int t =brr.length;
        int maxvalue=brr[0]; // try to chose first or the last elemnt

        // now , compare maxvalue ko arrays k harr element k sath;
        for(int x=0;x<t;x++){ // yaha se mene arrays ko init kiya hai to be ready to campare
            if (brr[x]>maxvalue){
                // update the maxvalue;
                maxvalue=brr[x];
            }
        }
        System.out.println("the max vlaue is "+maxvalue);


        // 2 ques multiply all the elementso f an aarrya
        int arr[]={2,3,4,5};
        int multiply=1;
        int n=arr.length;
        for(int i=0;i<=n-1;i++)
        {
            int val=arr[i];
            multiply= multiply * val;


        }
        // print
        System.out.println(multiply);

        //method 2 manully indixing
       int m=arr[0]*arr[1]*arr[2]*arr[3];
        System.out.println(m);



        // questions  on arrays ;
        //1 take an arrays of 5 size and add them , nd print the sum
        int c[]= {10,20,30,40,50};
//        int sum =0;
//        int n =arr.length;
//        for(int i =0;i<=n-1;i++)
//        {
//            int value = arr[i];
//            sum = sum+value;
//
//        }
//        // print
//        System.out.println(sum);

        //method 2
        int f=c[0]+c[1]+c[2]+c[3]+c[4];
        System.out.println(f);

//        Scanner sc  = new Scanner(System.in);
//
//
//        System.out.println("enter the sze of arrays ");
//        int p =sc.nextInt();
//        int arr[]=new int [p];
//        int n =arr.length;
//        // input
//        for (int i =0;i<n;i++){
//            System.out.println("for the arrays inputs index "+i);
//            arr[i]=sc.nextInt();
//        }
//        // print
//        System.out.println("your arrays is :" );
//        for(int val:arr){
//            System.out.println(val);
//        }
//        // decalariton of arrays
//
//        int arr[];
//        // allocation;
//        arr = new int[5];
//        // init;
//        int brr[] = {1, 2, 3, 4, 4};
//
//        // for the access of the arrays we have to use the indices like 0,1,2,3... upto n-1
//
//
//        System.out.println("the value of the 1 st elemnet of the arrays" + brr[0]);
//        System.out.println("the value of the 2nd st elemnet of the arrays"+brr[1]);
//        System.out.println("the value of the 3rd st elemnet of the arrays"+brr[3]);
//
//        // you can also access the arrrays with the forloops of loops
//        int n =brr.length ;
//        for(int ind=0; ind<=n-1;ind++)
//        {
//            System.out.println(brr[ind]);
//        }
//        // for each loop ka use krkre bhi bhi arrays ko print krava sakthe hai
//
//        for(int val:brr){




    }
}
