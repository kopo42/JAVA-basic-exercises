package everland;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ProcessingClass {
	CalClass cal = new CalClass();
	
	public void	getTime (TypeClass t) {
		if (t.time == Options.day) {
			t.price_time = Options.price_day;
			t.timestr = "�ְ�";
		} else {
			t.price_time = Options.price_night;
			t.timestr = "�߰�";
		}
	}
	
	public void getAge (TypeClass t) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		int now_year = Integer.parseInt(sdf.format(calendar.getTime()));
		
		int birth_year = Integer.parseInt(t.minbun.substring(0, 4));
		t.age = now_year - birth_year;
		
		//price = {����, û�ҳ�, ���, ���, ����}
		if(t.age >= Options.adultMin && t.age <= Options.adultMax) {
			t.price_age = t.price_time[0];
			t.agestr = "����";
		} else if (t.age >= Options.youthMin && t.age <= Options.youthMax) {
			t.price_age = t.price_time[1];
			t.agestr = "û�ҳ�";
		} else if (t.age >= Options.childMin && t.age <= Options.childMax) {
			t.price_age = t.price_time[2];
			t.agestr = "���";
		} else if(t.age >= Options.senior){
			t.price_age = t.price_time[3];
			t.agestr = "���";
		} else if(t.age <= Options.enfant) {
			t.price_age = t.price_time[4];
			t.agestr = "36���� �̸� �����̿�";
		}
	}
	
	public int getDiscnt(TypeClass t) {
		switch(t.discnt) {
		case 1:
			t.disrate = Options.non;
			t.discntstr = "������ ����";
			t.subtotal = cal.Subtotal1(t);
			break;
		case 2:
			t.disrate = Options.disabled;
			t.discntstr = "�����";
			t.subtotal =cal.Subtotal2(t);
			break;
		case 3:
			t.disrate = Options.veteran;
			t.discntstr = "����������";
			t.subtotal =cal.Subtotal2(t);
			break;
		case 4:
			t.disrate = Options.multiChild;
			t.discntstr = "���ڳ�";
			t.subtotal =cal.Subtotal1(t);
			break;
		case 5:
			t.disrate = Options.preg;
			t.discntstr = "�ӻ��";
			t.subtotal =cal.Subtotal3(t);
			break;
		}
		return t.subtotal;
	}
}
