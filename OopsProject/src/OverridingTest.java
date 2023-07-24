
public class OverridingTest {
    public static void main(String[] args) {
		
    	Father f = new Father();
	}
}

class GrandFather
{   void farming() {
	System.out.println("Grandfather : knows farming");
}
}

class Father
{   void farming() {
	System.out.println("father : knows farming with tractor");
}
}
