package javaprograms;
//single Inheritance program........
class Animal{
	void sound(){
		System.out.println("Animal Sounds...");
	}
}

class Dog extends Animal{
	void barks(){
		System.out.println("Dog barks....");
	}
}
class Crow extends Dog{
	void crawss(){
		System.out.println("Crow Kaw.. Kaw..");
	}
}
class Horse extends Crow{
	void hees(){
		System.out.println("Horse heee...heee...");
	}
}

public class Test1 {

	public static void main(String[] args) {
	Horse h=new Horse();
	h.sound();
	h.barks();
	h.crawss();
	h.hees();

	}

}
