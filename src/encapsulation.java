public class encapsulation {



        // atributes
        private int id;
        private int age;
        private String name;
        private int nos;
        private String gf;


        public  String getName() { // get method help to use the private memb outside the  class
            return this.name;


        }
        public int getage(){

            return this.age;

        }
         void setAge(int A) {// set age is method to change anything from outside of class

            // MODIEY
                if( A<100){
            this.age = A;}
        }

    public  encapsulation(int id ,int age,String name,int nos,String gf){
            System.out.println("this is a parametrised constructor");

            this.id =id;
            this.age=age;
            this.name=name;
            this.nos=nos;
            this.gf=gf;


        }



      public void study(){

            System.out.println(name+"studybro");

        }
        public void sleep(){
            System.out.println(name +"sleeping");
        }

//        public bunk() {
//            System.out.println(name +"bunking");
//        }

          public void gfchating(){


            System.out.println(name+"gfchating");

        }










//        static void main() {  // this is accessabile because its is inside the class
//
//
//            // parameterised ctor
//            encapsulation b= new encapsulation(65,18,"tejus",5,"sume");
//            System.out.println(b.name);
//            System.out.println(b.age);
//            System.out.println(b.id);
//            System.out.println(b.nos);
//            System.out.println(b.gf);
//
//            b.study();
//            b.sleep();
//            b.bunk();
//            b.gfchating();













        }




