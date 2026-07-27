public class classes_and_object {

    // atributes
    public int id;
    public int age;
    public String name;
    public int nos;

    // default ctor = consturctor // attr. -> garbage // same name as class

    public classes_and_object(){
        System.out.println("this is a defult ctor");
    }

    // parameterised ctor aasa ctor jike aander kuch na kuch toh ho

    public classes_and_object(int id ,int age,String name,int nos){
        System.out.println("this is a parametrised constructor");
        // now using this keyword we have to point the obj . which were created
        this.id =id;
        this.age=age;
        this.name=name;
        this.nos=nos;
        // now ye sare obj ab point hogye hai

    }
    //copy ctor - means copy krega dusre ctor ke attri.ko apne aandar
   public classes_and_object(classes_and_object srcobj) {
        // yeh srcobj keyword used to copy another constructor
        System.out.println("this is a copy constructor");
        // isme bhi same thingkrene hoga use this keyword;
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;

    }
    public void study(){

        System.out.println(name+"studybro");

    }
    public void sleep(){
        System.out.println(name +"sleeping");
    }
    public void bunk(){
        System.out.println(name +"bunking");
    }










    static void main() {
        // default ctor
        classes_and_object A= new classes_and_object();
        A.id = 65;
        A.age=19;
        A.name="raju";
        A.nos=5;
        System.out.println(A.name);
        System.out.println(A.id);
        System.out.println(A.age);
        System.out.println(A.nos);
        A.study();
        A.sleep();
        A.bunk();


        // parameterised ctor
        classes_and_object b= new classes_and_object(34,19,"tejus",5);
        System.out.println(b.name);
        System.out.println(b.age);
        System.out.println(b.id);
        System.out.println(b.nos);

        b.study();
        b.sleep();
        b.bunk();

        // copy ctor
        classes_and_object c =new classes_and_object(b); // jo ctor copy krna vo
        System.out.println(c.name);
        System.out.println(c.id);
        System.out.println(c.age);
        System.out.println(c.nos);

        c.study();
        c.sleep();
        c.bunk();








    }
}
