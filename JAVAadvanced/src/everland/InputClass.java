package everland;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InputClass {
	public static void main(String[] args) throws IOException {
		TypeClass t; //����, ������ �ݺ��� ������
		Scanner scan = new Scanner(System.in);
		SelectorClass s;
		FileWriteClass f = new FileWriteClass();
		ArrayList <String> subinfoList = new ArrayList<String>();
		ArrayList <Integer> totalList = new ArrayList<Integer>();
		int ctn1;
		f.headerWrite(); //���� ��� ����

		while(true){
			System.out.println("�߱��� �����մϴ�");
			System.out.println("1. ����  2. ����");
			ctn1 = scan.nextInt();
			if(ctn1 == 1) {
				t = new TypeClass();
				s = new SelectorClass();
	
				s.timeSelect(t);
				s.ageSelect(t);
				s.amntInput(t);
				t.subtotal = s.discntSelect(t);
				
				String subinfo = t.timestr + " " + t.agestr + " X " + t.amnt + " " + t.subtotal+ "��" + " " + t.discntstr;
				subinfoList.add(subinfo);
				
				totalList.add(t.subtotal);
				for(int i = 0; i < totalList.size(); i++) {
					t.total += totalList.get(i);
				}
				
				f.dataWrite(t); //���� ���� ����
				
				System.out.println("�߰��� �߱��Ͻðڽ��ϱ�?: ");
				System.out.println("1. �߰�  2. ����");
				int ctn2 = scan.nextInt();
				
				if(ctn2 == 1) {
					continue;
				} else {
					System.out.println("Ƽ�� �߱��� �����մϴ�.");
					System.out.println("****EVERLAND RESORT****");
					
					for(int i = 0; i < subinfoList.size(); i++) {
						System.out.println(subinfoList.get(i));
					}
					System.out.printf("�����Ͻ� �ݾ�: %d��\n", t.total);
					System.out.println("=======================");
				}
			}else if(ctn1 == 2) {
				f.fileClose();//���� ���� �ݱ�
				break;
			}
		} 
	}
}
