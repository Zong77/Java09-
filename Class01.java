package java09;

class CRectangle {
	int width;
	int height;

//CRectangle類別的定義

	public CRectangle(int w, int h) {
		width = w;
		height = h;
	}

	public CRectangle() {// 無引數建構元
		//width = 10;
		//height = 8;
		//(b)小題
		
		this(10, 8);
		int width;
		int height;
		//(c)小題用this()來設定
	}

	public void show() {
		System.out.println("width=" + width);
		System.out.println("height=" + height);
	}
}

public class Class01 {
	public static void main(String[] args) {
		CRectangle a = new CRectangle(5, 2);
		a.show();
		CRectangle b = new CRectangle();
		b.show();
	}
}