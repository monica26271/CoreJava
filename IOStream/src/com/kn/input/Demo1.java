//Reading data from the Input file and printing into the console

package com.kn.input;

import java.io.BufferedReader;
import java.io.FileReader;



public class Demo1 {

	public static void main(String[] args) {

		String path="c://io//input.txt";
		try {
			FileReader fr=new FileReader(path);
			BufferedReader br=new BufferedReader(fr);
			int charCode;
			while((charCode=br.read())!=-1) {
				  char character = (char) charCode;
                System.out.print(character);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
