public class datatype {

    static void main(){
        // numeric  Dt - short , byte, int, long  ... en sab ki koi na koi  range fix hai

        byte num1= 127; // byte= +- 127 uske aage nhi

        long newnum=num1; // yeh ek type casting ke method called as implicit dt where humko koi chote DT ki value bade DT me store kr te hai
        System.out.println(newnum);
        System.out.println(num1);
        short num2 = 32767; //  32767 ke aage nhi
        System.out.println(num2);
        int num3=50000; //aasse pass of ths value
        System.out.println(num3);
        long num4=345604000; // alg - bg
        System.out.println(num4);

        // explicit type caste means hum koi mehnath kr rahe hai
        // bade data type ko chote datatye store krna hai
        // conditions jo bada data type vala number ha voh chote datatype vale number ki range ko satisfiys krns hoga

        //eg

        long newnewnum= 443443554;
        int num9=(int)(newnewnum);
        System.out.println(num9);








        // floating Dts
        float num5 = 3.456674322f; // yeh piche f syntex hai we have to use,, aleast last itna haii

        double  num6  = 3.4444400340334;
        System.out.println(num5);
        System.out.println(num6);


        //other -char ,boolean

        boolean eligibletovote=true;
        System.out.println(eligibletovote);

        char firstcharacter='a';
        System.out.println("MY FIRST CHAR IS :" + firstcharacter+2); // isme only numb. print hoga
        // if char bhi print krna hai tu
        System.out.println("char :"+ (char )(firstcharacter+2));

        




    }





}


/// article of this datatype ///
 /* What Are Data Types?
A data type specifies the type of data that a variable can hold.

For example:


Copy

int dailyPracticeMinutes = 90;
Here:

dailyPracticeMinutes → variable
int → data type
This means the variable can store only integer values.

Java is Statically Typed
Java requires every variable to be declared with a data type before it is used.

This is valid:


Copy

double mockAccuracy = 84.5;
This is invalid:


Copy

        mockAccuracy = 84.5;   // ❌ Error
Java must know the data type in advance.

Primitive Data Types in Java
Java has 8 predefined primitive data types. These are the most basic data storage types.

        1) boolean
Stores logical values: true or false.

Default value: false

Used in:

Conditions
Validation checks
Access control logic

        Copy

//Example:

boolean hasActiveSubscription = true;
System.out.println(hasActiveSubscription);
2) byte
Range: -128 to 127

Size: 8-bit

Used when memory efficiency matters.

        Example:


Copy

byte moduleLevel = 5;
System.out.println(moduleLevel);
//Default value: 0
3) short
Range: -32,768 to 32,767

Size: 16-bit

Used when integer range is small but larger than byte.

Example:


Copy

short contestScore = 1500;
System.out.println(contestScore);
//Default value: 0
4) int
Range: -2³¹ to 2³¹-1

Size: 32-bit

Most commonly used integer type.

        Example:


Copy

int totalUsers = 250000;
System.out.println(totalUsers);
//Default value: 0
For most placement problems, int is the default integer choice.

        5) long
Range: -2⁶³ to 2⁶³-1

Size: 64-bit

Used for very large numbers.

        Example:


Copy

long platformVisits = 15000000000L;
System.out.println(platformVisits);
//Notice the L at the end. Without L, Java treats it as int.
//Default value: 0
6) double
64-bit floating-point type.

Used for decimal numbers.

Example:


Copy

double averageCompletionTime = 3.75;
System.out.println(averageCompletionTime);
//Default value: 0.0
⚠ Never use double for precise currency calculations due to rounding issues.

7) float
32-bit floating-point type.

Less precise than double.

Example:


Copy

float discountRate = 12.5F;
System.out.println(discountRate);
Notice the F. Without F, Java treats decimal values as double.

Default value: 0.0f

        8) char
Stores a single Unicode character.

        Size: 16-bit

Example:


Copy

char gradeLevel = 'A';
System.out.println(gradeLevel);
//You can also assign using Unicode:
char symbol = '\u2605';
System.out.println(symbol);
//Default value: '\u0000'
Primitive vs Reference Types
The 8 types above are primitive types. Java also supports reference types, such as:

String
        Arrays
Classes
        Objects
String (Reference Type)
Strings are not primitive. They are objects of java.lang.String.

        Example:


Copy

String trackName = "DSA Mastery Track";
System.out.println(trackName);
Why Data Types Matter (Placement Perspective)
        In interviews, companies test:

Proper data type selection
Overflow handling
Precision issues
Memory optimization
Type mismatch errors
Example:

If problem constraints allow values up to 10¹²,

using int will cause overflow.

You must use long.

Strong data type understanding prevents:

Runtime errors
Wrong answers
Edge case failures */
