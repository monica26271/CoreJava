package project1;

public class Student1 {

	public static void main(String[] args) {
		Student S1=new Student();
		System.out.println("id "+S1.id+" name "+S1.name+" cgpa "+S1.cgpa);
		S1.id=123;
		S1.name="monica";
		S1.cgpa=8.5;
		
		S1.study();
		S1.markAttandence();
		System.out.println("id "+S1.id+" name "+S1.name+" cgpa "+S1.cgpa);
		
	

	}

}
