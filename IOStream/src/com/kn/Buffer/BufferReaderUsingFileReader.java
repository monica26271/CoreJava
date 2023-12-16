package com.kn.Buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferReaderUsingFileReader {

	public static void main(String[] args) {
		String path1="c://io//inputString.txt";
		String path2="c://io//outputString.txt";
		try {
			FileReader fr=new FileReader(path1);
			FileWriter fw=new FileWriter(path2);
			
			BufferedReader br=new BufferedReader(fr);
			BufferedWriter bw=new BufferedWriter(fw);
		String x;
		while((x=br.readLine())!=null) {
			bw.write(x);
		}
		fw.flush();
		br.close();
		bw.close();
		fr.close();
		fw.close();
		}catch(Exception e){
		e.printStackTrace();
		}
	}
}
