package accommodationTestPune;

public class AccommodationTest {
	public static void main(String[] args) {
		House h1 = new House();
		h1.garden();
		h1.staying();
		h1.kitchen();
	}
}



interface Accommodation {
  abstract void staying();
}


abstract class Home implements Accommodation {

  abstract void kitchen();


  public void staying() {
      System.out.println("Staying in a home.");
  }
}


abstract class Hostel implements Accommodation {
  
  abstract void sharedFacilities();


  public void staying() {
      System.out.println("Staying in a hostel.");
  }
}

class Flat extends Home {

  public void kitchen() {
      System.out.println("Flat has its own kitchen.");
  }


  public void livingRoom() {
      System.out.println("Flat has a living room.");
  }
}


class House extends Home {

  public void kitchen() {
      System.out.println("House has a particular kitchen.");
  }


  public void garden() {
      System.out.println("House has a beautiful garden.");
  }
}


class Hotel extends Hostel {

  public void sharedFacilities() {
      System.out.println("Hotel has shared facilities for guests.");
  }


  public void roomService() {
      System.out.println("Hotel provides room service.");
  }
}


class PanGuest extends Hostel  {
  public void sharedFacilities() {
      System.out.println("PanGuest offers budget shared facilities.");
  }


   public void communalKitchen() {
      System.out.println("PanGuest have common kitchen");
      
   }

}


//														Accommodation   (staying)
//																	|
//									 ----------------------------------------------------------------										
//	   						   		|																|	
//						Home	(kitchen)															Hostel (sharedServices)
//               -----------------|------------------                              -----------------|---------------------
//              |                                    |                                 |                             |                                                            |
//        House  (garden)                          Flat  (livingRoom)      PanGuest (communalKitchen)              Hotel (roomService)
