class Static_variables{
	static String collegeName = "Karunya";
	String name;
	int age;

	Static_variables(String stu_name, int stu_age){
		name = stu_name;
		age = stu_age;
		System.out.println(name + age + collegeName);
	}

	public static void main(String [] args){
		Static_variables s1 = new Static_variables("Anil", 23);
		Static_variables s2 = new Static_variables("feroz", 22);
		Static_variables s3 = new Static_variables("nithin", 21);
	}
}