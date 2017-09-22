package javaprograms;

 class Test {
	String name,course;
	float fee;
	int id;
	public Test(int id,String name,String course) {
		this.id=id;
		this.name=name;
		this.course=course;
	}
	public Test(int id,String name,String course,float fee) {
		this(id,name,course);
		this.fee=fee;
	}
void display(){
	System.out.println(id+"  "+name+" "+course+"  "+fee);
}

}
class This_Constuct{
	public static void main(String[] args) {
		Test tc=new Test(101,"Ashadulla", "MCA",5000f);
		Test tc1=new Test(102,"Asadulla", "MBA",6000f);
		Test tc2=new Test(102,"Asadulla", "MBA",6000f);
		tc.display();
		tc1.display();
		tc2.display();
		

	}

}
