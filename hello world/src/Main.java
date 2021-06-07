public class Main {

	public static void main(String[] args) {
		int iTemp = 1;
		System.out.print(iTemp);
		
		iTemp = (int)'2'; //trans char type
		System.out.println(", " + iTemp);
		
		char cTemp = 'A';
		System.out.print(cTemp);
		
		iTemp = (int)'3';
		System.out.println(", " + iTemp);
		
		double dTemp = 1.123123123;
		System.out.print(dTemp);
		
		dTemp = (char)'A';
		System.out.println(", " + dTemp);
		//prints out fixed values (ex: 'A' = 65)
	}
}
