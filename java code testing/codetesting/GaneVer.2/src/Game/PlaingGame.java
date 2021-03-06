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
				System.out.println("渋識馬叔 敗識聖 識澱背爽淑獣推.");
				System.out.println("1 : 姥逐敗");
				int i = sc.nextInt();
				if (i == 1) {
					System.out.println("姥逐敗拭 渋識馬写柔艦陥.");
					return 1;
				} else
					System.out.println("焼患 赤澗 識澱走拭辞幻 壱牽室推.");
				continue;
			} else if (choice == true) {
				System.out.println("渋識馬叔 敗識聖 識澱背爽淑獣推.");
				System.out.println("1 : 姥逐敗        2 : 授丞敗");
				int i = sc.nextInt();
				if (i == 1) {
					System.out.println("姥逐敗拭 渋識馬写柔艦陥.");
					return 1;
				} else if (i == 2) {
					System.out.println("授丞敗拭 渋識馬写柔艦陥.");
					return 2;
				} else
					System.out.println("しししししし鎧亜 杭源拝走 硝走推?しししししし");
				continue;
			}

		}
	}

	public static boolean battling_destroyer(Unit user1, Unit user2, Unit opposite1, Unit opposite2) {
		while (true) {
			System.out.println("敗舌 誤敬聖 鎧形爽淑獣推.");
			System.out.println("巷醸聖 馬叔位艦猿?");
			System.out.println("1. 窒維     2. 左厭     3. 悪鉢");
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
			System.out.println("敗舌 誤敬聖 鎧形爽淑獣推.");
			System.out.println("巷醸聖 馬叔位艦猿?");
			System.out.println("1. 窒維     2. 左厭     3. 悪鉢");
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
						System.out.println("採巨 疏精 衣引研 鎧爽獣奄 郊遇艦陥.");
						return 1;
					} else if (ba == 2) {
						System.out.println("神酔 政逢脊艦陥.");
						System.out.println("採巨 陥製拭澗 持唖戚 含虞走獣掩 郊遇艦陥.");
						continue;
					}
				}

			}
		}
		return 0;
	}

	public static void battling_carrier(Unit user, Unit user1, Unit user2, Unit easy, Unit normal, Unit hard) {
		System.out.println("牌因乞敗生稽税 壕紗戚 魁概柔艦陥.");
		System.out.println("域紗 走榎坦軍 毘鎧爽室推.");
		System.out.println("牌因乞敗戚獣艦 袷 牌因企幻 域紗劾軒室推.");
		while (true) {
			System.out.println("牌因乞敗生稽 更 拝掘推?");
			System.out.println("1. 窒穿         2. 鯵舌");
			int b = sc.nextInt();
			if (b == 1) {
				if (Aircraft_Carrier.upGrade_Count >= 1) {

					break;
				}
				System.out.println("牌因乞敗税 窒維戚 更赤畏柔艦猿?");
				System.out.println("袷 及拭 壷 鉱粕辞 敗企奄蟹 劾軒室推.");

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
		System.out.println("穿敗生稽税 壕紗戚 溌昔 鞠写柔艦陥.");
		System.out.println("域紗 毘鎧爽室推~~~");
		while (true) {
			System.out.println("敗舌生稽辞税 誤敬聖 採店球験艦陥.");
			System.out.println("1. 窒維                    2. 左厭");

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
			System.out.println("穿敗生稽 醤原塘研 幻概柔艦陥.");
			System.out.println("焦功戚 魚稽蒸浦推.");
			System.out.println("楳錘聖 索艦陥.");
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
		Unit destroyer = new Destroyer("姥逐敗", 500, 500, 50, 50, 10, 10, 0, 10, 10);
		Unit cruiser = new Cruiser("授丞敗", 1000, 1000, 150, 150, 15, 15, 0, 10, 10, 10, 450);
		Unit battleship = new Unit("穿敗", 5000, 5000, 1000, 1000, 20, 20, 0, 0);
		Unit carrier = new Aircraft_Carrier("牌因乞敗", 10000, 10000, 500, 500, 0, 0, 0, 0, 20);
		Unit o_destroyer = new Unit("旋 姥逐敗", 500, 500, 10, 10, 10, 10, 0, 0);
		Unit o_cruiser = new Unit("旋 授丞敗", 1000, 1000, 50, 50, 15, 15, 0, 0);
		Unit easy_ship = new Unit("旋 穿敗", 2000, 2000, 150, 150, 20, 20, 0, 0);
		Unit normal_ship = new Unit("旋 穿敗", 3000, 3000, 500, 500, 20, 20, 0, 0);
		Unit hard_ship = new Unit("旋 穿敗", 4000, 4000, 700, 700, 20, 20, 0, 0);
		Unit Yamato = new Unit("醤原塘", 10000, 10000, 5000, 5000, 20, 20, 50, 0);
		weather.setDaemon(true);
		go.setDaemon(true);
		time.setDaemon(true);
		weather.start(); // 什掘球 獣拙 採歳
		go.start();
		time.start();

		while (true) {
			System.out.println("敗識 徹酔奄 獣拙馬獣畏柔艦猿?");
			System.out.println("1. 惟績 獣拙          2. 曽戟");
			int a = sc.nextInt();
			if (a == 1) {
				while (true) {

					System.out.println("雁重精 企焼獣焼 殿汝丞敗企拭 敗舌生稽辞 穿紗 壕舛鞠醸柔艦陥.");
					System.out.println("      採巨 戚 懐啄廃 穿戦聖 渋軒稽 戚怪嬢爽淑獣神.");
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
				System.out.println("煽奄 神徹蟹人稽 戚疑掻昔 醤原塘研 幻概柔艦陥.");
				System.out.println("益君蟹 雁重精 牌因乞敗拭 展壱赤柔艦陥.");
				System.out.println("巷醸聖 背醤拝走澗 硝壱域叔依脊艦陥.");
				do {
					Aircraft_Carrier.PlainAttact((Aircraft_Carrier) carrier, Yamato);
				} while (Unit.checkDead(carrier) && Unit.checkDead(Yamato));
				System.out.println("乞窮戚醤奄拭 魁聖 限戚梅柔艦陥.");
				System.out.println("呪壱馬写柔艦陥.");
				break;

			}
			if (true)
				System.out.println("惟績聖 曽戟杯艦陥.");
			break;

		}

	}

}
