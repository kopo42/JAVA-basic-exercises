package sw06;

public class ClassTest {
	int k42_topF = 10;//�ֻ�
	int k42_groundF = 0;//������
	int k42_floor = 1;//����
	String k42_help;//�ȳ���
	
	void up() {
		if(k42_floor == k42_topF) { //������ ���϶�
			k42_help = "������ ���Դϴ�"; //�ȳ���
		} else {
			k42_floor++; //�ƴ� ��� �� �ö�
			k42_help = String.format("%d���Դϴ�", k42_floor);
		}
	}
	void down() {
		if(k42_floor == k42_groundF) { //ó�� ���϶�
			k42_help = "ó�� ���Դϴ�"; //�ȳ���
		}else {
			k42_floor--;
			k42_help = String.format("%d���Դϴ�", k42_floor);
		}
	}
}
