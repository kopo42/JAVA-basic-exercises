package sw05;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

//console font = consolas normal 11

public class Reciepts3 {
	public static void main(String[] args) throws ParseException {
		printer1();
	}
	public static void printer1() throws ParseException {
		//제품명, 가격 정보가 30개 각각 이상이므로 이마트 상품 페이지에서 가져옴
		String[] ITEM = {"뽀로로 블루베리 맛 235ml", "[팔도] 뽀로로 보리차 220ml", 
				"피코크 콜롬비아 안티오키아 수프리모 1kg (홀빈)", "프레스코발디 카스틸리오니 끼안티", 
				"피죤 주방세제 퓨어 750ml 애플밤", "피죤 주방세제 퓨어 750ml 버진모히토", 
				"건조기용 피죤 라피에스타 40매", "건조기용 피죤 미스틱레인 40매", "액츠 퍼펙트 베이킹소다 3L+200ml", 
				"액츠 퍼펙트 딥클린 3L+200ml", "[종가집] 묵은지김치1.6kg", "프레스코발디 카스틸리오니 토스카나", 
				"피코크 트루워터 330ml", "맑은누리숨 황사방역 마스크 KF94 (대형) 1매 FDA등록 (한국생산/한국부자재사용/개별포장)", 
				"오리온 투유 우유초콜릿 60g", "라이프리 안심매트 10p", "[롯데] 허쉬[HERSHEY`S] 미니어처 155g", 
				"(G)피코크 유기농 밤그대로 100g*2입", "[피코크] 트루 스파클링 레몬(500ml×6입)", 
				"[피코크] 트루스파클링 자몽(500ml×6입)", "피코크 핫바베큐치킨300g", 
				"[20년산] 해남쌀이야기10kg(상등급)", "[피코크] 마몰로 녹차트러플 200g", 
				"[피코크] 과일 그래놀라 380g", "[피코크] 버터플라이 새우튀김 400g", 
				"[피코크] 인절미 그래놀라 380g", "피코크 카라멜초코볼 260g", "피코크 리얼화이트 딸기초코볼 170g", 
				"[피코크] 핫앤스파이시 새우튀김 400g", "[리스테린] 구강청결제 후레쉬버스트 750ml [의약외품]"};
		
		int[] PRICE = {1200, 1200, 14980, 22000, 6500, 6500, 6500, 6500, 9900, 9900, 
				12900, 37000, 1680, 3500, 8260, 2415, 3080, 3486, 3570, 3570, 
				3836, 29800, 4186, 4186, 4186, 4186, 4886, 1000, 5586, 5880};
		
		//수량 num[]에 1부터 3까지의 정수 난수를 지정한다
		int[] num = new int[ITEM.length];
		for(int i = 0; i < ITEM.length; i++) {
			int rand = (int) (Math.random() * 3 + 1);
			num[i] = rand;
		}
		//면세품목 지정을 위한 참, 거짓 배열
		boolean[] TAXFREE = {true, true, true, true, true, true, 
				true, true, true, true, true, true, 
				true, true, true, true, true, false, 
				true, true, true, false, true, true, 
				true, true, true, true, true, true};
		
		Calendar k42_cal = Calendar.getInstance(); //날짜 출력을 위한 calendar 객체
		SimpleDateFormat k42_sdf = new SimpleDateFormat("yyyy-MM-d HH:mm:ss"); //date format 생성
		String k42_TIME = k42_sdf.format(k42_cal.getTime()); //시간 정보 획득
		
		String HEADER = "emart";
		System.out.printf("  %s", HEADER);
		System.out.printf("%25s\n", "이마트 죽전점 (031)888-1234"); //오른쪽으로 정렬하여 출력한다 (printf)
		System.out.printf("%35s\n", "206-85-50913 강희석");//오른쪽으로 정렬하여 출력한다 (printf)
		System.out.printf("%29s\n", "용인 수지구 포은대로 552");//오른쪽으로 정렬하여 출력한다 (printf)
		
		System.out.println("영수증 미지참시 교환/환불 불가"
				+ "\n정상상품에 한함, 30일 이내(신선 7일)"
				+ "\n※일부 브랜드매장 제외(매장 고지물 참조)"
				+ "\n교환/환불 구매점에서 가능(결제카드 지참)\n");
		
		System.out.printf("[구 매]%s%14s\n", k42_TIME, "POS:0011-9861"); //처리 시간을 string으로 저장하여 출력한다
		System.out.println("------------------------------------------"); //구분선
		System.out.printf("%12s %12s %5s %5s\n", "상품명", "단 가", "수량", "금 액");
		System.out.println("------------------------------------------"); //구분선
		
		int[] sum = new int[ITEM.length]; //합계 저장을 위한 정수 배열
		int totalamount = 0; //총 구매수량
		int totalTaxFree = 0; //총 면세 품목
		int totalTaxincluded = 0; //총 과세 품목
		
		for(int i = 0; i < ITEM.length; i++) { //영수증 출력을 위한 반복문
			sum[i] = PRICE[i] * num[i];
			if(TAXFREE[i] == false) { //즉 면세품목이라면
				System.out.printf(" * %-10.6s %10s\t%4d%10s\n", //마찬가지로 printf로 정렬한다
						strCut(ITEM[i], null, 11, 0, true, true), NumberFormat.getInstance().format(PRICE[i]),
						num[i], NumberFormat.getInstance().format(sum[i]));
				totalTaxFree += PRICE[i]*num[i]; //면세품목 합계 = 가격 배열*수량 배열
			} else {
				System.out.printf("   %-10.6s %10s\t%4d%10s\n", //마찬가지로 printf로 정렬한다
						strCut(ITEM[i], null, 11, 0, true, true), NumberFormat.getInstance().format(PRICE[i]),
						num[i], NumberFormat.getInstance().format(sum[i]));
				totalTaxincluded += PRICE[i]*num[i]; //과세품목 합계
			}
			if((i+1) % 5 == 0) {
				System.out.println("------------------------------------------");
				//5개마다 구분선 출력
			}
			totalamount ++;
			//총 수량 저장
		}

		
		double k42_TAX = 0.1; //세율 10%
		int netprice = (int) (totalTaxincluded / (1 + k42_TAX)); //원가
		int totalTAX = totalTaxincluded - netprice; //부가세 = 과세 가격 - 원가
		int totalPRICE = totalTaxFree + totalTaxincluded + totalTAX; //총 구매금액 = 면세품목 + 과세품목 + 부가세
		
		System.out.println(); //한줄 띄움
		System.out.printf("%12s%4s%4s%17d\n", "총", "품목", "수량", totalamount);
		System.out.printf("%13s%4s%4s%17s\n", "(*)","면세","물품", 
				NumberFormat.getInstance().format(totalTaxFree)); //천단위 쉼표 형식
		System.out.printf("%17s%4s%17s\n", "과세", "물품", //같은 간격으로 printf 지정함
				NumberFormat.getInstance().format(totalTaxincluded));
		System.out.printf("%16s%3s%3s%17s\n", "부", "가", "세", 
				NumberFormat.getInstance().format(totalTAX));
		System.out.printf("%16s%7s%17s\n", "합", "계", 
				NumberFormat.getInstance().format(totalPRICE));
		System.out.printf("%-15s%21s\n", " 결 제 대 상 금 액", //-15 = 왼쪽 정렬
				NumberFormat.getInstance().format(totalPRICE)); //결제 대상 금액 = 합계 금액
		System.out.println("------------------------------------------");
		System.out.printf("%-15s%29s\n", "0012 KEB 하나", "541707**0484/35860658");//임의로 지정한 카드번호
		System.out.printf("카드결제(IC)%22s  %s\n", "일시불 /", NumberFormat.getInstance().format(totalPRICE)); //결제 금액 출력
		System.out.println("------------------------------------------");
		System.out.printf("%30s\n","[신세계 포인트 적립]");
		System.out.println("***고객님의 포인트 현황입니다.");
		int point = 164; //금회 발생 포인트
		int pointTOTAL = 5637; //누계 포인트
		int pointA = pointTOTAL - point; //가용 포인트 = 누계 - 금회 발생
		
		System.out.printf("%-10.10s %19s  %7d\n", 
				"금회발생포인트", "9350**9995", point);
		System.out.printf("%-10.10s %15s(   %8s)\n", 
				"누계(가용)포인트", NumberFormat.getInstance().format(pointTOTAL),  //천단위 쉼표 형식
				NumberFormat.getInstance().format(pointA));
		System.out.println("*신세계포인트 유효기간은 2년입니다.");
		System.out.println("------------------------------------------");
		System.out.printf("%24s\n", "구매금액기준 무료주차시간 자동부여");
		System.out.printf("%-10s %30s\n", "차량번호 :", "38보****"); //임의 지정 차량번호
		System.out.printf("%s %34s\n", "입차시간 : ", k42_TIME); //입차시간 = 처리시간 or 임의 지정
		System.out.println("------------------------------------------");
		System.out.printf("%s %29s", "캐셔:084599 양00", "1150");

		
	}/*
	"가나다라" 에서 2바이트까지 자르고 싶을경우 strCut("가나다라", 2, 0, true); 처럼 하시면 됩니다.
 => 결과 : "가"                            (String szText, int nLength, int nPrev, boolean isAdddot)

"가나다라" 에서 "다"라는 키워드 기준에서 2바이트까지 자르고싶을경우 strCut("가나다라", "다", 2, 0, true, true); 처럼 하시면 됩니다.

출처: https://cublip.tistory.com/102 [HeBhy, since 1983.]
*/
	
	
	public static String strCut(String szText, String szKey, int nLength, int nPrev, boolean isNotag, boolean isAdddot){
		// 문자열 자르기         
		String r_val = szText;     
		int oF = 0, oL = 0, rF = 0, rL = 0;     
		int nLengthPrev = 0;     
		//Pattern p = Pattern.compile("<(/?)([^<>]*)?>", Pattern.CASE_INSENSITIVE); 
		// 태그제거 패턴         
		//if(isNotag) {r_val = p.matcher(r_val).replaceAll("");}  // 태그 제거     
		//r_val = r_val.replaceAll("&amp;", "&");     
		//r_val = r_val.replaceAll("(!/|\r|\n|&nbsp;)", "");  // 공백제거       
		try {       byte[] bytes = r_val.getBytes("UTF-8");     // 바이트로 보관       
		if(szKey != null && !szKey.equals("")) {
			nLengthPrev = (r_val.indexOf(szKey) == -1)? 0: r_val.indexOf(szKey);  // 일단 위치찾고         
			nLengthPrev = r_val.substring(0, nLengthPrev).getBytes("MS949").length;  // 위치까지길이를 byte로 다시 구한다
			nLengthPrev = (nLengthPrev-nPrev >= 0)? nLengthPrev-nPrev:0;    // 좀 앞부분부터 가져오도록한다.       
			}           // x부터 y길이만큼 잘라낸다. 한글안깨지게.       
		int j = 0;       
		if(nLengthPrev > 0) while(j < bytes.length) {
			if((bytes[j] & 0x80) != 0) {
				oF+=2; rF+=3; 
				if(oF+2 > nLengthPrev) {break;} 
				j+=3;         
				} else {if(oF+1 > nLengthPrev) {break;} ++oF; ++rF; ++j;}       
			}             
		j = rF;
		while(j < bytes.length) {
			if((bytes[j] & 0x80) != 0) {
				if(oL+2 > nLength) {break;} oL+=2; rL+=3; j+=3;
				} else {if(oL+1 > nLength) {break;} ++oL; ++rL; ++j;}       
			}       r_val = new String(bytes, rF, rL, "UTF-8");  // charset 옵션    
			List<String> list = new ArrayList<String>();
			List<String> space = new ArrayList<String>();
			String kor = "^[ㄱ-ㅎㅏ-ㅣ가-힣]*$"; //한글만 인식
			//[피코크] 인절
			int Ecnt = 0;
			for(int k = 0; k < szText.length(); k++) { //10글자 내에서
				boolean korONLY = String.valueOf(szText.charAt(k)).matches(kor);
				if (korONLY = false) { //특수문자나 공백이라면
					r_val += "/";
					//Ecnt++; //substring 내 특수문자의 개수 (int)
				}
			}
		} catch(UnsupportedEncodingException e){ e.printStackTrace(); } 
		return r_val;   
		}
}
