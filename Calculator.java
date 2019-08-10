public class Calculator{
  
  double result;
  public static final double pi = 3.14;
  public Calculator(){
    
  }
  //Adds two integers: a and b
  public double add(double a,double b){
    result = a + b;
    return result;
   }
  
  public double subtract(double a,double b){
    result = a - b;
  	return result;
   }
  
  public double multiply(double a,double b){
  	result = a * b;
    return result;
   }
  
  public double divide(double a,double b){
    result = a / b;
    return result;
   }
  
  public double modulo(double a,double b){
    result = a % b;
    return result;
   }
  public double areaOfCircle(double radius){
    result = radius*radius*pi;
    return result;
  }
  
  public static void main(String[] args)
  {
    
  	Calculator myCalculator = new Calculator();
    
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(45,11));
    System.out.println(myCalculator.areaOfCircle(2));
    
 }
}
