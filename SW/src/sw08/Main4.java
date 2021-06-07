package sw08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.Queue;

import org.openqa.selenium.NoSuchElementException;

public class Main4 {

	public static void main(String[] args) throws IOException {
		//엑셀 옵션 -> tab을 기준으로 txt 저장
				File k42_file = new File ("c:\\Users\\J\\Desktop\\source\\12_04_07_E_무료와이파이정보.txt"); //경로 및 파일명 지정
				BufferedReader k42_br = new BufferedReader (new FileReader(k42_file)); //파일 읽기 객체 생성
				String k42_str; //br.readLine으로 읽어들인 파일 내용을 저장할 변수
				
				if((k42_str = k42_br.readLine()) == null) { //읽어들인 내용이 없을 경우
					System.out.println("this file is empty"); //안내문 출력
					return; //조건문 나가기
				}
				double k42_lat = 37.3860521; //위도
				double k42_lng = 127.1214038; //경도
				
				int k42_lineCnt = 0; //줄 개수를 저장할 변수  
				double k42_max = 0.25;
				double k42_min = 0.25; //최대, 최소값을 저장할 변수 : 값을 구할 때 적절한 값으로 초기화
				
				List <String> k42_QforMAX = new ArrayList <String>(); //최대, 최소값의 정보만 최종적으로 출력하기 위해 사용
				List <String> k42_QforMIN = new ArrayList <String>(); 
				
				while((k42_str = k42_br.readLine()) != null) { //읽어들인 내용이 존재할 경우 반복
					try {
						String[] k42_field = k42_str.split("\t"); //필드 내용 (tab 기준)
						
						double k42_distance = getDistance(k42_field,k42_lat, k42_lng, k42_lineCnt); //거리를 계산하고 반올림한 값을 반환하는 함수
						
						if(k42_distance < 0.5) { //서울시 반경을 고려한 허위값 축소를 위해 거리를 제한함
							
							if(k42_max < getDistance(k42_field, k42_lat, k42_lng, k42_lineCnt)) { //최대값보다 큰 값이 존재한다면 그 값을 최대값으로 다시 저장한다
								k42_max = getDistance(k42_field, k42_lat, k42_lng, k42_lineCnt); //최대값 초기화
								String WifiInfoMAX = "<최장거리>\n" + "소재지 도로명 주소 : " + k42_field[9] + "\n설치장소 : " + k42_field[1] + " " + k42_field[2] 
										+ "\n거리 : " + k42_distance + "\n" + "위도 : " + k42_field[13] + "\n" + "경도 : " +k42_field[14] + "\n";
								//출력할 값을 하나의 String에 저장한다
							k42_QforMAX.add(WifiInfoMAX); //값이 저장된 문자열 하나를 문자열 배열에 추가한다
							}
							if(k42_min > getDistance(k42_field, k42_lat, k42_lng, k42_lineCnt)) { //최소값보다 작은 값이 존재한다면 그 값을 최소값으로 다시 저장한다
								k42_min = getDistance(k42_field, k42_lat, k42_lng, k42_lineCnt); //최소값 초기화
								String WifiInfoMIN = "<최단거리>\n" + "소재지 도로명 주소 : " + k42_field[9] + "\n설치장소 : " + k42_field[1] + " " + k42_field[2] 
										+ "\n거리 : " + k42_distance + "\n" + "위도 : " + k42_field[13] + "\n" + "경도 : " +k42_field[14] + "\n";
								//출력할 값을 하나의 String에 저장한다
								k42_QforMIN.add(WifiInfoMIN); //값이 저장된 문자열 하나를 문자열 배열에 추가한다
							}
						}
					} catch(ArrayIndexOutOfBoundsException e) { //실행 시 에러 요인 확인하여 예외처리: 수동으로 처리한 파일이므로 잘못된 형식이 존재함
						System.out.println("ArrayIndexOutOfBoundsException");
					} catch(NumberFormatException e) {
						System.out.println("NumberFormatException");
					} catch(NoSuchElementException e) {
						System.out.println("NoSuchElementException");
					} catch(MissingFormatArgumentException e) {
						System.out.println("MissingFormatArgumentException");
					}
					k42_lineCnt ++;
				}
				System.out.println("<무료 와이파이 데이터 최장, 최단거리 처리 결과>");
				System.out.printf("\n처리: %d건\n\n", k42_lineCnt);
				System.out.println(k42_QforMAX.get(k42_QforMAX.size() - 1)); //마지막 요소(가장 최근에 추가된 요소)만을 출력
				System.out.println(k42_QforMIN.get(k42_QforMIN.size() - 1));
				//ex: arr[] = {A}, index "A" = 0, arr.size = 1
				
				k42_br.close(); //파일 읽기 닫기
			}

	public static double getDistance(String[] k42_field, double k42_lat, double k42_lng, int lineCnt) { //거리 계산 함수
		double k42_distance = Math.sqrt(Math.pow(Double.parseDouble(k42_field[13]) - k42_lat, 2)
				+ Math.pow(Double.parseDouble(k42_field[14]) - k42_lng, 2));
		//피타고라스 거리 정리 = {(a - c)^2 + (b - d)^2}의 루트값
		return k42_distance;
	}
	
}

