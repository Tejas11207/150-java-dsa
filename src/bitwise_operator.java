import java.util.Scanner;


public class bitwise_operator {

    static void main() {

        int a = 5 ;
        int b = 6;

        System.out.println(5&6); // and  opertor

        System.out.println(5|6); // or opertor

        System.out.println(5^6); // xor operator

        System.out.println(~5); //not operator

        System.out.println(5<<2); // leftshift

        System.out.println(5>>2); // right shift


        // check the number is odd or not
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int  n = sc.nextInt();
        if ((n&1)==0){
            System.out.println("even");

        }
        else {
            System.out.println("odd");

        }
        // how its works = even ->last bit -> 0
        //  odd ->last bit ->1

        // multiply by 2 -- left wise opertor
        int D= 5;

        System.out.println( D<<1);

        // divide by2 -- right wise operator

        int e =6;
        System.out.println(e>>1);

        // check the power to 2 - expontional

        int x =18;
        if((n&(n-1))==0){
            System.out.println("the expo");

        }

        else {
            System.out.println("no expo");
        }




    }



}
