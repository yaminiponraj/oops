package oops1;

public class UseWorld {
	public static void main (String[]args) {
		
		State s1=new State();
		s1.name="tamilnadu";
		
		
		Countries c1=new Countries();
		c1.name="india";
		c1.state=s1;
		
		
		Continents con=new Continents();
		con.name="asia";
		con.countries=c1;
		
		World w1=new World();
		w1.shape="circle";
		w1.continents=con;
		
		System.out.println(w1.continents.countries.state.name);
	}

}
