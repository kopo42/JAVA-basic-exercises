package sw06;

public class ClassTestMain {
	private static int val;
	public static void up() {
		val++;
		System.out.printf("�Ϲ� �޼ҵ� %d\n", val);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		val = 0; //���� ���� ���
		ClassTest elev; //Ŭ����
		elev = new ClassTest(); //Ŭ���� ��ü ����
		up(); //���� �޼ҵ� ����
		
		for(int i = 0; i < 10; i ++) {
			elev.up(); //Ŭ���� ��ü �޼ҵ� ����
			
			System.out.printf("MSG[%s]\n", elev.k42_help);
		}
		for(int i = 0; i < 10; i ++) {
			elev.down();
			
			System.out.printf("MSG[%s]\n", elev.k42_help);
		}
	}

}
