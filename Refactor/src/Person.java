
public class Person {
	static int current_year = 2017;
	private String name;
	private int birthdate;
	private int age;
	
	//constructor
	public Person(String name, int birthdate){
		this.name = name;
		this.birthdate = birthdate;
	}

	//birthday
	public void reset_birthday(int year){
		birthdate = year;
	}
	
	//displays name
	public void display_name(){
		System.out.println("This is " + name);
	}
	
	//prints birthday
	public void display_birthday(){
		System.out.printf("I was born in %d. ",birthdate);
	}
	//prints age
	public void display_age(){
		age = current_year - birthdate;
		System.out.printf("I am %d years old ",age);
		
		this.seniorCitizen();
	}

   //determines if senior citizen or not 
	public void seniorCitizen() {
		if (age >= 65){
			System.out.println("\nI'm a senior citizen");
		}
		else{
			System.out.println("\nI'm not old enough to be classified as a senior by Medicare!");
		}
	}
	//simplified method
	public void showInfo() {
		this.display_name();
		this.display_birthday();
		this.display_age();
	}

	//final method-print all of Johns info
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person John = new Person("John",1957);
		John.showInfo();		
	}

}