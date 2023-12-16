package com.kp.swithcase;

import java.util.Scanner;

public class PolygonNames {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of sides the Polygon has=");
		int sides=scan.nextInt();
		polygonName(sides);
		
		scan.close();

	}

	 static void polygonName(int sides) {
		switch (sides) {
		case 3: {
			System.out.println("It has "+sides+" sides so It's a Triangle");
			break;
		}
		case 4: {
			System.out.println("It has "+sides+" sides so It's a Quadrilateral");
			break;
		}
		case 5: {
			System.out.println("It has "+sides+" sides so It's a Pentagon");
			break;
		}
		case 6: {
			System.out.println("It has "+sides+" sides so It's a Hexagon");
			break;
		}
		case 7: {
			System.out.println("It has "+sides+" sides so It's a Heptogon");
			break;
		}
		case 8: {
			System.out.println("It has "+sides+" sides so It's a Octagon");
			break;
		}
		default:
			System.out.println("Enter the valid number of sides");
			
		}
		
	}

}
