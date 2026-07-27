public class strings02 {
    // question 1 -Print all characters of a string.
    static void cout(String rr) {
        int n = rr.length();
        for(int i = 0 ; i<n ; i ++){
            char cu = rr.charAt(i);
            System.out.println(cu);
        }
    }







    // methods  of string
    static void main() {
        String rr = "ululou";
        System.out.println(rr);


        String str = "tejus ";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        String name = "joshi ";
        System.out.println(str.equals(name));
        System.out.println((str.equalsIgnoreCase(name))); // just ingore the all cases and campare it
        String st = "   ";
        System.out.println(st.length());
        System.out.println(st.isEmpty()); // empty -> = length =0 check the string is khali hai ya nhi
        System.out.println(st.isBlank()); // blank -> = empty or sirf space h string me

        String name2= "  sume     ";
        name2=name2.trim() ; // trimpe- cuts all the space and retrun the whole string without the space
        System.out.println(name2.length());
        System.out.println(name2);
        System.out.println(name2.toUpperCase()); // just change the string into upper case
        String c = " SUME  ";
        System.out.println(c.toLowerCase());

        String hi = "MY Name is love tejus ";
        //0 th index -> M;
        //1 st index ->y;
        // 2 -> space nd so on
        // begingIndex ->3 -> inclusive
        // endIndex ->6 -> exclusive
        // slicing
        System.out.println(hi.substring(3,8)); // name prints  means kaha se kaha tk jana hai just put the indexix
        System.out.println(hi.contains("love")); // just check the string/ word  is exits in the  line

       int num = 5123;
       String tit=String.valueOf(num);
        System.out.println(num+1); // last vala numb me pluse one output 5124 ... no me add hoga
        System.out.println(tit +1); // one add nhi hoga judega 5123 se and banega 51231 .. join hoga


        String titu="titu ke papa";
        System.out.println(titu.startsWith("titu ke"));
        System.out.println(titu.endsWith("papa"));

        // char ko print
        String juju ="hehehe";
        char crr[]=name.toCharArray(); // yeh array krega as img

        // print the char array  // using each arrays method
        for(char ch: crr ) {
            System.out.println("the value of juju :"+ch);
        }
        // split -> output -> string arrays
        String input ="meru naam ,,, tejas hai ,,😊";
        String[]words =input.split(",");
        for (String voh: words ){
            System.out.println(voh);
        }
        String kullu =" rajeev";
         kullu= kullu.replace('r','h');
        System.out.println(kullu);


    }
}
