package ThreadPackage;

import java.util.Random;

public class WeatherThread extends Thread {
	int atk;// ���ݷ�
	int num;
	
	
	
	public WeatherThread(int num) {
		this.num = num;
	}

	public void run() {

		do {
			Random rendom = new Random();
			int a = rendom.nextInt(1) + 1;
			if (a == 1) {
				// System.out.println("������ ������");
				this.num = 1;
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else
				this.num = 2;
			// System.out.println("�񰡿ɴϴ�.");
			// System.out.println("���߸��� �������ϴ�.");
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
			System.out.println("������ ������");
		}
		else if (this.num==2) {
			System.out.println("�񰡿ɴϴ�.");
			System.out.println("���߸��� �������ϴ�.");
		}

	}
}
