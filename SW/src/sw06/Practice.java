package sw06;

public class Practice {
	static int k42_iStatic;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc2 cc = new Calc2();
		
		System.out.printf("¸Å°³º¯¼ö 2°³ µ¡»ù %d\n", cc.sum(1, 2));
		System.out.printf("¸Å°³º¯¼ö 3°³ µ¡»ù %d\n", cc.sum(1, 2, 3));
		System.out.printf("¸Å°³º¯¼ö 4°³ µ¡»ù %d\n", cc.sum(1, 2, 3, 4));
		
		System.out.printf("´õºíÇü µ¡»ù %f\n", cc.sum(1.3, 2.4));
		
		int k42_iMain = 1;
		k42_iStatic = 1;
		
		System.out.printf("Method not yet called -> iStatic = %d\n", k42_iStatic);
		System.out.printf("Method not yet called -> iMain = %d\n", k42_iMain);
		
		add(k42_iMain);
		
		System.out.printf("Method called -> iStatic = %d\n", k42_iStatic);
		System.out.printf("Method called -> iMain = %d\n", k42_iMain);
		
		k42_iMain = add2(k42_iMain);
		System.out.printf("Method add2 called -> iStatic = %d\n", k42_iStatic);
		System.out.printf("Method add2 called -> iMain = %d\n", k42_iMain);
		
	}
	public static void add(int k42_i) {
		k42_iStatic++;
		k42_i++;
		System.out.printf("From add Method -> iStatic = %d\n", k42_iStatic);
		System.out.printf("From add Method -> i = %d\n", k42_i);
	}
	public static int add2(int k42_i) {
		k42_iStatic++;
		k42_i++;
		System.out.printf("From add2 Method -> iStatic = %d\n", k42_iStatic);
		System.out.printf("From add2 Method -> i = %d\n", k42_i);
		return k42_i;
	}
	public static void iamMethod() { //method created
		System.out.println("Method"); //print
	}
}
