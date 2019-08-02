package Game;

import java.*;

import ThreadPackage.*;

import java.util.*;

import Ship.*;

public class PlaingGame {
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
		MyBGM go = new MyBGM();
		Random _random = new Random();
		WeatherThread weather = new WeatherThread(0);
		weather.setDaemon(true) ;
		go.setDaemon(true) ;
		weather.start(); // ������ ���� �κ�
		go.start();
		
		// sorry.start();
		while (true) {
			System.out.println("�Լ� Ű��� �����Ͻðڽ��ϱ�?");
			System.out.println("1. ���� ����          2. ����");
			int a = sc.nextInt();
			if (a == 1) {
				while (true) {
				
					System.out.println("����� ��ƽþ� ������Դ뿡 �������μ� ���� �����Ǿ����ϴ�.");
					System.out.println("      �ε� �� ������ ������ �¸��� �̲����ֽʽÿ�.");
					System.out.println("");

					if (destroyer.isPowered()) {
						System.out.println("�������μ� �Լ��� ����ֽʽÿ�.");
						System.out.println("1. ������");
						int b1 = sc.nextInt();
						if (b1 == 1) {
							System.out.println("���������� ������ ������ ����ñ� �ٶ��ϴ�.");
							System.out.println("�Լ��� �¼��Ͻ� ���� ���ϵ帳�ϴ�.");
							while (true) {
								System.out.println("");
								System.out.println("���� ����� �����ֽʽÿ�.");
								System.out.println("������ �Ͻǰ̴ϱ�?");
								System.out.println("1. ���     2. ����     3. ��ȭ");
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
							System.out.println("�ƴ� ������ �ּ����̽ô� ���� �������̳� Ÿ�� �����ϼ���.");
						continue;
					} else
						System.out.println("�������μ� �Լ��� ����ֽʽÿ�.");
					System.out.println("1. ������           2. ������");
					int b2 = sc.nextInt();
					if (b2 == 1) {
						System.out.println("�������� �����ϼ̽��ϴ�.");
						System.out.println("���������� ������ ������ ����ñ� �ٶ��ϴ�.");
						System.out.println("�Լ��� �¼��Ͻ� ���� ���ϵ帳�ϴ�.");
						System.out.println("");
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
						System.out.println("�������� �����ϼ̽��ϴ�.");
						System.out.println("���������� ������ ������ ����ñ� �ٶ��ϴ�.");
						System.out.println("�Լ��� �¼��Ͻ� ���� ���ϵ帳�ϴ�.");
						System.out.println("");
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
										System.out.println("�ε� �ùٸ� ����� ���ֽñ� �ٶ��ϴ�.");
										break;
									} else if (ba == 2) {
										System.out.println("���� �����Դϴ�.");
										System.out.println("�ε� �������� ������ �޶����ñ� �ٶ��ϴ�.");
										continue;
									}
								}

							}
						}
						if (cruiser.isChoice() == false) {
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
							System.out.println("���������� ����� Ȯ�� �Ǽ̽��ϴ�.");
							System.out.println("��� �����ּ���~~~");
							while (true) {
								System.out.println("�������μ��� ����� ��Ź�帳�ϴ�.");
								System.out.println("1. ���                    2. ����");
								if (Aircraft_Carrier.upGrade_Count >= 1) {
									System.out.println("�������� �߸��並 �������ϴ�.");
									System.out.println("�Ǹ��� ���ξ�����.");
									System.out.println("����� ���ϴ�.");
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
			

			}

			else
				System.out.println("������ �����մϴ�.");
			break;
		}

	}
}
