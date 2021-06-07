package sw07;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class OneRecListMain {
	static int k42_person = 100; //���Ƿ� ũ�� ����
	static ArrayList<OneRecList> ArrayOneRec = new ArrayList<OneRecList>(); //����Ʈ�� ����
	static int k42_korsum = 0; static int k42_engsum = 0; static int k42_matsum = 0; //���� �հ谡 ����� ����
	static int k42_kortotal = 0; static int k42_engtotal = 0; static int k42_mattotal = 0; //���� ���� �հ谡 ����� ����
	static int k42_totalsum = 0; static double k42_avgsum = 0; //����, ���
	static int k42_sum_totalsum = 0; static double k42_sum_avgsum = 0; //���� ����, ���
	
	public static void main(String[] args) { //���� �Լ�
		int k42_page = 1;
		int k42_index = 0;
		int k42_i = 0;
		dataSet(); //������ ���� �Լ�
		dataSort(); //������ ����
		
		 while(k42_index < k42_person) { //������ �Է°� ũ�� ������ 
				 if(k42_index % 30 == 1) {//head, tail = 30������ �ѹ��� ��� 
					HeaderPrint(k42_page); 
					for(k42_i = k42_index; k42_i < 30 + k42_index; k42_i ++) {
					 itemPrint(k42_i, k42_page); 
						 if(k42_i == k42_person) { //�迭 ũ�⿡ �ٴٸ��� �ݺ� ���� 
							 break; 
						 }
					}
				int cnt  = (k42_i - 30 * (k42_page - 1));
				 k42_sum_totalsum += k42_totalsum; //���� ������ �հ� 
				 k42_sum_avgsum += k42_avgsum;//���� ������ ��� 
				 k42_kortotal += k42_korsum; 
				 k42_engtotal += k42_engsum;
				 k42_mattotal += k42_matsum; //���� ������ ���� �հ� 
				 TailPrint(k42_i, k42_page, cnt); 
				 k42_page ++;
			 }
			k42_korsum = 0; k42_engsum = 0; k42_matsum = 0; //���� �ݺ����� �Ѿ �� �ʱ�ȭ
			k42_totalsum = 0; k42_avgsum = 0; //static variables
			 k42_index++;	 
		 }
	}
	public static void dataSet() {
		for(int k42_i = 0; k42_i < k42_person + 1; k42_i++) { //������ ũ�� �� �ݺ�
			 String k42_name = String.format("student%02d", k42_i); //���� ����
			 int k42_kor = 2; //���� ���� ����
			 int k42_eng = (int) (Math.random() * 50 + 50);
			 int k42_mat = (int) (Math.random() * 50 + 50);
			 ArrayOneRec.add(new OneRecList(k42_i, k42_name, k42_kor, k42_eng, k42_mat)); //���Ĵ�� �Է�
			 //�ϳ��� Ŭ���� ���� �� ����Ʈ�� �߰�
		}
	}
	public static void HeaderPrint(int k42_page) { //��� ���
		Calendar k42_cal = Calendar.getInstance(); //���� �ð� ���
		SimpleDateFormat k42_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		String k42_TIME = k42_sdf.format(k42_cal.getTime());
		System.out.printf("%30s\n", "��������ǥ");
		System.out.printf("%s%d", "PAGE: ", k42_page);
		System.out.printf("%30s%20s\n", "������� :", k42_TIME);
		System.out.println("==============================================================");
		System.out.println("��ȣ\t       �̸�\t����\t����\t����\t����\t���");
		System.out.println("==============================================================");
	}
	
	public static void itemPrint(int k42_i, int k42_page) { //���� ���
		OneRecList rec;
		rec = ArrayOneRec.get(k42_i); //Ŭ���� ���� �� �ʱ�ȭ //i��° �л��� ���� ���
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n", //��� �Ҽ��� ���� ���
				rec.STUDENTID(), rec.NAME(), rec.KOR(), rec.ENG(), rec.MAT(), (int)(rec.SUM()), rec.AVG());
		pageSum(rec, k42_i, k42_page);
	}
	
	public static void TailPrint(int k42_i, int k42_page, int cnt) { //������ ���
		int totalcnt = cnt + (30 * (k42_page - 1));
		System.out.println(totalcnt);
		System.out.println("==============================================================");
		System.out.println("���� ������");
		System.out.printf("%s\t\t%d\t%d\t%d\t%d\t%.2f\n", "�հ�", 
				k42_korsum, k42_engsum, k42_matsum, k42_totalsum, k42_avgsum);
		System.out.printf("%s\t\t%d\t%d\t%d\t%d\t%.2f\n", "���",
				k42_korsum/cnt, k42_engsum/cnt, k42_matsum/cnt,
				k42_totalsum/cnt, k42_avgsum/cnt);
		System.out.println("==========================================================");
		System.out.println("���� ������");
		System.out.printf("%s\t\t%d\t%d\t%d\t%d\t%.2f\n", "�հ�", 
				k42_kortotal, k42_engtotal, k42_mattotal, k42_sum_totalsum, k42_sum_avgsum);
		System.out.printf("%s\t\t%d\t%d\t%d\t%d\t%.2f\n", "���",
				k42_kortotal/totalcnt, k42_engtotal/k42_person, k42_mattotal/k42_person,
				k42_sum_totalsum/k42_person, k42_sum_avgsum/k42_person);	
	}
	public static void pageSum(OneRecList rec, int k42_i, int k42_page) { //��� �κ�
		int n  = (k42_i - 30 * (k42_page - 1));//n = 30, 15
		k42_korsum += rec.KOR(); k42_engsum += rec.ENG(); k42_matsum += rec.MAT();
		k42_totalsum += rec.SUM(); k42_avgsum += rec.AVG(); //static variables
		
	} 
	public static void dataSort() {
		Comparator<OneRecList> listorder = new Comparator<OneRecList>() {
			public int compare(OneRecList k42_a1, OneRecList k42_a2) { //����ڰ� ������ ������ �����Ѵ�
				return (int) (k42_a2.SUM() - k42_a1.SUM());
			}
		};
		Collections.sort(ArrayOneRec, listorder); //�����Ľ� reverse ���
	}
}
