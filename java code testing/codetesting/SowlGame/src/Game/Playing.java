package Game;

import java.util.*;

public class Playing {
	public static void main(String[] args) {
		int a;// ù��° if��
		int b;// �ι�° if��
		int c;// ����° if��
		int d;// ���ݹ��
		int att;// ����
		int hp = 500;// ü��
		int tr = 3;// ����
		int oil = 10;// ����
		int str = 50;// ���ݷ�
		int power = 0;// ��ȭȽ��
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
					int sup = 5;// ���
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
							int Ehp = 500;// �� ü��
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
								System.out.println("������ ����, ����, ���� �̷�����ϴ�.");
								try {
									Thread.sleep(500);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
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
										try {
											Thread.sleep(500);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										System.out.println("�������� :" + hp + "��������" + Ehp);
										try {
											Thread.sleep(500);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										System.out.println("1:���� 2:���� 3:��");
										Scanner num1111 = new Scanner(System.in);
										att = num1111.nextInt();
										int sis = 1, rok = 2, pap = 3;
										Random random1 = new Random();
										int com = random1.nextInt(3) + 1;
										if (att == com) {
											System.out.println("���̽��ϴ�.");
											try {
												Thread.sleep(500);
											} catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											System.out.println("�������� :" + hp + "��������" + Ehp);
										} else if ((att == 1 && com == 2) || (att == 2 && com == 3)
												|| (att == 3 && com == 1)) {
											System.out.println("���̽��ϴ�.");
											hp = hp - 50;
											try {
												Thread.sleep(500);
											} catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											System.out.println("�������� :" + hp + "��������" + Ehp);
										} else if ((att == 1 && com == 3) || (att == 2 && com == 1)
												|| (att == 3 && com == 2)) {
											System.out.println("�̱�̽��ϴ�.");
											Ehp = Ehp - str;
											try {
												Thread.sleep(500);
											} catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											System.out.println("�������� :" + hp + "��������" + Ehp);
										}

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
						}

						else if (c == 2) {
							System.out.println("�����մϴ�.");
							hp = 500;
							sup = sup + 2;
							tr--;
							System.out.println("�������� : " + hp + " ����" + tr + "��� �ܷ�" + sup);
						}

						else if (c == 3) {
							System.out.println("��ȭ�մϴ�.");
							if (tr >= 10) {
								tr = tr - 10;
								str = str + 50;
								System.out.println("�����ܷ� " + tr + " ���ݷ� " + str);
							} else if (tr < 10) {
								System.out.println("������ �����մϴ�.");
							}
						}

					}
				}

				else if (b == 2) {
					str = str + 50;
					hp = hp + 500;
					int sub = 15;// ������ ���
					int PlainCount = 0;// �����⸦ ���� Ƚ��
					System.out.println("�������� �����ϼ̽��ϴ�.");
					while (hp > 0) {
						// dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd
						int plain = 2;// ������ ����
						System.out.println("������ �Ͻðڽ��ϱ�?");
						System.out.println("1:��� 2:���� 3:��ȭ");
						Scanner num11 = new Scanner(System.in);
						c = num11.nextInt();

						// ������ ����

						if (c == 1) {
							int Ehp = 500;// �� ü��
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
								System.out.println("������ ����, ����, ���� �̷�����ϴ�.");
								try {
									Thread.sleep(500);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
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
										try {
											Thread.sleep(500);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										System.out.println("�������� :" + hp + "���Լ�" + Ehp);
										try {
											Thread.sleep(500);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										System.out.println("1:���� 2:���� 3:��");
										Scanner num1111 = new Scanner(System.in);
										att = num1111.nextInt();
										int sis = 1, rok = 2, pap = 3;
										Random random1 = new Random();
										int com = random1.nextInt(3) + 1;
										if (att == com) {
											System.out.println("���̽��ϴ�.");
											try {
												Thread.sleep(500);
											} catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											System.out.println("�������� :" + hp + "���Լ�" + Ehp);
										} else if ((att == 1 && com == 2) || (att == 2 && com == 3)
												|| (att == 3 && com == 1)) {
											System.out.println("���̽��ϴ�.");
											hp = hp - 50;
											try {
												Thread.sleep(500);
											} catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											System.out.println("�������� :" + hp + "���Լ�" + Ehp);
										} else if ((att == 1 && com == 3) || (att == 2 && com == 1)
												|| (att == 3 && com == 2)) {
											System.out.println("�̱�̽��ϴ�.");
											Ehp = Ehp - str;
											try {
												Thread.sleep(500);
											} catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											System.out.println("�������� :" + hp + "���Լ�" + Ehp);
										}

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
								System.out.println("�����ܷ� " + tr + " ���ݷ� " + str);
								power++;// ��ȭ Ƚ�� ����
								int reject = 0;// ����
								if (power == 1 && reject == 0) {
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
										reject++;
									}
									// ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd

								}

							} else if (tr < 10) {
								System.out.println("������ �����մϴ�.");
							}
						}

					}
					int battle = 0;// ���� Ƚ��
					int reload;// ���� Ƚ��
					int evadeNum = 3;// ȸ�� ����
					while (power == 1 && hp > 0) {
						System.out.println("������ ����մϴ�.");
						System.out.println("1.���       2.����");
						Scanner num111 = new Scanner(System.in);
						int e = num111.nextInt();
						if (e == 1) {
							System.out.println("����մϴ�.");
							Random random = new Random();
							int data = random.nextInt(3) + 1;
							if (data == 1) {
								System.out.println("�� �Դ�� ������ �����մϴ�.");
								System.out.println("���� ����Ŀ��� ������ �ݵ�� �ʿ��մϴ�.");
								System.out.println("ȸ�� �⵿�� �� �������� 3���� ������ �ֽ��ϴ�.");
								Random random1 = new Random();
								int com = random1.nextInt(3) + 1;
								int shut=1;
								int evade =2;
								int reloadNum=3;
								
								if(4dx) {
									
								}

							}

						} else if (e == 2) {

						}

					} // ���� ������

				}
				// ������ ������ �κ�

			}

			else if (a == 2) {
				System.out.println("�����մϴ�.");
				break;
			}

		}

	}

}