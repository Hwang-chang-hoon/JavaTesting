package Game;

import java.*;

import ThreadPackage.*;

import java.util.*;

import Ship.*;

public class PlaingGame {
	static boolean choice;
	static Scanner sc = new Scanner(System.in);
	static Random _random = new Random();
	static MyBGM go = new MyBGM();
	static WeatherThread weather = new WeatherThread(0);
	static Timecheck time = new Timecheck(0);

	public static int battle_choice(boolean chioce) {
		while (true) {
			if (choice == false) {
				System.out.println("�¼��Ͻ� �Լ��� �������ֽʽÿ�.");
				System.out.println("1 : ������");
				int i = sc.nextInt();
				if (i == 1) {
					System.out.println("�����Կ� �¼��ϼ̽��ϴ�.");
					return 1;
				} else
					System.out.println("�ƴ� �ִ� ������������ ������.");
				continue;
			} else if (choice == true) {
				System.out.println("�¼��Ͻ� �Լ��� �������ֽʽÿ�.");
				System.out.println("1 : ������        2 : ������");
				int i = sc.nextInt();
				if (i == 1) {
					System.out.println("�����Կ� �¼��ϼ̽��ϴ�.");
					return 1;
				} else if (i == 2) {
					System.out.println("�����Կ� �¼��ϼ̽��ϴ�.");
					return 2;
				} else
					System.out.println("���������������� �������� ������?������������");
				continue;
			}

		}
	}

	public static boolean battling_destroyer(Unit user1, Unit user2, Unit opposite1, Unit opposite2) {
		while (true) {
			System.out.println("���� ����� �����ֽʽÿ�.");
			System.out.println("������ �Ͻǰ̴ϱ�?");
			System.out.println("1. ���     2. ����     3. ��ȭ");
			int c1 = sc.nextInt();
			if (c1 == 1) {
				int data = _random.nextInt(3) + 1;
				if (data == 1) {
					int data1 = _random.nextInt(3) + 1;
					if (data1 == 1) {
						do {
							Unit.battle_choice(opposite1);
							int ch = sc.nextInt();
							if (ch == 1) {
								weather.print();
								time.print();
								Unit.battle(user1, opposite1);
							} else if (ch == 2) {
								Destroyer.subattact((Destroyer) user1, opposite1);

							}

						} while (Unit.checkDead(user1) && Unit.checkDead(opposite1));

					} else if (data1 == 2) {
						do {
							Unit.battle_choice(opposite1);
							int ch = sc.nextInt();
							if (ch == 1) {
								weather.print();
								time.print();
								Unit.battle(user1, opposite1);
							} else if (ch == 2) {
								Destroyer.subattact((Destroyer) user1, opposite1);
							}

						} while (Unit.checkDead(user1) && Unit.checkDead(opposite1));

					} else if (data1 == 3) {
						do {
							Unit.battle_choice(opposite1);
							int ch = sc.nextInt();
							if (ch == 1) {
								weather.print();
								time.print();
								Unit.battle(user1, opposite1);
							} else if (ch == 2) {
								Destroyer.subattact((Destroyer) user1, opposite1);
							}

						} while (Unit.checkDead(user1) && Unit.checkDead(opposite1));

					} else if (data1 == 4) {
						do {
							Unit.battle_choice(opposite2);
							int ch = sc.nextInt();
							if (ch == 1) {
								weather.print();
								time.print();
								Unit.battle(user1, opposite2);
							} else if (ch == 2) {
								Destroyer.subattact((Destroyer) user1, opposite2);
							}

						} while (Unit.checkDead(user1) && Unit.checkDead(opposite2));

					}
					if (Unit.checkDead(opposite1) == false || Unit.checkDead(opposite2) == false) {
						Unit.battle_end(user1);
						Unit.reset(opposite1);
						Unit.reset(opposite2);
					} else if (Unit.checkDead(user1) == false) {
						Unit.die(user1, user2);
						Unit.reset(opposite1);
						Unit.reset(opposite2);
						break;
					}

				} else if (data == 2) {
					Unit.lucky(user1);
				} else if (data == 3) {
					Unit.un_lucky(user1);
				}
			} else if (c1 == 2) {
				Unit.supply(user1);
			} else if (c1 == 3) {
				Unit.power_up(user1, opposite1, opposite2);
				if (user1.isPowered()) {
					Unit.tutorial(user1);
					return choice = true;
				}
			}
		}
		return choice;
	}

