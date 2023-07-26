public class CustomExceptionTest {
	public static void main(String[] args) 
	{
		System.out.println("MAIN started...\n");
		
		try {
			Car myCar = new Car();
			myCar.longDrive();
		}
		catch(CarKeyNotFoundException ex1) {
			System.out.println("Key Issue : "+ex1);
		} catch (NoSeatBeltException ex2) {
			// TODO Auto-generated catch block
			System.out.println("Belt Issue : "+ex2);
		} catch (CarBatteryDownException ex3) {
			// TODO Auto-generated catch block
			System.out.println("Belt Issue : "+ex3);
		}
		System.out.println("\nMAIN finished...\n");
		
	}
}

class CarBatteryDownException extends Exception 
{
	CarBatteryDownException(String msg) {
		super(msg);
	}
}
class CarKeyNotFoundException extends Exception
{
	CarKeyNotFoundException(String msg) {
		super(msg);
	}
}
class RedSignalDishnouredException extends RuntimeException
{
	RedSignalDishnouredException(String msg) {
		super(msg);
	}
}
class NoSeatBeltException extends Exception{
	NoSeatBeltException(String msg){
		super(msg);
	}
}

class TyrePuncturedException extends RuntimeException
{
	TyrePuncturedException(String msg) {
		super(msg);
	}
}



class Car
{
	boolean keyFound=false;
	boolean seatBelt=false;
	boolean carBatteryFunctioning=true;
	
	Car() throws CarKeyNotFoundException,NoSeatBeltException, CarBatteryDownException
	{
		double value = Math.random()%10;
		
		if(value>=0.10) {
			keyFound=true;
		}
		
		if(value<0.10) {
			carBatteryFunctioning=false;
		}
		else {
			System.out.println("Car Battery is FINE...!!!");
		}
		
		if(carBatteryFunctioning==false) {
			CarBatteryDownException ex = new CarBatteryDownException("Car Battery is out of order...");
			throw ex;
		}
		
		if(keyFound==true) {
			System.out.println("Car is started....");
			double value1 = Math.random()%10;
			
			if(value1>=0.10) {
				seatBelt=true;
			}
			
			if(seatBelt==true) {
				System.out.println("Wore seatBelt....");
				
			}
			else {
				//System.out.println("Car Key Not Found....");
				throw new NoSeatBeltException("Seat Belt is not used...");
				
			}
			
		}
		else {
			//System.out.println("Car Key Not Found....");
			throw new CarKeyNotFoundException("Hey...Where is the Car Key? im not getting it...");
			
		}
		
	}
	public void longDrive() {
		for (int i = 1; i <=30; i++) {
			System.out.println(i+" kms driven....");
			double value = Math.random()%10;
			if(value>0.95) {
				RedSignalDishnouredException ex1 = new RedSignalDishnouredException("Oh No!!! Red signal is dishonoured....");
				throw ex1;
			}
			else if(value>0.65 && value <=0.70) {
				TyrePuncturedException ex1 = new TyrePuncturedException("Oh No!!! tyre got punctured.......");
				throw ex1;
			}
		}
	}
}