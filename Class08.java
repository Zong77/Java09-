package java09;

class CWin {
	private static int cnt;
	static String color;
	static int width;
	static int height;

	public static void count() {
		cnt = cnt + 1;
		System.out.println(cnt + "objects");
	}

	public static void Cwin(String str, int w, int h) {
		color = str;
		width = w;
		height = h;
	}
	// (b)

	public static void CWin() {
		color = "red";
		width = 2;
		height = 2;
	}
	// (c)

	public static void setZore() {
		cnt = 0;
		System.out.println(cnt + "object");
	}
	// (d)

	public static void setValue(int n) {
		cnt = n;
	}
	// (e)
}

public class Class08 {

	public static void main(String[] args) {
		CWin a = new CWin();
		CWin.count();
		CWin b = new CWin();
		CWin.count();
		CWin.setZore();
	}
}
//(f)���O��ơA�p�G���O�L�k�֥[
//(g)��Ҩ�ơA�u�n����count() cnt�֥ܲ[�A�p�G�O���O����ܦ�����@�ΫK�L�k����