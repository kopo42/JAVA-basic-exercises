package sw06;

public class RemoCon { //TVRemocon 클래스를 불러와 실행할 클래스
	public static void main(String[] args) { //메인 함수
		TVRemocon k42_con = new TVRemocon(); //클래스 객체 생성
		int k42_i = 0; //반복문을 설정할 변수 선언
		while(k42_i < 10) { //10번 반복
			k42_con.ChUp(); //TVRemocon 클래스 내 미리 구현된 기능 실행
			System.out.print(k42_con.k42_help + " "); //미리 구현된 문자열 불러와 출력
			k42_i++;
		}
		System.out.println(); //줄바꿈
		
		k42_i = 0; //다른 반복문 실행을 위하여 0으로 초기화
		while(k42_i < 10) {//10번 반복
			k42_con.ChDown(); //TVRemocon 클래스 내 미리 구현된 기능 실행
			System.out.print(k42_con.k42_help + " ");//미리 구현된 문자열 불러와 출력
			k42_i++;
		}
		System.out.println();//줄바꿈
		
		k42_i = 0;
		while(k42_i < 5) { //5번 반복
			k42_con.VolUp(); //TVRemocon 클래스 내 미리 구현된 기능 실행
			System.out.print(k42_con.k42_help + " ");//미리 구현된 문자열 불러와 출력
			k42_i++;
		}
		System.out.println();//줄바꿈
		
		k42_i = 0;
		while(k42_i < 5) { //5번 반복
			k42_con.VolDown(); //TVRemocon 클래스 내 미리 구현된 기능 실행
			System.out.print(k42_con.k42_help + " ");//미리 구현된 문자열 불러와 출력
			k42_i++;
		}
		System.out.println();//줄바꿈
	}
}
