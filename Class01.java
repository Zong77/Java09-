package java09;

class CRectangle {
	int width;
	int height;

//CRectangle���O���w�q

	public CRectangle(int w, int h) {
		width = w;
		height = h;
	}

	public CRectangle() {// �L�޼ƫغc��
		//width = 10;
		//height = 8;
		//(b)�p�D
		
		this(10, 8);
		int width;
		int height;
		//(c)�p�D��this()�ӳ]�w
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