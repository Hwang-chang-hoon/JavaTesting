package Ship;

import java.util.Random;

import Game.*;

public class Cruiser extends Unit {
	static public int plain;
	static public int plain_;
	static public int plain_atk;
	static public int plainCount;
	static boolean upgrade;// ���׷��̵� �Ǵ�
	public static boolean air_deney;//�װ����� ����

	public Cruiser(String name, int hp, int hp_, int atk, int atk_, int oil, int oil_, int reload, int tr, int plain, int plain_,
			int plain_atk) {
		super(name, hp, hp_, atk, atk_, oil, oil_, reload, tr);
		this.plain = plain;
		this.plain_ = plain_;
		this.plain_atk = plain_atk;
		this.upgrade = false;
		this.air_deney = true;
	}

	public boolean up_grade() {
		return plainCount >= 1 ? true : false;
	}

	public static void plainFihgt(Cruiser u, Unit o) {
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

	public static void air_convert(Unit user) {
		System.out.println("�� �������� �װ��븦 ������Ű�̱���");
		System.out.println("����� �װ������� ���������� ������ �����Ͻ������� ���� ����� �׿����� Ȯ�� �߾��ϴ�.");
		System.out.println("�����Ͻðڽ��ϱ�?");
		System.out.println("1. �ϰڽ��ϴ�.   2. ���ϰھ��ϴ�.");
		
	}
	public static void air_agree(Unit user) {
		System.out.println("�װ����������� ����� �Ű�Ǿ����ϴ�.");
		System.out.println("����� �������� ������ ���Դϴ�.");
		System.out.println("");
		user.choice=1;
	}
	public static void air_reject(Cruiser user) {
		System.out.println("��Ÿ������.");
		user.plainCount = 0;
		user.air_deney = false;
	}
	public static void recharge(Cruiser user) {
		user.plain = 10;
	}
	

}
