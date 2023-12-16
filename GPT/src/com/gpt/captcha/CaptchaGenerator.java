package com.gpt.captcha;

import java.util.Random;

public class CaptchaGenerator {
	private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private static final int CAPTCHA_LENGTH = 6;

	public static void main(String[] args) {
		String captchaCode = generateCaptcha();
		System.out.println("Generated CAPTCHA Code: " + captchaCode);
	}

	private static String generateCaptcha() {
		Random random = new Random();
		StringBuilder captcha = new StringBuilder();

		for (int i = 0; i < CAPTCHA_LENGTH; i++) {
			int index = random.nextInt(CHARACTERS.length());
			captcha.append(CHARACTERS.charAt(index));
		}

		return captcha.toString();
		 
	     
	}
	
}
