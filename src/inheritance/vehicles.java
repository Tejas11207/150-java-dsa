package inheritance;


//main class
public class vehicles {
    //model
   public  String name;
   public String model;
   public int nooftyer;

   //default ctor
    vehicles(){
        name ="";
        model="";
        nooftyer = -1;

    }
    //prameter ctor
    vehicles(String name,String model, int nooftyer){

        this.name=name;
        this.model=model;
        this.nooftyer=nooftyer;



    }
    //behavour

    public  void start_engin(){

        System.out.println("the car engin is start"+name + model);


    }
    public void stop_engin(){

        System.out.println("the car is stoped:"+name+model);
    }
}
