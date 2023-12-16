
public class TrainerApp {

	public static void main(String[] args) {
		
		Trainer t1=new Trainer(1234,"Arun","Java");
		
//		t1.id=1234;
//		t1.name="Arun";
//		t1.skill="Java";
//		t1.giveData(1234,"Arun","Java");
		
		t1.train();
		t1.solveProblems();
		System.out.println("Id "+t1.id+" Name "+t1.name+" Skill "+t1.skill);
		
		Trainer t2 = new Trainer(5678,"Yash","testing");

		/*t2.id = 1234;
		t2.name = "Arun";
		t2.skill = "Java";*/
		//t2.giveData(4567,"Yash","Testing");

		t2.train();
		t2.solveProblems();
		System.out.println("Id " + t2.id + " Name " + t2.name + " Skill " + t2.skill);
		

	}

}
