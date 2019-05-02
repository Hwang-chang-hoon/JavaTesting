
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class MakingSdocu {

	public static void main(String[] args) {
		System.out.println("정수을 입력하시오.");
		Scanner nu = new Scanner(System.in);
		int n = nu.nextInt();
		int temp[][] = new int[n][n];
		int i;
		int j;
		int num[][] = new int[n][n];
		int change = num.length;
		for (i = 0; i < num.length; i++) {

			for (j = 0; j < num[i].length; j++) {

				num[i][j] = (i + j) % n + 1;

			}

		}

		for (int a = 0; a < change; a++) {
			int r = (int) (Math.random() * change);
			int r2 = (int) (Math.random() * change);
			for (int b = 0; b < change; b++) {
				temp[0][b] = num[r][b];
				num[r][b] = num[r2][b];
				num[r2][b] = temp[0][b];

			}
		}
		for (int a = 0; a < change; a++) {
			int r = (int) (Math.random() * change);
			int r2 = (int) (Math.random() * change);
			for (int b = 0; b < change; b++) {
				temp[b][0] = num[b][r];
				num[b][r] = num[b][r2];
				num[b][r2] = temp[b][0];

			}
		}

		for (i = 0; i < num.length; i++) {
			for (j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}

	}
}