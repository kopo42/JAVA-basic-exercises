package sw06;

public class Elevater3 extends Elevater2 {
	void Repair() {
		k42_help = String.format("������");
	}
	
	void up() {
		if(k42_floor >= k42_topFloor) {
			k42_help = "������ ��";
		} else {
			k42_floor+=2;
			k42_help = String.format("%d���Դϴ�", k42_floor);
		}
		
		this.down();
	}
	
	void down() {
		super.down();
		System.out.printf("Ŭ���� �� MSG: %s\n", this.k42_help);
		//this.down(); //���ȣ��� ���ѹݺ�
	}
}
