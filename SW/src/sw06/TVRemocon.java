package sw06;

public class TVRemocon { //����� ����� Ŭ����
	int k42_Vmax = 30; //�ִ� ����
	int k42_Vmin = 0; //�ּ� ����
	int k42_Vol = 2; //���� ����
	
	int k42_Chmax = 212; //������ ä��
	int k42_Chmin = 0; //ó�� ä��
	int k42_Chan = 210; //���� ä��

	String k42_help; //�ȳ����� ����� ���ڿ� ���� ����

	public void VolUp() { //���� ����
		if(k42_Vol == k42_Vmax) { //�ִ� �����̶��
			k42_help = "�ִ� �����Դϴ�";
		} else {
			k42_Vol++; //�ƴ� ��� ���� ����
			k42_help = String.format("���� : %d", k42_Vol);
		}
	}
	public void VolDown() { //���� ����
		if(k42_Vol == k42_Vmin) { //�ּ� �����̶��
			k42_help = "�ּ� �����Դϴ�";
		} else {
			k42_Vol--; //�ƴ� ��� ���� ����
			k42_help = String.format("���� : %d", k42_Vol);
		}
	}
	public void ChUp() { //ä�� �ø�
		if(k42_Chan == k42_Chmax) { //������ ä�� ����
			k42_help = String.format("%d��", k42_Chmax);
			k42_Chan++; //��������
		} else if(k42_Chan > k42_Chmax){//������ ä�ο��� �� �÷ȴٸ�
			k42_Chan = k42_Chmin;//ó�� ä�η� �Ѿ��
			k42_help = String.format("%d��", k42_Chan);
			k42_Chan++;
		} else {
			k42_help = String.format("%d��", k42_Chan); //�� ���� ����
			k42_Chan++;
		}
	}
	public void ChDown() { //ä�� ����
		if(k42_Chan == k42_Chmin) { //ó�� ä�� ����
			k42_help = String.format("%d��", k42_Chmin);
			k42_Chan--; //��������
		} else if(k42_Chan < k42_Chmin){//ó�� ä�ο��� �� ���ȴٸ�
			k42_Chan = k42_Chmax;//������ ä�η� �Ѿ��
			k42_help = String.format("%d��", k42_Chan);
			k42_Chan--;
		} else {
			k42_help = String.format("%d��", k42_Chan); //�� ���� ����
			k42_Chan--;
		}
	}
}
