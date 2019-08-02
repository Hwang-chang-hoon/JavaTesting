package ThreadPackage;

import java.util.Random;

public class WeatherThread extends Thread {
	int atk;// 공격력
	int num;
	
	
	
	public WeatherThread(int num) {
		this.num = num;
	}

	public void run() {

		do {
			Random rendom = new Random();
			int a = rendom.nextInt(1) + 1;
			if (a == 1) {
				// System.out.println("날씨가 맑군요");
				this.num = 1;
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else
				this.num = 2;
			// System.out.println("비가옵니다.");
			// System.out.println("명중륭이 낮아집니다.");
			this.atk -= 10;

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} while (true);

	}

	public void print() {
		if (this.num == 1) {
			System.out.println("날씨가 맑군요");
		}
		else if (this.num==2) {
			System.out.println("비가옵니다.");
			System.out.println("명중륭이 낮아집니다.");
		}

	}
}
