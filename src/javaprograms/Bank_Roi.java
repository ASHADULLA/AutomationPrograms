package javaprograms;
class Bank{
	float getRate(){ return 0;
	}
}
class Bank1 extends Bank{
	float getRate(){ return 2;
	}
}
class Bank2 extends Bank{
	float getRate(){ return 5;
	}
}
class Bank3 extends Bank{
	float getRate(){ return 7;
	}
}

public class Bank_Roi {

	public static void main(String[] args) {
		Bank b;
		b=new Bank1();
		System.out.println("Bank1 Rate: "+b.getRate() );
		b=new Bank2();
		System.out.println("Bank2 Rate: "+b.getRate() );
		b=new Bank3();
		System.out.println("Bank3 Rate: "+b.getRate() );
	}
}
