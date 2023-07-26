package staticFinalAbstractProject;

public class CarTest {
	
public static void main(String[] args) {
        
        CarTest car1 = new CarTest("Camry", 2022, 25000.0);
        CarTest car2 = new CarTest("Corolla", 2021, 20000.0);

        
        System.out.println("Model: " + car1.getModel());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Price: $" + car1.getPrice());

        System.out.println("Model: " + car2.getModel());
        System.out.println("Year: " + car2.getYear());
        System.out.println("Price: $" + car2.getPrice());

       
        System.out.println("Manufacturer: " + CarTest.MANUFACTURER);

       
        System.out.println("Total Cars Sold: " + CarTest.getTotalCarsSold());
    }
    
    public static final String MANUFACTURER = "Toyota";

   
    private String model;
    private int year;
    private double price;

    
    private static int totalCarsSold = 0;

   
    public CarTest(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
        totalCarsSold++;
    }

   
    public String getModel() {
        return model;
    }

    
    public int getYear() {
        return year;
    }

    
    public double getPrice() {
        return price;
    }

    
    public static int getTotalCarsSold() {
        return totalCarsSold;
    }

    
}

