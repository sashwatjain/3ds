
	public class hasATest {
		public static void main(String[] args) {
			
		}
	}
	
	class Heart
	{
		void pumping() {
			System.out.println("Heart is pumping...");
		}
	}
	
	class Brain {
		void analyzing() {
			System.out.println("brain is analyzing.");
	}}
		
	class Kidney {
		void filterBlood() {
			System.out.println("Kidney is filtering");
	}
	}
	
	class Lung{
		void oxygenating() {
			System.out.println("Oxygenating blood..");
		}
	}
class Human{
	private Heart heart = new Heart();
	private Brain brain = new Brain();
	private Kidney leftKidney = new Kidney();
	private Kidney rightKidney = new Kidney();
	private Lung leftLung = new Lung();
	private Lung rightLung =  new Lung();
	
	void breathing() {
		System.out.println("Human is breathing....");
		heart.pumping();
	}
	void thinking() {
		System.out.println("Human is thinking....");
		brain.analyzing();
	}
	void drinkLemonJuice() {
		System.out.println("Drinking lemon juice...");
		rightKidney.filterBlood();
		leftKidney.filterBlood();
	}
	void doPranayama() {
		System.out.println("Doing Pranayama....");
		rightLung.oxygenating();
		leftLung.oxygenating();
	}
	
} 
