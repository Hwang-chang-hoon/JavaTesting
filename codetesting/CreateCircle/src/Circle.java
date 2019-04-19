import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		System.out.println("반지름을 입력하시오.");
		Scanner input1 = new Scanner(System.in);
		
		int R = input1.nextInt();
		int x=0,y=0;
		for(x=-R; x<=R; x+=2) {
			for(y=-R; y<=R; y++) {
				if(x*x + y*y <= R*R) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}

