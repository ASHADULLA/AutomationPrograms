package javaprograms;

public class Constructor_Overload {

	int id;
	String name;
	int age;
	public Constructor_Overload(int i,String n) {
	id=i;
	name=n;
	}
	public Constructor_Overload(int i,String n,int a) {
		id=i;
		name=n;
		age=a;
	}
	void display(){
		
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String[] args) {
		System.out.println("id\tname\tage");
	Constructor_Overload co=new Constructor_Overload(111, "Ashadulla");
	Constructor_Overload co1=new Constructor_Overload(222, "Asadullahh", 25);
	co.display();
	co1.display();
	}

}
