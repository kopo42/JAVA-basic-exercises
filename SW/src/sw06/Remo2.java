package sw06;

public class Remo2 { //TVRemocon Ŭ������ �ҷ��� ������ Ŭ����
	static TVRemo2 k42_remo1;
	static TVRemo2 k42_remo2;
	public static void main(String[] args) { //���� �Լ�
		TVRemocon k42_con = new TVRemocon(); //Ŭ���� ��ü ����
		k42_remo1 = new TVRemo2(); //�⺻ ������ ���� ����
		k42_remo2 = new TVRemo2(112, 20, 107, 10, 1, 6); //ä��, ���� ������ �ٽ� �����Ͽ� ����
		
		//�⺻ ����
		k42_remo1.ChUp(10); //ä�� 10 �ø�
		k42_remo1.ChDown(10); //ä�� 10 ����
		k42_remo1.VolUp(5); //���� 5 �ø�
		k42_remo1.VolDown(5); //���� 5 ����
		
		//�����ڿ� ���� �޶��� ����
		k42_remo2.ChUp(10);
		k42_remo2.ChDown(10);
		k42_remo2.VolUp(5);
		k42_remo2.VolDown(5);
	}
}
