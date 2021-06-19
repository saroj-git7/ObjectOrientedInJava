package multilevel_inheritance;

class A{
	public void  fly( int i ,int j)
	{
		System.out.println("I am flying in the sky"+i+j);
	}
	public void run()
	{
		System.out.println("I am running for my  better health");
	}
}
class B extends A
{
	public void can()
	{
		System.out.println("I am able to acheive my dream");
	}
}
class C extends B
{
	public void eat()
	{
		System.out.println("I am Eating");
	}
} 
class D extends C
{
	public void world()
	{
		System.out.println("Hello WOrld");
	}
}

public class multi extends D {
	
	public void multi()
	{
		System.out.println("I have created multilevel inheritance");
	}

	public static void main(String[] args) {
		
	multi m=new multi();
	m.can();
	m.fly(4,6);
    m.run();
    m.eat();
    m.multi();
    m.world();
		

	}

}
