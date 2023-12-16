
public class MainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}
public class User{
	String name;
	int age;
	
public void displayInfo(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("name = "+name);
		System.out.println("age = "+age);
		
	}
}
public class Friend extends User{
	
	
}
public class Follower{
	
}

}
