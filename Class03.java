package java09;

class Caaa {
	//(c)Caaa����ŧi��public�A�]���@���ɮ׸̥u�঳�@��public�����O
	private int value;
	//(d)�S���v�T�A�]���i�H�b��L���O�I�svalue

	public Caaa() {
		this(10);
		//(a)��value���ӳQ�]�w��10
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
		//(b)��21��O�I�s�S���޼ƪ��A��22��O�I�s���޼ƪ�
	}
}