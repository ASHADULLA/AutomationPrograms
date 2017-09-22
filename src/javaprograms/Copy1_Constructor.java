package javaprograms;

public class Copy1_Constructor {
	
	int id;
	String name;
	Copy1_Constructor(int i,String n) {
		id=i;
		name=n;
	}
	 Copy1_Constructor() {
		// TODO Auto-generated constructor stub
	}
	void display(){
		System.out.println(id+"\t"+name);
	}

	
	public static void main(String[] args) {
		System.out.println("id\tname");
		
		Copy1_Constructor cc=new Copy1_Constructor(111, "Ashadulla");
		Copy1_Constructor cc1=new Copy1_Constructor();
		cc1.id=cc.id;
		cc1.name=cc.name;
		cc.display();
		cc1.display();
	}

}
