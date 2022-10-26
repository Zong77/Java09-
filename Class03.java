package Java09;

class Caaa {
	//(c)Caaa不能宣告成public，因為一個檔案裡只能有一個public的類別
	private int value;
	//(d)沒有影響，因為可以在其他類別呼叫value

	public Caaa() {
		this(10);
		//(a)使value的植被設定為10
		System.out.println("value=" + value);
	}

	public Caaa(int i) {
		value = i;
		System.out.println("value=" + value);
	}
}

public class Class03 {
	public static void main(String[] args) {
		Caaa obj1 = new Caaa();
		Caaa obj2 = new Caaa(12);
		//(b)第21行是呼叫沒有引數的，第22行是呼叫有引數的
	}
}
