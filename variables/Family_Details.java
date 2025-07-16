class Family_Details{
	static String surname = "P";
	String name;
	int age;
	
	Family_Details(String name, int age){
		System.out.println(name + " " +age  + " " + Family_Details.surname);
	}
	
	public static void main(String [] args){
		Family_Details f1 = new Family_Details("John", 50);
		Family_Details f2 = new Family_Details("Joy", 45);
		Family_Details f3 = new Family_Details("Joe", 30);
		Family_Details f4 = new Family_Details("Stewart", 28);
		Family_Details f5 = new Family_Details("Bob", 25);
		System.out.println(f2.name);
		System.out.println(f1.age);
	}
}