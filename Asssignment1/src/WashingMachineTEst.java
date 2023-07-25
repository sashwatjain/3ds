
import java.util.ArrayList;

public class WashingMachineTEst {
	public static void main(String[] args) {
		Cloth[] arr;
		arr = new Cloth[20];
		arr[0] = new Cloth("organic", "red", 400.0f, "T-shirt", false);
		arr[1] = new Cloth("organic", "black", 1000.0f, "shirt", false);
		arr[2] = new Cloth("synthetic", "red", 500.0f, "shirt", false);
		arr[3] = new Cloth("organic", "red", 400.0f, "T-shirt", false);
		arr[4] = new Cloth("organic", "black", 1000.0f, "shirt", false);
		arr[5] = new Cloth("synthetic", "red", 500.0f, "shirt", false);
		arr[6] = new Cloth("organic", "red", 400.0f, "T-shirt", false);
		arr[7] = new Cloth("organic", "black", 1000.0f, "shirt", false);
		arr[8] = new Cloth("synthetic", "red", 500.0f, "shirt", false);
		arr[9] = new Cloth("organic", "red", 400.0f, "T-shirt", false);
		arr[10] = new Cloth("organic", "black", 1999.0f, "black", false);
		arr[11] = new Cloth("synthetic", "red", 500.0f, "shirt", false);
		arr[12] = new Cloth("synthetic", "red", 500.0f, "shirt", false);
		arr[13] = new Cloth("organic", "red", 400.0f, "T-shirt", false);
		arr[14] = new Cloth("organic", "black", 1000.0f, "shirt", false);
		arr[15] = new Cloth("synthetic", "red", 500.0f, "shirt", false);
		arr[16] = new Cloth("organic", "red", 400.0f, "T-shirt", false);
		arr[17] = new Cloth("organic", "black", 1000.0f, "shirt", false);
		arr[18] = new Cloth("synthetic", "red", 500.0f, "shirt", false);
		arr[19] = new Cloth("organic", "red", 400.0f, "T-shirt", false);
		

		WashingPowder washPowder = new WashingPowder(100,"Nirma", "Front Load", true, 10.0f);
		Electricity electricity = new Electricity("Commercial", 120.0 , 9.8, "Electric house");
		
		System.out.println("wash powder : "+washPowder); //toString is invoked
		System.out.println("electricity : "+electricity);
		
		Laundry laundry = new Laundry();
		Machine machine = new Machine();
		laundry = machine.wash(washPowder, electricity, arr);
		System.out.println("Laundry : "+laundry);
	}
}

class Machine {

	public Laundry wash(WashingPowder washPowder, Electricity electricity, Cloth[] cloth) {
		// TODO Auto-generated method stub
		ArrayList<Cloth> syntheticCloths = new ArrayList<>();
		ArrayList<Cloth> naturalCloths = new ArrayList<>();
		
		
		for (Cloth clothx : cloth) {
            if (clothx.getMaterial() == "organic") {
            	naturalCloths.add(clothx);
            	clothx.setClean(true); 
            }
            else {naturalCloths.add(clothx);
            	clothx.setClean(true); 
            }
        }
		
		
		int length1 = naturalCloths.size();
		int length2 = syntheticCloths.size();
		Laundry laundry = new Laundry();
		
		laundry.setNumberOfCloths(cloth.length);
		laundry.setTimeRequired(length1*20 + length2*15 );
		laundry.setWaterUsed(length1*3 + length2*2);
		laundry.setElectricityUsed(laundry.getTimeRequired()*2/60);
		laundry.setCostOfWashingPowder((float)(laundry.getWaterUsed()*18.0f*washPowder.getPrice())/800);
	    laundry.setTotalCost((laundry.getElectricityUsed()*10) + laundry.getCostOfWashingPowder() + laundry.getWaterUsed() + (laundry.getNumberOfCloths()*10) );
		return laundry;
	}
	
}
//class WashingMachine extends Machine { //isA
//	
//	WashingTub washTub = new WashingTub(60 , "frontLoaded"); //hasA
//
//	
//		Laundry wash(WashingPowder washPowder, Water water, Electricity elect, Cloth cloth[]) {
//			ArrayList<Cloth> syntheticCloths = new ArrayList<>();
//			ArrayList<Cloth> naturalCloths = new ArrayList<>();
//			
//			
//			for (Cloth clothx : cloth) {
//	            if (clothx.getMaterial() == "organic") {
//	            	naturalCloths.add(clothx);
//	            	clothx.setClean(true); 
//	            }
//	            else {naturalCloths.add(clothx);
//	            	clothx.setClean(true); 
//	            }
//	        }
//			
//			
//			int length1 = naturalCloths.size();
//			int length2 = syntheticCloths.size();
//			Laundry laundry = new Laundry();
//			
//			laundry.setNumberOfCloths(cloth.length);
//			laundry.setTimeRequired(length1*20 + length2*15 );
//			laundry.setWaterUsed(length1*3 + length2*2);
//			laundry.setElectricityUsed(laundry.getTimeRequired()*2/60);
//			laundry.setCostOfWashingPowder((float)(laundry.getWaterUsed()*18.0f*washPowder.getPrice()));
//		    laundry.setTotalCost((laundry.getElectricityUsed()*elect.getCostPerUnit()) + laundry.getCostOfWashingPowder() + laundry.getWaterUsed() + (laundry.getNumberOfCloths()*10) );
//			return laundry;
//		}
//}

