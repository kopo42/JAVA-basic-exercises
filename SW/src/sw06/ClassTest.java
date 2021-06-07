package sw06;

public class ClassTest {
	int k42_topF = 10;//최상
	int k42_groundF = 0;//최하층
	int k42_floor = 1;//현재
	String k42_help;//안내문
	
	void up() {
		if(k42_floor == k42_topF) { //마지막 층일때
			k42_help = "마지막 층입니다"; //안내문
		} else {
			k42_floor++; //아닐 경우 층 올라감
			k42_help = String.format("%d층입니다", k42_floor);
		}
	}
	void down() {
		if(k42_floor == k42_groundF) { //처음 층일때
			k42_help = "처음 층입니다"; //안내문
		}else {
			k42_floor--;
			k42_help = String.format("%d층입니다", k42_floor);
		}
	}
}
