package test;

public class book {
	public int no;
	public String name;
	public int price;
	public String author;
	
	public book(int no, String name, int price, String author) {
		this.no = no;
		this.name = name;
		this.price = price;
		this.author = author;
	}

	public void test() {
		if(this.name.equals("��â��")) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("�����Դϴ�.");
		}
	}
}
