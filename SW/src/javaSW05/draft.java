package javaSW05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class draft {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver"); //mysql ����� ���� ��ü
		Connection k42_connect = DriverManager.getConnection("jdbc:mysql://192.168.23.72:33060/kopo42",
				"root", "kopo42"); //mysql ��ũ, �����, ��й�ȣ
		//����� ���� ������ ���� ���, ������ �����ϴ� Ŭ���� ���� ����
		
		Statement k42_statemt = k42_connect.createStatement(); //statement = ���� ���� �������̽�
		
		//k42_statemt.execute("drop table Scores;");
		
		k42_statemt.execute("create table examtable2("
				+ "id int not null,"
				+ "name	varchar(50), "
				+ "kor int, eng	int, math int,"
				+ "sum int, avg double"
				+ ") DEFAULT CHARSET=utf8;"); 
		//������ ��ɾ�� �����ϰ� ���̺� ����
		
		//PRIMARY KEY ����
		//k42_statemt.execute("ALTER TABLE Scores DROP PRIMARY KEY;");
		//k42_statemt.execute("ALTER TABLE Scores ADD PRIMARY KEY (id);"); //������ ���Ǹ� ����
		//���̺� ���� �� ...indexnum int not null PRIMARY KEY...ó�� ��ϵ� ����
		
		k42_statemt.close();
		k42_connect.close();
	}
}
