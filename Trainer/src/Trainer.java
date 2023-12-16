
public class Trainer {
	int id;
	String name;
	String skill;
	
	void train() {
		System.out.println("Training in progress");
	}
	void solveProblems() {
		System.out.println("Trainer Solved The problem");
	}
	void giveData(int a,String b,String c) {
		id=a;
		name=b;
		skill=c;
	}
	Trainer(int id,String name,String skill){
		this.id=id;
		this.name=name;
		this.skill=skill;
	}
	Trainer(){}
	

}
