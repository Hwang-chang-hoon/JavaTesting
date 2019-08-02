package Game;

import java.*;

import ThreadPackage.*;

import java.util.*;

import Ship.*;

public class PlaingGame {
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
		MyBGM go = new MyBGM();
		Random _random = new Random();
		WeatherThread weather = new WeatherThread(0);
		weather.setDaemon(true) ;
		go.setDaemon(true) ;
		weather.start(); // 스래드 시작 부분
		go.start();
		
		// sorry.start();
		while (true) {
			System.out.println("함선 키우기 시작하시겠습니까?");
			System.out.println("1. 게임 시작          2. 종료");
			int a = sc.nextInt();
			if (a == 1) {
				while (true) {
				
					System.out.println("당신은 대아시아 태평양함대에 함장으로서 전속 배정되었습니다.");
					System.out.println("      부디 이 끔찍한 전쟁을 승리로 이끌어주십시오.");
					System.out.println("");

					if (destroyer.isPowered()) {
						System.out.println("함장으로서 함선은 골라주십시오.");
						System.out.println("1. 구축함");
						int b1 = sc.nextInt();
						if (b1 == 1) {
							System.out.println("구축함으로 열심히 전공을 새우시기 바랍니다.");
							System.out.println("함선에 승선하신 것을 축하드립니다.");
							while (true) {
								System.out.println("");
								System.out.println("함장 명령을 내려주십시요.");
								System.out.println("무었을 하실겁니까?");
								System.out.println("1. 출격     2. 보급     3. 강화");
								int c1 = sc.nextInt();
								if (c1 == 1) {
									int data = _random.nextInt(2) + 1;
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
										if (Unit.checkDead(o_destroyer) == false
												|| Unit.checkDead(o_cruiser) == false) {
											Unit.battle_end(destroyer);
											Unit.reset(o_destroyer);
											Unit.reset(o_cruiser);
										} else if (Unit.checkDead(destroyer) == false) {
											Unit.die(destroyer);
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
									if (destroyer.isPowered() == false) {
										Unit.tutorial(destroyer);
										break;
									}
								}
							}

						} else
							System.out.println("아니 지금은 애송이이시니 빨리 구축함이나 타서 성장하세요.");
						continue;
					} else
						System.out.println("함장으로서 함선은 골라주십시오.");
					System.out.println("1. 구축함           2. 순양함");
					int b2 = sc.nextInt();
					if (b2 == 1) {
						System.out.println("구축함을 선택하셨습니다.");
						System.out.println("구축함으로 열심히 전공을 새우시기 바랍니다.");
						System.out.println("함선에 승선하신 것을 축하드립니다.");
						System.out.println("");
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
										Unit.die(destroyer);
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
						System.out.println("순양함을 선택하셨습니다.");
						System.out.println("순양함으로 열심히 전공을 새우시기 바랍니다.");
						System.out.println("함선에 승선하신 것을 축하드립니다.");
						System.out.println("");
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
										Unit.die(cruiser);
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
										System.out.println("부디 올바른 결과를 내주시기 바랍니다.");
										break;
									} else if (ba == 2) {
										System.out.println("오우 유갑입니다.");
										System.out.println("부디 다음에는 생각이 달라지시길 바랍니다.");
										continue;
									}
								}

							}
						}
						if (cruiser.isChoice() == false) {
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
									Unit.die(carrier);
									Unit.reset(easy_ship);
									Unit.reset(normal_ship);
									Unit.reset(hard_ship);
									break;
								} else if (b == 2) {
									Aircraft_Carrier.refitment((Aircraft_Carrier) carrier);

								}

							}

						} else if (cruiser.isChoice()) {
							System.out.println("전함으로의 배속이 확인 되셨습니다.");
							System.out.println("계속 힘내주세요~~~");
							while (true) {
								System.out.println("함장으로서의 명령을 부탁드립니다.");
								System.out.println("1. 출격                    2. 보급");
								if (Aircraft_Carrier.upGrade_Count >= 1) {
									System.out.println("전함으로 야마토를 만났습니다.");
									System.out.println("악몽이 따로없군요.");
									System.out.println("행운을 빕니다.");
									do {
										Unit.battle(battleship, Yamato);

									} while (Unit.checkDead(battleship) && Unit.checkDead(Yamato));
									if (Unit.checkDead(Yamato) == false) {
										Unit.battle_end(battleship);
										Unit.reset(o_destroyer);
										Unit.reset(o_cruiser);
									} else if (Unit.checkDead(battleship) == false) {
										Unit.die(destroyer);
										Unit.die(cruiser);
										Unit.reset(o_cruiser);
										Unit.reset(o_destroyer);
										continue;
									}
								}
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
										Unit.die(battleship);
										Unit.reset(o_cruiser);
										Unit.reset(o_destroyer);
										break;
									}

								} else if (l == 2) {
									Unit.supply(battleship);
									Aircraft_Carrier.upGrade_Count++;
								}
							}

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
			

			}

			else
				System.out.println("게임을 종료합니다.");
			break;
		}

	}
}
