package com.kp.elseif;

import java.util.Scanner;

public class ZodiacSigns {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Zodiac sign to know your characteristics");
		String sign=scan.next();
		characterOfZodiac(sign);
		scan.close();

	}

	 static void characterOfZodiac(String sign) {
		if(sign.equals("Aries")) {
			System.out.println("Adventurous");
		}
		else if(sign.equals("Taurus")) {
			System.out.println("Dependable");
		}
		else if(sign.equals("Gemini")) {
			System.out.println("Expressive");
		}
		else if(sign.equals("Cancer")) {
			System.out.println("Intuitive");
		}
		else if(sign.equals("Leo")) {
			System.out.println("Passionate");
		}
		else if(sign.equals("Virgo")) {
			System.out.println("Analytical");
		}
		else if(sign.equals("Libra")) {
			System.out.println("Diplomatic");
		}
		else if(sign.equals("Scorpio")) {
			System.out.println("Determined");
		}
		else if(sign.equals("Sarittaris")) {
			System.out.println("Philosophical");
		}
		else if(sign.equals("Capricon")) {
			System.out.println("Organized");
		}
		else if(sign.equals("Aquarus")) {
			System.out.println("Original");
		}
		else if(sign.equals("Pisces")) {
			System.out.println("Compassionate");
		}
		else {
			System.out.println("Invalid Zodiac Sign!!");
		}
	}

}
