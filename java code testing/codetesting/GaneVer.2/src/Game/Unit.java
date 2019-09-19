package Game;

import java.util.Random;

import java.util.Scanner;

import Ship.Cruiser;
import Ship.Destroyer;

public class Unit {

	String name;
	public int hp;// ü��
	public int hp_;// ü�� �ʱ�ȭ
	public int atk;// ���ݷ�
	public static int atkbuff;
	public int atk_;// ���ݷ� �ʱ�ȭ
	public int oil;// ����
	public int oil_;// ���� �ʱ�ȭ
	public int reload;// ��ź��
	public int tr;// ����
	public int power;// ��ȭȽ��
	public int choice;// ����
	public boolean isPowered;// ��ȭ Ƚ�� �Ǵ�
	public boolean dead;// ���� �Ǵ�

	static Scanner sc = new Scanner(System.in);
	static Random rendom = new Random();

	public Unit(String name, int hp, int hp_, int atk, int atk_, int oil, int oil_, int reload, int tr) {
		this.name = name;
		this.hp_ = hp_;
		this.hp = hp;
		this.atk = atk;
		this.atk_ = atk_;
		this.oil = oil;
		this.oil_ = oil_;
		this.reload = reload;
		this.tr = tr;
		this.power = 0;
		this.choice = 0;
		this.dead = true;
	}

	public boolean isPowered() {
		return power >= 1 ? true : false;
	}

	public boolean isChoice() {
		return choice >= 1 ? false : true;
	}

	public static boolean checkDead(Unit user) {
		if (user.hp <= 0)
			user.dead = false;
		return user.dead;
	}

	public static void battle_txt(Unit user, Unit opposite) {
		System.out.println("������ ����Ƚ��");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("======================");
		System.out.println("���� : " + user.reload);
		System.out.println("��ǻ�Ͳ� : " + opposite.reload);
		System.out.println("======================");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("������ ȸ�ǰ��� Ƚ��");
		System.out.println("======================");
		System.out.println("����" + user.oil);
		System.out.println("��벨" + opposite.oil);
		System.out.println("======================");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�ܿ� ü��");
		System.out.println("======================");
		System.out.println("���� hp : " + user.hp);
		System.out.println("��ǻ�Ͳ� hp : " + opposite.hp);
		System.out.println("======================");
	}

