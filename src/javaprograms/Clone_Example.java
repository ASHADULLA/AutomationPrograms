package javaprograms;

public class Clone_Example implements Cloneable{

	
	int marks;
	String name;
	Clone_Example(int marks, String name){
	this.marks=marks;
	this.name=name;
	}
	
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
		
		
	}

	public static void main(String[] args) {
		try{
		Clone_Example ce=new Clone_Example(100, "Ashadulla");
		Clone_Example ce1=(Clone_Example)ce.clone();
		System.out.println(ce.marks+ " "+ce.name);
		System.out.println(ce1.marks+ " "+ce1.name);
		 }
		catch(CloneNotSupportedException c){
			
		}
	}
}


