package sw06;

public class TVRemo2 { //기능이 저장된 클래스
	private int k42_Vmax; //최대 음량
	private int k42_Vmin; //최소 음량
	private int k42_Vol; //현재 음량
	
	private int k42_Chmax; //마지막 채널
	private int k42_Chmin; //처음 채널
	private int k42_Chan; //현재 채널

	private String k42_help; //안내문이 저장될 문자열 변수 선언
	
	TVRemo2(){
		k42_Vmax = 30; //최대 음량
		k42_Vmin = 0; //최소 음량
		k42_Vol = 2; //현재 음량
		
		k42_Chmax = 212; //마지막 채널
		k42_Chmin = 0; //처음 채널
		k42_Chan = 50; //현재 채널

		k42_help = "기본 설정"; //안내문이 저장될 문자열 변수 선언
	}
	TVRemo2(int k42_chup, int k42_chdn, int k42_ch, int k42_volup, int k42_voldn, int k42_vol){
		k42_Chmax = k42_chup; k42_Chmin = k42_chdn; k42_Chan = k42_ch;
		k42_Vmax = k42_volup; k42_Vmin = k42_voldn; k42_Vol = k42_vol;
		k42_help = "기본 설정 완료";
	}

	public void VolUp(int k42_n) { //음량 높임
		int k42_i = 0;
		while(k42_i < k42_n) {
		if(k42_Vol == k42_Vmax) { //최대 음량이라면
			k42_help = "최대 음량입니다";
		} else {
			k42_Vol++; //아닐 경우 음량 높임
			k42_help = String.format("음량 : %d", k42_Vol);
		}
		System.out.print(k42_help + " ");
		k42_i++;
		}
		System.out.println();
	}
	public void VolDown(int k42_n) { //음량 줄임
		int k42_i = 0;
		while(k42_i < k42_n) {
		if(k42_Vol == k42_Vmin) { //최소 음량이라면
			k42_help = "최소 음량입니다";
		} else {
			k42_Vol--; //아닐 경우 음량 줄임
			k42_help = String.format("음량 : %d", k42_Vol);
			}
		System.out.print(k42_help + " ");
		k42_i++;
		}
		System.out.println();
	}
	public void ChUp(int k42_n) { //채널 올림
		int k42_i = 0;
		while(k42_i < k42_n) {
			if(k42_Chan == k42_Chmax) { //마지막 채널 설정
				k42_help = String.format("%d번", k42_Chmax);
				k42_Chan++; //다음으로
			} else if(k42_Chan > k42_Chmax){//마지막 채널에서 더 올렸다면
				k42_Chan = k42_Chmin;//처음 채널로 넘어간다
				k42_help = String.format("%d번", k42_Chan);
				k42_Chan++;
			} else {
				k42_help = String.format("%d번", k42_Chan); //그 외의 경우들
				k42_Chan++;
			}
			System.out.print(k42_help + " ");
		k42_i++;
		}
		System.out.println();
	}
	public void ChDown(int k42_n) { //채널 내림
		int k42_i = 0;
		while(k42_i < k42_n) {
			if(k42_Chan == k42_Chmin) { //처음 채널 설정
				k42_help = String.format("%d번", k42_Chmin);
				k42_Chan--; //다음으로
			} else if(k42_Chan < k42_Chmin){//처음 채널에서 더 내렸다면
				k42_Chan = k42_Chmax;//마지막 채널로 넘어간다
				k42_help = String.format("%d번", k42_Chan);
				k42_Chan--;
			} else {
				k42_help = String.format("%d번", k42_Chan); //그 외의 경우들
				k42_Chan--;
			}
			System.out.print(k42_help + " ");
		k42_i++;
		}
		System.out.println();
	}
}
