package javaprograms;

public class Method_Example {
	

	int id;
	String name;
	public void insertData(int i,String n){
		id=i;
		name=n;
	}
	public void displayData(){
		System.out.println("id="+id );
		System.out.println("name="+name );
	}

	public static void main(String[] args) {
		Method_Example me=new Method_Example();
		Method_Example me1=new Method_Example();
		me.insertData(111, "Ashadulla");
		me1.insertData(222, "Ashu");
		me.displayData();
		me1.displayData();
	
	}

}
