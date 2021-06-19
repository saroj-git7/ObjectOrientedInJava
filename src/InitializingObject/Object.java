package InitializingObject;
//Initiallizing object by reference variable
public class Object {
	String color;
	int age;
	public static void main(String[] args) {
	
	Object ss=new Object();
	ss.age=(10);
	ss.color="Red";
	System.out.println(ss.age+" "+ss.color);
	}

}
