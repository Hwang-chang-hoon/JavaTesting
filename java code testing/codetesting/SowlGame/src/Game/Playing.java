package Game;

import java.util.*;

public class Playing {
	public static void main(String[] args) {
		int a;// 첫번째 if문
		int b;// 두번째 if문
		int c;// 세번째 if문
		int d;//공격방식
		int att;// 공격
		int hp = 500;// 체력
		int tr = 3;//보물
		int oil = 10;//연료
		int str = 50;//공격력
		while(hp>=0) {
			System.out.println("게임 스타트");
			System.out.println("1:실행 2 종료");
			Scanner num = new Scanner(System.in);
			a = num.nextInt();
			// 시작

			if (a == 1) {
				System.out.println("실행합니다.");
				try {
					Thread.sleep(500);
				}catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("합선을 선택해주세요");
				try {
					Thread.sleep(500);
				}catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("1:구축함 2:순양함 ");
				Scanner num1 = new Scanner(System.in);
				b = num1.nextInt();
				// 구축 순양선택

				if (b == 1) {
					int sup=5;//어뢰
					System.out.println("구축함을 선책하셨습니다.");
					while (hp > 0) {
						try {
							Thread.sleep(500);
						}catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("무엇을 하시겠습니까?");
						try {
							Thread.sleep(500);
						}catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("1:출격 2:보급 3:강화");
						Scanner num11 = new Scanner(System.in);
						c = num11.nextInt();

						// 구축시작

						if (c == 1) {
							int Ehp = 500;// 적 체력
							System.out.println("출격합니다.");
							Random random = new Random();
							int data = random.nextInt(3) + 1;

							if (data == 1) {
								try {
									Thread.sleep(500);
								}catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("적과 조우하였습니다.");
								try {
									Thread.sleep(500);
								}catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("전투 준비");
								try {
									Thread.sleep(500);
								}catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("전투는 가위, 바위, 보로 이루어집니다.");
								try {
									Thread.sleep(500);
								}catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("전투를 시작합니다.");
								do {
									try {
										Thread.sleep(500);
									}catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println("1:기본공격 2:특수공격");
									Scanner num111 = new Scanner(System.in);
									d=num111.nextInt();
									if(d==1) {
										try {
											Thread.sleep(500);
										}catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										System.out.println("내구축함 :" + hp + "적구축함" + Ehp);
										try {
											Thread.sleep(500);
										}catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										System.out.println("1:가위 2:바위 3:보");
										Scanner num1111 = new Scanner(System.in);
										att = num1111.nextInt();
										int sis = 1, rok = 2, pap = 3;
										Random random1 = new Random();
										int com = random1.nextInt(3) + 1;
										if (att == com) {
											System.out.println("비기셨습니다.");
											try {
												Thread.sleep(500);
											}catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											System.out.println("내구축함 :" + hp + "적구축함" + Ehp);
										} else if ((att == 1 && com == 2) || (att == 2 && com == 3) || (att == 3 && com == 1)) {
											System.out.println("지셨습니다.");
											hp = hp - 50;
											try {
												Thread.sleep(500);
											}catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											System.out.println("내구축함 :" + hp + "적구축함" + Ehp);
										} else if ((att == 1 && com == 3) || (att == 2 && com == 1) || (att == 3 && com == 2)) {
											System.out.println("이기셨습니다.");
											Ehp = Ehp - str;
											try {
												Thread.sleep(500);
											}catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											System.out.println("내구축함 :" + hp + "적구축함" + Ehp);
										}

									}
									else if (d==2) {
										if(sup>0) {
											sup--;
											System.out.println("어뢰를 발사합니다. ");
											try {
												Thread.sleep(500);
											}catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											System.out.println("어뢰잔량"+sup);
											Random random11 = new Random();
											int data1 = random11.nextInt(4) + 1;
											if(data1==1) {
												try {
													Thread.sleep(500);
												}catch (InterruptedException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												System.out.println("어뢰가 적중합니다.");
												try {
													Thread.sleep(500);
												}catch (InterruptedException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												System.out.println("적탄실에 적중했습니다!!!!");
												try {
													Thread.sleep(500);
												}catch (InterruptedException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												System.out.println("유폭이 발생했습니다!!!!!!!!!!");
												Ehp=Ehp-450;
												if (Ehp<0) {
													Ehp=0;
												}
												System.out.println("적 함선 : "+Ehp);
											}
											else if (data1==2) {
												System.out.println("어뢰가 영~ 좋지 못한 곳을 스칩니다.");
												System.out.println("대미지는 입어드릴께요");
												Ehp=Ehp-100;
												if (Ehp<0) {
													Ehp=0;
												}
												System.out.println("적 함선 : "+Ehp);
											}
											else if (data1==3) {
												System.out.println("적은 현란한 무빙으로 어뢰를 피해갑니다.");
												System.out.println("단 1의 피해도 입히지 못하였습니다.");
											}
											else if (data1==4) {
												System.out.println("해류가 심해서 어뢰가 모두 잘못된 방향으로 나갑니다.");
												System.out.println("적 합선이 당신의 조준실력에 비웃음을 보냅니다.");
											}

										}
										else if (sup<=0) {
											System.out.println("어뢰의 잔량이 없습니다.");
										}

									}

								} while (hp > 0 && Ehp > 0);//전투 끝지점
								
								if(Ehp==0&&hp>0) {
									tr=tr+3;
									System.out.println("전투에서 승리하셨습니다.");
									System.out.println("내구축함 : "+hp+" 자제 : "+ tr );
								}
							}

							else if (data == 2) {
								System.out.println("보물이다!!!!");
								tr++;
								System.out.println("내 구축함 : "+hp+" 자제"+tr);
							}

							else if (data == 3) {
								System.out.println("허탕이다~~~~");

							}
						}

						else if (c == 2) {
							System.out.println("보급합니다.");
							hp = 500;
							sup=sup+2;
							tr--;
							System.out.println("내구축함 : "+hp+" 자제"+tr+"어뢰 잔량"+sup);
						}

						else if (c == 3) {
							System.out.println("강화합니다.");
							if(tr>=10) {
								tr=tr-10;
								str=str+50;
								System.out.println("자재잔량 "+tr+" 공격력 "+str);
							}
							else if (tr<10) {
								System.out.println("자제가 부족합니다.");
							}
						}

					}
				}

				else if (b == 2) {
					str=str+50;
					System.out.println("순양합을 선택하셨습니다.");
					while (hp > 0) {
						oil = 10;
						System.out.println("무엇을 하시겠습니까?");
						System.out.println("1:출격 2:수리 3:강화");
						Scanner num11 = new Scanner(System.in);
						c = num11.nextInt();

						// 구축시작

						if (c == 1) {
							int Ehp = 500;// 적 체력
							System.out.println("출격합니다.");
							Random random = new Random();
							int data = random.nextInt(3) + 1;

							if (data == 1) {
								System.out.println("적과 조우하였습니다.");
								System.out.println("전투 준비");
								System.out.println("전투는 가위, 바위, 보로 이루어집니다.");
								System.out.println("전투를 시작합니다.");
								do {
									System.out.println("내순양함 :" + hp + "적구축함" + Ehp);
									System.out.println("1:가위 2:바위 3:보");
									Scanner num111 = new Scanner(System.in);
									att = num111.nextInt();
									int sis = 1, rok = 2, pap = 3;
									Random random1 = new Random();
									int com = random.nextInt(3) + 1;
									if (att == com) {
										System.out.println("비기셨습니다.");
									} else if ((att == 1 && com == 2) || (att == 2 && com == 3) || (att == 3 && com == 1)) {
										System.out.println("지셨습니다.");
										hp = hp - 50;
									} else if ((att == 1 && com == 3) || (att == 2 && com == 1) || (att == 3 && com == 2)) {
										System.out.println("이기셨습니다.");
										Ehp = Ehp - str;
									}

								} while (hp > 0 && Ehp > 0);

								if(Ehp==0&&hp>0) {
									tr=tr+3;
									System.out.println("내순양함 : "+hp+"자제 : "+tr);
								}

							}

							else if (data == 2) {
								System.out.println("보물이다!!!!");
								tr++;
								System.out.println("내 순양함 : "+hp+"자제"+tr);
							}

							else if (data == 3) {
								System.out.println("허탕이다~~~~");

							}
						}

						else if (c == 2) {
							System.out.println("수리합니다.");
							hp = 500;
							tr--;
							System.out.println("내순양함 : "+hp+" 자제 "+tr);
						}

						else if (c == 3) {
							System.out.println("강화합니다.");
							if(tr>=10) {
								tr=tr-10;
								str=str+50;
								System.out.println("자재잔량 "+tr+" 공격력 "+str);
							}
							else if (tr<10) {
								System.out.println("자제가 부족합니다.");
							}
						}

					}
				}

			}

			else if (a == 2) {
				System.out.println("종료합니다.");
				break;
			}

		}

	}

	private static void sleep(int i) {
		// TODO Auto-generated method stub

	}

}