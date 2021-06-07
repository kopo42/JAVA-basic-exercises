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

public class Main {
	String path =  "C:\\Users\\J\\Desktop\\output";
	File file = new File(path + "\\Lostandfound.csv");
    //BufferedReader br = new BufferedReader(new BufferedReader(new FileReader(file)));

	public static List<List<String>> readToList(String path) throws IOException {
		List<List<String>> list = new ArrayList<List<String>>();
		File csv = new File("C:\\Users\\J\\Desktop\\output\\Lostandfound.csv");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(csv));
			Charset.forName("UTF-8");
			String line = "";
			
			while((line=br.readLine()) != null) {
				String[] token = line.split(",");
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
		List<List<String>> list = Main.readToList(path);
		ArrayList <String> phone = new ArrayList<String>(); 
		ArrayList <String> wallet = new ArrayList<String>(); 
		ArrayList <String> book = new ArrayList<String>(); //책, 파일
		ArrayList <String> bag = new ArrayList<String>(); //서류, 베낭, 가방, 쇼핑백
		ArrayList <String>clothes = new ArrayList<String>(); 
		ArrayList <String> etc = new ArrayList<String>(); 
		ArrayList <Integer> total = new ArrayList<Integer>(); 
		
		
		for(int i = 1; i < list.size(); i++) {
			List<String> line = list.get(i);
			if (line.get(8).equals("핸드폰")) {
				phone.add(line.get(8));
			} else if (line.get(8).contains("지갑")) {
				wallet.add(line.get(8));
			} else if (line.get(8).contains("책") || line.get(8).contains("파일")
					|| line.get(8).contains("서류봉투")) {
				book.add(line.get(8));
			} else if (line.get(8).contains("베낭")
					|| line.get(8).contains("가방")|| line.get(8).contains("쇼핑백")) {
				bag.add(line.get(8));
			} else if (line.get(8).contains("옷")) {
				clothes.add(line.get(8));
			} else {
				etc.add(line.get(8));
			}
			temp.add(line.get(8));
			//System.out.print(line.get(8));
		}
		total.add(phone.size());
		total.add(wallet.size());
		total.add(book.size());
		total.add(bag.size());
		total.add(clothes.size());
		total.add(etc.size());
		//System.out.println(temp);
		//System.out.println(temp.size());
		int sum = phone.size() + wallet.size() + book.size() 
		+ bag.size() + clothes.size() + etc.size();
		double avg = sum / 6;
		int min = Collections.min(total);
		int max = Collections.max(total);
		//System.out.println(total);
		
		for(int i = 0; i < total.size(); i++) {
		    if(max < total.get(i)) {
			max = total.get(i);
		    }
					
		    if(min > total.get(i)) {
			min = total.get(i);
		    }
		}
		System.out.println("핸드폰 : " + total.get(0) + "건\n" + "지갑 : " + total.get(1) + "건\n" + "책, 서류 등 : " + total.get(2) + "건\n" 
		+ "가방 : " + total.get(3) +  "건\n" + "의류 : " + total.get(4) + "건\n" + "기타 : " + total.get(5) + "건\n");
		System.out.println("합계 : 총 " + sum + "건");
		System.out.println("평균 : 약 " + avg + "건");
		System.out.println("최소 : " + "의류 "  + min + "건");
		System.out.println("최다 : " + "기타 " + max + "건");
	}
}
