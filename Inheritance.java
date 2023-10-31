package demo;

//Single inheritance
class Employee  
{    
String name="john";   
}    

public class Inheritance extends Employee  
{   
int id=5;  
public static void main(String args[])  
{  
Inheritance obj=new Inheritance();   
System.out.println("Name: "+obj.name);    
System.out.println("ID: "+obj.id);   
}    
} 

//MultiLevel Inheritance
class car{
	public void model() {
		System.out.println("BMW");
		
	}
}
class speed extends car{
	public void speed1() {
		System.out.println("250");
		
	}
}
class version extends speed{
	public void ver() {
		System.out.println("M version");
		
	}

public static void main(String args[])
{
	version m1=new version();
	m1.model();
	m1.speed1();
	m1.ver();
	
}
}
