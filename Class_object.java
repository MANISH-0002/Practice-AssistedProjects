package demo;

//Creating Class
class Class_object {
	int id;
	String name;

	//Creating Constructor
	public Class_object()
	{
		id=5;
		name="John";
	}
	

	public static void main(String[] args) {
		Class_object s1=new Class_object(); //Creating object
		System.out.println("ID:"+s1.id);
		System.out.println("Name:"+s1.name);

	}

}