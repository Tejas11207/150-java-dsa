package polymorphism;



public class main {

    public  static void dothedrawingstuff(shape s){
        s.draw(); // yeh shap ka method nhi call krta yeh apne inherated class ka method ko call krta hai
        // draw polymorphic hai
        // isko bolte hai upcasting - parent ke aadhar child

       // circle ci= (circle)s; //downcasting child ke aandar hai parent
        //ci.draw();
    }


    static void main() {
        calculator c = new calculator();
        System.out.println(c.add(2,5));

        System.out.println(c.add(2,3,4));
        System.out.println(c.add(2,3,4,5.3));


        // runtime poly means chize assigne krte time hie function allot hojayega
        // draw method polymorphic hai
        circle ci=new circle();
        //ci.draw();  - normal method call
        // upcasting method code
        dothedrawingstuff(ci);


        rectangle r = new rectangle();
        //r.draw();
        dothedrawingstuff(r);

        shape s =new shape();
        dothedrawingstuff(s);

    }}
