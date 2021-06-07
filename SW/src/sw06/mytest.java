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
		
		elev1 = new Elevater2(); //기본 설정
		elev2 = new Elevater2(20, 1, 8); //맞춤 설정
		//elev3 = new Elevater2(50, -3, 5); //맞춤 설정2
		
		for(int k42_i = 0; k42_i < 20; k42_i ++) { //반복문 설정
			elev1.up(); elev1.msg("1번 1층씩 오르기"); //기본 값으로 설정
			elev2.up(); elev2.msg("2번 1층씩 오르기"); //맞춤설정
			//elev3.up(); elev3.msg("3번 1층씩 오르기"); //맞춤설정2
		}
		for(int k42_i = 0; k42_i < 20; k42_i ++) {
			elev1.up(2); elev1.msg("1번 2층씩 오르기"); //임의의 정수 입력
			elev2.up(2); elev2.msg("2번 2층씩 오르기");
			//elev3.up(2); elev3.msg("3번 2층씩 오르기");
		}
		for(int k42_i = 0; k42_i < 20; k42_i ++) {
			elev1.down(3); elev1.msg("1번 3층씩 내리기"); //임의의 정수 입력 내리기
			elev2.down(3); elev2.msg("2번 3층씩 내리기");
			//elev3.down(3); elev3.msg("2번 3층씩 내리기");
		}
	}
}
