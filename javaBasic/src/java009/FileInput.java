package java009;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader (new FileReader("C:\\Users\\J\\Desktop\\CarAccPerMonth.csv"));
		String line = "";
		String array1 [][] = new String[2744][8];
		int n = 0, i = 0, row = 0;
		while((line = reader.readLine()) != null) {
			String firstCut[] = line.replace(" ","").split("\"");
			for(i = 0; i < 8; i ++) {
				System.out.println(firstCut[i]);
				//array1[row][i] = firstCut[i];
			}
			for(i = 0; i < 8; i++) {
				//System.out.println(array1[row][i]);
			}	
		}
	}
}
