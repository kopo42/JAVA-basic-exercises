package sw06;

public class Elevater2 {
	public int k42_topFloor;
	public int k42_groundFloor;
	public int k42_floor;
	public String k42_help;
	
	Elevater2(){
		k42_topFloor = 10;
		k42_groundFloor = 1;
		k42_floor = 1;
		k42_help = "엘리베이터 기본 준공 완료";
	}
	
	Elevater2(int k42_floorUp, int k42_floorDown, int k42_floorCurr){
		k42_topFloor = k42_floorUp;
		k42_groundFloor = k42_floorDown;
		k42_floor = k42_floorCurr;
		k42_help = "엘리베이터 맞춤 준공 완료";
	}
	void up() {
		if(k42_floor == k42_topFloor) { //마지막 층일때
			k42_help = "마지막 층입니다"; //안내문
		} else {
			k42_floor++; //아닐 경우 층 올라감
			k42_help = String.format("%d층입니다", k42_floor);
		}
	}
	void down() {
		if(k42_floor == k42_groundFloor) { //처음 층일때
			k42_help = "처음 층입니다"; //안내문
		}else {
			k42_floor--;
			k42_help = String.format("%d층입니다", k42_floor);
		}
	}
	void up(int k42_u) {
		for(int k42_i = 0; k42_i < k42_u; k42_i ++) this.up();
	}
	void down(int k42_u) {
		for(int k42_i = 0; k42_i < k42_u; k42_i ++) down();
	}
	void msg(String k42_id) {
		System.out.printf("%s => %s 최대층%d 최소층%d 현재층%d\n", 
				k42_id, k42_help, k42_topFloor, k42_groundFloor, k42_floor);
	}
}
