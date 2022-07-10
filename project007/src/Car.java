public class Car {
    private String Color;
    private boolean newModel;
    public Car(){
        Color = "";
        newModel = false;
    }
    public Car( String color, boolean newmodel){
        Color= color;
        newModel = newmodel;
    }
    public String getColor(){
       return this.Color;
    }
    public void  setColor(String color){
        this.Color= color;
    }
    public boolean getnewModel(){
        return this.newModel;
    }
    public void  setNewModel(boolean newModel1){
       this.newModel= newModel1;
    }
    @Override
    public  String toString(){
        return  String.format("Car = [ Color = %s  ,  NewModel = %s ] ",this.Color,this.newModel);
    }


}