	public static void battle(Unit user, Unit opposite) {
		System.out.println("������ �����մϴ�.");
		System.out.println("���ָ� �����ֽʽÿ�");
		System.out.println("1.���� 2.ȸ�� 3.���� ");
		Scanner num1111 = new Scanner(System.in);
		int e = num1111.nextInt();
		Random random1 = new Random();
		int com = random1.nextInt(3) + 1;
		// 1
		if (e == 1 && com == 1 && user.reload > 0 && opposite.reload > 0) {
			System.out.println("���ΰ� ���ο��� ������ �մϴ�.");
			user.hp -= (opposite.atk * opposite.reload);
			opposite.hp -= (user.atk * user.reload);
			battle_txt(user, opposite);
			user.reload = 0;
			opposite.reload = 0;
		} // ���� ����
			// 2
		else if (e == 1 && com == 1 && user.reload > 0 && opposite.reload == 0) {
			System.out.println("���� AI�� ���� �ΰ��� �پ���� ���մϴ�.");
			opposite.hp -= (user.atk * user.reload);
			battle_txt(user, opposite);
			user.reload = 0;
			opposite.reload = 0;
		} // ���� ����
			// 3
		else if (e == 1 && com == 1 && user.reload == 0 && opposite.reload == 0) {
			System.out.println("������ �غ�����ʾҽ��ϴ�.");
			battle_txt(user, opposite);
			user.reload = 0;
			opposite.reload = 0;
		} // ���� ���� X
			// 4
		else if (e == 1 && com == 1 && user.reload == 0 && opposite.reload > 0) {
			System.out.println("������ �غ�����ʾҽ��ϴ�.");
			System.out.println("�׷��� ������ ������ �غ� ��������̱���.");
			user.hp -= (opposite.atk * opposite.reload);
			battle_txt(user, opposite);
			user.reload = 0;
			opposite.reload = 0;
		} // ��븸 ����
			// 5
		else if (e == 1 && com == 2 && user.reload > 0 && user.reload < 3 && opposite.oil > 0) {
			System.out.println("�����մϴ�.");
			System.out.println("���� ȸ�Ǳ⵿�� ����Ͽ����ϴ�.");
			System.out.println("�ѹߵ� ���� �ʾҽ��ϴ�.");
			opposite.oil -= 1;
			battle_txt(user, opposite);
			user.reload = 0;
		} // �� ���� ��� ȸ��
			// 6
		else if (e == 1 && com == 2 && user.reload >= 3 && opposite.oil > 0) {
			System.out.println("�����մϴ�.");
			System.out.println("���� ȸ�Ǳ⵿�� ����Ͽ����ϴ�.");
			System.out.println("������ ���� �Ǿ� ź���� ����� �����Ǿ����ϴ�.");
			System.out.println("���ظ� ���� �����ϴ�.");
			opposite.hp -= (user.atk * (user.reload / 3));
			battle_txt(user, opposite);
			user.reload = 0;
		} // �� ���� ���� ��� ȸ��
			// 7
		else if (e == 1 && com == 2 && user.reload > 0 && user.reload < 3 && opposite.oil == 0) {
			System.out.println("�����մϴ�.");
			System.out.println("���� ��û�ϰԵ� ȸ�Ǹ� �����ϴµ� ȸ�Ǳ⵿�� ����߽��ϴ�.");
			System.out.println("���ظ� �����ϴ�.");
			opposite.hp -= (user.atk * user.reload);
			battle_txt(user, opposite);
			user.reload = 0;
		} // ������ ��� ȸ�ǺҰ�
			// 8
		else if (e == 1 && com == 2 && user.reload == 0 && opposite.oil > 0) {
			System.out.println("���뿡 ��ź�� �����ϴ�.");
			System.out.println("���� �����԰� ȸ�Ǳ⵿�� �����մϴ�.");
			System.out.println("���ظ� �������� ������ �ʾҽ��ϴ�.");
			opposite.oil -= 1;
			battle_txt(user, opposite);
		} // �� ���� �غ� X��� ȸ��
			// 9
		else if (e == 1 && com == 2 && user.reload == 0 && opposite.oil == 0) {
			System.out.println("���뿡 ��ź �����ϴ�.");
			System.out.println("��뵵 �غ� �ȵȻ��·� ȸ�Ǳ⵿�մϴ�.");
			battle_txt(user, opposite);
		} // ������ �غ� �ȵ� ��� ȸ�� �Ұ�
			// 10
		else if (e == 1 && com == 3 && user.reload > 0) {
			System.out.println("�����մϴ�.");
			System.out.println("���� �������Դϴ�.");
			System.out.println("������Ÿ��~~");
			opposite.reload += 1;
			opposite.hp -= (user.atk * user.reload);
			battle_txt(user, opposite);
			user.reload = 0;
		} // ������ �������
			// 11
		else if (e == 1 && com == 3 && user.reload == 0) {
			System.out.println("���뿡 ��ź�� �����ϴ�.");
			System.out.println("���� ������ �غ��ϴ±���.");
			opposite.reload += 1;
			battle_txt(user, opposite);
		} // �� �����Ұ� �������
			// 12
		else if (e == 2 && com == 1 && user.oil > 0 && opposite.reload > 0 && opposite.reload < 3) {
			System.out.println("ȸ�Ǳ⵿�� �մϴ�.");
			System.out.println("���� �����߽��ϴ�.");
			System.out.println("����� ź�� �Һ��մϴ�.");
			System.out.println("���� ����.");
			user.oil -= 1;
			battle_txt(user, opposite);
			opposite.reload = 0;
		} // �� ȸ�� ��� ����
			// 13
		else if (e == 2 && com == 1 && user.oil > 0 && opposite.reload >= 3) {
			System.out.println("ȸ�Ǳ⵿�� �մϴ�.");
			System.out.println("���⿡�� ������ ȸ���� �� ���� ź���� ����ɴϴ�.");
			System.out.println("�ε� ���ذ� ����ϱ⸸�� �⵵�մϴ�.");
			user.oil -= 1;
			user.hp -= (opposite.atk * (opposite.reload / 3));
			battle_txt(user, opposite);
			opposite.reload = 0;
		} // �� ȸ�� ��� 3����� ����
			// 14
		else if (e == 2 && com == 1 && user.oil > 0 && opposite.reload == 0) {
			System.out.println("ȸ�Ǳ⵿�� �����մϴ�.");
			System.out.println("��뵵 ������ �Ϸ��մϴ�.");
			System.out.println("�׷��� ź�� �߻���� �ʾҽ��ϴ�.");
			System.out.println("���� �ΰ��� �����մϴ�(Ǫ��)");
			user.oil -= 1;
			battle_txt(user, opposite);
			opposite.reload = 0;
		} // �� ȸ�� ��� ���� ����
			// 15
		else if (e == 2 && com == 2 && user.oil == 0 && opposite.reload > 0) {
			System.out.println("ȸ�Ǳ⵿�� �ǽ� �մϴ�.");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println("�ƴ� �ȵ��ݾ�?");
			System.out.println("ȸ�ǰ� �ȵ�");
			System.out.println("��...�ȵ�....");
			System.out.println("�ӵ�");
			System.out.println("���ƾƾƾƾƤ��ƾƾƾƤ��ƾƾƾƾ�");
			user.hp -= (opposite.atk * opposite.reload);
			battle_txt(user, opposite);
			opposite.reload = 0;
		} // �� ȸ�� �Ұ� ��� ���� ����
			// 16
		else if (e == 2 && com == 1 && user.oil == 0 && opposite.reload == 0) {
			System.out.println("�Ѵ� �ٺ��Դϴ�.");
			System.out.println("���� �ڽ��� �������� Ȯ���ϼ���.");
			battle_txt(user, opposite);
			opposite.reload = 0;
		} // �� ȸ�� �Ұ� ��� ���� ����
			// 17
		else if (e == 2 && com == 2 && user.oil > 0 && opposite.oil > 0) {
			System.out.println("ȸ�Ǳ⵿�� �մϴ�.");
			System.out.println("��뵵 ȸ�Ǳ⵿�� �մϴ�.");
			System.out.println("�Ʊ�� �⸧�� ���ȱ���.");
			battle_txt(user, opposite);
		} // �� ȸ�� ��� ȸ��
			// 18
		else if (e == 2 && com == 2 && user.oil == 0 && opposite.oil > 0) {
			System.out.println("�⸧�����ϴ�.");
			System.out.println("���浵 ����� �⸧�� �����ϴ±���.");
			opposite.oil -= 1;
			battle_txt(user, opposite);
		} // �� ȸ�� �Ұ� ��� ȸ�� ����
			// 19
		else if (e == 2 && com == 2 && user.oil > 0 && opposite.oil == 0) {
			System.out.println("ȸ�� �⵿�� �ǽ��մϴ�.");
			System.out.println("���� �⸧�� �ٶ��������ϴ�.");
			System.out.println("�⸧�� �����ϼ̱���?");
			user.oil -= 1;
			battle_txt(user, opposite);
		} // ��ȸ�ǰ��� ���ȸ�� �Ұ�
			// 20
		else if (e == 2 && com == 2 && user.oil == 0 && opposite.oil == 0) {
			System.out.println("�⸧�� �����ϴٰ�");
			System.out.println("��뵵 �����մϴ�.");
			battle_txt(user, opposite);
		} // ��ȸ�ǺҰ� ��� ȸ�ǺҰ�
			// 21
		else if (e == 2 && com == 3 && user.oil > 0) {
			System.out.println("ȸ�Ǳ⵿�� �õ��մϴ�.");
			System.out.println("���� �����մϴ�.");
			opposite.reload += 1;
			battle_txt(user, opposite);
		} // �� ȸ�� ��� ����
			// 22
		else if (e == 2 && com == 3 && user.oil == 0) {
			System.out.println("ȸ�Ǳ⵿�� �⸧�� ��� �����߽��ϴ�.");
			System.out.println("���� �����Ͽ� ������ ���ݷ��� �����մϴ�.");
			opposite.reload += 1;
			battle_txt(user, opposite);
		} // �� ȸ�ǺҰ� ��� ����
			// 23
		else if (e == 3 && com == 1 && opposite.reload > 0) {
			System.out.println("���� �մϴ�.");
			System.out.println("���� �����մϴ�.");
			System.out.println("�� �� ��������");
			user.reload += 1;
			user.hp -= (opposite.atk * opposite.reload);
			System.out.println(opposite.atk);
			battle_txt(user, opposite);
			opposite.reload = 0;
		} // �� ���� ��� �߽�
			// 24
		else if (e == 3 && com == 1 && opposite.reload == 0) {
			System.out.println("������ �մϴ�.");
			System.out.println("���� ������ �߿伺�� �𸣴� ����Դϴ�.");
			user.reload += 1;
			battle_txt(user, opposite);
		} // �� ���� ��� ��������
			// 25
		else if (e == 3 && com == 2 && opposite.oil > 0) {
			System.out.println("������ �մϴ�. ");
			System.out.println("���� ȸ�Ǳ⵿�� �մϴ�.");
			System.out.println("���� �⸧�� ����� �ѷȽ��ϴ�.");
			user.reload += 1;
			opposite.oil -= 1;
			battle_txt(user, opposite);
		} // �� ���� ��� ȸ��
			// 26
		else if (e == 3 && com == 2 && opposite.oil == 0) {
			System.out.println("������ �մϴ�.");
			System.out.println("����  �⸧�� ���µ� ȸ�Ǳ⵿�� �õ��մϴ�.");
			user.reload += 1;
			battle_txt(user, opposite);
		} // ������ ��� ȸ�� ����
			// 27
		else if (e == 3 && com == 3) {
			System.out.println("�����մϴ�.");
			System.out.println("���浵 �����մϴ�.");
			user.reload += 1;
			opposite.reload += 1;
			battle_txt(user, opposite);
		} // ������ ��� ����

	}

