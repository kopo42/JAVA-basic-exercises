package sw06;

public class TVRemo2 { //����� ����� Ŭ����
	private int k42_Vmax; //�ִ� ����
	private int k42_Vmin; //�ּ� ����
	private int k42_Vol; //���� ����
	
	private int k42_Chmax; //������ ä��
	private int k42_Chmin; //ó�� ä��
	private int k42_Chan; //���� ä��

	private String k42_help; //�ȳ����� ����� ���ڿ� ���� ����
	
	TVRemo2(){
		k42_Vmax = 30; //�ִ� ����
		k42_Vmin = 0; //�ּ� ����
		k42_Vol = 2; //���� ����
		
		k42_Chmax = 212; //������ ä��
		k42_Chmin = 0; //ó�� ä��
		k42_Chan = 50; //���� ä��

		k42_help = "�⺻ ����"; //�ȳ����� ����� ���ڿ� ���� ����
	}
	TVRemo2(int k42_chup, int k42_chdn, int k42_ch, int k42_volup, int k42_voldn, int k42_vol){
		k42_Chmax = k42_chup; k42_Chmin = k42_chdn; k42_Chan = k42_ch;
		k42_Vmax = k42_volup; k42_Vmin = k42_voldn; k42_Vol = k42_vol;
		k42_help = "�⺻ ���� �Ϸ�";
	}

	public void VolUp(int k42_n) { //���� ����
		int k42_i = 0;
		while(k42_i < k42_n) {
		if(k42_Vol == k42_Vmax) { //�ִ� �����̶��
			k42_help = "�ִ� �����Դϴ�";
		} else {
			k42_Vol++; //�ƴ� ��� ���� ����
			k42_help = String.format("���� : %d", k42_Vol);
		}
		System.out.print(k42_help + " ");
		k42_i++;
		}
		System.out.println();
	}
	public void VolDown(int k42_n) { //���� ����
		int k42_i = 0;
		while(k42_i < k42_n) {
		if(k42_Vol == k42_Vmin) { //�ּ� �����̶��
			k42_help = "�ּ� �����Դϴ�";
		} else {
			k42_Vol--; //�ƴ� ��� ���� ����
			k42_help = String.format("���� : %d", k42_Vol);
			}
		System.out.print(k42_help + " ");
		k42_i++;
		}
		System.out.println();
	}
	public void ChUp(int k42_n) { //ä�� �ø�
		int k42_i = 0;
		while(k42_i < k42_n) {
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
			System.out.print(k42_help + " ");
		k42_i++;
		}
		System.out.println();
	}
	public void ChDown(int k42_n) { //ä�� ����
		int k42_i = 0;
		while(k42_i < k42_n) {
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
			System.out.print(k42_help + " ");
		k42_i++;
		}
		System.out.println();
	}
}
