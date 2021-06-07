package sw06;

public class ClassTestMain {
	private static int val;
	public static void up() {
		val++;
		System.out.printf("일반 메소드 %d\n", val);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		val = 0; //내부 변수 사용
		ClassTest elev; //클래스
		elev = new ClassTest(); //클래스 객체 생성
		up(); //내부 메소드 실행
		
		for(int i = 0; i < 10; i ++) {
			elev.up(); //클래스 객체 메소드 실행
			
			System.out.printf("MSG[%s]\n", elev.k42_help);
		}
		for(int i = 0; i < 10; i ++) {
			elev.down();
			
			System.out.printf("MSG[%s]\n", elev.k42_help);
		}
	}

}
