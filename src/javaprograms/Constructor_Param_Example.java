package javaprograms;

public class Constructor_Param_Example {
	int id;
	String name;
	public Constructor_Param_Example(int i,String n) {
	id=i;
	name=n;
	}
	
	public void display(){
		System.out.println(id+"  "+name);
	}

	public static void main(String[] args) {
		
		Constructor_Param_Example cpe=new Constructor_Param_Example(101,"Ashhadullah");
		Constructor_Param_Example cpe1=new Constructor_Param_Example(102,"Alhumdulliah");
		cpe.display();
		cpe1.display();

	}

}
