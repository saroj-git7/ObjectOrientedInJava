package Inheritance;
  
class Parent{
	public  void bike()
	{
		System.out.println("I HAVE A BIKE");
	}
	
}
class Child extends Parent{
	public  void cycle()
	{
		System.out.println("I HAVE A CYCLE");
	}
}



public class God extends Child{
	public void happy()
	{
		System.out.println("I am happy ");
	}
	public static void main(String[] args) {
		 Child c=new Child();
		 God g=new God(); 
	g.cycle();
	g.bike();
	g.happy();
	c.bike();
	Saroj s=new Saroj();
	s.saroj();
	}

}
class Saroj{
	public void saroj()
	{
		System.out.println("we gonna make one of the best it company");
}

}
