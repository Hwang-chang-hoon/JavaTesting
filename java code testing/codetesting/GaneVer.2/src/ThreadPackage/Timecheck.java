package ThreadPackage;
import Game.*;

public class Timecheck extends Thread{
	int num;
	public Timecheck(int num) {
		this.num = num;
	}
	public void run() {
		do {
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Unit.atkbuff=10;
			this.num = 1;
			
		}while(true);
	}
	public void print() {
		if (this.num == 1) {
			System.out.println("1���� ����Ǿ����ϴ�.");
			System.out.println("���ݷ��� �����մϴ�.");
		}

	}
	
}
