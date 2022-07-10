public class pride extends Car{
  private  int  width = 3935;
  private  int  height = 1605;
  private int high = 1455;
    public pride(){
        super();
    }
    public pride(String color, boolean newmodel){
        super(color,newmodel);
    }
    @Override
    public  String toString(){
        return  String.format("Pride  = [ Color = %s  ,  NewModel = %s  , width = %d ,  height = %d , high = %d ]",this.getColor(),this.getnewModel(),this.width,this.height,this.high);
    }
}
