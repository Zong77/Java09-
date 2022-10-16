class CRational {
	public static int n;
	public static int d;

	public void setND(int num, int den) {
		n = num;
		d = den;
	}

	public void setN(int num) {
		n = num;
	}

	public void setD(int num) {
		d = num;
	}
}

public class Class10b {

	public static void main(String[] args) {
		CRational aaa = new CRational();
		aaa.setND(3, 5);
		show(aaa);
	}

	public static void show(CRational obj) {
		System.out.println(obj.n + "/" + obj.d);
	}
}