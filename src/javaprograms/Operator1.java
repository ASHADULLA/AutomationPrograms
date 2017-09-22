package javaprograms;

public class Operator1 {

	public static void main(String[] args) {
	int x=90;
	if (x<35)
	{
	System.out.println("Fail");
	}
	else if(x>=35&&x<59)  { 
		System.out.println("Average");
	}
	else if(x>=60&&x<74)  { 
		System.out.println("First Class");
	}
	else if(x>=75&&x<90)  { 
		System.out.println("Distinction");
	}
	else if(x>=90&&x<100)  { 
		System.out.println("Genius");
	}

}
}
