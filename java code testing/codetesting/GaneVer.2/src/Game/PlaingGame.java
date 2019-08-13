package Game;

import java.*;

import ThreadPackage.*;

import java.util.*;

import Ship.*;

public class PlaingGame {
	static Scanner sc = new Scanner(System.in);
	Random _random = new Random();

	public static void battle_choice(boolean a) {
		while (true) {
			if (a == true) {
				System.out.println("渋識馬叔 敗識聖 識澱背爽淑獣推.");
				System.out.println("1 : 姥窒敗");
				int i = sc.nextInt();
				if (i == 1) {
					System.out.println("姥逐敗拭 渋識馬写柔艦陥.");
					break;
				} else
					System.out.println("焼患 赤澗 識澱走拭辞幻 壱牽室推.");
				continue;
			} else if (a == false) {
				System.out.println("渋識馬叔 敗識聖 識澱背爽淑獣推.");
				System.out.println("1 : 姥窒敗        2 : 授丞敗");
				int i = sc.nextInt();
				if (i == 1) {
					System.out.println("姥逐敗拭 渋識馬偲捷艦陥.");
					break;
				} else if (i == 2) {
					System.out.println("授丞敗拭 渋識馬写柔艦陥.");
					break;
				} else
					System.out.println("しししししし鎧亜 杭源拝走 硝走推?しししししし");
				continue;
			}

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
		MyBGM go = new MyBGM();
		Random _random = new Random();
		WeatherThread weather = new WeatherThread(0);
		weather.setDaemon(true);
		// go.setDaemon(true);
		weather.start(); // 什掘球 獣拙 採歳
		// go.start();

		// sorry.start();
		while (true) {
			System.out.println("敗識 徹酔奄 獣拙馬獣畏柔艦猿?");
			System.out.println("1. 惟績 獣拙          2. 曽戟");
			int a = sc.nextInt();
			if (a == 1) {
				while (true) {

					System.out.println("雁重精 企焼獣焼 殿汝丞敗企拭 敗舌生稽辞 穿紗 壕舛鞠醸柔艦陥.");
					System.out.println("      採巨 戚 懐啄廃 穿戦聖 渋軒稽 戚怪嬢爽淑獣神.");
					System.out.println("");

	//				if (destroyer.isPowered()) {
	//					System.out.println("敗舌生稽辞 敗識精 茨虞爽淑獣神.");
	//					System.out.println("1. 姥逐敗");
	//					int b1 = sc.nextInt();
//						if (b1 == 1) {
	//						System.out.println("姥逐敗生稽 伸宿備 穿因聖 歯酔獣奄 郊遇艦陥.");
		//					System.out.println("敗識拭 渋識馬重 依聖 逐馬球験艦陥.");
//							while (true) {
//								System.out.println("");
//								System.out.println("敗舌 誤敬聖 鎧形爽淑獣推.");
//								System.out.println("巷醸聖 馬叔位艦猿?");
//								System.out.println("1. 窒維     2. 左厭     3. 悪鉢");
//								int c1 = sc.nextInt();
//								if (c1 == 1) {
//									int data = _random.nextInt(2) + 1;
//									if (data == 1) {
//										int data1 = _random.nextInt(3) + 1;
//										if (data1 == 1) {
//											do {
//
//												Unit.battle_choice(destroyer, o_destroyer);
//												int ch = sc.nextInt();
//												if (ch == 1) {
//													weather.print();
//													Unit.battle(destroyer, o_destroyer);
//												} else if (ch == 2) {
//													Destroyer.subattact((Destroyer) destroyer, o_destroyer);
//												}
//
//											} while (Unit.checkDead(destroyer) && Unit.checkDead(o_destroyer));
//
//										} else if (data1 == 2) {
//											do {
//												Unit.battle_choice(destroyer, o_destroyer);
//												int ch = sc.nextInt();
//												if (ch == 1) {
//													weather.print();
//													Unit.battle(destroyer, o_destroyer);
//												} else if (ch == 2) {
//													Destroyer.subattact((Destroyer) destroyer, o_destroyer);
//												}
//
//											} while (Unit.checkDead(destroyer) && Unit.checkDead(o_destroyer));
//
//										} else if (data1 == 3) {
//											do {
//												Unit.battle_choice(destroyer, o_destroyer);
//												int ch = sc.nextInt();
//												if (ch == 1) {
//													weather.print();
//													Unit.battle(destroyer, o_destroyer);
//												} else if (ch == 2) {
//													Destroyer.subattact((Destroyer) destroyer, o_destroyer);
//												}
//
//											} while (Unit.checkDead(destroyer) && Unit.checkDead(o_destroyer));
//
//										} else if (data1 == 4) {
//											do {
//												Unit.battle_choice(destroyer, o_cruiser);
//												int ch = sc.nextInt();
//												if (ch == 1) {
//													weather.print();
//													Unit.battle(destroyer, o_cruiser);
//												} else if (ch == 2) {
//													Destroyer.subattact((Destroyer) destroyer, o_cruiser);
//												}
//
//											} while (Unit.checkDead(destroyer) && Unit.checkDead(o_cruiser));
//
//										}
//										if (Unit.checkDead(o_destroyer) == false
//												|| Unit.checkDead(o_cruiser) == false) {
//											Unit.battle_end(destroyer);
//											Unit.reset(o_destroyer);
//											Unit.reset(o_cruiser);
//										} else if (Unit.checkDead(destroyer) == false) {
//											Unit.die(destroyer, cruiser);
//											Unit.reset(o_cruiser);
//											Unit.reset(o_destroyer);
//											break;
//										}
//
//									} else if (data == 2) {
//										Unit.lucky(destroyer);
//									} else if (data == 3) {
//										Unit.un_lucky(destroyer);
//									}
//								} else if (c1 == 2) {
//									Unit.supply(destroyer);
//								} else if (c1 == 3) {
//									Unit.power_up(destroyer, o_destroyer, o_cruiser);
//									if (destroyer.isPowered() == false) {
//										Unit.tutorial(destroyer);
//										break;
//									}
//								}
//							}

//						} if(true)
//							System.out.println("焼艦 走榎精 蕉勺戚戚獣艦 察軒 姥逐敗戚蟹 展辞 失舌馬室推.");
//						continue;

			//		} 
				if (true)
						System.out.println("敗舌生稽辞 敗識精 茨虞爽淑獣神.");
					System.out.println("1. 姥逐敗           2. 授丞敗");
					int b2 = sc.nextInt();
					if (b2 == 1) {
						System.out.println("姥逐敗聖 識澱馬写柔艦陥.");
						System.out.println("姥逐敗生稽 伸宿備 穿因聖 歯酔獣奄 郊遇艦陥.");
						System.out.println("敗識拭 渋識馬重 依聖 逐馬球験艦陥.");
						System.out.println("");
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
											Unit.battle_choice(destroyer, o_destroyer);
											int ch = sc.nextInt();
											if (ch == 1) {
												weather.print();
												Unit.battle(destroyer, o_destroyer);
											} else if (ch == 2) {
												Destroyer.subattact((Destroyer) destroyer, o_destroyer);
											}

										} while (Unit.checkDead(destroyer) && Unit.checkDead(o_destroyer));

									} else if (data1 == 2) {
										do {
											Unit.battle_choice(destroyer, o_destroyer);
											int ch = sc.nextInt();
											if (ch == 1) {
												weather.print();
												Unit.battle(destroyer, o_destroyer);
											} else if (ch == 2) {
												Destroyer.subattact((Destroyer) destroyer, o_destroyer);
											}

										} while (Unit.checkDead(destroyer) && Unit.checkDead(o_destroyer));

									} else if (data1 == 3) {
										do {
											Unit.battle_choice(destroyer, o_destroyer);
											int ch = sc.nextInt();
											if (ch == 1) {
												weather.print();
												Unit.battle(destroyer, o_destroyer);
											} else if (ch == 2) {
												Destroyer.subattact((Destroyer) destroyer, o_destroyer);
											}

										} while (Unit.checkDead(destroyer) && Unit.checkDead(o_destroyer));

									} else if (data1 == 4) {
										do {
											Unit.battle_choice(destroyer, o_cruiser);
											int ch = sc.nextInt();
											if (ch == 1) {
												weather.print();
												Unit.battle(destroyer, o_cruiser);
											} else if (ch == 2) {
												Destroyer.subattact((Destroyer) destroyer, o_cruiser);
											}

										} while (Unit.checkDead(destroyer) && Unit.checkDead(o_cruiser));

									}
									if (Unit.checkDead(o_destroyer) == false || Unit.checkDead(o_cruiser) == false) {
										Unit.battle_end(destroyer);
										Unit.reset(o_destroyer);
										Unit.reset(o_cruiser);
									} else if (Unit.checkDead(destroyer) == false) {
										Unit.die(destroyer, cruiser);
										Unit.reset(o_cruiser);
										Unit.reset(o_destroyer);
										break;
									}

								} else if (data == 2) {
									Unit.lucky(destroyer);
								} else if (data == 3) {
									Unit.un_lucky(destroyer);
								}
							} else if (c1 == 2) {
								Unit.supply(destroyer);
							} else if (c1 == 3) {
								Unit.power_up(destroyer, o_destroyer, o_cruiser);
							}
						}

					} else if (b2 == 2) {
						System.out.println("授丞敗聖 識澱馬写柔艦陥.");
						System.out.println("授丞敗生稽 伸宿備 穿因聖 歯酔獣奄 郊遇艦陥.");
						System.out.println("敗識拭 渋識馬重 依聖 逐馬球験艦陥.");
						System.out.println("");
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
											Unit.battle_choice(cruiser, o_destroyer);
											int ch = sc.nextInt();
											if (ch == 1) {
												weather.print();
												Unit.battle(cruiser, o_destroyer);
											} else if (ch == 2) {
												Cruiser.plainFihgt((Cruiser) cruiser, o_destroyer);
											}

										} while (Unit.checkDead(cruiser) && Unit.checkDead(o_destroyer));

									} else if (data1 == 2) {
										do {
											Unit.battle_choice(cruiser, o_cruiser);
											int ch = sc.nextInt();
											if (ch == 1) {
												weather.print();
												Unit.battle(cruiser, o_cruiser);
											} else if (ch == 2) {
												Cruiser.plainFihgt((Cruiser) cruiser, o_cruiser);
											}

										} while (Unit.checkDead(cruiser) && Unit.checkDead(o_cruiser));

									} else if (data1 == 3) {
										do {
											Unit.battle_choice(cruiser, o_cruiser);
											int ch = sc.nextInt();
											if (ch == 1) {
												weather.print();
												Unit.battle(cruiser, o_cruiser);
											} else if (ch == 2) {
												Cruiser.plainFihgt((Cruiser) cruiser, o_cruiser);
											}

										} while (Unit.checkDead(cruiser) && Unit.checkDead(o_cruiser));

									} else if (data1 == 4) {
										do {
											Unit.battle_choice(cruiser, o_cruiser);
											int ch = sc.nextInt();
											if (ch == 1) {
												weather.print();
												Unit.battle(cruiser, o_cruiser);
											} else if (ch == 2) {
												Cruiser.plainFihgt((Cruiser) cruiser, o_cruiser);
											}

										} while (Unit.checkDead(cruiser) && Unit.checkDead(o_cruiser));

									}
									if (Unit.checkDead(o_destroyer) == false || Unit.checkDead(o_cruiser) == false) {
										Unit.battle_end(cruiser);
										Cruiser.recharge((Cruiser) cruiser);
										Unit.reset(o_destroyer);
										Unit.reset(o_cruiser);
										if (((Cruiser) cruiser).up_grade() && Cruiser.air_deney == true) {
											Cruiser.air_convert(cruiser);
											int air = sc.nextInt();
											if (air == 1) {
												Cruiser.air_agree(cruiser);
												break;
											} else if (air == 2) {
												Cruiser.air_reject((Cruiser) cruiser);
												continue;
											}
										}

									} else if (Unit.checkDead(cruiser) == false) {
										Unit.die(cruiser, destroyer);
										Cruiser.recharge((Cruiser) cruiser);
										Unit.reset(o_cruiser);
										Unit.reset(o_destroyer);

									}

								} else if (data == 2) {
									Unit.lucky(cruiser);
								} else if (data == 3) {
									Unit.un_lucky(cruiser);
								}
							} else if (c1 == 2) {
								Unit.supply(cruiser);
							} else if (c1 == 3) {
								Unit.power_up(cruiser, o_destroyer, o_cruiser);
								if (cruiser.isPowered() == false) {
									Unit.level_up(cruiser);
									int ba = sc.nextInt();
									if (ba == 1) {
										System.out.println("採巨 臣郊献 衣引研 鎧爽獣奄 郊遇艦陥.");
										break;
									} else if (ba == 2) {
										System.out.println("神酔 政逢脊艦陥.");
										System.out.println("採巨 陥製拭澗 持唖戚 含虞走獣掩 郊遇艦陥.");
										continue;
									}
								}

							}
						}
						if (cruiser.isChoice() == false) {
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
											Aircraft_Carrier.PlainAttact((Aircraft_Carrier) carrier, easy_ship);
										} while (Unit.checkDead(carrier) && Unit.checkDead(easy_ship));
									} else if (r == 2) {
										do {
											Aircraft_Carrier.PlainAttact((Aircraft_Carrier) carrier, normal_ship);
										} while (Unit.checkDead(carrier) && Unit.checkDead(normal_ship));
									} else if (r == 3) {
										do {
											Aircraft_Carrier.PlainAttact((Aircraft_Carrier) carrier, hard_ship);
										} while (Unit.checkDead(carrier) && Unit.checkDead(hard_ship));
									}

								}
								if (Unit.checkDead(easy_ship) == false || Unit.checkDead(normal_ship) == false
										|| Unit.checkDead(hard_ship) == false) {
									Unit.battle_end(carrier);
									Unit.reset(easy_ship);
									Unit.reset(normal_ship);
									Unit.reset(hard_ship);
								} else if (Unit.checkDead(carrier) == false) {
									Unit.die(carrier, destroyer);
									Unit.reset(easy_ship);
									Unit.reset(normal_ship);
									Unit.reset(hard_ship);
									break;
								} else if (b == 2) {
									Aircraft_Carrier.refitment((Aircraft_Carrier) carrier);

								}

							}

						} else if (cruiser.isChoice()) {
							System.out.println("穿敗生稽税 壕紗戚 溌昔 鞠写柔艦陥.");
							System.out.println("域紗 毘鎧爽室推~~~");
							while (true) {
								System.out.println("敗舌生稽辞税 誤敬聖 採店球験艦陥.");
								System.out.println("1. 窒維                    2. 左厭");

								int l = sc.nextInt();
								if (l == 1) {
									int data1 = _random.nextInt(3) + 1;
									if (data1 == 1) {
										do {
											weather.print();
											Unit.battle(battleship, o_destroyer);

										} while (Unit.checkDead(battleship) && Unit.checkDead(o_destroyer));

									} else if (data1 == 2) {
										do {
											weather.print();
											Unit.battle(battleship, o_destroyer);

										} while (Unit.checkDead(battleship) && Unit.checkDead(o_destroyer));

									} else if (data1 == 3) {
										do {
											weather.print();
											Unit.battle(battleship, o_destroyer);

										} while (Unit.checkDead(battleship) && Unit.checkDead(o_destroyer));

									} else if (data1 == 4) {
										do {
											weather.print();
											Unit.battle(battleship, o_cruiser);

										} while (Unit.checkDead(battleship) && Unit.checkDead(o_cruiser));

									}
									if (Unit.checkDead(o_destroyer) == false || Unit.checkDead(o_cruiser) == false) {
										Unit.battle_end(battleship);
										Unit.reset(o_destroyer);
										Unit.reset(o_cruiser);
									} else if (Unit.checkDead(battleship) == false) {
										Unit.die(battleship, cruiser);
										Unit.reset(o_cruiser);
										Unit.reset(o_destroyer);
										break;
									}

								} else if (l == 2) {
									Unit.supply(battleship);
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
									Unit.battle(battleship, Yamato);

								} while (Unit.checkDead(battleship) && Unit.checkDead(Yamato));
								if (Unit.checkDead(Yamato) == false) {
									Unit.battle_end(battleship);
									Unit.reset(o_destroyer);
									Unit.reset(o_cruiser);
								} else if (Unit.checkDead(battleship) == false) {
									Unit.die(destroyer, cruiser);
									Unit.reset(o_cruiser);
									Unit.reset(o_destroyer);
									continue;
								}
							}

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
	
	}
			if(true)
				System.out.println("惟績聖 曽戟杯艦陥.");
			break;

}

}
}
