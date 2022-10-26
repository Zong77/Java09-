package Java09;

class CRational {
	public int n;
	public int d;

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

	public void show() {
		System.out.println(n + "/" + d);
	}
}

public class Class10a {

	public static void main(String[] args) {
		CRational aaa = new CRational();
		aaa.setND(3, 5);
		aaa.show();
	}
}
