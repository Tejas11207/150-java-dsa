public class functions {

    //static int value =20; globle varibale
    static void print2katable(){
    int value=29;
        for(int i=0;i<=11;i++){
            int ans=2*i;
            System.out.println("->"+ans);
        }
    }
    static void printsum(int a ,int b){

        System.out.println("the sum is :" + (a+b));
    }

        static int mupltiply(int x ,int y){ // int,char , boolen , float etc ..... ek return type funtiond hai voh values ko returnr kr  deta haiii
        // void function cannot return anything
            int multiply=x * y;
            return  multiply;
        }


        // funtion overloading method - two funtion having same name but different parameters
        static int mupltiply(int a,int b ,int c ) {
        int mc = a* b* c;
        return  mc ;
        // if float me bhi ho toh bhi chalega bc  or any datatype
        }


    static void main() {
      
        int num=5;
        System.out.println("inside solve "+num);
        solve(num);
        System.out.println("inside solve"+num);
//        int ans1 = mupltiply(2,3,4);
//        int ans2 = mupltiply(2,5);
//        System.out.println("the ans1 is "+ans1);
//        System.out.println("the ans1 is "+ans2);


//        printsum(7,10);
//        System.out.println("printhogya");
//        print2katable();
//        System.out.println("printed");

    }
    // if me function ko niche bhi likh du toh bhi koi farak nhi padhta hsi

    //call by value- orginal value change nhi hogi make an dupilcate value and then perfrom the task
    static void solve(int num) {
        System.out.println( "inside solve "+num);
        num = num*10;
        System.out.println("inside solve "+num);


    }


}
