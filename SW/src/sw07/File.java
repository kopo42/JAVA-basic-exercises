package sw07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

class File {
	public static void main(String[] args) throws Exception{
		FileWriter k42_fw=new FileWriter("c:\\users\\J\\Desktop\\source\\a.txt",true); 
		//파일 저장시 경로와 파일명 지정 + 중복 덮어쓰기 유무(true)
		BufferedWriter k42_bw=new BufferedWriter(k42_fw); // 버퍼 쓰기 클래스 (딜레이 저장)
		StringBuffer k42_sf=new StringBuffer(); //스트링 버퍼 클래스 (파일 저장시 사용)
		BufferedReader k42_br=new BufferedReader(new InputStreamReader(System.in)); //버퍼 읽기 클래스
		
		String k42_str=""; //문자열 선언
		
		while(!(k42_str=k42_br.readLine()).startsWith("s")) { //"s"로 시작하는 값이 들어올 때 까지
			k42_sf.append(k42_str+"\n"); //string buffer에 추가한다
		}
		k42_br.close(); //반복문 종료시 닫기
		
		k42_fw.write(k42_sf.toString()); //입력값이 저장된 string buffer를 파일에 쓰기
		k42_fw.flush(); //(강제) 내보내기
		k42_fw.close(); //파일 쓰기 닫기
		System.out.println("저장이 완료되었습니다.");
	}
}