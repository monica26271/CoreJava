package com.kp.swithcase;

import java.util.Scanner;

public class GardeningApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter 1-Roses, 2-Sunflower,3-Orchids,4-cacti,5-Ferns");
		int option=scan.nextInt();
		plantFertilizer(option);
		scan.close();
		
		
	}

	 static void plantFertilizer(int plant) {
		switch (plant) {
		case 1: {
			System.out.println("Rose Food ");
			break;
		}
		case 2: {
			System.out.println("All Purpose Fertilizer ");
			break;
		}
		case 3: {
			System.out.println("Orchid Fertilizer");
			break;
		}
		case 4: {
			System.out.println("Cactus Mix");
			break;
		}
		case 5: {
			System.out.println("Orgainic Compost");
			break;
		}
		
		default:
			System.out.println("Invalid!!");
		}
		
	}

}
