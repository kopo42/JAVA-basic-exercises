package sw06;

public class mytest {
	static Elevater2 elev1;
	static Elevater2 elev2;
	static Elevater2 elev3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elevater3 elev3 = new Elevater3();
		for(int i = 0; i < 10; i ++) {
			elev3.up();
			System.out.printf("MSG elev3 %s \n", elev3.k42_help);
		}
		for(int i = 0; i < 10; i ++) {
			elev3.down();
			System.out.printf("MSG elev3 %s \n", elev3.k42_help);
		}
		elev3.Repair();
		System.out.printf("MSG elev3 %s \n", elev3.k42_help);
		
		elev1 = new Elevater2(); //�⺻ ����
		elev2 = new Elevater2(20, 1, 8); //���� ����
		//elev3 = new Elevater2(50, -3, 5); //���� ����2
		
		for(int k42_i = 0; k42_i < 20; k42_i ++) { //�ݺ��� ����
			elev1.up(); elev1.msg("1�� 1���� ������"); //�⺻ ������ ����
			elev2.up(); elev2.msg("2�� 1���� ������"); //���㼳��
			//elev3.up(); elev3.msg("3�� 1���� ������"); //���㼳��2
		}
		for(int k42_i = 0; k42_i < 20; k42_i ++) {
			elev1.up(2); elev1.msg("1�� 2���� ������"); //������ ���� �Է�
			elev2.up(2); elev2.msg("2�� 2���� ������");
			//elev3.up(2); elev3.msg("3�� 2���� ������");
		}
		for(int k42_i = 0; k42_i < 20; k42_i ++) {
			elev1.down(3); elev1.msg("1�� 3���� ������"); //������ ���� �Է� ������
			elev2.down(3); elev2.msg("2�� 3���� ������");
			//elev3.down(3); elev3.msg("2�� 3���� ������");
		}
	}
}
