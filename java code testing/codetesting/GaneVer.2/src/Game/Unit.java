package Game;

import java.util.Random;
import java.util.Scanner;

public class Unit  {

	String name;
	public int hp;// ü��
	public int hp_;// ü�� �ʱ�ȭ
	public int atk;// ���ݷ�
	public int atk_;// ���ݷ� �ʱ�ȭ
	public int oil;// ����
	public int oil_;// ���� �ʱ�ȭ
	public int reload;// ��ź��
	public int tr;// ����
	public int power;// ��ȭȽ��
	public int choice;//����
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
		return power >= 1 ? false : true;
	}
	public boolean isChoice() {
		return choice == 1 ? false : true;
	}
	
	public static boolean checkDead(Unit user) {
		if (user.hp <= 0)
			user.dead = false;
		return user.dead;
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
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			user.hp -= (opposite.atk * opposite.reload);
			opposite.hp -= (user.atk * user.reload);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
			user.reload = 0;
			opposite.reload = 0;
		} // ���� ����
			// 2
		else if (e == 1 && com == 1 && user.reload > 0 && opposite.reload == 0) {
			System.out.println("���� AI�� ���� �ΰ��� �پ���� ���մϴ�.");
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			opposite.hp -= (user.atk * user.reload);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
			user.reload = 0;
			opposite.reload = 0;
		} // ���� ����
			// 3
		else if (e == 1 && com == 1 && user.reload == 0 && opposite.reload == 0) {
			System.out.println("������ �غ�����ʾҽ��ϴ�.");
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
			user.reload = 0;
			opposite.reload = 0;
		} // ���� ���� X
			// 4
		else if (e == 1 && com == 1 && user.reload == 0 && opposite.reload > 0) {
			System.out.println("������ �غ�����ʾҽ��ϴ�.");
			System.out.println("�׷��� ������ ������ �غ� ��������̱���.");
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			user.hp -= (opposite.atk * opposite.reload);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
			user.reload = 0;
			opposite.reload = 0;
		} // ��븸 ����
			// 5
		else if (e == 1 && com == 2 && user.reload > 0 && user.reload < 3 && opposite.oil > 0) {
			System.out.println("�����մϴ�.");
			System.out.println("���� ȸ�Ǳ⵿�� ����Ͽ����ϴ�.");
			System.out.println("�ѹߵ� ���� �ʾҽ��ϴ�.");
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			opposite.oil -= 1;
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
			user.reload = 0;
		} // �� ���� ��� ȸ��
			// 6
		else if (e == 1 && com == 2 && user.reload >= 3 && opposite.oil > 0) {
			System.out.println("�����մϴ�.");
			System.out.println("���� ȸ�Ǳ⵿�� ����Ͽ����ϴ�.");
			System.out.println("������ ���� �Ǿ� ź���� ����� �����Ǿ����ϴ�.");
			System.out.println("���ظ� ���� �����ϴ�.");
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			opposite.hp -= (user.atk * (user.reload / 3));
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
			user.reload = 0;
		} // �� ���� ���� ��� ȸ��
			// 7
		else if (e == 1 && com == 2 && user.reload > 0 && user.reload < 3 && opposite.oil == 0) {
			System.out.println("�����մϴ�.");
			System.out.println("���� ��û�ϰԵ� ȸ�Ǹ� �����ϴµ� ȸ�Ǳ⵿�� ����߽��ϴ�.");
			System.out.println("���ظ� �����ϴ�.");
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			opposite.hp -= (user.atk * user.reload);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
			user.reload = 0;
		} // ������ ��� ȸ�ǺҰ�
			// 8
		else if (e == 1 && com == 2 && user.reload == 0 && opposite.oil > 0) {
			System.out.println("���뿡 ��ź�� �����ϴ�.");
			System.out.println("���� �����԰� ȸ�Ǳ⵿�� �����մϴ�.");
			System.out.println("���ظ� �������� ������ �ʾҽ��ϴ�.");
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			opposite.oil -= 1;
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
		} // �� ���� �غ� X��� ȸ��
			// 9
		else if (e == 1 && com == 2 && user.reload == 0 && opposite.oil == 0) {
			System.out.println("���뿡 ��ź �����ϴ�.");
			System.out.println("��뵵 �غ� �ȵȻ��·� ȸ�Ǳ⵿�մϴ�.");
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
		} // ������ �غ� �ȵ� ��� ȸ�� �Ұ�
			// 10
		else if (e == 1 && com == 3 && user.reload > 0) {
			System.out.println("�����մϴ�.");
			System.out.println("���� �������Դϴ�.");
			System.out.println("������Ÿ��~~");
			opposite.reload += 1;
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			opposite.hp -= (user.atk * user.reload);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
			user.reload = 0;
		} // ������ �������
			// 11
		else if (e == 1 && com == 3 && user.reload == 0) {
			System.out.println("���뿡 ��ź�� �����ϴ�.");
			System.out.println("���� ������ �غ��ϴ±���.");
			opposite.reload += 1;
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			System.out.println("���� : " + user.hp + "��ǻ�Ͳ� : " + opposite.hp);
		} // �� �����Ұ� �������
			// 12
		else if (e == 2 && com == 1 && user.oil > 0 && opposite.reload > 0 && opposite.reload < 3) {
			System.out.println("ȸ�Ǳ⵿�� �մϴ�.");
			System.out.println("���� �����߽��ϴ�.");
			System.out.println("����� ź�� �Һ��մϴ�.");
			System.out.println("���� ����.");
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			user.oil -= 1;
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
			opposite.reload = 0;
		} // �� ȸ�� ��� ����
			// 13
		else if (e == 2 && com == 1 && user.oil > 0 && opposite.reload >= 3) {
			System.out.println("ȸ�Ǳ⵿�� �մϴ�.");
			System.out.println("���⿡�� ������ ȸ���� �� ���� ź���� ����ɴϴ�.");
			System.out.println("�ε� ���ذ� ����ϱ⸸�� �⵵�մϴ�.");
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			user.oil -= 1;
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			user.hp -= (opposite.atk * (opposite.reload / 3));
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
			opposite.reload = 0;
		} // �� ȸ�� ��� 3����� ����
			// 14
		else if (e == 2 && com == 1 && user.oil > 0 && opposite.reload == 0) {
			System.out.println("ȸ�Ǳ⵿�� �����մϴ�.");
			System.out.println("��뵵 ������ �Ϸ��մϴ�.");
			System.out.println("�׷��� ź�� �߻���� �ʾҽ��ϴ�.");
			System.out.println("���� �ΰ��� �����մϴ�(Ǫ��)");
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			user.oil -= 1;
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
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
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			user.hp -= (opposite.atk * opposite.reload);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
			opposite.reload = 0;
		} // �� ȸ�� �Ұ� ��� ���� ����
			// 16
		else if (e == 2 && com == 1 && user.oil == 0 && opposite.reload == 0) {
			System.out.println("�Ѵ� �ٺ��Դϴ�.");
			System.out.println("���� �ڽ��� �������� Ȯ���ϼ���.");
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
			opposite.reload = 0;
		} // �� ȸ�� �Ұ� ��� ���� ����
			// 17
		else if (e == 2 && com == 2 && user.oil > 0 && opposite.oil > 0) {
			System.out.println("ȸ�Ǳ⵿�� �մϴ�.");
			System.out.println("��뵵 ȸ�Ǳ⵿�� �մϴ�.");
			System.out.println("�Ʊ�� �⸧�� ���ȱ���.");
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
		} // �� ȸ�� ��� ȸ��
			// 18
		else if (e == 2 && com == 2 && user.oil == 0 && opposite.oil > 0) {
			System.out.println("�⸧�����ϴ�.");
			System.out.println("���浵 ����� �⸧�� �����ϴ±���.");
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			opposite.oil -= 1;
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
		} // �� ȸ�� �Ұ� ��� ȸ�� ����
			// 19
		else if (e == 2 && com == 2 && user.oil > 0 && opposite.oil == 0) {
			System.out.println("ȸ�� �⵿�� �ǽ��մϴ�.");
			System.out.println("���� �⸧�� �ٶ��������ϴ�.");
			System.out.println("�⸧�� �����ϼ̱���?");
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			user.oil -= 1;
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
		} // ��ȸ�ǰ��� ���ȸ�� �Ұ�
			// 20
		else if (e == 2 && com == 2 && user.oil == 0 && opposite.oil == 0) {
			System.out.println("�⸧�� �����ϴٰ�");
			System.out.println("��뵵 �����մϴ�.");
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
		} // ��ȸ�ǺҰ� ��� ȸ�ǺҰ�
			// 21
		else if (e == 2 && com == 3 && user.oil > 0) {
			System.out.println("ȸ�Ǳ⵿�� �õ��մϴ�.");
			System.out.println("���� �����մϴ�.");
			opposite.reload += 1;
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
		} // �� ȸ�� ��� ����
			// 22
		else if (e == 2 && com == 3 && user.oil == 0) {
			System.out.println("ȸ�Ǳ⵿�� �⸧�� ��� �����߽��ϴ�.");
			System.out.println("���� �����Ͽ� ������ ���ݷ��� �����մϴ�.");
			opposite.reload += 1;
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
		} // �� ȸ�ǺҰ� ��� ����
			// 23
		else if (e == 3 && com == 1 && opposite.reload > 0) {
			System.out.println("���� �մϴ�.");
			System.out.println("���� �����մϴ�.");
			System.out.println("�� �� ��������");
			user.reload += 1;
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			user.hp -= (opposite.atk * user.reload);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
			opposite.reload = 0;
		} // �� ���� ��� �߽�
			// 24
		else if (e == 3 && com == 1 && opposite.reload == 0) {
			System.out.println("������ �մϴ�.");
			System.out.println("���� ������ �߿伺�� �𸣴� ����Դϴ�.");
			user.reload += 1;
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
		} // �� ���� ��� ��������
			// 25
		else if (e == 3 && com == 2 && opposite.oil > 0) {
			System.out.println("������ �մϴ�. ");
			System.out.println("���� ȸ�Ǳ⵿�� �մϴ�.");
			System.out.println("���� �⸧�� ����� �ѷȽ��ϴ�.");
			user.reload += 1;
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			opposite.oil -= 1;
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
		} // �� ���� ��� ȸ��
			// 26
		else if (e == 3 && com == 2 && opposite.oil == 0) {
			System.out.println("������ �մϴ�.");
			System.out.println("����  �⸧�� ���µ� ȸ�Ǳ⵿�� �õ��մϴ�.");
			user.reload += 1;
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
		} // ������ ��� ȸ�� ����
			// 27
		else if (e == 3 && com == 3) {
			System.out.println("�����մϴ�.");
			System.out.println("���浵 �����մϴ�.");
			user.reload += 1;
			opposite.reload += 1;
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			System.out.println("���� hp : " + user.hp + "��ǻ�Ͳ� hp : " + opposite.hp);
		} // ������ ��� ����

	}

	public static void battle_choice(Unit user, Unit opposite) {
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
			user.power = user.power+1;
			opposite.atk += 10;
			opposite1.atk += 10;
			System.out.println("�����ܷ� " + user.tr + "ü��" +user.hp + " ���ݷ� " + user.atk);
		} else {
			System.out.println("������ �����մϴ�.");
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

	public static void die(Unit user) {
		System.out.println("�;��������������������ȱ���.");
		System.out.println("���� ��ȭ�� �帱�״� ���� �Ϻ�.");
		user.hp = user.hp_ + 10;
		user.atk = user.atk_ + 15;
		user.oil = user.oil_;
		user.dead = true;
	}

	

}