	public static int battling_cruiser(Unit user1, Unit user2, Unit opposite1, Unit opposite2) {
		while (true) {
			System.out.println("���� ����� �����ֽʽÿ�.");
			System.out.println("������ �Ͻǰ̴ϱ�?");
			System.out.println("1. ���     2. ����     3. ��ȭ");
			int c1 = sc.nextInt();
			if (c1 == 1) {
				int data = _random.nextInt(3) + 1;
				if (data == 1) {
					int data1 = _random.nextInt(1) + 1;
					if (data1 == 1) {
						do {
							Unit.battle_choice(opposite1);
							int ch = sc.nextInt();
							if (ch == 1) {
								weather.print();
								time.print();
								Unit.battle(user1, opposite1);
							} else if (ch == 2) {
								Cruiser.plainFihgt((Cruiser) user1, opposite1);
							}

						} while (Unit.checkDead(user1) && Unit.checkDead(opposite1));

					} else if (data1 == 2) {
						do {
							Unit.battle_choice(opposite2);
							int ch = sc.nextInt();
							if (ch == 1) {
								weather.print();
								time.print();
								Unit.battle(user1, opposite2);
							} else if (ch == 2) {
								Cruiser.plainFihgt((Cruiser) user1, opposite2);
							}

						} while (Unit.checkDead(user1) && Unit.checkDead(opposite2));

					}
					if (Unit.checkDead(opposite1) == false || Unit.checkDead(opposite2) == false) {
						Unit.battle_end(user1);
						Cruiser.recharge((Cruiser) user1);
						Unit.reset(opposite1);
						Unit.reset(opposite2);
						if (((Cruiser) user1).up_grade() && Cruiser.air_deney == true) {
							Cruiser.air_convert(user1);
							int air = sc.nextInt();
							if (air == 1) {
								Cruiser.air_agree(user1);
								return 2;
							} else if (air == 2) {
								Cruiser.air_reject((Cruiser) user1);
								continue;
							}
						}

					} else if (Unit.checkDead(user1) == false) {
						Unit.die(user1, user2);
						Cruiser.recharge((Cruiser) user1);
						Unit.reset(opposite1);
						Unit.reset(opposite2);
						break;
					}

				} else if (data == 2) {
					Unit.lucky(user1);
				} else if (data == 3) {
					Unit.un_lucky(user1);
				}
			} else if (c1 == 2) {
				Unit.supply(user1);
			} else if (c1 == 3) {
				Unit.power_up(user1, opposite1, opposite2);
				if (user1.isPowered()) {
					Unit.level_up(user1);
					int ba = sc.nextInt();
					if (ba == 1) {
						System.out.println("�ε� ���� ����� ���ֽñ� �ٶ��ϴ�.");
						return 1;
					} else if (ba == 2) {
						System.out.println("���� �����Դϴ�.");
						System.out.println("�ε� �������� ������ �޶����ñ� �ٶ��ϴ�.");
						continue;
					}
				}

			}
		}
		return 0;
	}

	public static void battling_carrier(Unit user, Unit user1, Unit user2, Unit easy, Unit normal, Unit hard) {
		System.out.println("�װ����������� ����� �������ϴ�.");
		System.out.println("��� ����ó�� �����ּ���.");
		System.out.println("�װ������̽ô� �� �װ��븸 ��ӳ�������.");
		while (true) {
			System.out.println("�װ��������� �� �ҷ���?");
			System.out.println("1. ����         2. ����");
			int b = sc.nextInt();
			if (b == 1) {
				if (Aircraft_Carrier.upGrade_Count >= 1) {

					break;
				}
				System.out.println("�װ������� ����� ���ְڽ��ϱ�?");
				System.out.println("�� �ڿ� �� ������ �Դ�⳪ ��������.");

				int r = _random.nextInt(3) + 1;
				if (r == 1) {
					do {
						Aircraft_Carrier.PlainAttact((Aircraft_Carrier) user, easy);
					} while (Unit.checkDead(user) && Unit.checkDead(easy));
				} else if (r == 2) {
					do {
						Aircraft_Carrier.PlainAttact((Aircraft_Carrier) user, normal);
					} while (Unit.checkDead(user) && Unit.checkDead(normal));
				} else if (r == 3) {
					do {
						Aircraft_Carrier.PlainAttact((Aircraft_Carrier) user, hard);
					} while (Unit.checkDead(user) && Unit.checkDead(hard));
				}

			}
			if (Unit.checkDead(easy) == false || Unit.checkDead(normal) == false || Unit.checkDead(hard) == false) {
				Unit.battle_end(user);
				Unit.reset(easy);
				Unit.reset(normal);
				Unit.reset(hard);
			} else if (Unit.checkDead(user) == false) {
				Unit.die(user1, user2);
				Unit.reset(easy);
				Unit.reset(normal);
				Unit.reset(hard);
				break;
			} else if (b == 2) {
				Aircraft_Carrier.refitment((Aircraft_Carrier) user);

			}

		}

	}

