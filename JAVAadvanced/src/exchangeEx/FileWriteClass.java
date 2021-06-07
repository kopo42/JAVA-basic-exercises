package exchangeEx;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileWriteClass {
	TypeClass t = new TypeClass();
	private FileWriter fw;
	private boolean isFileExist;
	
	public FileWriteClass() {
		try {
			File file = new File(ValueClass.filename);
			if(file.exists() == true) {
				isFileExist = true;
			} else if(file.exists() == false){
				isFileExist = false;
			}
			fw = new FileWriter(ValueClass.filename, true);					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileClose() {
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void headerWrite() throws IOException {
		String head = "";
		if(isFileExist == false) {
			head = "��¥," + "ȯ�����," + "�ݾ�," + "ȯ�����," + "�Ž�����" + "\n";
			fw.write(head);
		} else if(isFileExist == true){
			head = "";
		}
	}
	
	public void dataWrite(TypeClass t) throws IOException {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		
		String result = sdf.format(c.getTime()) + "," + t.exchange_type + "," + t.inputWon + "," 
								+ t.result + "," + t.returnkrw + "\n";
		fw.write(result);
	}	
}














