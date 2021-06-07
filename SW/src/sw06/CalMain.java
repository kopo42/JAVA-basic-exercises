package sw06;

public class CalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc1 c = new Calc1();
		int kor; int eng; int mat; int soc; int sci; //성적 값이 저장될 변수들
		int sum; double avg;//성적 계산 값이 저장될 변수들
		int month; //헤당월
		String name = "kopo42"; //이름
		
		month = 3; //3월 성적
		kor = c.getRand(); eng = c.getRand(); mat = c.getRand(); //랜덤 성적 값으로 초기화
		sum = c.sum(kor, eng, mat); //매개변수 3개
		avg = c.getAvg(kor, eng, mat, 0, 0, 3); //매개변수 3개
		c.printer(month, name, kor, eng, mat, sum, avg); //매개변수 3개
		
		month = 4; //4월 성적
		kor = c.getRand(); eng = c.getRand(); mat = c.getRand(); sci = c.getRand(); //랜덤 성적 값으로 초기화
		sum = c.sum(kor, eng, mat, sci); //매개변수 4개 
		avg = c.getAvg(kor, eng, mat, sci, 0, 4); //매개변수 4개 
		c.printer(month, name, kor, eng, mat, sci, sum, avg); //매개변수 4개 
		
		month = 5; //5월 성적
		kor = c.getRand(); eng = c.getRand(); mat = c.getRand(); sci = c.getRand(); soc = c.getRand();
		//랜덤 성적 값으로 초기화
		sum = c.sum(kor, eng, mat, sci, soc); //매개변수 5개
		avg = c.getAvg(kor, eng, mat, sci, soc, 5); //매개변수 5개
		c.printer(month, name, kor, eng, mat, sci, soc, sum, avg); //매개변수 5개
		}
	}

