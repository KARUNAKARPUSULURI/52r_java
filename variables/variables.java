class Dog{
	String name = "German Shephard";
	String color = "Brown";
	
	public void barking(){
		System.out.println("Bow Bow");
	}

	public static void main(String [] args){
		Dog d1 = new Dog();//here we're creating an obj
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		int age = 3;
		System.out.println("14 : " + age);
		System.out.println(d1.name);
		System.out.println(d1.color);
		d1.barking();
		System.out.println(d2.name);
		System.out.println(d2.color);
		d2.barking();
		System.out.println(d3.color);
		System.out.println(d3.name);
		d3.barking();
	}
}