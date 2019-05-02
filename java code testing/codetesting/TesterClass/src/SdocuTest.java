import java.util.*;

public class SdocuTest {
	public static void main(String[] args) {
		int size = 0;
		int rand;
		Random random = new Random(System.currentTimeMillis());
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("숫자를 입력하세요(2이상)");
			size = sc.nextInt();
			if (size < 2) {
				System.out.println("2이상 숫자를 입력해주세요");
			} else {
				break;
			}
		}

		// 2차원 배열 size크기로 생성
		int result[][] = new int[size][size];

		// 0으로 초기화
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				result[i][j] = 0;
			}
		}
		// 랜덤상수 size만큼 자연수가들어가게함
		rand = random.nextInt(size) + 1;
		int a;
		int b;
		int row;
		int col;
		boolean isSame = true;
		int loopCount = 0;

		// long curTime = System.currentTimeMillis();
		// System.out.println("시작시간: "+ (curTime / 1000));

		Loop2: while (true) {
			loopCount = 0;// 초기화

			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					row = j; // 제이임
					col = i; // 아이임

					Loop1: while (true) {
						rand = random.nextInt(size) + 1;
						result[i][j] = rand;

						// 기준 왼쪽값들 일치유무검사
						for (a = row - 1; a >= 0; a--) {
							while (isSame == true) {
								if (result[i][j] == result[i][a]) {
									isSame = true;
									continue Loop1;
								} else {
									isSame = false;
								}
							}
							isSame = true;// 빠져나오면 다시 초기화
						}

						// 기준 위쪽값들 일치유무검사
						for (b = col - 1; b >= 0; b--) {
							while (isSame == true) {
								if (result[i][j] == result[b][j]) {
									loopCount++;
									if (loopCount > 300) { // 마지막에 가까운 값이 가로 세로 겹쳐서 무한루프가 도는 경우가 발생하는데 300번이상 루프를 돌면
															// 처음부터 스도쿠를 짜게한다.
										continue Loop2;
									}

									isSame = true;
									continue Loop1;
								} else {
									isSame = false;
								}
							}
							isSame = true;// 빠져나오면 다시 초기화
						}

						break;
					}
				}
			}
			// long curTime2 = System.currentTimeMillis();
			System.out.println("종료시간: " + loopCount);
			// System.out.println("걸린시간: " + ((curTime2 - curTime)/1000));

			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (String.valueOf(result[i][j]).length() == 1) {
						System.out.print("  " + result[i][j] + " ");
					} else {
						System.out.print("  " + result[i][j]);
					}
				}
				System.out.println();
			}
			break;
		}
	}
}