package javaSW05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class draft {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver"); //mysql 사용을 위한 객체
		Connection k42_connect = DriverManager.getConnection("jdbc:mysql://192.168.23.72:33060/kopo42",
				"root", "kopo42"); //mysql 링크, 사용자, 비밀번호
		//사용자 정보 변경이 잦을 경우, 정보만 저장하는 클래스 따로 생성
		
		Statement k42_statemt = k42_connect.createStatement(); //statement = 쿼리 전송 인터페이스
		
		//k42_statemt.execute("drop table Scores;");
		
		k42_statemt.execute("create table examtable2("
				+ "id int not null,"
				+ "name	varchar(50), "
				+ "kor int, eng	int, math int,"
				+ "sum int, avg double"
				+ ") DEFAULT CHARSET=utf8;"); 
		//리눅스 명령어와 동일하게 테이블 생성
		
		//PRIMARY KEY 지정
		//k42_statemt.execute("ALTER TABLE Scores DROP PRIMARY KEY;");
		//k42_statemt.execute("ALTER TABLE Scores ADD PRIMARY KEY (id);"); //수정시 편의를 위함
		//테이블 생성 시 ...indexnum int not null PRIMARY KEY...처럼 등록도 가능
		
		k42_statemt.close();
		k42_connect.close();
	}
}
