public class opertors {
    static void main(){

        int solvedthisweek= 9;
        int solvedlastweek=12;

        int total = solvedlastweek + solvedthisweek;
        int difference=solvedlastweek - solvedthisweek;
        int multiply=solvedlastweek * solvedthisweek;
        int onemultiply=solvedlastweek*4;
        int divide= solvedlastweek / solvedthisweek;
        int divi=solvedlastweek/7;
        int reminder=solvedlastweek % 2;

        System.out.println(total);
        System.out.println(difference);
        System.out.println(multiply);
        System.out.println(onemultiply);
        System.out.println(divide);
        System.out.println(divi);
        System.out.println(reminder);


        int a =9;
        int b=10;
        // comparesion operator
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

        boolean compdsa=true;
        boolean comptdsa=false;
        System.out.println(compdsa && comptdsa); // andf operator
        System.out.println(compdsa || comptdsa); // nor opertor
        System.out.println(!comptdsa); // not opertor


        int ratingPoints = 100;

        ratingPoints += 20;// ratingPoints = ratingPoints + 20
        System.out.println(ratingPoints); // 100+20=120
        ratingPoints -= 10;  // ratingPoints = ratingPoints - 10
        System.out.println(ratingPoints); //120-10=110
        ratingPoints *= 2;   // ratingPoints = ratingPoints * 2
        System.out.println(ratingPoints); //110*2=220
        ratingPoints /= 4;   // ratingPoints = ratingPoints / 4
        System.out.println(ratingPoints); // 220/4= 55
        ratingPoints %= 30;  // ratingPoints = ratingPoints % 30

                System.out.println(ratingPoints); // 55%30



        int activeUsers = 100;

        int prefix = ++activeUsers;
        //pehle activeuser increment hua and  bngaya=101
        // fer prefix me copy huA , so prefix ki value =101

        int postfix = activeUsers++;
        // active user =101 sbkuch hone ke baad
        //pehle use krta hai ,postfix me copy hoke,prefix=101;
        //uske baaaf increment krdia,active user =102
        System.out.println(prefix);
        //101
        System.out.println(postfix);
        //101
        System.out.println(activeUsers);
        //102












    }






}







