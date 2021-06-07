package sw07;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class InputDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k42_person = 5; //���Ƿ� ũ�� ����
		OneRec []inData = new OneRec[k42_person]; //Ŭ���� ������ �迭 ����
		
		inData[0] = new OneRec("student01", 100, 100, 90); //�� �迭�� Ŭ���� �ν��Ͻ� ����
		inData[1] = new OneRec("student02", 90, 90, 90);
		inData[2] = new OneRec("student03", 80, 70, 90);
		inData[3] = new OneRec("student04", 70, 60, 90);
		inData[4] = new OneRec("student05", 60, 100, 90);
		
		int k42_korsum = 0; int k42_engsum = 0; int k42_matsum = 0; //���� �հ谡 ����� ����
		int k42_kortotal = 0; int k42_engtotal = 0; int k42_mattotal = 0; //���� ���� �հ谡 ����� ����
		
		int k42_totalsum = 0; double k42_avgsum = 0; //����, ��� 
		
		Calendar k42_cal = Calendar.getInstance(); //���� �ð� ���
		SimpleDateFormat k42_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		String k42_TIME = k42_sdf.format(k42_cal.getTime());
		int k42_page = 1; //������ ������ ����
		int k42_i = 0; //�ݺ����� ���� ����
		System.out.printf("%25s\n", "��������ǥ");
		System.out.printf("%s%d", "PAGE: ", k42_page);
		System.out.printf("%30s%20s\n", "������� :", k42_TIME);
		System.out.println("==========================================================");
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
		System.out.println("==========================================================");
		//�Է°� Ȯ��
		for(k42_i = 0; k42_i < k42_person; k42_i ++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.0f\n",
					String.format("%03d", k42_i+1), inData[k42_i].NAME(), inData[k42_i].KOR(), inData[k42_i].ENG(), 
					inData[k42_i].MAT(), inData[k42_i].SUM(), inData[k42_i].avg());
				k42_korsum += inData[k42_i].KOR(); //�հ� ���ϱ�
				k42_engsum += inData[k42_i].ENG();
				k42_matsum += inData[k42_i].MAT();
				k42_totalsum += inData[k42_i].SUM();
				k42_avgsum += inData[k42_i].avg();
			} //inData[i].KOR(); ������ ���ϴ� ���� ���ϰ��� �޾ƿ´�
		System.out.println("==========================================================");
		System.out.println("���� ������");
		System.out.printf("%s\t\t\t%d\t%d\t%d\t%d\t%.0f\n", "�հ�", k42_korsum, k42_engsum, k42_matsum, k42_totalsum, k42_avgsum);
		System.out.printf("%s\t\t\t%d\t%d\t%d\t%d\t%.0f\n", "���",
					k42_korsum/k42_person, k42_engsum/k42_person, k42_matsum/k42_person,
					k42_totalsum/k42_person, k42_avgsum/k42_person);
		System.out.println("==========================================================");
	}
}
