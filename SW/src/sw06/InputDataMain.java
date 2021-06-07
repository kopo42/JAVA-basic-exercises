package sw06;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class InputDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k42_person = 45; //���Ƿ� ũ�� ����
		InputData inData = new InputData(k42_person + 1); //�������� ũ��� �迭�� �����ϱ� ����
		for(int k42_i = 0; k42_i < k42_person + 1; k42_i++) {
			String k42_name = String.format("ȫ��%02d", k42_i); //�̸� �Է�
			int k42_kor = inData.getRand(); //���� ���� �Է�
			int k42_eng = inData.getRand(); //���� ���� �Է�
			int k42_mat = inData.getRand(); //���� ���� �Է�
			inData.SetData(k42_i, k42_name, k42_kor, k42_eng, k42_mat); //�ܺ� Ŭ���� ���� ��ü ���
		}
		int k42_korsum = 0; int k42_engsum = 0; int k42_matsum = 0; //���� �հ谡 ����� ����
		int k42_kortotal = 0; int k42_engtotal = 0; int k42_mattotal = 0; //���� ���� �հ谡 ����� ����
		
		int k42_totalsum = 0; int k42_avgsum = 0; //����, ��� 
		int k42_sum_totalsum = 0; int k42_sum_avgsum = 0; //���� ����, ���
		
		Calendar k42_cal = Calendar.getInstance(); //���� �ð� ���
		SimpleDateFormat k42_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		String k42_TIME = k42_sdf.format(k42_cal.getTime());
		int k42_page = 1; //������ ������ ����
		int k42_index = 0; //��ȣ ��� �� �迭 ��ġ ����
		int k42_i = 0; //�ݺ����� ���� ����
		int k42_cnt = 0; //��µ� ȸ���� ������ ����
		while(k42_index < k42_person) { //������ �Է°� ũ�� ������
			if(k42_index % 30 == 1) { //head, tail = 30������ �ѹ��� ���
				System.out.printf("%25s\n", "��������ǥ");
				System.out.printf("%s%d", "PAGE: ", k42_page);
				System.out.printf("%30s%20s\n", "������� :", k42_TIME);
				System.out.println("==========================================================");
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
				System.out.println("==========================================================");
				
				//�Է°� Ȯ��
				for(k42_i = k42_index; k42_i < 30 + k42_index; k42_i ++) {
					System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%d\n",
							String.format("%03d", k42_i), inData.k42_name[k42_i], inData.k42_kor[k42_i], inData.k42_eng[k42_i], 
							inData.k42_mat[k42_i], inData.k42_sum[k42_i], inData.k42_avg[k42_i]);
					k42_cnt++; //��� ȸ�� ����
					if(k42_i == k42_person) { //�迭 ũ�⿡ �ٴٸ��� �ݺ� ����
						break;
					}
				}
				int k42_cntforavg = (k42_i - 30*(k42_page - 1)); //�ش� �������� �׸� ����
				
				k42_korsum = inData.pageSum(inData.k42_kor, k42_page, k42_cntforavg); //�ش� ������������ ����ϱ� ���� �ܺ� Ŭ���� ���
				k42_engsum = inData.pageSum(inData.k42_eng, k42_page, k42_cntforavg);
				k42_matsum = inData.pageSum(inData.k42_mat, k42_page, k42_cntforavg);
				
				k42_totalsum = inData.pageSum(inData.k42_sum, k42_page, k42_cntforavg); //������ �հ�
				k42_avgsum = inData.pageSum(inData.k42_avg, k42_page, k42_cntforavg); //����� �հ�
				
				k42_sum_totalsum += k42_totalsum; //���� ������ �հ�
				k42_sum_avgsum += k42_avgsum; //���� ������ ���
				k42_kortotal += k42_korsum; k42_engtotal += k42_engsum; k42_mattotal += k42_matsum; //���� ������ ���� �հ�
				System.out.println("==========================================================");
				System.out.println("���� ������");
				System.out.printf("%s\t\t%d\t%d\t%d\t%d\t%d\n", "�հ�", k42_korsum, k42_engsum, k42_matsum, k42_totalsum, k42_avgsum);
				System.out.printf("%s\t\t%d\t%d\t%d\t%d\t%d\n", "���",
						k42_korsum/k42_cntforavg, k42_engsum/k42_cntforavg, k42_matsum/k42_cntforavg,
						k42_totalsum/k42_cntforavg, k42_avgsum/k42_cntforavg);
				
				System.out.println("==========================================================");
				System.out.println("���� ������");
				System.out.printf("%s\t\t%d\t%d\t%d\t%d\t%d\n", "�հ�", k42_kortotal, k42_engtotal, k42_mattotal, k42_sum_totalsum, k42_sum_avgsum);
				System.out.printf("%s\t\t%d\t%d\t%d\t%d\t%d\n", "���",
						k42_kortotal/k42_person, k42_engtotal/k42_person, k42_mattotal/k42_person,
						k42_sum_totalsum/k42_person, k42_sum_avgsum/k42_person);	
				System.out.println("==========================================================");	
				k42_page++; //���� ������
			}
			k42_index++;
		}
	}
}
