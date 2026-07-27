public class encapsulation_02 {


// not accessable because its is outside the class


    static void main() {


        // parameterised ctor
        encapsulation b = new encapsulation(65, 18, "tejus", 5, "sume");
        System.out.println(b.getName());
        System.out.println(b.getage());
        b.setAge(30);
        System.out.println(b.getage());

        b.study();

        b.sleep();
        b.gfchating();

    }
}