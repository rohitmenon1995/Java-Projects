/*This program will print out a continent and the largest city in that continent based on values of of some int variables
*/
package javaapplication1;

public class Continents {
  int continent = 4;
  public Continents(){
    switch(continent) {
      case 1 :
        System.out.println("North America: Mexico City, Mexico");
        break;
      case 2 :
        System.out.println("South America: Sao Paulo,Brazil");
        break;
      case 3 :
        System.out.println("Europe: Moscow, Russia");
        break;
      case 4 :
        System.out.println("Africa: Lagos, Nigeria");
        break;
      case 5 :
        System.out.println("Asia: Shanghai, China");
        break;
      case 6 :
        System.out.println("Australia: Sydney, Australia");
        break;
      case 7 :
        System.out.println("Antartica: McMurdo Station,US");
      default:
        System.out.println("Undefined continent!");
        break;
    }
  }
	public static void main(String[] args) {
		Continents test1= new Continents();
		

	}
  
}