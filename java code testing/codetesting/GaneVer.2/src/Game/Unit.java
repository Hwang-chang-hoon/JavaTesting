package Game;

import java.util.Random;
import java.util.Scanner;

public class Unit {

	String name;
	public int hp;//ü��
	public int hp_;//ü�� �ʱ�ȭ
	public int atk;//���ݷ�
	public int oil;//����
	public int reload;//��ź��
	public int power;//��ȭȽ��
	public boolean isPowered;//��ȭ Ƚ�� �Ǵ�
	public boolean dead;//���� �Ǵ�
	
	public Unit (String name, int hp, int hp_, int atk, int oil, int reload ) {
		this.name=name;
		this.hp_=hp_;
		this.hp=hp;
		this.atk=atk;
		this.oil=oil;
		this.reload=reload;
		this.power=0;
		this.dead=false;
	}
	
	
	public boolean isPowered() {
		return power>10 ? false:true; 
	}
	
	public boolean checkDead() {
		if(this.hp<=0)
			dead=true;
		return dead;
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
		} // �� ���� �غ� X��� ȸ��
			// 9
		else if (e == 1 && com == 2 && user.reload == 0 && opposite.oil == 0) {
			System.out.println("���뿡 ��ź �����ϴ�.");
			System.out.println("��뵵 �غ� �ȵȻ��·� ȸ�Ǳ⵿�մϴ�.");
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
		} // ��ȸ�ǰ��� ���ȸ�� �Ұ�
			// 20
		else if (e == 2 && com == 2 && user.oil == 0 && opposite.oil == 0) {
			System.out.println("�⸧�� �����ϴٰ�");
			System.out.println("��뵵 �����մϴ�.");
			System.out.println("������ ����Ƚ��");
			System.out.println("���� : " + user.reload + "��ǻ�Ͳ� : " + opposite.reload);
			System.out.println("������ ȸ�ǰ��� Ƚ��");
			System.out.println("����" + user.oil + "��벨" + opposite.oil);
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
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
			System.out.println("���� user.hp : " + user.hp + "��ǻ�Ͳ� user.hp : " + opposite.hp);
		} // ������ ��� ����

	}

}

