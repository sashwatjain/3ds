
public class ClassExtensionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
            Doctor a = new HeartSurgeon();
            Surgeon b = new HeartSurgeon();
            HeartSurgeon c = new HeartSurgeon();
            Doctor d = new Surgeon();
            Surgeon e  = new Surgeon();
            Doctor f = new Doctor();
            
           if(a instanceof Doctor) {
            	System.out.println("Its a Doctor's object");
            }
            else {
            	System.out.println("Its a Doctor's object");
            }
             
            if(b instanceof Doctor) {
            	System.out.println("Its a Doctor's object");
            }
            else {
            	System.out.println("Its a Doctor's object");
            }
            
           
            if(c instanceof Doctor) {
            	System.out.println("Its a Doctor's object");
            }
            else {
            	System.out.println("Its a Doctor's object");
            }
            
            if(d instanceof Doctor) {
            	System.out.println("Its a Doctor's object");
            }
            else {
            	System.out.println("Its a Doctor's object");
            }
             
            if(e instanceof Doctor) {
            	System.out.println("Its a Doctor's object");
            }
            else {
            	System.out.println("Its a Doctor's object");
            }
            
           
            if(f instanceof Doctor) {
            	System.out.println("Its a Doctor's object");
            }
            else {
            	System.out.println("Its a Doctor's object");
            }
	}

}
class Doctor{
	void diagnose() {
		System.out.println("Doctor is Diagonisng...ENT....");
	}
	void prescribe() {
		System.out.println("Doctor is Prescribing..RGBpills...");
	}
	void cost() {
		System.out.println("Doctor is charging rs.300...");
	}
}

class Surgeon extends Doctor{
	void diagnose() {
		System.out.println("Surgeon is Diagonisng...CT Scan....");
	}
	void prescribe() {
		System.out.println("Surgeon is Prescribing..expensive...");
	}
	void cost() {
		System.out.println("Surgeon is charging rs.1000...");
	}
	void cut() {
		System.out.println("Surgeon is cutting...");
	}
	void stitch() {
		System.out.println("Surgeon is sticthing...");
	}
}

class HeartSurgeon extends Surgeon{
	void diagnose() {
		System.out.println("Heart Surgeon is diagonising ECG Report....");
	}
	void prescribe() {
		System.out.println("Heart Surgeon is Prescribing...very expensive...");
	}
	void cost() {
		System.out.println("Heart Surgeon is charging rs.3000...");
    }
	
}