	public static void battling_battleship(Unit user, Unit user1, Unit user2, Unit easy, Unit normal, Unit hard,
			Unit Yamato) {
		System.out.println("���������� ����� Ȯ�� �Ǽ̽��ϴ�.");
		System.out.println("��� �����ּ���~~~");
		while (true) {
			System.out.println("�������μ��� ����� ��Ź�帳�ϴ�.");
			System.out.println("1. ���                    2. ����");

			int l = sc.nextInt();
			if (l == 1) {
				int data1 = _random.nextInt(2) + 1;
				if (data1 == 1) {
					do {
						weather.print();
						time.print();
						Unit.battle(user, easy);

					} while (Unit.checkDead(user) && Unit.checkDead(easy));

				} else if (data1 == 2) {
					do {
						weather.print();
						time.print();
						Unit.battle(user, normal);

					} while (Unit.checkDead(user) && Unit.checkDead(normal));

				} else if (data1 == 3) {
					do {
						weather.print();
						time.print();
						Unit.battle(user, hard);

					} while (Unit.checkDead(user) && Unit.checkDead(hard));

				}
				if (Unit.checkDead(easy) == false || Unit.checkDead(normal) == false || Unit.checkDead(hard) == false) {
					Unit.battle_end(user);
					Unit.reset(easy);
					Unit.reset(normal);
					Unit.reset(hard);
				} else if (Unit.checkDead(user) == false) {
					Unit.die(user1, user2);
					Unit.reset(easy);
					Unit.reset(normal);
					Unit.reset(hard);
					break;
				}

			} else if (l == 2) {
				Unit.supply(user);
				Aircraft_Carrier.upGrade_Count++;
			}
			if (Aircraft_Carrier.upGrade_Count >= 1) {
				break;
			}
		}
		if (Aircraft_Carrier.upGrade_Count >= 1) {
			System.out.println("�������� �߸��並 �������ϴ�.");
			System.out.println("�Ǹ��� ���ξ�����.");
			System.out.println("����� ���ϴ�.");
			do {
				Unit.battle(user, Yamato);

			} while (Unit.checkDead(user) && Unit.checkDead(Yamato));
			if (Unit.checkDead(Yamato) == false) {
				Unit.battle_end(user);
				Unit.reset(easy);
				Unit.reset(normal);
				Unit.reset(hard);
			} else if (Unit.checkDead(user) == false) {
				Unit.die(user1, user2);
				Unit.reset(easy);
				Unit.reset(normal);
				Unit.reset(hard);
			}
		}

	}

	public static void main(String[] args) {
		Unit destroyer = new Destroyer("������", 500, 500, 50, 50, 10, 10, 0, 10, 10);
		Unit cruiser = new Cruiser("������", 1000, 1000, 150, 150, 15, 15, 0, 10, 10, 10, 450);
		Unit battleship = new Unit("����", 5000, 5000, 1000, 1000, 20, 20, 0, 0);
		Unit carrier = new Aircraft_Carrier("�װ�����", 10000, 10000, 500, 500, 0, 0, 0, 0, 20);
		Unit o_destroyer = new Unit("�� ������", 500, 500, 10, 10, 10, 10, 0, 0);
		Unit o_cruiser = new Unit("�� ������", 1000, 1000, 50, 50, 15, 15, 0, 0);
		Unit easy_ship = new Unit("�� ����", 2000, 2000, 150, 150, 20, 20, 0, 0);
		Unit normal_ship = new Unit("�� ����", 3000, 3000, 500, 500, 20, 20, 0, 0);
		Unit hard_ship = new Unit("�� ����", 4000, 4000, 700, 700, 20, 20, 0, 0);
		Unit Yamato = new Unit("�߸���", 10000, 10000, 5000, 5000, 20, 20, 50, 0);
		weather.setDaemon(true);
		go.setDaemon(true);
		time.setDaemon(true);
		weather.start(); // ������ ���� �κ�
		go.start();
		time.start();

		while (true) {
			System.out.println("�Լ� Ű��� �����Ͻðڽ��ϱ�?");
			System.out.println("1. ���� ����          2. ����");
			int a = sc.nextInt();
			if (a == 1) {
				while (true) {

					System.out.println("����� ��ƽþ� ������Դ뿡 �������μ� ���� �����Ǿ����ϴ�.");
					System.out.println("      �ε� �� ������ ������ �¸��� �̲����ֽʽÿ�.");
					System.out.println("");
					while (true) {
						int i = PlaingGame.battle_choice(destroyer.isPowered());

						if (i == 1) {

							battling_destroyer(destroyer, cruiser, o_destroyer, o_cruiser);

						} else if (i == 2) {
							int prog = battling_cruiser(cruiser, destroyer, o_destroyer, o_cruiser);
							if (prog == 1 || prog == 2) {
								break;
							}
						}

					}
					if (cruiser.isPowered()) {
						battling_battleship(battleship, destroyer, cruiser, easy_ship, normal_ship, hard_ship, Yamato);
						continue;
					} else if (((Cruiser) cruiser).up_grade()) {
						battling_carrier(carrier, destroyer, cruiser, easy_ship, normal_ship, hard_ship);
						break;
					}

				}
				System.out.println("���� ��Ű���ͷ� �̵����� �߸��並 �������ϴ�.");
				System.out.println("�׷��� ����� �װ����Կ� Ÿ���ֽ��ϴ�.");
				System.out.println("������ �ؾ������� �˰��ǰ��Դϴ�.");
				do {
					Aircraft_Carrier.PlainAttact((Aircraft_Carrier) carrier, Yamato);
				} while (Unit.checkDead(carrier) && Unit.checkDead(Yamato));
				System.out.println("����̾߱⿡ ���� �����߽��ϴ�.");
				System.out.println("�����ϼ̽��ϴ�.");
				break;

			}
			if (true)
				System.out.println("������ �����մϴ�.");
			break;

		}

	}

}
