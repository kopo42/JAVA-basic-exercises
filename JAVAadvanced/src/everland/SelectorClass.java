package everland;

import java.util.Scanner;

public class SelectorClass {
	ProcessingClass pc = new ProcessingClass();
	Scanner scan = new Scanner(System.in);
	
	public void timeSelect(TypeClass t) {
		System.out.println("Ƽ�� �߱��� �����մϴ�");
		System.out.println("������ �����ϼ���: ");
		System.out.println("1. �ְ���  2. �߰���");
		t.time = scan.nextInt();
		pc.getTime(t);
	}
	
	public void ageSelect(TypeClass t) {
		System.out.println("������� 8�ڸ��� �Է��ϼ���: ");
		t.minbun = scan.next();
		pc.getAge(t);
	}
	
	public void amntInput(TypeClass t) {
		System.out.println("�߱��Ͻ� Ƽ�� �ż��� �Է��ϼ���: ");
		t.amnt = scan.nextInt();
	}
	
	public int discntSelect(TypeClass t) {
		System.out.println("�������� �����ϼ���(���ɿ� ���� ���� �ڵ� ó���˴ϴ�): ");
		System.out.println("1. ����  2. �����  3. ����������  4. ���ڳ�  5. �ӻ��"); 
		t.discnt = scan.nextInt();
		t.subtotal = pc.getDiscnt(t);
		return t.subtotal;
	}
}

