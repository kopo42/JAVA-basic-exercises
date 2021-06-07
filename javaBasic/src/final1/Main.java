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
		ArrayList <String> book = new ArrayList<String>(); //å, ����
		ArrayList <String> bag = new ArrayList<String>(); //����, ����, ����, ���ι�
		ArrayList <String>clothes = new ArrayList<String>(); 
		ArrayList <String> etc = new ArrayList<String>(); 
		ArrayList <Integer> total = new ArrayList<Integer>(); 
		
		
		for(int i = 1; i < list.size(); i++) {
			List<String> line = list.get(i);
			if (line.get(8).equals("�ڵ���")) {
				phone.add(line.get(8));
			} else if (line.get(8).contains("����")) {
				wallet.add(line.get(8));
			} else if (line.get(8).contains("å") || line.get(8).contains("����")
					|| line.get(8).contains("��������")) {
				book.add(line.get(8));
			} else if (line.get(8).contains("����")
					|| line.get(8).contains("����")|| line.get(8).contains("���ι�")) {
				bag.add(line.get(8));
			} else if (line.get(8).contains("��")) {
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
		System.out.println("�ڵ��� : " + total.get(0) + "��\n" + "���� : " + total.get(1) + "��\n" + "å, ���� �� : " + total.get(2) + "��\n" 
		+ "���� : " + total.get(3) +  "��\n" + "�Ƿ� : " + total.get(4) + "��\n" + "��Ÿ : " + total.get(5) + "��\n");
		System.out.println("�հ� : �� " + sum + "��");
		System.out.println("��� : �� " + avg + "��");
		System.out.println("�ּ� : " + "�Ƿ� "  + min + "��");
		System.out.println("�ִ� : " + "��Ÿ " + max + "��");
	}
}