	public static void battle_choice(Unit opposite) {
		System.out.println("���� �߻���" + opposite.name + "�� �������ϴ�.");
		System.out.println("");
		System.out.println("1 : �⺻ ����                    2 : Ư�� ����");
	}

	public static void battle_end(Unit user) {
		System.out.println("�������� �¸��ϼ̽��ϴ�.");
		System.out.println("����ǰ�� ì��ϴ�.");
		user.tr += 3;
		System.out.println("���� ü��" + user.hp + "����" + user.tr);
	}

	public static void lucky(Unit user) {
		System.out.println("���� �����ñ���");
		System.out.println("������ ���ظ� �����÷Ƚ��ϴ�.");
		System.out.println("���� 1���� ȹ���մϴ�.");
		user.tr += 1;
		System.out.println("�Լ� ���� ä�� : " + user.hp);
	}

	public static void un_lucky(Unit user) {
		System.out.println("���̱�....������ �ƽ��ϴ�.");
		System.out.println("�Ʊ�� �⸧�� �����ϼ̱���");
		user.oil -= 1;
	}

	public static void supply(Unit user) {
		user.oil = 10;// ����
		System.out.println("�����մϴ�.");
		user.hp = user.hp_;
		user.tr--;
		user.oil = user.oil_;
		System.out.println("�� �Լ� : " + user.hp + " �ܿ�����" + user.tr);
	}

