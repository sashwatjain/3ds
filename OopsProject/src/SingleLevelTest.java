
public class SingleLevelTest {
	public static void main(String[] args) {
	
		Country country = new Country("Modi");
		country.showLeader();
		
		System.out.println("-----------");
		
		State state = new State("Modi","Shivraj");
		state.showLeader();
	
		System.out.println("-----------");

		City city = new City("Modi","Shivraj","Rathan");
		city.showLeader();
	}
}

class Country
{
	private String PM;
	Country(String PM) {
		this.PM = PM;
	}
	
	void showLeader() {
		System.out.println("PM : "+PM);
		
	}
}

class State extends Country
{
	private String CM;
	
	State(String PM,String CM) {
		super(PM);
		this.CM = CM;
	}
						

	void showLeader() {
		super.showLeader();  
		System.out.println("CM : "+CM);
	}
}

class City extends State
{
	private String Mayor; //EXTRA
	
							     //EXTRA
	City(String PM, String CM, String Mayor) {
		super(PM,CM); //invoke super class's constructor from this constructor
		this.Mayor = Mayor; //EXTRA
	}

	void showLeader() {
		super.showLeader();  //invoke super class's function
		System.out.println("Mayor: "+ Mayor);

	}
}