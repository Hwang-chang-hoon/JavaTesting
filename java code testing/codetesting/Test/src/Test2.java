
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int i, j;
		System.out.println("ธ๎ มู?");
		Scanner input1 = new Scanner(System.in);

		int num = input1.nextInt();

		for (i = 0; i < num; i++) {
			for (j = 0; j < (num - i - 1); j++) {
				System.out.print(" ");
			}
			for (j = 0; j < (2 * i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = num - 2; i >= 0; i--) {
			for (j = 0; j <= (num - i - 2); j++) {
				System.out.print(" ");
			}
			for (j = 0; j < (2 * i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}