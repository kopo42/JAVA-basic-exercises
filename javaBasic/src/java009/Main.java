package java009;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("C:\\Users\\J\\Desktop\\out.csv");

			try {
			String data = "no,name,age,school,major,score"
				+ "\n1,kim,20,korea,mathmatics,5"
				+ "\n2,young,19,korea,sports,1"
				+ "\n3,lee,24,seoul,law,2";
			output.write(data.getBytes());
			output.close();
			} catch (FileNotFoundException e) {
				System.out.println("ERROR");
			} 
		}
	}

