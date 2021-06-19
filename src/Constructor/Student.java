//COnstructor is used to initialize the object .lets take a example that there are 100 students and i 
//i have task to store their name and roll number so what i am gonna do is i gonna a object and then after 
//i gonna give uniqe value of that object with the particular value by creating contructor;





package Constructor;
public class Student {
String name;
int rollno;
	
//Here i have to create constructor and i hava to pass the parameter ;if not then it is not gonna work:

	Student(String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;
		
	}
	
	public static void main(String[] args) {
		
		Student s1=new Student("Saroj",101);
		Student s2=new Student("sahil",102);
		Student s3=new Student("kishan",103);
		Student s4=new Student ("kishor",104);
		Student s5=new Student("pradeep",105);
		Student s6=new Student("manoj",106);
	    Student s7=new Student("Anshu",100);
		System.out.println("The name is "+s1.name+" "+"The roll number is :"+s1.rollno);
		System.out.println("The name is  "+s2.name+" "+"The roll number is :"+s2.rollno);
		System.out.println("The name is "+s3.name+" "+"The roll number is :"+s3.rollno);
		System.out.println("The name is "+s4.name+" "+"The roll number is :"+s4.rollno);
		System.out.println("The name is "+s5.name+" "+"The roll number is :"+s5.rollno);
		System.out.println("The name is "+s6.name+" "+"The roll number is : "+s6.rollno);
		System.out.println("The name is "+s7.name+" "+"The roll number is :"+s7.rollno);
	}

}
