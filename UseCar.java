package oops1;


public class UseCar {
	public static void main (String[]args) {
		
		Engine e1=new Engine();
		e1.model="xyz";
		e1.cc=800;
		
		Car c1=new Car();
		c1.brand="audi";
		c1.price=200000;
		c1.color="red";
		c1.engine=e1;
		
		System.out.println(c1.brand+"\n"+c1.price+"\n"+c1.color);
		System.out.println(c1.engine.model+"\n"+c1.engine.cc);
		
	}

}
