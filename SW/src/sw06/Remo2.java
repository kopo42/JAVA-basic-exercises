package sw06;

public class Remo2 { //TVRemocon 클래스를 불러와 실행할 클래스
	static TVRemo2 k42_remo1;
	static TVRemo2 k42_remo2;
	public static void main(String[] args) { //메인 함수
		TVRemocon k42_con = new TVRemocon(); //클래스 객체 생성
		k42_remo1 = new TVRemo2(); //기본 정보에 따라 실행
		k42_remo2 = new TVRemo2(112, 20, 107, 10, 1, 6); //채널, 음량 정보를 다시 설정하여 실행
		
		//기본 정보
		k42_remo1.ChUp(10); //채널 10 올림
		k42_remo1.ChDown(10); //채널 10 내림
		k42_remo1.VolUp(5); //음량 5 올림
		k42_remo1.VolDown(5); //음량 5 내림
		
		//생성자에 따라 달라진 정보
		k42_remo2.ChUp(10);
		k42_remo2.ChDown(10);
		k42_remo2.VolUp(5);
		k42_remo2.VolDown(5);
	}
}
