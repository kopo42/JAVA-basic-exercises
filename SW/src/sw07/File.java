package sw07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

class File {
	public static void main(String[] args) throws Exception{
		FileWriter k42_fw=new FileWriter("c:\\users\\J\\Desktop\\source\\a.txt",true); 
		//���� ����� ��ο� ���ϸ� ���� + �ߺ� ����� ����(true)
		BufferedWriter k42_bw=new BufferedWriter(k42_fw); // ���� ���� Ŭ���� (������ ����)
		StringBuffer k42_sf=new StringBuffer(); //��Ʈ�� ���� Ŭ���� (���� ����� ���)
		BufferedReader k42_br=new BufferedReader(new InputStreamReader(System.in)); //���� �б� Ŭ����
		
		String k42_str=""; //���ڿ� ����
		
		while(!(k42_str=k42_br.readLine()).startsWith("s")) { //"s"�� �����ϴ� ���� ���� �� ����
			k42_sf.append(k42_str+"\n"); //string buffer�� �߰��Ѵ�
		}
		k42_br.close(); //�ݺ��� ����� �ݱ�
		
		k42_fw.write(k42_sf.toString()); //�Է°��� ����� string buffer�� ���Ͽ� ����
		k42_fw.flush(); //(����) ��������
		k42_fw.close(); //���� ���� �ݱ�
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	}
}