import java.util.Scanner;
import java.util.concurrent.Callable;


public class condtions

{

        static void main() {

            Scanner sc = new Scanner(System.in);
            System.out.println("enter the age");
            int a = sc.nextInt();
             System.out.println("age"+a);
            if(a>=18){ // single if
                System.out.println("you are an adult"+a);}
            if (a>=18){ // if else
                System.out.println("eliglible for the vote");
            }
            else{
                System.out.println("not eliglible for the vote");


            }
            // if -else if -else seddi

//            System.out.println("enter your day");
//            int b =sc.nextInt();
//
//            if(b==1)
//            {
//                System.out.println("monday");
//            }
//            else if (b==7)
//            {
//                System.out.println("sunday");
//            }
//            else if (b==2)
//            {
//                System.out.println("tuesday");
//            }
//            else if (b==3){
//
//                System.out.println("wednesday");
//            }
//            else if (b==4)
//            {
//                System.out.println("thrusday");
//            }
//            else if (b==5)
//            {
//                System.out.println("firday");
//            }
//            else if (b==6)
//            {
//                System.out.println("saturday");
//            }
//            else
//            {
//                System.out.println("kaho piyo ashh kro mitroo");
//            }
//
//            System.out.println("programm excited ");



            //nested if - if ke anger if or else


             int del=sc.nextInt();
             boolean t= sc.nextBoolean();

             if (del>18)
            {
                System.out.println("del is good person");
            }
            if(del==90)
            {
                System.out.println((t));
            }
            else{
                System.out.println("DARU PIYO");
            }


          // turnery operators

            int age =100;

            int ans = (age>18)? 22:12; // 22 true vala case hai and 12  flase vALA
            System.out.println(ans);

            // switch statement;

            System.out.println("enter  the day ");
            int ddiy = sc.nextInt();
            switch (ddiy){



                case 1:
                  System.out.println("MONDAY");
                break ; // if mai break nhi use krta hu toh  programm purake pura exicute hoye gya ek hie saas me

                case 2:
                System.out.println("TUESDAY");
                break;
                case 3 :
                System.out.println("WED");
                break;
                case 4 :
                System.out.println("FRIDAY");
                break;
                case 5 :
                System.out.println("SATURDAY");
                break;
                case 6 :
                System.out.println("SUNDAY");
                break;
                default:
                    System.out.println("hrgrgg");

            }






    }  }
