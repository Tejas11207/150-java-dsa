public class basicmaths {


    static  void printdigit(int num){

        // agar  mere num = 0 ; toh main rukhjana hai
        //agar  mere num != 0 ; toh main proccess krte rhena hai
        while (num!=0) {

            int digit = num % 10;
            System.out.println(digit);
            // last digit remove bhi toh krna hai
            num = num / 10; // remove hie aaase hoga

        }
    }

    static  int countdigit(int num){    // return krega isliye int
        int count =0;
        while(num!=0){

            int digit = num % 10;
            count++;
            num = num/10;

        }
        return count;



    }
    static  int sumofdigit(int nums) {    // return krega isliye int
        int sum = 0;
        while (nums != 0) {

            int digit = nums % 10;
            sum = sum + digit;
            nums = nums / 10;

        }
        return sum;}

    static boolean ispalindrome(int num){

        int oringinalnum=num;
        int reversenum=reversenum(num);
        if (oringinalnum==reversenum){
            System.out.println("is the palindrom");
            return true;
        }
        else
            System.out.println("is not");
        return  false;
    }

    static int  reversenum(int num2) {
        int revnum = 0;
        // ans = ans*10+digit
        while (num2 != 0) {
            int digit = num2 % 10;
            revnum = revnum * 10 + digit;

            num2 = num2 / 10;


        }
        return revnum;
    }
        static boolean isprimeornot ( int num2) {
        for (int i =2;i*i<=num2;i++){ // fast tarikha
            //for (int i = 2; i <= num2 - 1; i++) {
                if (num2 == 0) {
                    //not a prime
                    return false;


                }
            }
            // taha tbhi pohoch paoge , jab loops se bhaar nikhloge
            // or loop se tbhi bahar nikloge , jb kabhi bhi
            //reminder me zero naa aaye;
            // or ager kabbhi remainder 0 nhi aaye
            // iska matlb ists a prime no
            return  true;
        }
        static int gcd(int a ,int b ){
        //fcd(a,b)= gcd(b,a%b)
            while(b!=0){

                int oflvalueofb=b;
                b=a%b;
                a=oflvalueofb;

            }
            // jab mera b = 0 hoga tb a ki place pr gcd milea
            int ans = a ;

            return  ans ;





            }






    static void main() {
        System.out.println(gcd(18,12));
            boolean ans3= isprimeornot(8);
        System.out.println(ans3);
            boolean ans =ispalindrome(1221);
        System.out.println(ans);
            int num2 = 12345;
            int revnum=reversenum(num2);
        System.out.println(revnum);

           int nums = 51370;
            int ans2 = sumofdigit(nums);
            System.out.println(ans2);
//        int ans = countdigit(num);
//        System.out.println(ans);

            //printdigit(num);




    }}
