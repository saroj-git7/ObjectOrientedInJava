//I have used here static keyword which can directly call the method without creating any object:


public class Method {
public static void run() {
	System.out.println("Good Morning GOD");
}

public static void god() {
	System.out.println("I am working now ");
	System.out.println("I am learning method");
	System.out.println("I am very hard working person");
}
public static void fly()
{
	System.out.println("I am flying");
}
	public static void main(String[] args) {
		fly();
		god();
		run();
	}

}