//Java Operators
//Operators are special symbols used to perform operations on variables and values.
//
//For example:
//
//
//Copy
//
//int solvedWeek1 = 40;
//int solvedWeek2 = 35;
//
//int totalSolved = solvedWeek1 + solvedWeek2;
//Here, + is an operator that performs addition.
//
//Types of Operators in Java
//Java operators are classified into:
//
//Arithmetic Operators
//Assignment Operators
//Relational Operators
//Logical Operators
//Unary Operators
//Bitwise Operators
//Other Operators (instanceof, ternary)
//        In Java, operators are used in Mathematical calculations, Decision making, Loop conditions, Bit manipulation & Real-world logic building
//
//Understanding operators deeply is critical for DSA, Competitive programming, Backend development and Coding interviews. Let’s understand each in detail.
//
//1) Arithmetic Operators
//Arithmetic operators perform mathematical calculations.
//
//        unknown node
//Example
//
//        Copy
//
//public class Main {
//    public static void main(String[] args) {
//
//        int solvedThisWeek = 25;
//        int solvedLastWeek = 15;
//
//        int total = solvedThisWeek + solvedLastWeek;
//        int difference = solvedThisWeek - solvedLastWeek;
//        int projected = solvedThisWeek * 4;
//        int average = solvedThisWeek / 7;
//        int remainder = solvedThisWeek % 7;
//
//        System.out.println(total);
//        System.out.println(difference);
//        System.out.println(projected);
//        System.out.println(average);
//        System.out.println(remainder);
//    }
//}
//Explanation
//1) + (Addition)
//
//Copy
//
//int total = solvedThisWeek + solvedLastWeek;
////Adds both operands.
////  25 + 15 = 40
//2) - (Subtraction)
//
//Copy
//
//int difference = solvedThisWeek - solvedLastWeek;
////  25 - 15 = 10
//3) * (Multiplication)
//
//Copy
//
//int projected = solvedThisWeek * 4;
////  25 × 4 = 100
//4) / (Division)
//
//Copy
//
//int average = solvedThisWeek / 7;
////  25 / 7 = 3
//⚠ Important: Since both operands are integers, Java performs integer division.
//
//The decimal part (3.57) is discarded.
//
//        5) % (Modulo)
//
//Copy
//
//int remainder = solvedThisWeek % 7;
////  25 % 7 = 4
////  Because: 25 = (7 × 3) + 4
//Used heavily in:
//
//Even/odd checks
//Circular indexing
//DSA problems
//2) Assignment Operators
//Assignment operators assign values to variables.
//
//Basic assignment:
//
//
//Copy
//
//int streak = 5;
//Compound assignments:
//
//unknown node
//Example
//
//        Copy
//
//public class Main {
//    public static void main(String[] args) {
//
//        int ratingPoints = 100;
//
//        ratingPoints += 20;  // ratingPoints = ratingPoints + 20
//        ratingPoints -= 10;  // ratingPoints = ratingPoints - 10
//        ratingPoints *= 2;   // ratingPoints = ratingPoints * 2
//        ratingPoints /= 4;   // ratingPoints = ratingPoints / 4
//        ratingPoints %= 30;  // ratingPoints = ratingPoints % 30
//
//        System.out.println(ratingPoints);
//    }
//}
//Explanation
//Start: ratingPoints = 100
//
//After += 20 → 120
//
//After -= 10 → 110
//
//After *= 2 → 220
//
//After /= 4 → 55
//
//After %= 30 → 25
//
//These operators are frequently used inside loops.
//
//3) Relational Operators
//Relational operators compare values.
//
//Return type → boolean (true or false)
//
//unknown node
//Example
//
//        Copy
//
//public class Main {
//    public static void main(String[] args) {
//
//        int currentStreak = 45;
//        int targetStreak = 50;
//
//        System.out.println(currentStreak == targetStreak);
//        System.out.println(currentStreak != targetStreak);
//        System.out.println(currentStreak > targetStreak);
//        System.out.println(currentStreak < targetStreak);
//        System.out.println(currentStreak >= targetStreak);
//        System.out.println(currentStreak <= targetStreak);
//    }
//}
//Explanation
//
//
//45 == 50 → false
//
//        45 != 50 → true
//
//        45 > 50 → false
//
//        45 < 50 → true
//
//        45 >= 50 → false
//
//        45 <= 50 → true
//
//Used in:
//
//If statements
//Loops
//Filtering logic
//4) Logical Operators
//Used to combine boolean expressions.
//
//unknown node
//Example
//
//        Copy
//
//public class Main {
//    public static void main(String[] args) {
//
//        boolean completedDSA = true;
//        boolean completedCore = false;
//
//        System.out.println(completedDSA && completedCore);
//        System.out.println(completedDSA || completedCore);
//        System.out.println(!completedCore);
//    }
//}
//Explanation
//AND ( && )
//Returns true only if both conditions are true.
//
//        true && false → false
//
//OR ( || )
//Returns true if at least one condition is true.
//
//        true || false → true
//
//NOT ( ! )
//Reverses boolean value.
//
//        !false → true
//
//        5) Unary Operators
//unknown node
//Example (Prefix vs Postfix)
//
//Copy
//
//public class Main {
//    public static void main(String[] args) {
//
//        int activeUsers = 100;
//
//        int prefix = ++activeUsers;
//        int postfix = activeUsers++;
//
//        System.out.println(prefix);
//        System.out.println(postfix);
//        System.out.println(activeUsers);
//    }
//}
//
//
//
//
//Explanation
//Initial value = 100
//
//        ++activeUsers → increment first → becomes 101
//
//prefix = 101
//
//activeUsers++ → assign first (101), then increment
//
//postfix = 101
//
//Final activeUsers = 102
//
//This difference is frequently asked in interviews.
//
//6) Bitwise Operators
//Operate at binary level.
//
//unknown node
//Example
//
//
//        Copy
//
//public class Main {
//    public static void main(String[] args) {
//
//        int x = 6;  // 00000110
//        int y = 3;  // 00000011
//
//        System.out.println(x & y);
//        System.out.println(x | y);
//        System.out.println(x ^ y);
//        System.out.println(~x);
//        System.out.println(x << 1);
//        System.out.println(x >> 1);
//    }
//}
//Explanation
//6 in binary = 00000110
//
//3 in binary = 00000011
//
//x & y → 00000010 → 2
//
//x | y → 00000111 → 7
//
//x ^ y → 00000101 → 5
//
//        ~x → bitwise flip
//
//x << 1 → left shift → multiply by 2
//
//x >> 1 → right shift → divide by 2
//
//Bitwise operators are heavily used in:
//
//Advanced DSA
//Competitive programming
//Optimization problems
//7) instanceof Operator
//Checks whether an object belongs to a class.
//
//
//Copy
//
//String track = "CodeHelp ONE";
//
//boolean result = track instanceof String;
//
//System.out.println(result);
//Returns true if object matches type.
//
//8) Ternary Operator
//Shorthand for if-else.
//
//
//Copy
//
//int solvedProblems = 320;
//
//String level = (solvedProblems >= 300) ? "Advanced" : "Intermediate";
//
//System.out.println(level);
//If condition is true → first value
//
//Else → second value
//
//Operator Precedence
//Operators are evaluated in order.
//
//
//        Copy
//
//// Example:
//int result = 10 + 5 * 2;
//Multiplication happens before addition.
//
//Understanding precedence avoids logical bugs.
//
//Why Operators Matter
//Most coding round mistakes happen due to:
//
//Integer division confusion
//Wrong logical conditions
//Prefix/postfix misunderstanding
//Incorrect operator precedence
//Strong operator clarity improves accuracy significantly.
//
//
//
//
