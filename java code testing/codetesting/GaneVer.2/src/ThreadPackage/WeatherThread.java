package ThreadPackage;

import java.util.Random;
import Game.*;

public class WeatherThread extends Thread {

	int num;

	public WeatherThread(int num) {
		this.num = num;
	}

	public void run() {

		do {
			Random rendom = new Random();
			int a = rendom.nextInt(1) + 1;
			if (a == 1) {
				this.num = 1;
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (a == 2) {
				this.num = 2;
				Unit.atkbuff = -10;

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} while (true);

	}

	public void print() {
		if (this.num == 1) {
			System.out.println("³¯¾¾°¡ ¸¼±º¿ä");
		} else if (this.num == 2) {
			System.out.println("ºñ°¡¿É´Ï´Ù.");
			System.out.println("¸íÁß¸¢ÀÌ ³·¾ÆÁý´Ï´Ù.");
		}

	}
}
