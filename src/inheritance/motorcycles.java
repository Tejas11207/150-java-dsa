package inheritance;

public class motorcycles  extends vehicles{
    public String handlebarstyle;
    public int suspensiontype;

    motorcycles(String name,String model,int nooftyer,String handlebarstyle,int suspensiontype){ //sare meb define krne hogne
       super(name,model,nooftyer);
        this.handlebarstyle=handlebarstyle;
        this.suspensiontype=suspensiontype;

    }
    public void wheelie(){

        System.out.println("the motorcycle is doing wheelieeee"+name+model);

    }
}
