package java09;

class Namecard {
	private String name;
	private String address;
	private Phone data;

	public Namecard(String na, String add, String s1, String s2) {
		name = na;
		address = add;
		data = new Phone(s1, s2);

	}

	class Phone {
		private String company;
		private String cell;

//(a)
		public Phone(String s1, String s2) {
			company = s1;
			cell = s2;
		}
	}

//(b)
	public void show() {
		System.out.println("好友姓名:" + name);
		System.out.println("好友地址:" + this.address);
		System.out.println("公司電話:" + data.company);
		System.out.println("手機號碼:" + data.cell);
	}
}

//(c)
public class Class17 {

	public static void main(String[] args) {
		Namecard first = new Namecard("Andy", "123City", "2345-678", "0922-300-112");
		first.show();
	}
}
//(d)