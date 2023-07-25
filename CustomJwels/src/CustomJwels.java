
public class CustomJwels {
	public static void main(String[] args) {
		Metal gold = new Metal();
		gold.setColour("yellow");
		gold.setShine(98);
		
		Stone ruby = new Stone();
		ruby.setColour(null);
	}
}

class Metal {
	private String colour ;
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getShine() {
		return shine;
	}
	public void setShine(int shine) {
		this.shine = shine;
	}
	private int shine;
}

class Stone{
	private String colour;
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getRefrectivity() {
		return refrectivity;
	}
	public void setRefrectivity(int refrectivity) {
		this.refrectivity = refrectivity;
	}
	private int refrectivity;
}

class Jwel{
	private String Colours;
	private int Shine;
	
	public String getColours() {
		return Colours;
	}

	public void setColours(String colours) {
		Colours = colours;
	}

	public int getShine() {
		return Shine;
	}

	public void setShine(int shine) {
		Shine = shine;
	}

	
	
	Jwel createJwel(Stone diamond1 , Metal metal1) {
			Jwel jwel = new Jwel();
			jwel.setShine(diamond1.getRefrectivity() + metal1.getShine());
			jwel.setColours(diamond1.getColour() + " " + metal1.getColour());
			return jwel;
	}
}