	public static void power_up(Unit user, Unit opposite, Unit opposite1) {
		System.out.println("��ȭ�մϴ�.");
		if (user.tr >= 10) {
			user.tr = user.tr - 10;
			user.hp_ += 50;
			user.hp = user.hp_;
			user.atk = user.atk_ + 50;
			user.power = user.power + 1;
			opposite.atk += 10;
			opposite1.atk += 10;
			System.out.println("�����ܷ� " + user.tr + "ü��" + user.hp + " ���ݷ� " + user.atk);
		} else {
			System.out.println("������ �����մϴ�.");
		}

	}

	public static void subattact(Destroyer u, Unit o) {
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

	public static void tutorial(Unit user) {
		System.out.println("������� �ͼ��� ���̱���.");
		System.out.println("���� �������� �����غ���.");

	}

	public static void level_up(Unit user) {
		System.out.println("���� �ܰ���� ������ �Ͻ� �� �ֽ��ϴ�.");
		System.out.println("�������� �����ϼż� �ٽ� �����Ű�ø� �˴ϴ�.");
		System.out.println("�����Ͻø� ������ ��ȸ�� �ְ���?.");
		System.out.println("1. �ϰڽ��ϴ�.       2. �� �� �Ƿ��� �װڽ��ϴ�.");

	}

	public static void air_craft(Unit user) {
		System.out.println("���� �̷� ����� ��Ű�ٴ� ");
		System.out.println("�װ������� �رݵǾ����ϴ�.");

	}

	public static void reset(Unit user) {
		user.hp = user.hp_;
		user.atk = user.atk_;
		user.oil = user.oil_;
		user.reload = 0;
		user.dead = true;

	}

	public static void die(Unit user1, Unit user2) {
		System.out.println("�;��������������������ȱ���.");
		System.out.println("���� ��ȭ�� �帱�״� ���� �Ϻ�.");
		user1.hp = user1.hp_ + 10;
		user1.atk = user1.atk_ + 15;
		user1.oil = user1.oil_;
		user1.dead = true;
		user2.hp = user2.hp_ + 10;
		user2.atk = user2.atk_ + 15;
		user2.oil = user2.oil_;
		user2.dead = true;
	}

}
