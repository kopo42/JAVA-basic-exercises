package sw06;

public class TVRemocon { //기능이 저장된 클래스
	int k42_Vmax = 30; //최대 음량
	int k42_Vmin = 0; //최소 음량
	int k42_Vol = 2; //현재 음량
	
	int k42_Chmax = 212; //마지막 채널
	int k42_Chmin = 0; //처음 채널
	int k42_Chan = 210; //현재 채널

	String k42_help; //안내문이 저장될 문자열 변수 선언

	public void VolUp() { //음량 높임
		if(k42_Vol == k42_Vmax) { //최대 음량이라면
			k42_help = "최대 음량입니다";
		} else {
			k42_Vol++; //아닐 경우 음량 높임
			k42_help = String.format("음량 : %d", k42_Vol);
		}
	}
	public void VolDown() { //음량 줄임
		if(k42_Vol == k42_Vmin) { //최소 음량이라면
			k42_help = "최소 음량입니다";
		} else {
			k42_Vol--; //아닐 경우 음량 줄임
			k42_help = String.format("음량 : %d", k42_Vol);
		}
	}
	public void ChUp() { //채널 올림
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
	}
	public void ChDown() { //채널 내림
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
	}
}
