package Ship;

import java.util.Random;

import Game.*;

public class Destroyer extends Unit {
	public int sub;
	

	public Destroyer(String name, int hp, int hp_, int atk, int oil, int reload, int sub) {
		super(name, hp, hp_, atk, oil, reload);
		this.sub=sub;
	}
	
	
	public void subattact(Destroyer u, Unit o) {
		if (u.sub > 0) {
			u.sub--;
			System.out.println("��ڸ� �߻��մϴ�. ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("����ܷ�" + u.sub);
			Random random11 = new Random();
			int data1 = random11.nextInt(4) + 1;
			if (data1 == 1) {
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
			} else if (data1 == 2) {
				System.out.println("��ڰ� ��~ ���� ���� ���� ��Ĩ�ϴ�.");
				System.out.println("������� �Ծ�帱����");
				o.hp = o.hp - 100;
				if (o.hp < 0) {
					o.hp = 0;
				}
				System.out.println("�� �Լ� : " + o.hp);
			} else if (data1 == 3) {
				System.out.println("���� ������ �������� ��ڸ� ���ذ��ϴ�.");
				System.out.println("�� 1�� ���ص� ������ ���Ͽ����ϴ�.");
			} else if (data1 == 4) {
				System.out.println("�ط��� ���ؼ� ��ڰ� ��� �߸��� �������� �����ϴ�.");
				System.out.println("�� �ռ��� ����� ���ؽǷ¿� ������� �����ϴ�.");
			}

		} else if (u.sub <= 0) {
			System.out.println("����� �ܷ��� �����ϴ�.");
		}

	}

}
