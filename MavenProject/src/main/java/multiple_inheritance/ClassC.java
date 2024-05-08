package multiple_inheritance;

public class ClassC implements Show,Display{
	public void add() {
		System.out.println("java");
	}
	

	public static void main(String[] args) {
		/*ClassC obj=new ClassC();
		obj.add();
		obj.show1();
		obj.print();*/
		// TODO Auto-generated method stub
		Display obj=new ClassC();
		obj.print();
		//obj.show1();
		

	}

	@Override
	public void print() {
		System.out.println("hello");
		
		
	}

	@Override
	public void show1() {
		System.out.println("welcome");
		
		
		
	}

}
