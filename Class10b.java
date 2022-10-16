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
		show(aaa);//內部函數
	}

	public static void show(CRational obj) {//引數，類別and物件
		System.out.println(obj.n + "/" + obj.d);
	}
}