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
		if(this.name.equals("손창하")) {
			System.out.println("정공입니다.");
		}
		else {
			System.out.println("현역입니다.");
		}
	}
}
