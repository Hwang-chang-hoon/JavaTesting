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
				System.out.println("승선하실 함선을 선택해주십시요.");
				System.out.println("1 : 구축함");
				int i = sc.nextInt();
				if (i == 1) {
					System.out.println("구축함에 승선하셨습니다.");
					return 1;
				} else
					System.out.println("아뉘 있는 선택지에서만 고르세요.");
				continue;
			} else if (choice == true) {
				System.out.println("승선하실 함선을 선택해주십시요.");
				System.out.println("1 : 구축함        2 : 순양함");
				int i = sc.nextInt();
				if (i == 1) {
					System.out.println("구축함에 승선하셨습니다.");
					return 1;
				} else if (i == 2) {
					System.out.println("순양함에 승선하셨습니다.");
					return 2;
				} else
					System.out.println("ㅇㅇㅇㅇㅇㅇ내가 뭔말할지 알지요?ㅇㅇㅇㅇㅇㅇ");
				continue;
			}

		}
	}

	public static boolean battling_destroyer(Unit user1, Unit user2, Unit opposite1, Unit opposite2) {
		while (true) {
			System.out.println("함장 명령을 내려주십시요.");
			System.out.println("무었을 하실겁니까?");
			System.out.println("1. 출격     2. 보급     3. 강화");
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
			System.out.println("함장 명령을 내려주십시요.");
			System.out.println("무었을 하실겁니까?");
			System.out.println("1. 출격     2. 보급     3. 강화");
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
						System.out.println("부디 좋은 결과를 내주시기 바랍니다.");
						return 1;
					} else if (ba == 2) {
						System.out.println("오우 유갑입니다.");
						System.out.println("부디 다음에는 생각이 달라지시길 바랍니다.");
						continue;
					}
				}

			}
		}
		return 0;
	}

	public static void battling_carrier(Unit user, Unit user1, Unit user2, Unit easy, Unit normal, Unit hard) {
		System.out.println("항공모함으로의 배속이 끝났습니다.");
		System.out.println("계속 지금처럼 힘내주세요.");
		System.out.println("항공모함이시니 걍 항공대만 계속날리세요.");
		while (true) {
			System.out.println("항공모함으로 뭐 할래요?");
			System.out.println("1. 출전         2. 개장");
			int b = sc.nextInt();
			if (b == 1) {
				if (Aircraft_Carrier.upGrade_Count >= 1) {

					break;
				}
				System.out.println("항공모함의 출격이 뭐있겠습니까?");
				System.out.println("걍 뒤에 콕 밖혀서 함대기나 날리세요.");

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
		System.out.println("전함으로의 배속이 확인 되셨습니다.");
		System.out.println("계속 힘내주세요~~~");
		while (true) {
			System.out.println("함장으로서의 명령을 부탁드립니다.");
			System.out.println("1. 출격                    2. 보급");

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
			System.out.println("전함으로 야마토를 만났습니다.");
			System.out.println("악몽이 따로없군요.");
			System.out.println("행운을 빕니다.");
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
		Unit destroyer = new Destroyer("구축함", 500, 500, 50, 50, 10, 10, 0, 10, 10);
		Unit cruiser = new Cruiser("순양함", 1000, 1000, 150, 150, 15, 15, 0, 10, 10, 10, 450);
		Unit battleship = new Unit("전함", 5000, 5000, 1000, 1000, 20, 20, 0, 0);
		Unit carrier = new Aircraft_Carrier("항공모함", 10000, 10000, 500, 500, 0, 0, 0, 0, 20);
		Unit o_destroyer = new Unit("적 구축함", 500, 500, 10, 10, 10, 10, 0, 0);
		Unit o_cruiser = new Unit("적 순양함", 1000, 1000, 50, 50, 15, 15, 0, 0);
		Unit easy_ship = new Unit("적 전함", 2000, 2000, 150, 150, 20, 20, 0, 0);
		Unit normal_ship = new Unit("적 전함", 3000, 3000, 500, 500, 20, 20, 0, 0);
		Unit hard_ship = new Unit("적 전함", 4000, 4000, 700, 700, 20, 20, 0, 0);
		Unit Yamato = new Unit("야마토", 10000, 10000, 5000, 5000, 20, 20, 50, 0);
		weather.setDaemon(true);
		go.setDaemon(true);
		time.setDaemon(true);
		weather.start(); // 스래드 시작 부분
		go.start();
		time.start();

		while (true) {
			System.out.println("함선 키우기 시작하시겠습니까?");
			System.out.println("1. 게임 시작          2. 종료");
			int a = sc.nextInt();
			if (a == 1) {
				while (true) {

					System.out.println("당신은 대아시아 태평양함대에 함장으로서 전속 배정되었습니다.");
					System.out.println("      부디 이 끔찍한 전쟁을 승리로 이끌어주십시오.");
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
				System.out.println("저기 오키나와로 이동중인 야마토를 만났습니다.");
				System.out.println("그러나 당신은 항공모함에 타고있습니다.");
				System.out.println("무었을 해야할지는 알고계실것입니다.");
				do {
					Aircraft_Carrier.PlainAttact((Aircraft_Carrier) carrier, Yamato);
				} while (Unit.checkDead(carrier) && Unit.checkDead(Yamato));
				System.out.println("모든이야기에 끝을 맞이했습니다.");
				System.out.println("수고하셨습니다.");
				break;

			}
			if (true)
				System.out.println("게임을 종료합니다.");
			break;

		}

	}

}
