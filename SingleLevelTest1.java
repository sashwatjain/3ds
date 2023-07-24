
public class SingleLevelTest1 {
	public static void main(String[] args) {
			Person personObj = new Person();
			System.out.println("......................");		
			Student stObj = new Student();
			System.out.println("......................");		
			Employee empObj = new Employee();
			personObj.showPerson();
	}
}

class Person{
		private char gender;
		private String name;
		private int age;
		
	Person(){
		System.out.println("Person()...ctor");
	}
	
	Person(char gender, String name, int age) {
			super();
			this.gender = gender;
			this.name = name;
			this.age = age;
		}
	void showPerson(){
		System.out.println("GENDER : "+ this.gender);
		System.out.println("AGE : "+ this.age);
		System.out.println("NAME : "+ this.name);
	}
}
class Student extends Person{	
		private int rollNo;
		private String collageName;
		private String stream;
		private float marks;
		Student(){
		System.out.println("Student()...ctor");
		}
}
class Employee extends Student{
	Employee(){
		System.out.println("Employee()...ctor");
}}