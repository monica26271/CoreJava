package com.kn.producerandconsumerproblem;



public class PizzaHouse  {
	int token;
	boolean isAvailable=false;
	public synchronized void bake(int num){
		token=num;
		
			if(isAvailable==false) {
				System.out.println("Baker is baking the pizza for :"+token);
				isAvailable=true;
				notify();
			}else {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}
	public synchronized void eat() {
		if(isAvailable==true) {
			System.out.println("Counsumer is consuming the pizza for :"+token);
			isAvailable=false;
			notify();
		}else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
