package Game;

import java.util.*;

public class Playing {
	public static void main(String[] args) {
		int a;// ù��° if��
		int b;// �ι�° if��
		int c;// ����° if��
		int d;// ���ݹ��
		int att;// ����
		int reload = 0;// ����
		int comreload = 0;// ��ǻ�� ����
		int hp = 500;// ü��
		int Ehp = 500;// �� ü��
		int tr = 3;// ����
		int oil = 10;// ����
		int Eoil = 10;// �� ����
		int str = 50;// ���ݷ�
		int Estr = 50;
		int power = 0;// ��ȭȽ��
		int airSuc = 0;// �װ����� ����
		int plain = 2;// ������ ����
		int sup = 5;// ���
		int Yhp = 10000;
		int Ystr = 5000;
		int tuto = 0;
		int tutoEnd = 0;
		int reject1 = 0;// ����
		int reject2 = 0;// ����
		while (hp >= 0) {
			System.out.println("���� ��ŸƮ");
			System.out.println("1:���� 2 ����");
			Scanner num = new Scanner(System.in);
			a = num.nextInt();
			// ����

			if (a == 1) {
				System.out.println("�����մϴ�.");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("�ռ��� �������ּ���");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("1:������ 2:������ ");
				Scanner num1 = new Scanner(System.in);
				b = num1.nextInt();
				// ���� ���缱��

				if (b == 1) {
					System.out.println("�������� ��å�ϼ̽��ϴ�.");
					while (hp > 0) {
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("������ �Ͻðڽ��ϱ�?");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("1:��� 2:���� 3:��ȭ");
						Scanner num11 = new Scanner(System.in);
						c = num11.nextInt();

						// �������

						if (c == 1) {

							System.out.println("����մϴ�.");
							Random random = new Random();
							int data = random.nextInt(3) + 1;

							if (data == 1) {
								Ehp = 500;// �� ü��
								Eoil = 10;// �� ����
								comreload = 0;
								try {
									Thread.sleep(500);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("���� �����Ͽ����ϴ�.");
								try {
									Thread.sleep(500);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("���� �غ�");
								try {
									Thread.sleep(500);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("������ �����մϴ�.");
								System.out.println("������ ������ ȸ�Ƿ� ���ظ� �����մϴ�.");
								System.out.println("ȸ�Ǵ� " + oil + "�� �����մϴ�");
								System.out.println("������ �� �Ĵ� ������ �ؾ��մϴ�.");
								System.out.println("������ �����ϸ� �����Ҽ��� ������� Ů�ϴ�.");

								do {
									try {
										Thread.sleep(500);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println("1:�⺻���� 2:Ư������");
									Scanner num111 = new Scanner(System.in);
									d = num111.nextInt();
									if (d == 1) {
										System.out.println("������ �����մϴ�.");
										System.out.println("���ָ� �����ֽʽÿ�");
										System.out.println("1.���� 2.ȸ�� 3.���� ");
										Scanner num1111 = new Scanner(System.in);
										int e = num1111.nextInt();
										Random random1 = new Random();
										int com = random1.nextInt(3) + 1;
										// 1
										if (e == 1 && com == 1 && reload > 0 && comreload > 0) {
											System.out.println("���ΰ� ���ο��� ������ �մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (Estr * comreload);
											Ehp -= (str * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											reload = 0;
											comreload = 0;
										} // ���� ����
											// 2
										else if (e == 1 && com == 1 && reload > 0 && comreload == 0) {
											System.out.println("���� AI�� ���� �ΰ��� �پ���� ���մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											Ehp -= (str * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											reload = 0;
											comreload = 0;
										} // ���� ����
											// 3
										else if (e == 1 && com == 1 && reload == 0 && comreload == 0) {
											System.out.println("������ �غ�����ʾҽ��ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											reload = 0;
											comreload = 0; 
										} // ���� ���� X
											// 4
										else if (e == 1 && com == 1 && reload == 0 && comreload > 0) {
											System.out.println("������ �غ�����ʾҽ��ϴ�.");
											System.out.println("�׷��� ������ ������ �غ� ��������̱���.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (Estr * comreload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											reload = 0;
											comreload = 0;
										} // ��븸 ����
											// 5
										else if (e == 1 && com == 2 && reload > 0 && reload < 3 && Eoil > 0) {
											System.out.println("�����մϴ�.");
											System.out.println("���� ȸ�Ǳ⵿�� ����Ͽ����ϴ�.");
											System.out.println("�ѹߵ� ���� �ʾҽ��ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											Eoil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											reload = 0;
										} // �� ���� ��� ȸ��
											// 6
										else if (e == 1 && com == 2 && reload >= 3 && Eoil > 0) {
											System.out.println("�����մϴ�.");
											System.out.println("���� ȸ�Ǳ⵿�� ����Ͽ����ϴ�.");
											System.out.println("������ ���� �Ǿ� ź���� ����� �����Ǿ����ϴ�.");
											System.out.println("���ظ� ���� �����ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											Ehp -= (str * (reload / 3));
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											reload = 0;
										} // �� ���� ���� ��� ȸ��
											// 7
										else if (e == 1 && com == 2 && reload > 0 && reload < 3 && Eoil == 0) {
											System.out.println("�����մϴ�.");
											System.out.println("���� ��û�ϰԵ� ȸ�Ǹ� �����ϴµ� ȸ�Ǳ⵿�� ����߽��ϴ�.");
											System.out.println("���ظ� �����ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											Ehp -= (str * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											reload = 0;
										} // ������ ��� ȸ�ǺҰ�
											// 8
										else if (e == 1 && com == 2 && reload == 0 && Eoil > 0) {
											System.out.println("���뿡 ��ź�� �����ϴ�.");
											System.out.println("���� �����԰� ȸ�Ǳ⵿�� �����մϴ�.");
											System.out.println("���ظ� �������� ������ �ʾҽ��ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											Eoil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // �� ���� �غ� X��� ȸ��
											// 9
										else if (e == 1 && com == 2 && reload == 0 && Eoil == 0) {
											System.out.println("���뿡 ��ź �����ϴ�.");
											System.out.println("��뵵 �غ� �ȵȻ��·� ȸ�Ǳ⵿�մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // ������ �غ� �ȵ� ��� ȸ�� �Ұ�
											// 10
										else if (e == 1 && com == 3 && reload > 0) {
											System.out.println("�����մϴ�.");
											System.out.println("���� �������Դϴ�.");
											System.out.println("������Ÿ��~~");
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											Ehp -= (str * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											reload = 0;
										} // ������ �������
											// 11
										else if (e == 1 && com == 3 && reload == 0) {
											System.out.println("���뿡 ��ź�� �����ϴ�.");
											System.out.println("���� ������ �غ��ϴ±���.");
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� : " + hp + "��ǻ�Ͳ� : " + Ehp);
										} // �� �����Ұ� �������
											// 12
										else if (e == 2 && com == 1 && oil > 0 && comreload > 0 && comreload < 3) {
											System.out.println("ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("���� �����߽��ϴ�.");
											System.out.println("����� ź�� �Һ��մϴ�.");
											System.out.println("���� ����.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											oil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											comreload = 0;
										} // �� ȸ�� ��� ����
											// 13
										else if (e == 2 && com == 1 && oil > 0 && comreload >= 3) {
											System.out.println("ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("���⿡�� ������ ȸ���� �� ���� ź���� ����ɴϴ�.");
											System.out.println("�ε� ���ذ� ����ϱ⸸�� �⵵�մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											oil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (Estr * (comreload / 3));
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											comreload = 0;
										} // �� ȸ�� ��� 3����� ����
											// 14
										else if (e == 2 && com == 1 && oil > 0 && comreload == 0) {
											System.out.println("ȸ�Ǳ⵿�� �����մϴ�.");
											System.out.println("��뵵 ������ �Ϸ��մϴ�.");
											System.out.println("�׷��� ź�� �߻���� �ʾҽ��ϴ�.");
											System.out.println("���� �ΰ��� �����մϴ�(Ǫ��)");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											oil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											comreload = 0;
										} // �� ȸ�� ��� ���� ����
											// 15
										else if (e == 2 && com == 2 && oil == 0 && comreload > 0) {
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
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (Estr * comreload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											comreload = 0;
										} // �� ȸ�� �Ұ� ��� ���� ����
											// 16
										else if (e == 2 && com == 1 && oil == 0 && comreload == 0) {
											System.out.println("�Ѵ� �ٺ��Դϴ�.");
											System.out.println("���� �ڽ��� �������� Ȯ���ϼ���.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											comreload = 0;
										} // �� ȸ�� �Ұ� ��� ���� ����
											// 17
										else if (e == 2 && com == 2 && oil > 0 && Eoil > 0) {
											System.out.println("ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("��뵵 ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("�Ʊ�� �⸧�� ���ȱ���.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // �� ȸ�� ��� ȸ��
											// 18
										else if (e == 2 && com == 2 && oil == 0 && Eoil > 0) {
											System.out.println("�⸧�����ϴ�.");
											System.out.println("���浵 ����� �⸧�� �����ϴ±���.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											Eoil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // �� ȸ�� �Ұ� ��� ȸ�� ����
											// 19
										else if (e == 2 && com == 2 && oil > 0 && Eoil == 0) {
											System.out.println("ȸ�� �⵿�� �ǽ��մϴ�.");
											System.out.println("���� �⸧�� �ٶ��������ϴ�.");
											System.out.println("�⸧�� �����ϼ̱���?");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											oil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // ��ȸ�ǰ��� ���ȸ�� �Ұ�
											// 20
										else if (e == 2 && com == 2 && oil == 0 && Eoil == 0) {
											System.out.println("�⸧�� �����ϴٰ�");
											System.out.println("��뵵 �����մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // ��ȸ�ǺҰ� ��� ȸ�ǺҰ�
											// 21
										else if (e == 2 && com == 3 && oil > 0) {
											System.out.println("ȸ�Ǳ⵿�� �õ��մϴ�.");
											System.out.println("���� �����մϴ�.");
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // �� ȸ�� ��� ����
											// 22
										else if (e == 2 && com == 3 && oil == 0) {
											System.out.println("ȸ�Ǳ⵿�� �⸧�� ��� �����߽��ϴ�.");
											System.out.println("���� �����Ͽ� ������ ���ݷ��� �����մϴ�.");
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // �� ȸ�ǺҰ� ��� ����
											// 23
										else if (e == 3 && com == 1 && comreload > 0) {
											System.out.println("���� �մϴ�.");
											System.out.println("���� �����մϴ�.");
											System.out.println("�� �� ��������");
											reload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (Estr * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											comreload = 0;
										} // �� ���� ��� �߽�
											// 24
										else if (e == 3 && com == 1 && comreload == 0) {
											System.out.println("������ �մϴ�.");
											System.out.println("���� ������ �߿伺�� �𸣴� ����Դϴ�.");
											reload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // �� ���� ��� ��������
											// 25
										else if (e == 3 && com == 2 && Eoil > 0) {
											System.out.println("������ �մϴ�. ");
											System.out.println("���� ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("���� �⸧�� ����� �ѷȽ��ϴ�.");
											reload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											Eoil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // �� ���� ��� ȸ��
											// 26
										else if (e == 3 && com == 2 && Eoil == 0) {
											System.out.println("������ �մϴ�.");
											System.out.println("����  �⸧�� ���µ� ȸ�Ǳ⵿�� �õ��մϴ�.");
											reload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // ������ ��� ȸ�� ����
											// 27
										else if (e == 3 && com == 3) {
											System.out.println("�����մϴ�.");
											System.out.println("���浵 �����մϴ�.");
											reload += 1;
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // ������ ��� ����

									} else if (d == 2) {
										if (sup > 0) {
											sup--;
											System.out.println("��ڸ� �߻��մϴ�. ");
											try {
												Thread.sleep(500);
											} catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											System.out.println("����ܷ�" + sup);
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
												Ehp = Ehp - 450;
												if (Ehp < 0) {
													Ehp = 0;
												}
												System.out.println("�� �Լ� : " + Ehp);
											} else if (data1 == 2) {
												System.out.println("��ڰ� ��~ ���� ���� ���� ��Ĩ�ϴ�.");
												System.out.println("������� �Ծ�帱����");
												Ehp = Ehp - 100;
												if (Ehp < 0) {
													Ehp = 0;
												}
												System.out.println("�� �Լ� : " + Ehp);
											} else if (data1 == 3) {
												System.out.println("���� ������ �������� ��ڸ� ���ذ��ϴ�.");
												System.out.println("�� 1�� ���ص� ������ ���Ͽ����ϴ�.");
											} else if (data1 == 4) {
												System.out.println("�ط��� ���ؼ� ��ڰ� ��� �߸��� �������� �����ϴ�.");
												System.out.println("�� �ռ��� ����� ���ؽǷ¿� ������� �����ϴ�.");
											}

										} else if (sup <= 0) {
											System.out.println("����� �ܷ��� �����ϴ�.");
										}

									}

								} while (hp > 0 && Ehp > 0);// ���� ������

								if (Ehp == 0 && hp > 0) {
									tuto += 1;
									tr = tr + 3;
									System.out.println("�������� �¸��ϼ̽��ϴ�.");
									System.out.println("�������� : " + hp + " ���� : " + tr);
								}
							}

							else if (data == 2) {
								System.out.println("�����̴�!!!!");
								tr++;
								System.out.println("�� ������ : " + hp + " ����" + tr);
							}

							else if (data == 3) {
								System.out.println("�����̴�~~~~");

							}
							tuto++;
						}

						else if (c == 2) {
							tuto++;
							oil = 10;// ����
							System.out.println("�����մϴ�.");
							hp = 500;
							sup = sup + 2;
							tr--;
							System.out.println("��������ü�� : " + hp + " �ܿ�����" + tr + "��� �ܷ�" + sup);
						}

						else if (c == 3) {
							tuto++;
							System.out.println("��ȭ�մϴ�.");
							if (tr >= 10) {
								tr = tr - 10;
								str = str + 50;
								Estr += 10;
								System.out.println("�����ܷ� " + tr + " ���ݷ� " + str);
							} else if (tr < 10) {
								System.out.println("������ �����մϴ�.");
							}

						}
						if (tuto > 3 && tutoEnd == 0) {
							System.out.println("������� �Դ��뿡 �ɼ������̱���.");
							System.out.println("�����ϼ̽��ϴ�.");
							tuto++;
							break;
						}

					}
					// ������ �帧
				}

				else if (b == 2) {
					str = str + 50;
					hp = hp + 500;
					int sub = 15;// ������ ���
					int PlainCount = 0;// �����⸦ ���� Ƚ��
					System.out.println("�������� �����ϼ̽��ϴ�.");
					while (hp > 0) {
						// dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd
						Ehp = 500;// �� ü��
						Eoil = 10;// �� ����
						comreload = 0;
						System.out.println("������ �Ͻðڽ��ϱ�?");
						System.out.println("1:��� 2:���� 3:��ȭ");
						Scanner num11 = new Scanner(System.in);
						c = num11.nextInt();

						// ������ ����
						if (c == 1) {
							
							Ehp = +500;// �� ü��
							System.out.println("����մϴ�.");
							Random random = new Random();
							int data = random.nextInt(3) + 1;

							if (data == 1) {
								try {
									Thread.sleep(500);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("���� �����Ͽ����ϴ�.");
								try {
									Thread.sleep(500);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("���� �غ�");
								try {
									Thread.sleep(500);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("������ �����մϴ�.");
								System.out.println("������ ������ ȸ�Ƿ� ���ظ� �����մϴ�.");
								System.out.println("ȸ�Ǵ� " + oil + "�� �����մϴ�");
								System.out.println("������ �� �Ĵ� ������ �ؾ��մϴ�.");
								System.out.println("������ �����ϸ� �����Ҽ��� ������� Ů�ϴ�.");
								System.out.println("������ �����մϴ�.");
								do {
									try {
										Thread.sleep(500);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println("1:�⺻���� 2:Ư������");
									Scanner num111 = new Scanner(System.in);
									d = num111.nextInt();
									if (d == 1) {
										System.out.println("������ �����մϴ�.");
										System.out.println("���ָ� �����ֽʽÿ�");
										System.out.println("1.���� 2.ȸ�� 3.���� ");
										Scanner num1111 = new Scanner(System.in);
										int e = num1111.nextInt();
										Random random1 = new Random();
										int com = random1.nextInt(3) + 1;
										// 1
										if (e == 1 && com == 1 && reload > 0 && comreload > 0) {
											System.out.println("���ΰ� ���ο��� ������ �մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (Estr * comreload);
											Ehp -= (str * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											reload = 0;
											comreload = 0;
										} // ���� ����
											// 2
										else if (e == 1 && com == 1 && reload > 0 && comreload == 0) {
											System.out.println("���� AI�� ���� �ΰ��� �پ���� ���մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											Ehp -= (str * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											reload = 0;
											comreload = 0;
										} // ���� ����
											// 3
										else if (e == 1 && com == 1 && reload == 0 && comreload == 0) {
											System.out.println("������ �غ�����ʾҽ��ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											reload = 0;
											comreload = 0;
										} // ���� ���� X
											// 4
										else if (e == 1 && com == 1 && reload == 0 && comreload > 0) {
											System.out.println("������ �غ�����ʾҽ��ϴ�.");
											System.out.println("�׷��� ������ ������ �غ� ��������̱���.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (Estr * comreload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											reload = 0;
											comreload = 0;
										} // ��븸 ����
											// 5
										else if (e == 1 && com == 2 && reload > 0 && reload < 3 && Eoil > 0) {
											System.out.println("�����մϴ�.");
											System.out.println("���� ȸ�Ǳ⵿�� ����Ͽ����ϴ�.");
											System.out.println("�ѹߵ� ���� �ʾҽ��ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											Eoil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											reload = 0;
										} // �� ���� ��� ȸ��
											// 6
										else if (e == 1 && com == 2 && reload >= 3 && Eoil > 0) {
											System.out.println("�����մϴ�.");
											System.out.println("���� ȸ�Ǳ⵿�� ����Ͽ����ϴ�.");
											System.out.println("������ ���� �Ǿ� ź���� ����� �����Ǿ����ϴ�.");
											System.out.println("���ظ� ���� �����ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											Ehp -= (str * (reload / 3));
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											reload = 0;
										} // �� ���� ���� ��� ȸ��
											// 7
										else if (e == 1 && com == 2 && reload > 0 && reload < 3 && Eoil == 0) {
											System.out.println("�����մϴ�.");
											System.out.println("���� ��û�ϰԵ� ȸ�Ǹ� �����ϴµ� ȸ�Ǳ⵿�� ����߽��ϴ�.");
											System.out.println("���ظ� �����ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											Ehp -= (str * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											reload = 0;
										} // ������ ��� ȸ�ǺҰ�
											// 8
										else if (e == 1 && com == 2 && reload == 0 && Eoil > 0) {
											System.out.println("���뿡 ��ź�� �����ϴ�.");
											System.out.println("���� �����԰� ȸ�Ǳ⵿�� �����մϴ�.");
											System.out.println("���ظ� �������� ������ �ʾҽ��ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											Eoil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // �� ���� �غ� X��� ȸ��
											// 9
										else if (e == 1 && com == 2 && reload == 0 && Eoil == 0) {
											System.out.println("���뿡 ��ź �����ϴ�.");
											System.out.println("��뵵 �غ� �ȵȻ��·� ȸ�Ǳ⵿�մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // ������ �غ� �ȵ� ��� ȸ�� �Ұ�
											// 10
										else if (e == 1 && com == 3 && reload > 0) {
											System.out.println("�����մϴ�.");
											System.out.println("���� �������Դϴ�.");
											System.out.println("������Ÿ��~~");
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											Ehp -= (str * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											reload = 0;
										} // ������ �������
											// 11
										else if (e == 1 && com == 3 && reload == 0) {
											System.out.println("���뿡 ��ź�� �����ϴ�.");
											System.out.println("���� ������ �غ��ϴ±���.");
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� : " + hp + "��ǻ�Ͳ� : " + Ehp);
										} // �� �����Ұ� �������
											// 12
										else if (e == 2 && com == 1 && oil > 0 && comreload > 0 && comreload < 3) {
											System.out.println("ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("���� �����߽��ϴ�.");
											System.out.println("����� ź�� �Һ��մϴ�.");
											System.out.println("���� ����.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											oil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // �� ȸ�� ��� ����
											// 13
										else if (e == 2 && com == 1 && oil > 0 && comreload >= 3) {
											System.out.println("ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("���⿡�� ������ ȸ���� �� ���� ź���� ����ɴϴ�.");
											System.out.println("�ε� ���ذ� ����ϱ⸸�� �⵵�մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											oil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (Estr * (comreload / 3));
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											comreload = 0;
										} // �� ȸ�� ��� 3����� ����
											// 14
										else if (e == 2 && com == 1 && oil > 0 && comreload == 0) {
											System.out.println("ȸ�Ǳ⵿�� �����մϴ�.");
											System.out.println("��뵵 ������ �Ϸ��մϴ�.");
											System.out.println("�׷��� ź�� �߻���� �ʾҽ��ϴ�.");
											System.out.println("���� �ΰ��� �����մϴ�(Ǫ��)");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											oil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											comreload = 0;
										} // �� ȸ�� ��� ���� ����
											// 15
										else if (e == 2 && com == 2 && oil == 0 && comreload > 0) {
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
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (Estr * comreload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											comreload = 0;
										} // �� ȸ�� �Ұ� ��� ���� ����
											// 16
										else if (e == 2 && com == 1 && oil == 0 && comreload == 0) {
											System.out.println("�Ѵ� �ٺ��Դϴ�.");
											System.out.println("���� �ڽ��� �������� Ȯ���ϼ���.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											comreload = 0;
										} // �� ȸ�� �Ұ� ��� ���� ����
											// 17
										else if (e == 2 && com == 2 && oil > 0 && Eoil > 0) {
											System.out.println("ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("��뵵 ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("�Ʊ�� �⸧�� ���ȱ���.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // �� ȸ�� ��� ȸ��
											// 18
										else if (e == 2 && com == 2 && oil == 0 && Eoil > 0) {
											System.out.println("�⸧�����ϴ�.");
											System.out.println("���浵 ����� �⸧�� �����ϴ±���.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											Eoil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // �� ȸ�� �Ұ� ��� ȸ�� ����
											// 19
										else if (e == 2 && com == 2 && oil > 0 && Eoil == 0) {
											System.out.println("ȸ�� �⵿�� �ǽ��մϴ�.");
											System.out.println("���� �⸧�� �ٶ��������ϴ�.");
											System.out.println("�⸧�� �����ϼ̱���?");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											oil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // ��ȸ�ǰ��� ���ȸ�� �Ұ�
											// 20
										else if (e == 2 && com == 2 && oil == 0 && Eoil == 0) {
											System.out.println("�⸧�� �����ϴٰ�");
											System.out.println("��뵵 �����մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // ��ȸ�ǺҰ� ��� ȸ�ǺҰ�
											// 21
										else if (e == 2 && com == 3 && oil > 0) {
											System.out.println("ȸ�Ǳ⵿�� �õ��մϴ�.");
											System.out.println("���� �����մϴ�.");
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // �� ȸ�� ��� ����
											// 22
										else if (e == 2 && com == 3 && oil == 0) {
											System.out.println("ȸ�Ǳ⵿�� �⸧�� ��� �����߽��ϴ�.");
											System.out.println("���� �����Ͽ� ������ ���ݷ��� �����մϴ�.");
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // �� ȸ�ǺҰ� ��� ����
											// 23
										else if (e == 3 && com == 1 && comreload > 0) {
											System.out.println("���� �մϴ�.");
											System.out.println("���� �����մϴ�.");
											System.out.println("�� �� ��������");
											reload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (Estr * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
											comreload = 0;
										} // �� ���� ��� �߽�
											// 24
										else if (e == 3 && com == 1 && comreload == 0) {
											System.out.println("������ �մϴ�.");
											System.out.println("���� ������ �߿伺�� �𸣴� ����Դϴ�.");
											reload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // �� ���� ��� ��������
											// 25
										else if (e == 3 && com == 2 && Eoil > 0) {
											System.out.println("������ �մϴ�. ");
											System.out.println("���� ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("���� �⸧�� ����� �ѷȽ��ϴ�.");
											reload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											Eoil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // �� ���� ��� ȸ��
											// 26
										else if (e == 3 && com == 2 && Eoil == 0) {
											System.out.println("������ �մϴ�.");
											System.out.println("����  �⸧�� ���µ� ȸ�Ǳ⵿�� �õ��մϴ�.");
											reload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // ������ ��� ȸ�� ����
											// 27
										else if (e == 3 && com == 3) {
											System.out.println("�����մϴ�.");
											System.out.println("���浵 �����մϴ�.");
											reload += 1;
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + Ehp);
										} // ������ ��� ����

									} else if (d == 2) {
										if (plain > 0 && sub > 0) {
											plain--;
											System.out.println("������ ����!!!!! ");
											try {
												Thread.sleep(500);
											} catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											System.out.println("�ܿ� ������" + plain);
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
												Ehp = Ehp - 450;
												if (Ehp < 0) {
													Ehp = 0;
												}
												System.out.println("�� �Լ� : " + Ehp);
												PlainCount++;

											} else if (data11 == 2) {
												System.out.println("��ڰ� ��~ ���� ���� ���� ��Ĩ�ϴ�.");
												System.out.println("������� �Ծ�帱����");
												Ehp = Ehp - 100;
												if (Ehp < 0) {
													Ehp = 0;
												}
												System.out.println("�� �Լ� : " + Ehp);
												PlainCount++;

											} else if (data11 == 3) {
												System.out.println("���� ������ �������� ��ڸ� ���ذ��ϴ�.");
												System.out.println("�� 1�� ���ص� ������ ���Ͽ����ϴ�.");

											} else if (data11 == 4) {
												System.out.println("�ط��� ���ؼ� ��ڰ� ��� �߸��� �������� �����ϴ�.");
												System.out.println("�� �ռ��� ����� ���ؽǷ¿� ������� �����ϴ�.");

											}

										} else if (plain <= 0) {
											System.out.println("ž�� ������ ���� �����մϴ�.");
										} else if (sub <= 0) {
											System.out.println("����������� �ٴڳ����ϴ�.");
										}

									}

								} while (hp > 0 && Ehp > 0);// ���� ������
								if (Ehp <= 0 && hp > 0) {
									tr = tr + 3;
									System.out.println("�������� �¸��ϼ̽��ϴ�.");
									System.out.println("�������� : " + hp + "���� : " + tr);
								}

							}

							else if (data == 2) {
								System.out.println("�����̴�!!!!");
								tr++;
								System.out.println("�� ������ : " + hp + "����" + tr);
							}

							else if (data == 3) {
								System.out.println("�����̴�~~~~");

							}
						}

						else if (c == 2) {
							System.out.println("�����մϴ�.");
							hp = 1000;
							tr--;
							System.out.println("�������� : " + hp + " ���� " + tr);
						}

						else if (c == 3) {
							System.out.println("��ȭ�մϴ�.");
							if (tr >= 10) {
								tr = tr - 10;
								str = str + 50;
								plain+=2;
								System.out.println("�����ܷ� " + tr + " ���ݷ� " + str);
								power++;// ��ȭ Ƚ�� ����

								}
							if (power == 1 && reject1 == 0) {
								System.out.println("��ȭ Ƚ���� 5���̻��Դϴ�.");
								System.out.println("������� ����� �������� �����ǽʴϴ�.");
								System.out.println("������ ������ �ǽðڽ��ϱ�?");
								System.out.println("1.��                2.�ƴϿ�");
								Scanner num111 = new Scanner(System.in);
								int e = num111.nextInt();
								if (e == 1) {
									break;
								} else if (e == 2) {
									System.out.println("�̷� ��ȸ�� �ٽô� �������Դϴ�.");
									reject1++;
								}

							} else if (tr < 10) {
								System.out.println("������ �����մϴ�.");
							}

						}
						if (PlainCount >= 1 && reject2 == 0) {
							System.out.println("����� ���� Ƚ���� 5���̻��Դϴ�.");
							System.out.println("������� ����� �װ��������� �����ǽʴϴ�.");
							System.out.println("�װ������� ������ �ǽðڽ��ϱ�?");
							System.out.println("1.��                2.�ƴϿ�");
							Scanner num111 = new Scanner(System.in);
							int e = num111.nextInt();
							if (e == 1) {
								airSuc++;
								break;
							} else if (e == 2) {
								System.out.println("�̷� ��ȸ�� �ٽô� �������Դϴ�.");
								reject2++;
							}

						}
					}
					hp = hp + 1500;
					int battle = 0;// ���� Ƚ��
					while (power == 1 && hp > 0) {
						// int battle = 0;// ���� Ƚ��
						int evadeNum = 3;// ȸ�� ����
						System.out.println("������ ����մϴ�.");
						System.out.println("1.���       2.���� �� ��ȭ");
						Scanner num111 = new Scanner(System.in);
						int e = num111.nextInt();
						if (e == 1) {
							int esey = 1;
							int eseyHp = 300;
							int eseystr = 25;
							int nomal = 2;
							int nomalHp = 500;
							int nomalstr = 50;
							int hard = 3;
							int hardHp = 1000;
							int hardstr = 100;
							comreload = 0;
							System.out.println("����մϴ�.");

							battle++;
							System.out.println("���� �����Ͽ����ϴ�.");

							System.out.println("������ �����մϴ�.");
							System.out.println("������ ������ ȸ�Ƿ� ���ظ� �����մϴ�.");
							System.out.println("ȸ�Ǵ� " + oil + "�� �����մϴ�");
							System.out.println("������ �� �Ĵ� ������ �ؾ��մϴ�.");
							System.out.println("������ �����ϸ� �����Ҽ��� ������� Ů�ϴ�.");
							System.out.println("������ �����մϴ�.");
							Random random2 = new Random();
							int enmy = random2.nextInt(3) + 1;
							if (enmy == 1) {
								do {
									// esey
									System.out.println("�߻��� �������� ��Ÿ�����ϴ�.");
									System.out.println("1:�⺻���� ");
									Scanner num1111 = new Scanner(System.in);
									d = num1111.nextInt();
									if (d == 1) {
										System.out.println("������ �����մϴ�.");
										System.out.println("���ָ� �����ֽʽÿ�");
										System.out.println("1.���� 2.ȸ�� 3.���� ");
										Scanner num11 = new Scanner(System.in);
										e = num11.nextInt();
										Random random1 = new Random();
										int com = random1.nextInt(3) + 1;
										// 1
										if (e == 1 && com == 1 && reload > 0 && comreload > 0) {
											System.out.println("���ΰ� ���ο��� ������ �մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (eseystr * comreload);
											eseyHp -= (str * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
											reload = 0;
											comreload = 0;
										} // ���� ����
											// 2
										else if (e == 1 && com == 1 && reload > 0 && comreload == 0) {
											System.out.println("���� AI�� ���� �ΰ��� �پ���� ���մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											eseyHp -= (str * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
											reload = 0;
											comreload = 0;
										} // ���� ����
											// 3
										else if (e == 1 && com == 1 && reload == 0 && comreload == 0) {
											System.out.println("������ �غ�����ʾҽ��ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
											reload = 0;
											comreload = 0;
										} // ���� ���� X
											// 4
										else if (e == 1 && com == 1 && reload == 0 && comreload > 0) {
											System.out.println("������ �غ�����ʾҽ��ϴ�.");
											System.out.println("�׷��� ������ ������ �غ� ��������̱���.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (eseystr * comreload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
											reload = 0;
											comreload = 0;
										} // ��븸 ����
											// 5
										else if (e == 1 && com == 2 && reload > 0 && reload < 3 && Eoil > 0) {
											System.out.println("�����մϴ�.");
											System.out.println("���� ȸ�Ǳ⵿�� ����Ͽ����ϴ�.");
											System.out.println("�ѹߵ� ���� �ʾҽ��ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											Eoil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
											reload = 0;
										} // �� ���� ��� ȸ��
											// 6
										else if (e == 1 && com == 2 && reload >= 3 && Eoil > 0) {
											System.out.println("�����մϴ�.");
											System.out.println("���� ȸ�Ǳ⵿�� ����Ͽ����ϴ�.");
											System.out.println("������ ���� �Ǿ� ź���� ����� �����Ǿ����ϴ�.");
											System.out.println("���ظ� ���� �����ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											eseyHp -= (str * (reload / 3));
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
											reload = 0;
										} // �� ���� ���� ��� ȸ��
											// 7
										else if (e == 1 && com == 2 && reload > 0 && reload < 3 && Eoil == 0) {
											System.out.println("�����մϴ�.");
											System.out.println("���� ��û�ϰԵ� ȸ�Ǹ� �����ϴµ� ȸ�Ǳ⵿�� ����߽��ϴ�.");
											System.out.println("���ظ� �����ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											eseyHp -= (str * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
											reload = 0;
										} // ������ ��� ȸ�ǺҰ�
											// 8
										else if (e == 1 && com == 2 && reload == 0 && Eoil > 0) {
											System.out.println("���뿡 ��ź�� �����ϴ�.");
											System.out.println("���� �����԰� ȸ�Ǳ⵿�� �����մϴ�.");
											System.out.println("���ظ� �������� ������ �ʾҽ��ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											Eoil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
										} // �� ���� �غ� X��� ȸ��
											// 9
										else if (e == 1 && com == 2 && reload == 0 && Eoil == 0) {
											System.out.println("���뿡 ��ź �����ϴ�.");
											System.out.println("��뵵 �غ� �ȵȻ��·� ȸ�Ǳ⵿�մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
										} // ������ �غ� �ȵ� ��� ȸ�� �Ұ�
											// 10
										else if (e == 1 && com == 3 && reload > 0) {
											System.out.println("�����մϴ�.");
											System.out.println("���� �������Դϴ�.");
											System.out.println("������Ÿ��~~");
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											eseyHp -= (str * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
											reload = 0;
										} // ������ �������
											// 11
										else if (e == 1 && com == 3 && reload == 0) {
											System.out.println("���뿡 ��ź�� �����ϴ�.");
											System.out.println("���� ������ �غ��ϴ±���.");
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� : " + hp + "��ǻ�Ͳ� : " + eseyHp);
										} // �� �����Ұ� �������
											// 12
										else if (e == 2 && com == 1 && oil > 0 && comreload > 0 && comreload < 3) {
											System.out.println("ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("���� �����߽��ϴ�.");
											System.out.println("����� ź�� �Һ��մϴ�.");
											System.out.println("���� ����.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											oil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
										} // �� ȸ�� ��� ����
											// 13
										else if (e == 2 && com == 1 && oil > 0 && comreload >= 3) {
											System.out.println("ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("���⿡�� ������ ȸ���� �� ���� ź���� ����ɴϴ�.");
											System.out.println("�ε� ���ذ� ����ϱ⸸�� �⵵�մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											oil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (eseystr * (comreload / 3));
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
											comreload = 0;
										} // �� ȸ�� ��� 3����� ����
											// 14
										else if (e == 2 && com == 1 && oil > 0 && comreload == 0) {
											System.out.println("ȸ�Ǳ⵿�� �����մϴ�.");
											System.out.println("��뵵 ������ �Ϸ��մϴ�.");
											System.out.println("�׷��� ź�� �߻���� �ʾҽ��ϴ�.");
											System.out.println("���� �ΰ��� �����մϴ�(Ǫ��)");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											oil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
											comreload = 0;
										} // �� ȸ�� ��� ���� ����
											// 15
										else if (e == 2 && com == 2 && oil == 0 && comreload > 0) {
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
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (eseystr * comreload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
											comreload = 0;
										} // �� ȸ�� �Ұ� ��� ���� ����
											// 16
										else if (e == 2 && com == 1 && oil == 0 && comreload == 0) {
											System.out.println("�Ѵ� �ٺ��Դϴ�.");
											System.out.println("���� �ڽ��� �������� Ȯ���ϼ���.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
											comreload = 0;
										} // �� ȸ�� �Ұ� ��� ���� ����
											// 17
										else if (e == 2 && com == 2 && oil > 0 && Eoil > 0) {
											System.out.println("ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("��뵵 ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("�Ʊ�� �⸧�� ���ȱ���.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
										} // �� ȸ�� ��� ȸ��
											// 18
										else if (e == 2 && com == 2 && oil == 0 && Eoil > 0) {
											System.out.println("�⸧�����ϴ�.");
											System.out.println("���浵 ����� �⸧�� �����ϴ±���.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											Eoil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
										} // �� ȸ�� �Ұ� ��� ȸ�� ����
											// 19
										else if (e == 2 && com == 2 && oil > 0 && Eoil == 0) {
											System.out.println("ȸ�� �⵿�� �ǽ��մϴ�.");
											System.out.println("���� �⸧�� �ٶ��������ϴ�.");
											System.out.println("�⸧�� �����ϼ̱���?");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											oil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
										} // ��ȸ�ǰ��� ���ȸ�� �Ұ�
											// 20
										else if (e == 2 && com == 2 && oil == 0 && Eoil == 0) {
											System.out.println("�⸧�� �����ϴٰ�");
											System.out.println("��뵵 �����մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
										} // ��ȸ�ǺҰ� ��� ȸ�ǺҰ�
											// 21
										else if (e == 2 && com == 3 && oil > 0) {
											System.out.println("ȸ�Ǳ⵿�� �õ��մϴ�.");
											System.out.println("���� �����մϴ�.");
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
										} // �� ȸ�� ��� ����
											// 22
										else if (e == 2 && com == 3 && oil == 0) {
											System.out.println("ȸ�Ǳ⵿�� �⸧�� ��� �����߽��ϴ�.");
											System.out.println("���� �����Ͽ� ������ ���ݷ��� �����մϴ�.");
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
										} // �� ȸ�ǺҰ� ��� ����
											// 23
										else if (e == 3 && com == 1 && comreload > 0) {
											System.out.println("���� �մϴ�.");
											System.out.println("���� �����մϴ�.");
											System.out.println("�� �� ��������");
											reload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (eseystr * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
											comreload = 0;
										} // �� ���� ��� �߽�
											// 24
										else if (e == 3 && com == 1 && comreload == 0) {
											System.out.println("������ �մϴ�.");
											System.out.println("���� ������ �߿伺�� �𸣴� ����Դϴ�.");
											reload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
										} // �� ���� ��� ��������
											// 25
										else if (e == 3 && com == 2 && Eoil > 0) {
											System.out.println("������ �մϴ�. ");
											System.out.println("���� ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("���� �⸧�� ����� �ѷȽ��ϴ�.");
											reload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											Eoil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
										} // �� ���� ��� ȸ��
											// 26
										else if (e == 3 && com == 2 && Eoil == 0) {
											System.out.println("������ �մϴ�.");
											System.out.println("����  �⸧�� ���µ� ȸ�Ǳ⵿�� �õ��մϴ�.");
											reload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
										} // ������ ��� ȸ�� ����
											// 27
										else if (e == 3 && com == 3) {
											System.out.println("�����մϴ�.");
											System.out.println("���浵 �����մϴ�.");
											reload += 1;
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + eseyHp);
										} // ������ ��� ����
									}

								} while (hp > 0 && eseyHp > 0);// ���� ������
								if (eseyHp <= 0 || nomalHp <= 0 || hardHp<=0 && hp > 0) {
									tr = tr + 3;
									System.out.println("�������� �¸��ϼ̽��ϴ�.");
									System.out.println("������ : " + hp + " ���� : " + tr);
								}

							} else if (enmy == 2) {
								do {
									// nomal
									System.out.println("�߻��� �������� ��Ÿ����.");
									System.out.println("1:�⺻���� ");
									Scanner num1111 = new Scanner(System.in);
									d = num1111.nextInt();
									if (d == 1) {
										System.out.println("������ �����մϴ�.");
										System.out.println("���ָ� �����ֽʽÿ�");
										System.out.println("1.���� 2.ȸ�� 3.���� ");
										Scanner num11 = new Scanner(System.in);
										e = num11.nextInt();
										Random random1 = new Random();
										int com = random1.nextInt(3) + 1;
										// 1
										if (e == 1 && com == 1 && reload > 0 && comreload > 0) {
											System.out.println("���ΰ� ���ο��� ������ �մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (nomalstr * comreload);
											nomalHp -= (str * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
											reload = 0;
											comreload = 0;
										} // ���� ����
											// 2
										else if (e == 1 && com == 1 && reload > 0 && comreload == 0) {
											System.out.println("���� AI�� ���� �ΰ��� �پ���� ���մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											nomalHp -= (str * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
											reload = 0;
											comreload = 0;
										} // ���� ����
											// 3
										else if (e == 1 && com == 1 && reload == 0 && comreload == 0) {
											System.out.println("������ �غ�����ʾҽ��ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
											reload = 0;
											comreload = 0;
										} // ���� ���� X
											// 4
										else if (e == 1 && com == 1 && reload == 0 && comreload > 0) {
											System.out.println("������ �غ�����ʾҽ��ϴ�.");
											System.out.println("�׷��� ������ ������ �غ� ��������̱���.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (nomalstr * comreload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
											reload = 0;
											comreload = 0;
										} // ��븸 ����
											// 5
										else if (e == 1 && com == 2 && reload > 0 && reload < 3 && Eoil > 0) {
											System.out.println("�����մϴ�.");
											System.out.println("���� ȸ�Ǳ⵿�� ����Ͽ����ϴ�.");
											System.out.println("�ѹߵ� ���� �ʾҽ��ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											Eoil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
											reload = 0;
										} // �� ���� ��� ȸ��
											// 6
										else if (e == 1 && com == 2 && reload >= 3 && Eoil > 0) {
											System.out.println("�����մϴ�.");
											System.out.println("���� ȸ�Ǳ⵿�� ����Ͽ����ϴ�.");
											System.out.println("������ ���� �Ǿ� ź���� ����� �����Ǿ����ϴ�.");
											System.out.println("���ظ� ���� �����ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											nomalHp -= (str * (reload / 3));
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
											reload = 0;
										} // �� ���� ���� ��� ȸ��
											// 7
										else if (e == 1 && com == 2 && reload > 0 && reload < 3 && Eoil == 0) {
											System.out.println("�����մϴ�.");
											System.out.println("���� ��û�ϰԵ� ȸ�Ǹ� �����ϴµ� ȸ�Ǳ⵿�� ����߽��ϴ�.");
											System.out.println("���ظ� �����ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											nomalHp -= (str * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
											reload = 0;
										} // ������ ��� ȸ�ǺҰ�
											// 8
										else if (e == 1 && com == 2 && reload == 0 && Eoil > 0) {
											System.out.println("���뿡 ��ź�� �����ϴ�.");
											System.out.println("���� �����԰� ȸ�Ǳ⵿�� �����մϴ�.");
											System.out.println("���ظ� �������� ������ �ʾҽ��ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											Eoil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
										} // �� ���� �غ� X��� ȸ��
											// 9
										else if (e == 1 && com == 2 && reload == 0 && Eoil == 0) {
											System.out.println("���뿡 ��ź �����ϴ�.");
											System.out.println("��뵵 �غ� �ȵȻ��·� ȸ�Ǳ⵿�մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
										} // ������ �غ� �ȵ� ��� ȸ�� �Ұ�
											// 10
										else if (e == 1 && com == 3 && reload > 0) {
											System.out.println("�����մϴ�.");
											System.out.println("���� �������Դϴ�.");
											System.out.println("������Ÿ��~~");
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											nomalHp -= (str * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
											reload = 0;
										} // ������ �������
											// 11
										else if (e == 1 && com == 3 && reload == 0) {
											System.out.println("���뿡 ��ź�� �����ϴ�.");
											System.out.println("���� ������ �غ��ϴ±���.");
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� : " + hp + "��ǻ�Ͳ� : " + nomalHp);
										} // �� �����Ұ� �������
											// 12
										else if (e == 2 && com == 1 && oil > 0 && comreload > 0 && comreload < 3) {
											System.out.println("ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("���� �����߽��ϴ�.");
											System.out.println("����� ź�� �Һ��մϴ�.");
											System.out.println("���� ����.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											oil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
										} // �� ȸ�� ��� ����
											// 13
										else if (e == 2 && com == 1 && oil > 0 && comreload >= 3) {
											System.out.println("ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("���⿡�� ������ ȸ���� �� ���� ź���� ����ɴϴ�.");
											System.out.println("�ε� ���ذ� ����ϱ⸸�� �⵵�մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											oil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (nomalstr * (comreload / 3));
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
											comreload = 0;
										} // �� ȸ�� ��� 3����� ����
											// 14
										else if (e == 2 && com == 1 && oil > 0 && comreload == 0) {
											System.out.println("ȸ�Ǳ⵿�� �����մϴ�.");
											System.out.println("��뵵 ������ �Ϸ��մϴ�.");
											System.out.println("�׷��� ź�� �߻���� �ʾҽ��ϴ�.");
											System.out.println("���� �ΰ��� �����մϴ�(Ǫ��)");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											oil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
											comreload = 0;
										} // �� ȸ�� ��� ���� ����
											// 15
										else if (e == 2 && com == 2 && oil == 0 && comreload > 0) {
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
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (nomalstr * comreload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
											comreload = 0;
										} // �� ȸ�� �Ұ� ��� ���� ����
											// 16
										else if (e == 2 && com == 1 && oil == 0 && comreload == 0) {
											System.out.println("�Ѵ� �ٺ��Դϴ�.");
											System.out.println("���� �ڽ��� �������� Ȯ���ϼ���.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
											comreload = 0;
										} // �� ȸ�� �Ұ� ��� ���� ����
											// 17
										else if (e == 2 && com == 2 && oil > 0 && Eoil > 0) {
											System.out.println("ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("��뵵 ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("�Ʊ�� �⸧�� ���ȱ���.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
										} // �� ȸ�� ��� ȸ��
											// 18
										else if (e == 2 && com == 2 && oil == 0 && Eoil > 0) {
											System.out.println("�⸧�����ϴ�.");
											System.out.println("���浵 ����� �⸧�� �����ϴ±���.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											Eoil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
										} // �� ȸ�� �Ұ� ��� ȸ�� ����
											// 19
										else if (e == 2 && com == 2 && oil > 0 && Eoil == 0) {
											System.out.println("ȸ�� �⵿�� �ǽ��մϴ�.");
											System.out.println("���� �⸧�� �ٶ��������ϴ�.");
											System.out.println("�⸧�� �����ϼ̱���?");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											oil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
										} // ��ȸ�ǰ��� ���ȸ�� �Ұ�
											// 20
										else if (e == 2 && com == 2 && oil == 0 && Eoil == 0) {
											System.out.println("�⸧�� �����ϴٰ�");
											System.out.println("��뵵 �����մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
										} // ��ȸ�ǺҰ� ��� ȸ�ǺҰ�
											// 21
										else if (e == 2 && com == 3 && oil > 0) {
											System.out.println("ȸ�Ǳ⵿�� �õ��մϴ�.");
											System.out.println("���� �����մϴ�.");
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
										} // �� ȸ�� ��� ����
											// 22
										else if (e == 2 && com == 3 && oil == 0) {
											System.out.println("ȸ�Ǳ⵿�� �⸧�� ��� �����߽��ϴ�.");
											System.out.println("���� �����Ͽ� ������ ���ݷ��� �����մϴ�.");
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
										} // �� ȸ�ǺҰ� ��� ����
											// 23
										else if (e == 3 && com == 1 && comreload > 0) {
											System.out.println("���� �մϴ�.");
											System.out.println("���� �����մϴ�.");
											System.out.println("�� �� ��������");
											reload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (nomalstr * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
											comreload = 0;
										} // �� ���� ��� �߽�
											// 24
										else if (e == 3 && com == 1 && comreload == 0) {
											System.out.println("������ �մϴ�.");
											System.out.println("���� ������ �߿伺�� �𸣴� ����Դϴ�.");
											reload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
										} // �� ���� ��� ��������
											// 25
										else if (e == 3 && com == 2 && Eoil > 0) {
											System.out.println("������ �մϴ�. ");
											System.out.println("���� ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("���� �⸧�� ����� �ѷȽ��ϴ�.");
											reload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											Eoil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
										} // �� ���� ��� ȸ��
											// 26
										else if (e == 3 && com == 2 && Eoil == 0) {
											System.out.println("������ �մϴ�.");
											System.out.println("����  �⸧�� ���µ� ȸ�Ǳ⵿�� �õ��մϴ�.");
											reload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
										} // ������ ��� ȸ�� ����
											// 27
										else if (e == 3 && com == 3) {
											System.out.println("�����մϴ�.");
											System.out.println("���浵 �����մϴ�.");
											reload += 1;
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + nomalHp);
										} // ������ ��� ����
									}

								} while (hp > 0 && nomalHp > 0);// ���� ������
								if (eseyHp <= 0 || nomalHp <= 0 || hardHp<=0 && hp > 0) {
									tr = tr + 3;
									System.out.println("�������� �¸��ϼ̽��ϴ�.");
									System.out.println("������ : " + hp + " ���� : " + tr);
								}
							} else if (enmy == 3) {
								do {
									System.out.println("�߻��� ������ ��Ÿ�����ϴ�.");
									System.out.println("1:�⺻���� ");
									Scanner num1111 = new Scanner(System.in);
									d = num1111.nextInt();
									if (d == 1) {
										System.out.println("������ �����մϴ�.");
										System.out.println("���ָ� �����ֽʽÿ�");
										System.out.println("1.���� 2.ȸ�� 3.���� ");
										Scanner num11 = new Scanner(System.in);
										e = num11.nextInt();
										Random random1 = new Random();
										int com = random1.nextInt(3) + 1;
										// 1
										if (e == 1 && com == 1 && reload > 0 && comreload > 0) {
											System.out.println("���ΰ� ���ο��� ������ �մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (hardstr * comreload);
											hardHp -= (str * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
											reload = 0;
											comreload = 0;
										} // ���� ����
											// 2
										else if (e == 1 && com == 1 && reload > 0 && comreload == 0) {
											System.out.println("���� AI�� ���� �ΰ��� �پ���� ���մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hardHp -= (str * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
											reload = 0;
											comreload = 0;
										} // ���� ����
											// 3
										else if (e == 1 && com == 1 && reload == 0 && comreload == 0) {
											System.out.println("������ �غ�����ʾҽ��ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
											reload = 0;
											comreload = 0;
										} // ���� ���� X
											// 4
										else if (e == 1 && com == 1 && reload == 0 && comreload > 0) {
											System.out.println("������ �غ�����ʾҽ��ϴ�.");
											System.out.println("�׷��� ������ ������ �غ� ��������̱���.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (hardstr * comreload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
											reload = 0;
											comreload = 0;
										} // ��븸 ����
											// 5
										else if (e == 1 && com == 2 && reload > 0 && reload < 3 && Eoil > 0) {
											System.out.println("�����մϴ�.");
											System.out.println("���� ȸ�Ǳ⵿�� ����Ͽ����ϴ�.");
											System.out.println("�ѹߵ� ���� �ʾҽ��ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											Eoil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
											reload = 0;
										} // �� ���� ��� ȸ��
											// 6
										else if (e == 1 && com == 2 && reload >= 3 && Eoil > 0) {
											System.out.println("�����մϴ�.");
											System.out.println("���� ȸ�Ǳ⵿�� ����Ͽ����ϴ�.");
											System.out.println("������ ���� �Ǿ� ź���� ����� �����Ǿ����ϴ�.");
											System.out.println("���ظ� ���� �����ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hardHp -= (str * (reload / 3));
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
											reload = 0;
										} // �� ���� ���� ��� ȸ��
											// 7
										else if (e == 1 && com == 2 && reload > 0 && reload < 3 && Eoil == 0) {
											System.out.println("�����մϴ�.");
											System.out.println("���� ��û�ϰԵ� ȸ�Ǹ� �����ϴµ� ȸ�Ǳ⵿�� ����߽��ϴ�.");
											System.out.println("���ظ� �����ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hardHp -= (str * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
											reload = 0;
										} // ������ ��� ȸ�ǺҰ�
											// 8
										else if (e == 1 && com == 2 && reload == 0 && Eoil > 0) {
											System.out.println("���뿡 ��ź�� �����ϴ�.");
											System.out.println("���� �����԰� ȸ�Ǳ⵿�� �����մϴ�.");
											System.out.println("���ظ� �������� ������ �ʾҽ��ϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											Eoil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
										} // �� ���� �غ� X��� ȸ��
											// 9
										else if (e == 1 && com == 2 && reload == 0 && Eoil == 0) {
											System.out.println("���뿡 ��ź �����ϴ�.");
											System.out.println("��뵵 �غ� �ȵȻ��·� ȸ�Ǳ⵿�մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
										} // ������ �غ� �ȵ� ��� ȸ�� �Ұ�
											// 10
										else if (e == 1 && com == 3 && reload > 0) {
											System.out.println("�����մϴ�.");
											System.out.println("���� �������Դϴ�.");
											System.out.println("������Ÿ��~~");
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hardHp -= (str * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
											reload = 0;
										} // ������ �������
											// 11
										else if (e == 1 && com == 3 && reload == 0) {
											System.out.println("���뿡 ��ź�� �����ϴ�.");
											System.out.println("���� ������ �غ��ϴ±���.");
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� : " + hp + "��ǻ�Ͳ� : " + hardHp);
										} // �� �����Ұ� �������
											// 12
										else if (e == 2 && com == 1 && oil > 0 && comreload > 0 && comreload < 3) {
											System.out.println("ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("���� �����߽��ϴ�.");
											System.out.println("����� ź�� �Һ��մϴ�.");
											System.out.println("���� ����.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											oil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
										} // �� ȸ�� ��� ����
											// 13
										else if (e == 2 && com == 1 && oil > 0 && comreload >= 3) {
											System.out.println("ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("���⿡�� ������ ȸ���� �� ���� ź���� ����ɴϴ�.");
											System.out.println("�ε� ���ذ� ����ϱ⸸�� �⵵�մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											oil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (hardstr * (comreload / 3));
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
											comreload = 0;
										} // �� ȸ�� ��� 3����� ����
											// 14
										else if (e == 2 && com == 1 && oil > 0 && comreload == 0) {
											System.out.println("ȸ�Ǳ⵿�� �����մϴ�.");
											System.out.println("��뵵 ������ �Ϸ��մϴ�.");
											System.out.println("�׷��� ź�� �߻���� �ʾҽ��ϴ�.");
											System.out.println("���� �ΰ��� �����մϴ�(Ǫ��)");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											oil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
											comreload = 0;
										} // �� ȸ�� ��� ���� ����
											// 15
										else if (e == 2 && com == 2 && oil == 0 && comreload > 0) {
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
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (hardstr * comreload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
											comreload = 0;
										} // �� ȸ�� �Ұ� ��� ���� ����
											// 16
										else if (e == 2 && com == 1 && oil == 0 && comreload == 0) {
											System.out.println("�Ѵ� �ٺ��Դϴ�.");
											System.out.println("���� �ڽ��� �������� Ȯ���ϼ���.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
											comreload = 0;
										} // �� ȸ�� �Ұ� ��� ���� ����
											// 17
										else if (e == 2 && com == 2 && oil > 0 && Eoil > 0) {
											System.out.println("ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("��뵵 ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("�Ʊ�� �⸧�� ���ȱ���.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
										} // �� ȸ�� ��� ȸ��
											// 18
										else if (e == 2 && com == 2 && oil == 0 && Eoil > 0) {
											System.out.println("�⸧�����ϴ�.");
											System.out.println("���浵 ����� �⸧�� �����ϴ±���.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											Eoil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
										} // �� ȸ�� �Ұ� ��� ȸ�� ����
											// 19
										else if (e == 2 && com == 2 && oil > 0 && Eoil == 0) {
											System.out.println("ȸ�� �⵿�� �ǽ��մϴ�.");
											System.out.println("���� �⸧�� �ٶ��������ϴ�.");
											System.out.println("�⸧�� �����ϼ̱���?");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											oil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
										} // ��ȸ�ǰ��� ���ȸ�� �Ұ�
											// 20
										else if (e == 2 && com == 2 && oil == 0 && Eoil == 0) {
											System.out.println("�⸧�� �����ϴٰ�");
											System.out.println("��뵵 �����մϴ�.");
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
										} // ��ȸ�ǺҰ� ��� ȸ�ǺҰ�
											// 21
										else if (e == 2 && com == 3 && oil > 0) {
											System.out.println("ȸ�Ǳ⵿�� �õ��մϴ�.");
											System.out.println("���� �����մϴ�.");
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
										} // �� ȸ�� ��� ����
											// 22
										else if (e == 2 && com == 3 && oil == 0) {
											System.out.println("ȸ�Ǳ⵿�� �⸧�� ��� �����߽��ϴ�.");
											System.out.println("���� �����Ͽ� ������ ���ݷ��� �����մϴ�.");
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
										} // �� ȸ�ǺҰ� ��� ����
											// 23
										else if (e == 3 && com == 1 && comreload > 0) {
											System.out.println("���� �մϴ�.");
											System.out.println("���� �����մϴ�.");
											System.out.println("�� �� ��������");
											reload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											hp -= (hardstr * reload);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
											comreload = 0;
										} // �� ���� ��� �߽�
											// 24
										else if (e == 3 && com == 1 && comreload == 0) {
											System.out.println("������ �մϴ�.");
											System.out.println("���� ������ �߿伺�� �𸣴� ����Դϴ�.");
											reload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
										} // �� ���� ��� ��������
											// 25
										else if (e == 3 && com == 2 && Eoil > 0) {
											System.out.println("������ �մϴ�. ");
											System.out.println("���� ȸ�Ǳ⵿�� �մϴ�.");
											System.out.println("���� �⸧�� ����� �ѷȽ��ϴ�.");
											reload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											Eoil -= 1;
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
										} // �� ���� ��� ȸ��
											// 26
										else if (e == 3 && com == 2 && Eoil == 0) {
											System.out.println("������ �մϴ�.");
											System.out.println("����  �⸧�� ���µ� ȸ�Ǳ⵿�� �õ��մϴ�.");
											reload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
										} // ������ ��� ȸ�� ����
											// 27
										else if (e == 3 && com == 3) {
											System.out.println("�����մϴ�.");
											System.out.println("���浵 �����մϴ�.");
											reload += 1;
											comreload += 1;
											System.out.println("������ ����Ƚ��");
											System.out.println("���� : " + reload + "��ǻ�Ͳ� : " + comreload);
											System.out.println("������ ȸ�ǰ��� Ƚ��");
											System.out.println("����" + oil + "��벨" + Eoil);
											System.out.println("���� hp : " + hp + "��ǻ�Ͳ� hp : " + hardHp);
										} // ������ ��� ����
									}

								} while (hp > 0 && hardHp > 0);// ���� ������
								if (eseyHp <= 0 || nomalHp <= 0 || hardHp<=0 && hp > 0) {
									tr = tr + 3;
									System.out.println("�������� �¸��ϼ̽��ϴ�.");
									System.out.println("������ : " + hp + " ���� : " + tr);
								}
							}

							if (eseyHp <= 0 && hp > 0 && tr>0) {
								System.out.println("�����մϴ�.");
								hp += 500;
								str = str + 100;
								tr--;

							}
							else if (nomalHp <= 0 && hp > 0 && tr>0) {
								System.out.println("�����մϴ�.");
								hp += 1000;
								str = str + 500;
								tr--;
							}
							else if (hardHp <= 0 && hp > 0 && tr>0) {
								System.out.println("�����մϴ�.");
								hp += 2000;
								str = str + 1000;
								tr--;
							}

						} else if (e == 2 && tr>0) {
							System.out.println("ü���� �����մϴ�.");
							hp = hp + 500;
							str+=100;
							tr--;

						}
						if (battle == 10) {
							System.out.println("���� �߽����� ���Խ��ϴ�.");
							System.out.println("�߸���� �����߽��ϴ�.");
							System.out.println("������...........");
							System.out.println("������ �����մϴ�.");

							do {

								System.out.println("������ :" + hp + "�߸���" + Yhp);

								System.out.println("1:���� 2:���� 3:��");
								Scanner num11111 = new Scanner(System.in);
								att = num11111.nextInt();
								int sis = 1, rok = 2, pap = 3;
								Random random1 = new Random();
								int com = random1.nextInt(3) + 1;
								if (att == com) {
									System.out.println("���̽��ϴ�.");

									System.out.println("������ :" + hp + "�߸���" + Yhp);
								} else if ((att == 1 && com == 2) || (att == 2 && com == 3) || (att == 3 && com == 1)) {
									System.out.println("���̽��ϴ�.");
									hp = hp - Ystr;

									System.out.println("������ :" + hp + "�߸���" + Yhp);
								} else if ((att == 1 && com == 3) || (att == 2 && com == 1) || (att == 3 && com == 2)) {
									System.out.println("�̱�̽��ϴ�.");
									Yhp = Yhp - str;

									System.out.println("������ :" + hp + "�߸���" + Yhp);
								}

							} while (hp > 0 && Yhp > 0);// ���� ������

						}

					} // ���� ������
					int battle1 = 0;// ���� Ƚ��
					while (airSuc == 1 && hp > 0) {
						System.out.println("�װ������� ����մϴ�.");
						System.out.println("1.���       2.����");
						Scanner num111 = new Scanner(System.in);
						int e = num111.nextInt();
						if (e == 1) {
							Ehp = 500;// �� ü��
							System.out.println("����մϴ�.");

							System.out.println("���� �����Ͽ����ϴ�.");

							System.out.println("���� �غ�");
						

							System.out.println("������ �����մϴ�.");
							do {

								System.out.println("1:�⺻���� ");
								Scanner num1111 = new Scanner(System.in);
								d = num1111.nextInt();
								if (d == 1) {
									if (plain > 0 && sub > 0) {
										plain--;
										System.out.println("������ ����!!!!! ");
										
										System.out.println("�ܿ� ������" + plain);
										Random random11 = new Random();
										int data11 = random11.nextInt(4) + 1;
										if (data11 == 1) {
											
											System.out.println("��ڰ� �����մϴ�.");
											
											System.out.println("��ź�ǿ� �����߽��ϴ�!!!!");
											
											System.out.println("������ �߻��߽��ϴ�!!!!!!!!!!");
											Ehp = Ehp - 450;
											if (Ehp < 0) {
												Ehp = 0;
											}
											System.out.println("�� �Լ� : " + Ehp);
											PlainCount++;

										} else if (data11 == 2) {
											System.out.println("��ڰ� ��~ ���� ���� ���� ��Ĩ�ϴ�.");
											System.out.println("������� �Ծ�帱����");
											Ehp = Ehp - 100;
											if (Ehp < 0) {
												Ehp = 0;
											}
											System.out.println("�� �Լ� : " + Ehp);
											PlainCount++;

										} else if (data11 == 3) {
											System.out.println("���� ������ �������� ��ڸ� ���ذ��ϴ�.");
											System.out.println("�� 1�� ���ص� ������ ���Ͽ����ϴ�.");

										} else if (data11 == 4) {
											System.out.println("�ط��� ���ؼ� ��ڰ� ��� �߸��� �������� �����ϴ�.");
											System.out.println("�� �ռ��� ����� ���ؽǷ¿� ������� �����ϴ�.");

										}

									} else if (plain <= 0) {
										System.out.println("ž�� ������ ���� �����մϴ�.");
									} else if (sub <= 0) {
										System.out.println("����������� �ٴڳ����ϴ�.");
									}

								}

						
							} while (hp > 0 && Ehp > 0);// ���� ������

							if (Ehp == 0 && hp > 0) {
								System.out.println("��ȭ�մϴ�.");
								hp += 1000;
								plain+=2;
								tr--;

							}

						} else if (e == 2) {
							System.out.println("ü�¹� �װ��⸦ �����մϴ�.");
							hp = hp + 500;
							plain+=5;
							battle1++;
							tr--;

						}
						if (battle1 == 10) {
							System.out.println("���� �߽����� ���Խ��ϴ�.");
							System.out.println("�߸���� �����߽��ϴ�.");
							System.out.println("������...........");
							System.out.println("������ �����մϴ�.");

							do {
								if (plain > 0 && sub > 0) {
									plain--;
									System.out.println("������ ����!!!!! ");
									
									System.out.println("�ܿ� ������" + plain);
									Random random11 = new Random();
									int data11 = random11.nextInt(4) + 1;
									if (data11 == 1) {
										
										System.out.println("��ڰ� �����մϴ�.");
										
										System.out.println("��ź�ǿ� �����߽��ϴ�!!!!");
										
										System.out.println("������ �߻��߽��ϴ�!!!!!!!!!!");
										Yhp = Yhp - 5000;
										if (Yhp < 0) {
											Yhp = 0;
										}
										System.out.println("�� �Լ� : " + Ehp);
						

									} else if (data11 == 2) {
										System.out.println("��ڰ� ��~ ���� ���� ���� ��Ĩ�ϴ�.");
										System.out.println("������� �Ծ�帱����");
										Yhp = Yhp - 2000;
										if (Yhp < 0) {
											Yhp = 0;
										}
										System.out.println("�� �Լ� : " + Ehp);
									
									} else if (data11 == 3) {
										System.out.println("�߸���� ��û�� ����� �� ��ڸ� ġ���ϴ�..");
										System.out.println("�� 1�� ���ص� ������ ���Ͽ����ϴ�.");
										Yhp-=1000;
										System.out.println("�� �Լ� : " + Ehp);

									} else if (data11 == 4) {
										System.out.println("�ط��� ���ؼ� ��ڰ� ��� �߸��� �������� �����ϴ�.");
										System.out.println("�߸��䰡 ����� ���ؽǷ¿� ������� �����ϴ�.");
										System.out.println("�� �Լ� : " + Ehp);
						


									}

								} else if (plain <= 0) {
									System.out.println("ž�� ������ ���� �����մϴ�.");
								} else if (sub <= 0) {
									System.out.println("����������� �ٴڳ����ϴ�.");
								}

							

					
								

							} while (hp > 0 && Yhp > 0||plain<=0);// ���� ������
							break;

						}

					}
					if (Yhp>0) {
						System.out.println("���� �Լ� �߸��信�� �й��Ͽ����ϴ�.");
						System.out.println("�� ");
						System.out.println("�ٽ� �밡�� �㽯?");
					}

					else if (Yhp<=0) {
						System.out.println("���� �Լ� �߸��並 ��ҽ��ϴ�.");
						System.out.println("���ϵ帳�ϴ�. ");
						System.out.println("�ٽ� �밡�� �㽯?");
						str+=10;
					}

				}
				continue;
				// ������ ������ �κ�

			}

			else if (a == 2) {
				System.out.println("�����մϴ�.");
				break;
			}

		}

	}

}