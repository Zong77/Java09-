package Java09;

class CCount {
	static int cnt = 0;

	public CCount() {
		cnt++;
	}

	public static void count() {
		System.out.println(cnt + "object(s) created");
	}
	//void setValue() {
	//	cnt = 0;
	//}
	void setValue(int n) {
		cnt = n;
	}
	//(c)n是int整數型態，可任意在setValue()輸入整數
}

public class Class05 {

	public static void main(String[] args) {
		CCount a = new CCount();
		a.count();
		CCount b = new CCount();
		CCount c = new CCount();
		b.count();
		//a.setValue();
		//(b)設計setZero()函數，使cnt值被歸零
		c.count();
	}
}
//(d)類別變數，static修飾子加上成為類別變數，類別變數是每一個物件共享，因此物件建立而累加
//(e)實力函數，執行count()cnt變累加，如果是類別函數變成物件共用便無法執行
