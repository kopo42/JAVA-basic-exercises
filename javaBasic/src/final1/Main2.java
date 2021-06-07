package final1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main2 {
	String path =  "C:\\Users\\J\\Desktop\\output";
	File file = new File(path + "\\HSCPnumbers.txt");
    //BufferedReader br = new BufferedReader(new BufferedReader(new FileReader(file)));

	public static List<List<String>> readToList(String path) throws IOException {
		List<List<String>> list = new ArrayList<List<String>>();
		File numbersTxt = new File("C:\\Users\\J\\Desktop\\output\\HSCPnumbers.txt");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(numbersTxt));
			Charset.forName("UTF-8");
			String line = ""; //null
			
			while((line=br.readLine()) != null) {
				String[] token = line.split(", ");
				for(int i = 0; i < token.length; i++) {
					System.out.println(token[i]);
				}
				List<String> tempList = new ArrayList<String>(Arrays.asList(token));
				list.add(tempList);
			}
		} catch (FileNotFoundException e) {
		}
		return list;
	}
	
	public static void main(String[] args) throws IOException {
		HashSet <String> temp = new HashSet <String>();
		String path = "C:\\Users\\J\\Desktop\\output";
		List<List<String>> list = Main2.readToList(path);
		//for(int i = 0; i < 50; i++) {
			//System.out.println(list.get(i));
		//}
	}
}
