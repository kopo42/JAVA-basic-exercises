package sw06;

public class RemoCon { //TVRemocon Ŭ������ �ҷ��� ������ Ŭ����
	public static void main(String[] args) { //���� �Լ�
		TVRemocon k42_con = new TVRemocon(); //Ŭ���� ��ü ����
		int k42_i = 0; //�ݺ����� ������ ���� ����
		while(k42_i < 10) { //10�� �ݺ�
			k42_con.ChUp(); //TVRemocon Ŭ���� �� �̸� ������ ��� ����
			System.out.print(k42_con.k42_help + " "); //�̸� ������ ���ڿ� �ҷ��� ���
			k42_i++;
		}
		System.out.println(); //�ٹٲ�
		
		k42_i = 0; //�ٸ� �ݺ��� ������ ���Ͽ� 0���� �ʱ�ȭ
		while(k42_i < 10) {//10�� �ݺ�
			k42_con.ChDown(); //TVRemocon Ŭ���� �� �̸� ������ ��� ����
			System.out.print(k42_con.k42_help + " ");//�̸� ������ ���ڿ� �ҷ��� ���
			k42_i++;
		}
		System.out.println();//�ٹٲ�
		
		k42_i = 0;
		while(k42_i < 5) { //5�� �ݺ�
			k42_con.VolUp(); //TVRemocon Ŭ���� �� �̸� ������ ��� ����
			System.out.print(k42_con.k42_help + " ");//�̸� ������ ���ڿ� �ҷ��� ���
			k42_i++;
		}
		System.out.println();//�ٹٲ�
		
		k42_i = 0;
		while(k42_i < 5) { //5�� �ݺ�
			k42_con.VolDown(); //TVRemocon Ŭ���� �� �̸� ������ ��� ����
			System.out.print(k42_con.k42_help + " ");//�̸� ������ ���ڿ� �ҷ��� ���
			k42_i++;
		}
		System.out.println();//�ٹٲ�
	}
}
