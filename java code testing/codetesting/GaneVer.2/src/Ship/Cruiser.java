package Ship;

import java.util.Random;

import Game.*;

public class Cruiser extends Unit {
	public int plain;
	public int plain_atk;
	public int plainCount;
	boolean upgrade;//���� �Ǵ�

	public Cruiser(String name, int hp, int hp_, int atk, int oil, int reload, int plain, int plain_atk) {
		super(name, hp, hp_, atk, oil, reload);
		this.plain=plain;
		this.plain_atk=plain_atk;
	}
	public void checkplain() {
		if(this.plainCount>=10)
			upgrade=true;
	}
	public void plainFihgt(Cruiser u, Unit o) {
		if (u.plain > 0) {
			u.plain--;
			System.out.println("������ ����!!!!! ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("�ܿ� ������" + u.plain);
			Random random11 = new Random();
			int data11 = random11.nextInt(4) + 1;
			if (data11 == 1) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("��ڰ� �����մϴ�.");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("��ź�ǿ� �����߽��ϴ�!!!!");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("������ �߻��߽��ϴ�!!!!!!!!!!");
				o.hp = o.hp - 450;
				if (o.hp < 0) {
					o.hp = 0;
				}
				System.out.println("�� �Լ� : " + o.hp);
				u.plainCount++;

			} else if (data11 == 2) {
				System.out.println("��ڰ� ��~ ���� ���� ���� ��Ĩ�ϴ�.");
				System.out.println("������� �Ծ�帱����");
				o.hp = o.hp - 100;
				if (o.hp < 0) {
					o.hp = 0;
				}
				System.out.println("�� �Լ� : " + o.hp);
				u.plainCount++;

			} else if (data11 == 3) {
				System.out.println("���� ������ �������� ��ڸ� ���ذ��ϴ�.");
				System.out.println("�� 1�� ���ص� ������ ���Ͽ����ϴ�.");

			} else if (data11 == 4) {
				System.out.println("�ط��� ���ؼ� ��ڰ� ��� �߸��� �������� �����ϴ�.");
				System.out.println("�� �ռ��� ����� ���ؽǷ¿� ������� �����ϴ�.");

			}

		} else if (u.plain <= 0) {
			System.out.println("ž�� ������ ���� �����մϴ�.");
		} 
	}

}
