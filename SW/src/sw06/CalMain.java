package sw06;

public class CalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc1 c = new Calc1();
		int kor; int eng; int mat; int soc; int sci; //���� ���� ����� ������
		int sum; double avg;//���� ��� ���� ����� ������
		int month; //����
		String name = "kopo42"; //�̸�
		
		month = 3; //3�� ����
		kor = c.getRand(); eng = c.getRand(); mat = c.getRand(); //���� ���� ������ �ʱ�ȭ
		sum = c.sum(kor, eng, mat); //�Ű����� 3��
		avg = c.getAvg(kor, eng, mat, 0, 0, 3); //�Ű����� 3��
		c.printer(month, name, kor, eng, mat, sum, avg); //�Ű����� 3��
		
		month = 4; //4�� ����
		kor = c.getRand(); eng = c.getRand(); mat = c.getRand(); sci = c.getRand(); //���� ���� ������ �ʱ�ȭ
		sum = c.sum(kor, eng, mat, sci); //�Ű����� 4�� 
		avg = c.getAvg(kor, eng, mat, sci, 0, 4); //�Ű����� 4�� 
		c.printer(month, name, kor, eng, mat, sci, sum, avg); //�Ű����� 4�� 
		
		month = 5; //5�� ����
		kor = c.getRand(); eng = c.getRand(); mat = c.getRand(); sci = c.getRand(); soc = c.getRand();
		//���� ���� ������ �ʱ�ȭ
		sum = c.sum(kor, eng, mat, sci, soc); //�Ű����� 5��
		avg = c.getAvg(kor, eng, mat, sci, soc, 5); //�Ű����� 5��
		c.printer(month, name, kor, eng, mat, sci, soc, sum, avg); //�Ű����� 5��
		}
	}

