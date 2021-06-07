package sw07;

public class OneRec1 {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public OneRec1(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public String name() {return this.name;};
	public int kor() {return this.kor;};
	public int eng() {return this.eng;};
	public int mat() {return this.mat;};
	public int sum() {return this.kor + this.eng + this.mat;};
	public double avg() {return this.sum() / 3.0;};
}
