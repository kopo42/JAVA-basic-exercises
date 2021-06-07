package exchangeEx;
import java.io.IOException;
import java.util.Scanner;

public class SelectClass {
	static FileWriteClass FileOut = new FileWriteClass();
	
	public static void main(String[] args) throws IOException {
		TypeClass t; //����, ������ �ݺ��� ������
		ProcessingClass pc;
		Scanner scanner = new Scanner(System.in);
		
		FileOut.headerWrite();
		
		while(true) {
			pc = new ProcessingClass();
			t = new TypeClass();
			
			System.out.print("### ȯ�� ��� ���� (1: USD, 2: EUR, 3: JPY, 4: EXIT) : ");
			t.type = scanner.nextInt();
			
			if (t.type > 4 || t.type < 1) {
				System.out.println("\n ### Please check the number you chose "
						+ "and try again\n");
				continue;
			} else if (t.type == 4) {
				System.out.println("\n### User ended the session");
				FileOut.fileClose();
				break;
			}
			System.out.print("### �ٲ� �ݾ� : ");
			
			t.inputWon = scanner.nextInt();
			
			SELECT (pc, t);
		}
	}
		
		public static void SELECT (ProcessingClass pc, TypeClass t) throws IOException {
			if (t.type == ValueClass.EX_TYPE_USD) {
				pc.EXCHANGE_USD (t);
				pc.CHANGE_KR(t);
				
				FileOut.dataWrite(t);
			} else if (t.type == ValueClass.EX_TYPE_EUR) {
				pc.EXCHANGE_EUR (t);
				pc.CHANGE_KR(t);
				
				FileOut.dataWrite(t);
			} else if (t.type == ValueClass.EX_TYPE_JPY) {
				pc.EXCHANGE_JPY (t);
				pc.CHANGE_KR(t);
				
				FileOut.dataWrite(t);
			} else if (t.type == ValueClass.EX_TYPE_EXIT) {
				System.out.println("==============================");
				System.out.println("SESSION ENDED");
			}
		}
}















































