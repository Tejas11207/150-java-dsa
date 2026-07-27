import java.util.Scanner;

public class stringbasic {
    //question 1 print all the char of the string
    static void printstring(String str) {
        int n =str.length();
        for(int i=0;i<=n-1;i++){
        char ch =str.charAt(i);
        System.out.println((ch));}

    }
    static  void getlenghtofstring(String stri){
        char[] arr=stri.toCharArray();
        int len=arr.length;

    }
    static void main() {


        String str = "love";
        printstring(str);


//        String fristname="tejus"; // method 1 to create an string
//        String lastname="joshi";
//        System.out.println("my full name is "+ fristname + lastname );
//        String fs= new String("hehe"); //  method 2 to create an string
//        System.out.println("the fs is :"+fs);
//
//        // accessing the string char.
//        System.out.println(fristname.charAt(0)); // not firstname[0] not aas arrays
//        System.out.println(lastname.length());
//
//        String name1 ="sticker";
//        String name2 ="STICKER";
//        //METHOD 1 CASE SENSITIVE
//        if (name1==name2){
//            System.out.println("if the both name are equal");
//
//        }
//        else {
//            System.out.println("not equal");
//        }
//        //case 2
//        // also CASE SENSITIVE and actual campare the contant
//        if (name1.equals(name2)){
//            System.out.println("if the both name are equal");
//
//        }
//        else {
//            System.out.println("not equal");
//
//        }
//        // method 3 - not case sensitive and ignor all case and just compare
//        if (name1.equalsIgnoreCase(name2)){
//            System.out.println("if the both name are equal");
//
//        }
//        else {
//            System.out.println("not equal");
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("provide the next string contant");
//        String str=sc.nextLine(); // print hole line
//        System.out.println("the string is :"+str);
//
//
//        System.out.println("provide the next string contant");
//        String stri= sc.next(); // 1st space stop
//        System.out.println("the string is :"+stri);


    }}

