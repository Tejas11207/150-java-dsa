package inheritance;
//1st child car
public class car extends vehicles { // extends is keyword which is used to accuire the property of the parent class or other class
    public int noofdoors;
    public String transmissiontype;

    car(String name,String model,int nooftyer,int noofdoors,String transmissiontype){

        super( name,model,nooftyer); // super help to call the obj of other class but first we have to defined in ctor or in class
        this.noofdoors=noofdoors;
        this.transmissiontype=transmissiontype;




    }

    public void startac(){
        System.out.println("now the ac is turned on"+ name+model+noofdoors);
    }






}
