public class Droid{
  int batteryLevel;
  String name;
  //Constructor Method
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }
  public String toString() {
    return "Hello,I'm the droid:"+name+"!";
  }
  public void performTask(String task) {
    System.out.println(name + " is performing task:" + task);
    batteryLevel = batteryLevel - 10;
  }
  public int energyReport(){
    return batteryLevel;
  }
  
  
  public static void main(String[] args){
    Droid Codey = new Droid("Codey");
    System.out.println(Codey);
    Codey.performTask("Play music");
    Codey.performTask("Learn Spanish");
    System.out.println(Codey.energyReport());
    
  }
}