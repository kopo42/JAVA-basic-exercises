package sw06;

public class Elevater3 extends Elevater2 {
	void Repair() {
		k42_help = String.format("수리중");
	}
	
	void up() {
		if(k42_floor >= k42_topFloor) {
			k42_help = "마지막 층";
		} else {
			k42_floor+=2;
			k42_help = String.format("%d층입니다", k42_floor);
		}
		
		this.down();
	}
	
	void down() {
		super.down();
		System.out.printf("클래스 내 MSG: %s\n", this.k42_help);
		//this.down(); //재귀호출시 무한반복
	}
}
