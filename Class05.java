package java09;

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
	//(c)n�Oint��ƫ��A�A�i���N�bsetValue()��J���
}

public class Class05 {

	public static void main(String[] args) {
		CCount a = new CCount();
		a.count();
		CCount b = new CCount();
		CCount c = new CCount();
		b.count();
		//a.setValue();
		//(b)�]�psetZero()��ơA��cnt�ȳQ�k�s
		c.count();
	}
}
//(d)���O�ܼơAstatic�׹��l�[�W�������O�ܼơA���O�ܼƬO�C�@�Ӫ���@�ɡA�]������إߦӲ֥[
//(e)��O��ơA����count()cnt�֥ܲ[�A�p�G�O���O����ܦ�����@�ΫK�L�k����