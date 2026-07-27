import java.math.BigInteger;
import java.util.Scanner;

public class inout {


    static void main() {
        // in c++ hum ko scanf or cin le the java me scanner hota hai
        Scanner sc = new Scanner(System.in); // khali ek baar he krna padta hai

        System.out.println("enter the value of the first num1");
        int firstnum=sc.nextInt();

        System.out.println("enter the secound value of the num2");

        int num2=sc.nextInt();

        int ans =firstnum + num2;
        System.out.println("the ans will be "+ans);

        BigInteger bg =sc.nextBigInteger();
        System.out.println( "bg"+bg);

        System.out.println("ente the value of flag");

        boolean flag=sc.nextBoolean();

        System.out.println("enter the value of short val ");

        short val= sc.nextShort();

        System.out.println( "enter the value of float");

        float fc=sc.nextFloat();

        System.out.println("the boolen"+flag);
        System.out.println("short val"+val);
        System.out.println("float value"+fc);



        sc.close();

    }
}




