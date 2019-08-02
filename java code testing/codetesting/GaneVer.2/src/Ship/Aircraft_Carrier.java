package Ship;

import java.util.Random;

import Game.*;

public class Aircraft_Carrier extends Unit {

	public int air_plain;
	public static int upGrade_Count;

	public Aircraft_Carrier(String name, int hp, int hp_, int atk, int atk_, int oil, int oil_, int reload, int tr,
			int air_plain) {
		super(name, hp, hp_, atk, atk_, oil, oil_, reload, tr);
		this.air_plain = air_plain;
	}

	public static void PlainAttact(Aircraft_Carrier user, Unit opposite) {
		if (user.air_plain > 0) {
			System.out.println("������ ����!!!!! ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Random random11 = new Random();
			int data11 = random11.nextInt(5) + 1;
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
				opposite.hp = opposite.hp - user.atk * 4;
				if (opposite.hp < 0) {
					opposite.hp = 0;
				}
				System.out.println("�� �Լ� : " + opposite.hp);

			} else if (data11 == 2) {
				System.out.println("��ڰ� ��~ ���� ���� ���� ��Ĩ�ϴ�.");
				System.out.println("������� �Ծ�帱����");
				opposite.hp = opposite.hp - user.atk;
				if (opposite.hp < 0) {
					opposite.hp = 0;
				}
				System.out.println("�� �Լ� : " + opposite.hp);

			} else if (data11 == 3) {
				System.out.println("�װ��밡 ����մϴ�.");
				System.out.println("������ �����ö� ���� ��ٷ�����.");
				System.out.println("����� ������ ���°Ͱ����ϴ�.");
				System.out.println("����� ���ظ� ���� �װ��밡 ��ȯ�߽��ϴ�.");
				opposite.hp = opposite.hp - user.hp * (user.air_plain / 2);
				if (opposite.hp < 0) {
					opposite.hp = 0;
				}

			} else if (data11 == 4) {
				System.out.println("�װ��밡 ����մϴ�.");
				System.out.println("������ �����ö� ���� ��ٷ�����.");
				System.out.println("����� ������ ���°Ͱ����ϴ�.");
				System.out.println("����� ���ظ� ���� �װ��밡 ��ȯ�߽��ϴ�.");
				opposite.hp = opposite.hp - user.hp * user.air_plain;
				if (opposite.hp < 0) {
					opposite.hp = 0;
				}
			} else if (data11 == 5) {
				System.out.println("�װ��밡 ����մϴ�.");
				System.out.println("������ �����ö� ���� ��ٷ�����.");
				System.out.println("����� ������ ���°Ͱ����ϴ�.");
				System.out.println("�׳� �װ������� �Ѱ����� ġ��.");
				System.out.println("�� �װ������̳İ��?");
				System.out.println("�ű⿡ �����־����ϱ� �װ��Ⱑ ���ظ� �Ծ�����?");
				user.air_plain--;
			}

		} else if (user.air_plain <= 0) {
			System.out.println("ž�� ������ ���� �����մϴ�.");
		}
	}

	public static void refitment(Aircraft_Carrier user) {
		System.out.println("�װ��밡 ������ �ֵ��� ������ �մϴ�.");
		System.out.println("10���� �װ��Ⱑ ����� �Դ뿡 �շ��մϴ�.");
		System.out.println("���� �����ϰ� ������ �ϽǼ��ֽ��ϴ�.");
		user.air_plain += 10;
		user.upGrade_Count++;
		System.out.println("�ܿ� �װ��� �� : "+user.air_plain);
	}
	

}