class Laundry {
	private int numberOfCloths; //cloth.length
	private float timeRequired;
	private float totalCost ;// cloth.length * price per cloth
	private float waterUsed;
	private float electricityUsed;
	private float costOfWashingPowder; //
	
	public Laundry() {
		
	};

	
	


	public Laundry(int numberOfCloths, float timeRequired, float totalCost, float waterUsed, float electricityUsed,
			float costOfWashingPowder) {
		super();
		this.numberOfCloths = numberOfCloths;
		this.timeRequired = timeRequired;
		this.totalCost = totalCost;
		this.waterUsed = waterUsed;
		this.electricityUsed = electricityUsed;
		this.costOfWashingPowder = costOfWashingPowder;
	}

	@Override
	public String toString() {
		return "Laundry [numberOfCloths=" + numberOfCloths + ", timeRequired=" + timeRequired + ", totalCost="
				+ totalCost + ", waterUsed=" + waterUsed + ", electricityUsed=" + electricityUsed
				+ ", costOfWashingPowder=" + costOfWashingPowder + "]";
	}

	public int getNumberOfCloths() {
		return numberOfCloths;
	}

	public void setNumberOfCloths(int numberOfCloths) {
		this.numberOfCloths = numberOfCloths;
	}

	public float getTimeRequired() {
		return timeRequired;
	}

	public void setTimeRequired(float timeRequired) {
		this.timeRequired = timeRequired;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	public float getWaterUsed() {
		return waterUsed;
	}

	public void setWaterUsed(float waterUsed) {
		this.waterUsed = waterUsed;
	}

	public float getElectricityUsed() {
		return electricityUsed;
	}

	public void setElectricityUsed(float electricityUsed) {
		this.electricityUsed = electricityUsed;
	}

	public float getCostOfWashingPowder() {
		return costOfWashingPowder;
	}

	public void setCostOfWashingPowder(float costOfWashingPowder) {
		this.costOfWashingPowder = costOfWashingPowder;
	}
	
	
	
	
	
}

class Tub {
	
}

class WashingTub  extends Tub {
	private int capacity;
	private String type; //
	public WashingTub(int capacity, String type) {
		super();
		this.capacity = capacity;
		this.type = type;
	}
	@Override
	public String toString() {
		return "WashingTub [capacity=" + capacity + ", type=" + type + "]";
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}

class Powder {
	
}

class WashingPowder extends Powder { // isA

	private int quantity;
	private String brand;
	private String type;
	private boolean scented;
	private float price;
	
	public WashingPowder(int quantity, String brand, String type, boolean scented, float price) {
		super();
		this.quantity = quantity;
		this.brand = brand;
		this.type = type;
		this.scented = scented;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "WashingPowder [quantity=" + quantity + ", brand=" + brand + ", type=" + type + ", scented=" + scented
				+ ", price=" + price + "]";
	}
	/*public String toString() {
		String str = (scented) ? "Scented" :"Not Scented";
		return str+ " "+brand+" Washing Powder of "+type+ " type quantity used "+quantity+ " grams ";
	}*/

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isScented() {
		return scented;
	}

	public void setScented(boolean scented) {
		this.scented = scented;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}

class Water {
	private String type;
	private int quantity;
	private String temperature;
	
	public Water(String type, int quantity, String temperature) {
		super();
		this.type = type;
		this.quantity = quantity;
		this.temperature = temperature;
	}
	@Override
	public String toString() {
		return "Water [type=" + type + ", quantity=" + quantity + ", temperature=" + temperature + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

}

class Electricity {

	private String type; //ac dc
	private float voltage; 
	private int costPerUnit;
	private String supplier;

	
	public Electricity(String string, double d, double e, String string2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Electricity [type=" + type + ", voltage=" + voltage + ", costPerUnit=" + costPerUnit 
				 + ", supplier=" + supplier + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getVoltage() {
		return voltage;
	}
	public void setVoltage(float voltage) {
		this.voltage = voltage;
	}
	public int getCostPerUnit() {
		return costPerUnit;
	}
	public void setCostPerUnit(int costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
	
	
}

class Cloth {
	private String material; //
	private String color;
	private float cost;
	private String type;
	private boolean clean; //
	
	public Cloth(String material, String color, float cost, String type, boolean clean) {
		super();
		this.material = material;
		this.color = color;
		this.cost = cost;
		this.type = type;
		this.clean = clean;
	}
	@Override
	public String toString() {
		return "Cloth [material=" + material + ", color=" + color + ", cost=" + cost + ", type=" + type + ", clean="
				+ clean + "]";
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isClean() {
		return clean;
	}
	public void setClean(boolean clean) {
		this.clean = clean;
	}
	

	
}

