package Game;

import java.util.*;

public class Playing {
	public static void main(String[] args) {
		int a;// 첫번째 if문
		int b;// 두번째 if문
		int c;// 세번째 if문
		int d;// 공격방식
		int att;// 공격
		int reload = 0;// 장전
		int comreload = 0;// 컴퓨터 장전
		int hp = 500;// 체력
		int Ehp = 500;// 적 체력
		int tr = 3;// 보물
		int oil = 10;// 연료
		int Eoil = 10;// 적 연료
		int str = 50;// 공격력
		int Estr = 50;
		int power = 0;// 강화횟수
		int airSuc = 0;// 항공공격 선택
		int plain = 2;// 함제기 수량
		int sup = 5;// 어뢰
		int Yhp = 10000;
		int Ystr = 5000;
		int tuto = 0;
		int tutoEnd = 0;
		int reject1 = 0;// 거절
		int reject2 = 0;// 거절
		while (hp >= 0) {
			System.out.println("게임 스타트");
			System.out.println("1:실행 2 종료");
			Scanner num = new Scanner(System.in);
			a = num.nextInt();
			// 시작

			if (a == 1) {
				System.out.println("실행합니다.");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("합선을 선택해주세요");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("1:구축함 2:순양함 ");
				Scanner num1 = new Scanner(System.in);
				b = num1.nextInt();
				// 구축 순양선택

				if (b == 1) {
					System.out.println("구축함을 선책하셨습니다.");
					while (hp > 0) {
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("무엇을 하시겠습니까?");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("1:출격 2:보급 3:강화");
						Scanner num11 = new Scanner(System.in);
						c = num11.nextInt();

						// 구축시작

						if (c == 1) {

							System.out.println("출격합니다.");
							Random random = new Random();
							int data = random.nextInt(3) + 1;

							if (data == 1) {
								Ehp = 500;// 적 체력
								Eoil = 10;// 적 연료
								comreload = 0;
								try {
									Thread.sleep(500);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("적과 조우하였습니다.");
								try {
									Thread.sleep(500);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("전투 준비");
								try {
									Thread.sleep(500);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("전투를 시작합니다.");
								System.out.println("전투는 발포와 회피로 피해를 조정합니다.");
								System.out.println("회피는 " + oil + "번 가능합니다");
								System.out.println("발포를 한 후는 장전을 해야합니다.");
								System.out.println("장전을 많이하면 많이할수록 대미지가 큽니다.");

								do {
									try {
										Thread.sleep(500);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println("1:기본공격 2:특수공격");
									Scanner num111 = new Scanner(System.in);
									d = num111.nextInt();
									if (d == 1) {
										System.out.println("전투를 진행합니다.");
										System.out.println("지휘를 내려주십시요");
										System.out.println("1.발포 2.회피 3.장전 ");
										Scanner num1111 = new Scanner(System.in);
										int e = num1111.nextInt();
										Random random1 = new Random();
										int com = random1.nextInt(3) + 1;
										// 1
										if (e == 1 && com == 1 && reload > 0 && comreload > 0) {
											System.out.println("서로가 서로에게 발포를 합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (Estr * comreload);
											Ehp -= (str * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											reload = 0;
											comreload = 0;
										} // 서로 발포
											// 2
										else if (e == 1 && com == 1 && reload > 0 && comreload == 0) {
											System.out.println("역시 AI는 아직 인간을 뛰어넘지 못합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											Ehp -= (str * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											reload = 0;
											comreload = 0;
										} // 나만 장전
											// 3
										else if (e == 1 && com == 1 && reload == 0 && comreload == 0) {
											System.out.println("장전이 준비되지않았습니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											reload = 0;
											comreload = 0; 
										} // 서로 장전 X
											// 4
										else if (e == 1 && com == 1 && reload == 0 && comreload > 0) {
											System.out.println("장전이 준비되지않았습니다.");
											System.out.println("그런대 상대방은 전투의 준비가 끝난모양이군요.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (Estr * comreload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											reload = 0;
											comreload = 0;
										} // 상대만 장전
											// 5
										else if (e == 1 && com == 2 && reload > 0 && reload < 3 && Eoil > 0) {
											System.out.println("발포합니다.");
											System.out.println("적이 회피기동은 사용하였습니다.");
											System.out.println("한발도 맞지 않았습니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											Eoil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											reload = 0;
										} // 나 발포 상대 회피
											// 6
										else if (e == 1 && com == 2 && reload >= 3 && Eoil > 0) {
											System.out.println("발포합니다.");
											System.out.println("적이 회피기동은 사용하였습니다.");
											System.out.println("장전이 많이 되어 탄막이 충분히 형성되었습니다.");
											System.out.println("피해를 조금 입힙니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											Ehp -= (str * (reload / 3));
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											reload = 0;
										} // 나 발포 성공 상대 회피
											// 7
										else if (e == 1 && com == 2 && reload > 0 && reload < 3 && Eoil == 0) {
											System.out.println("발포합니다.");
											System.out.println("적이 멍청하게도 회피를 사용못하는데 회피기동을 명령했습니다.");
											System.out.println("피해를 입힙니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											Ehp -= (str * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											reload = 0;
										} // 나발포 상대 회피불가
											// 8
										else if (e == 1 && com == 2 && reload == 0 && Eoil > 0) {
											System.out.println("포대에 포탄이 없습니다.");
											System.out.println("상대는 겁을먹고 회피기동을 시행합니다.");
											System.out.println("피해를 입히지도 입지도 않았습니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											Eoil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나 발포 준비 X상대 회피
											// 9
										else if (e == 1 && com == 2 && reload == 0 && Eoil == 0) {
											System.out.println("포대에 포탄 없습니다.");
											System.out.println("상대도 준비가 안된상태로 회피기동합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나발포 준비 안됨 산대 회피 불가
											// 10
										else if (e == 1 && com == 3 && reload > 0) {
											System.out.println("발포합니다.");
											System.out.println("적은 장전중입니다.");
											System.out.println("프리딜타임~~");
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											Ehp -= (str * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											reload = 0;
										} // 나발포 상대장전
											// 11
										else if (e == 1 && com == 3 && reload == 0) {
											System.out.println("포대에 포탄이 없습니다.");
											System.out.println("상대는 전투를 준비하는군요.");
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 : " + hp + "컴퓨터꺼 : " + Ehp);
										} // 나 발포불가 상대장전
											// 12
										else if (e == 2 && com == 1 && oil > 0 && comreload > 0 && comreload < 3) {
											System.out.println("회피기동을 합니다.");
											System.out.println("상대는 발포했습니다.");
											System.out.println("상대의 탄을 소비합니다.");
											System.out.println("아주 좋소.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											oil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											comreload = 0;
										} // 나 회피 상대 발포
											// 13
										else if (e == 2 && com == 1 && oil > 0 && comreload >= 3) {
											System.out.println("회피기동을 합니다.");
											System.out.println("적기에서 도저히 회피할 수 없는 탄막이 나라옵니다.");
											System.out.println("부디 피해가 경미하기만을 기도합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											oil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (Estr * (comreload / 3));
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											comreload = 0;
										} // 나 회피 상대 3번모아 발포
											// 14
										else if (e == 2 && com == 1 && oil > 0 && comreload == 0) {
											System.out.println("회피기동을 시행합니다.");
											System.out.println("상대도 발포를 하려합니다.");
											System.out.println("그런대 탄이 발사되지 않았습니다.");
											System.out.println("역시 인간은 위대합니다(푸흡)");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											oil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											comreload = 0;
										} // 나 회피 상대 발포 실패
											// 15
										else if (e == 2 && com == 2 && oil == 0 && comreload > 0) {
											System.out.println("회피기동을 실시 합니다.");
											System.out.println(".");
											System.out.println(".");
											System.out.println(".");
											System.out.println("아니 안되잖아?");
											System.out.println("회피가 안되");
											System.out.println("아...안되....");
											System.out.println("앙돼");
											System.out.println("으아아아아아ㅏ아아아아ㅏ아아아아앙");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (Estr * comreload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											comreload = 0;
										} // 나 회피 불가 상대 발포 성공
											// 16
										else if (e == 2 && com == 1 && oil == 0 && comreload == 0) {
											System.out.println("둘다 바보입니다.");
											System.out.println("제발 자신의 적제량을 확인하세요.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											comreload = 0;
										} // 나 회피 불가 상대 발포 실패
											// 17
										else if (e == 2 && com == 2 && oil > 0 && Eoil > 0) {
											System.out.println("회피기동을 합니다.");
											System.out.println("상대도 회피기동을 합니다.");
											System.out.println("아까운 기름만 날렸군요.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나 회피 상대 회피
											// 18
										else if (e == 2 && com == 2 && oil == 0 && Eoil > 0) {
											System.out.println("기름없습니다.");
											System.out.println("상대방도 허공에 기름을 낭비하는군요.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											Eoil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나 회피 불가 상대 회피 가능
											// 19
										else if (e == 2 && com == 2 && oil > 0 && Eoil == 0) {
											System.out.println("회피 기동을 실시합니다.");
											System.out.println("상대는 기름이 다떨어졌습니다.");
											System.out.println("기름만 낭비하셨군요?");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											oil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나회피가능 상대회피 불가
											// 20
										else if (e == 2 && com == 2 && oil == 0 && Eoil == 0) {
											System.out.println("기름이 부족하다고");
											System.out.println("상대도 부족합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나회피불가 산대 회피불가
											// 21
										else if (e == 2 && com == 3 && oil > 0) {
											System.out.println("회피기동을 시도합니다.");
											System.out.println("상대는 장전합니다.");
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나 회피 상대 장전
											// 22
										else if (e == 2 && com == 3 && oil == 0) {
											System.out.println("회피기동이 기름이 없어서 실패했습니다.");
											System.out.println("상대는 장전하여 더강한 공격력을 보유합니다.");
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나 회피불가 상대 장전
											// 23
										else if (e == 3 && com == 1 && comreload > 0) {
											System.out.println("장전 합니다.");
											System.out.println("상대는 발포합니다.");
											System.out.println("걍 쳐 맞으세여");
											reload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (Estr * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											comreload = 0;
										} // 나 장전 상대 발싸
											// 24
										else if (e == 3 && com == 1 && comreload == 0) {
											System.out.println("장전을 합니다.");
											System.out.println("상대는 장전의 중요성을 모르는 모양입니다.");
											reload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나 장전 상대 발포실패
											// 25
										else if (e == 3 && com == 2 && Eoil > 0) {
											System.out.println("장전을 합니다. ");
											System.out.println("상대는 회피기동을 합니다.");
											System.out.println("상대는 기름을 허공에 뿌렸습니다.");
											reload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											Eoil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나 장전 상대 회피
											// 26
										else if (e == 3 && com == 2 && Eoil == 0) {
											System.out.println("장전을 합니다.");
											System.out.println("상대는  기름도 없는데 회피기동을 시도합니다.");
											reload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나장전 산대 회피 실패
											// 27
										else if (e == 3 && com == 3) {
											System.out.println("장전합니다.");
											System.out.println("상대방도 장전합니다.");
											reload += 1;
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나장전 상대 장전

									} else if (d == 2) {
										if (sup > 0) {
											sup--;
											System.out.println("어뢰를 발사합니다. ");
											try {
												Thread.sleep(500);
											} catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											System.out.println("어뢰잔량" + sup);
											Random random11 = new Random();
											int data1 = random11.nextInt(4) + 1;
											if (data1 == 1) {
												try {
													Thread.sleep(500);
												} catch (InterruptedException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												System.out.println("어뢰가 적중합니다.");
												try {
													Thread.sleep(500);
												} catch (InterruptedException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												System.out.println("적탄실에 적중했습니다!!!!");
												try {
													Thread.sleep(500);
												} catch (InterruptedException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												System.out.println("유폭이 발생했습니다!!!!!!!!!!");
												Ehp = Ehp - 450;
												if (Ehp < 0) {
													Ehp = 0;
												}
												System.out.println("적 함선 : " + Ehp);
											} else if (data1 == 2) {
												System.out.println("어뢰가 영~ 좋지 못한 곳을 스칩니다.");
												System.out.println("대미지는 입어드릴께요");
												Ehp = Ehp - 100;
												if (Ehp < 0) {
													Ehp = 0;
												}
												System.out.println("적 함선 : " + Ehp);
											} else if (data1 == 3) {
												System.out.println("적은 현란한 무빙으로 어뢰를 피해갑니다.");
												System.out.println("단 1의 피해도 입히지 못하였습니다.");
											} else if (data1 == 4) {
												System.out.println("해류가 심해서 어뢰가 모두 잘못된 방향으로 나갑니다.");
												System.out.println("적 합선이 당신의 조준실력에 비웃음을 보냅니다.");
											}

										} else if (sup <= 0) {
											System.out.println("어뢰의 잔량이 없습니다.");
										}

									}

								} while (hp > 0 && Ehp > 0);// 전투 끝지점

								if (Ehp == 0 && hp > 0) {
									tuto += 1;
									tr = tr + 3;
									System.out.println("전투에서 승리하셨습니다.");
									System.out.println("내구축함 : " + hp + " 자제 : " + tr);
								}
							}

							else if (data == 2) {
								System.out.println("보물이다!!!!");
								tr++;
								System.out.println("내 구축함 : " + hp + " 자제" + tr);
							}

							else if (data == 3) {
								System.out.println("허탕이다~~~~");

							}
							tuto++;
						}

						else if (c == 2) {
							tuto++;
							oil = 10;// 연료
							System.out.println("보급합니다.");
							hp = 500;
							sup = sup + 2;
							tr--;
							System.out.println("내구축함체력 : " + hp + " 잔여자제" + tr + "어뢰 잔량" + sup);
						}

						else if (c == 3) {
							tuto++;
							System.out.println("강화합니다.");
							if (tr >= 10) {
								tr = tr - 10;
								str = str + 50;
								Estr += 10;
								System.out.println("자재잔량 " + tr + " 공격력 " + str);
							} else if (tr < 10) {
								System.out.println("자제가 부족합니다.");
							}

						}
						if (tuto > 3 && tutoEnd == 0) {
							System.out.println("어느정도 함대운용에 능숙해지셨군요.");
							System.out.println("수고하셨습니다.");
							tuto++;
							break;
						}

					}
					// 구축함 흐름
				}

				else if (b == 2) {
					str = str + 50;
					hp = hp + 500;
					int sub = 15;// 함제기 어뢰
					int PlainCount = 0;// 함제기를 날린 횟수
					System.out.println("순양합을 선택하셨습니다.");
					while (hp > 0) {
						// dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd
						Ehp = 500;// 적 체력
						Eoil = 10;// 적 연료
						comreload = 0;
						System.out.println("무엇을 하시겠습니까?");
						System.out.println("1:출격 2:수리 3:강화");
						Scanner num11 = new Scanner(System.in);
						c = num11.nextInt();

						// 순양함 시작
						if (c == 1) {
							
							Ehp = +500;// 적 체력
							System.out.println("출격합니다.");
							Random random = new Random();
							int data = random.nextInt(3) + 1;

							if (data == 1) {
								try {
									Thread.sleep(500);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("적과 조우하였습니다.");
								try {
									Thread.sleep(500);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("전투 준비");
								try {
									Thread.sleep(500);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("전투를 시작합니다.");
								System.out.println("전투는 발포와 회피로 피해를 조정합니다.");
								System.out.println("회피는 " + oil + "번 가능합니다");
								System.out.println("발포를 한 후는 장전을 해야합니다.");
								System.out.println("장전을 많이하면 많이할수록 대미지가 큽니다.");
								System.out.println("전투를 시작합니다.");
								do {
									try {
										Thread.sleep(500);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println("1:기본공격 2:특수공격");
									Scanner num111 = new Scanner(System.in);
									d = num111.nextInt();
									if (d == 1) {
										System.out.println("전투를 진행합니다.");
										System.out.println("지휘를 내려주십시요");
										System.out.println("1.발포 2.회피 3.장전 ");
										Scanner num1111 = new Scanner(System.in);
										int e = num1111.nextInt();
										Random random1 = new Random();
										int com = random1.nextInt(3) + 1;
										// 1
										if (e == 1 && com == 1 && reload > 0 && comreload > 0) {
											System.out.println("서로가 서로에게 발포를 합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (Estr * comreload);
											Ehp -= (str * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											reload = 0;
											comreload = 0;
										} // 서로 발포
											// 2
										else if (e == 1 && com == 1 && reload > 0 && comreload == 0) {
											System.out.println("역시 AI는 아직 인간을 뛰어넘지 못합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											Ehp -= (str * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											reload = 0;
											comreload = 0;
										} // 나만 장전
											// 3
										else if (e == 1 && com == 1 && reload == 0 && comreload == 0) {
											System.out.println("장전이 준비되지않았습니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											reload = 0;
											comreload = 0;
										} // 서로 장전 X
											// 4
										else if (e == 1 && com == 1 && reload == 0 && comreload > 0) {
											System.out.println("장전이 준비되지않았습니다.");
											System.out.println("그런대 상대방은 전투의 준비가 끝난모양이군요.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (Estr * comreload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											reload = 0;
											comreload = 0;
										} // 상대만 장전
											// 5
										else if (e == 1 && com == 2 && reload > 0 && reload < 3 && Eoil > 0) {
											System.out.println("발포합니다.");
											System.out.println("적이 회피기동은 사용하였습니다.");
											System.out.println("한발도 맞지 않았습니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											Eoil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											reload = 0;
										} // 나 발포 상대 회피
											// 6
										else if (e == 1 && com == 2 && reload >= 3 && Eoil > 0) {
											System.out.println("발포합니다.");
											System.out.println("적이 회피기동은 사용하였습니다.");
											System.out.println("장전이 많이 되어 탄막이 충분히 형성되었습니다.");
											System.out.println("피해를 조금 입힙니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											Ehp -= (str * (reload / 3));
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											reload = 0;
										} // 나 발포 성공 상대 회피
											// 7
										else if (e == 1 && com == 2 && reload > 0 && reload < 3 && Eoil == 0) {
											System.out.println("발포합니다.");
											System.out.println("적이 멍청하게도 회피를 사용못하는데 회피기동을 명령했습니다.");
											System.out.println("피해를 입힙니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											Ehp -= (str * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											reload = 0;
										} // 나발포 상대 회피불가
											// 8
										else if (e == 1 && com == 2 && reload == 0 && Eoil > 0) {
											System.out.println("포대에 포탄이 없습니다.");
											System.out.println("상대는 겁을먹고 회피기동을 시행합니다.");
											System.out.println("피해를 입히지도 입지도 않았습니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											Eoil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나 발포 준비 X상대 회피
											// 9
										else if (e == 1 && com == 2 && reload == 0 && Eoil == 0) {
											System.out.println("포대에 포탄 없습니다.");
											System.out.println("상대도 준비가 안된상태로 회피기동합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나발포 준비 안됨 산대 회피 불가
											// 10
										else if (e == 1 && com == 3 && reload > 0) {
											System.out.println("발포합니다.");
											System.out.println("적은 장전중입니다.");
											System.out.println("프리딜타임~~");
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											Ehp -= (str * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											reload = 0;
										} // 나발포 상대장전
											// 11
										else if (e == 1 && com == 3 && reload == 0) {
											System.out.println("포대에 포탄이 없습니다.");
											System.out.println("상대는 전투를 준비하는군요.");
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 : " + hp + "컴퓨터꺼 : " + Ehp);
										} // 나 발포불가 상대장전
											// 12
										else if (e == 2 && com == 1 && oil > 0 && comreload > 0 && comreload < 3) {
											System.out.println("회피기동을 합니다.");
											System.out.println("상대는 발포했습니다.");
											System.out.println("상대의 탄을 소비합니다.");
											System.out.println("아주 좋소.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											oil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나 회피 상대 발포
											// 13
										else if (e == 2 && com == 1 && oil > 0 && comreload >= 3) {
											System.out.println("회피기동을 합니다.");
											System.out.println("적기에서 도저히 회피할 수 없는 탄막이 나라옵니다.");
											System.out.println("부디 피해가 경미하기만을 기도합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											oil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (Estr * (comreload / 3));
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											comreload = 0;
										} // 나 회피 상대 3번모아 발포
											// 14
										else if (e == 2 && com == 1 && oil > 0 && comreload == 0) {
											System.out.println("회피기동을 시행합니다.");
											System.out.println("상대도 발포를 하려합니다.");
											System.out.println("그런대 탄이 발사되지 않았습니다.");
											System.out.println("역시 인간은 위대합니다(푸흡)");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											oil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											comreload = 0;
										} // 나 회피 상대 발포 실패
											// 15
										else if (e == 2 && com == 2 && oil == 0 && comreload > 0) {
											System.out.println("회피기동을 실시 합니다.");
											System.out.println(".");
											System.out.println(".");
											System.out.println(".");
											System.out.println("아니 안되잖아?");
											System.out.println("회피가 안되");
											System.out.println("아...안되....");
											System.out.println("앙돼");
											System.out.println("으아아아아아ㅏ아아아아ㅏ아아아아앙");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (Estr * comreload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											comreload = 0;
										} // 나 회피 불가 상대 발포 성공
											// 16
										else if (e == 2 && com == 1 && oil == 0 && comreload == 0) {
											System.out.println("둘다 바보입니다.");
											System.out.println("제발 자신의 적제량을 확인하세요.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											comreload = 0;
										} // 나 회피 불가 상대 발포 실패
											// 17
										else if (e == 2 && com == 2 && oil > 0 && Eoil > 0) {
											System.out.println("회피기동을 합니다.");
											System.out.println("상대도 회피기동을 합니다.");
											System.out.println("아까운 기름만 날렸군요.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나 회피 상대 회피
											// 18
										else if (e == 2 && com == 2 && oil == 0 && Eoil > 0) {
											System.out.println("기름없습니다.");
											System.out.println("상대방도 허공에 기름을 낭비하는군요.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											Eoil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나 회피 불가 상대 회피 가능
											// 19
										else if (e == 2 && com == 2 && oil > 0 && Eoil == 0) {
											System.out.println("회피 기동을 실시합니다.");
											System.out.println("상대는 기름이 다떨어졌습니다.");
											System.out.println("기름만 낭비하셨군요?");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											oil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나회피가능 상대회피 불가
											// 20
										else if (e == 2 && com == 2 && oil == 0 && Eoil == 0) {
											System.out.println("기름이 부족하다고");
											System.out.println("상대도 부족합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나회피불가 산대 회피불가
											// 21
										else if (e == 2 && com == 3 && oil > 0) {
											System.out.println("회피기동을 시도합니다.");
											System.out.println("상대는 장전합니다.");
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나 회피 상대 장전
											// 22
										else if (e == 2 && com == 3 && oil == 0) {
											System.out.println("회피기동이 기름이 없어서 실패했습니다.");
											System.out.println("상대는 장전하여 더강한 공격력을 보유합니다.");
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나 회피불가 상대 장전
											// 23
										else if (e == 3 && com == 1 && comreload > 0) {
											System.out.println("장전 합니다.");
											System.out.println("상대는 발포합니다.");
											System.out.println("걍 쳐 맞으세여");
											reload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (Estr * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
											comreload = 0;
										} // 나 장전 상대 발싸
											// 24
										else if (e == 3 && com == 1 && comreload == 0) {
											System.out.println("장전을 합니다.");
											System.out.println("상대는 장전의 중요성을 모르는 모양입니다.");
											reload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나 장전 상대 발포실패
											// 25
										else if (e == 3 && com == 2 && Eoil > 0) {
											System.out.println("장전을 합니다. ");
											System.out.println("상대는 회피기동을 합니다.");
											System.out.println("상대는 기름을 허공에 뿌렸습니다.");
											reload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											Eoil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나 장전 상대 회피
											// 26
										else if (e == 3 && com == 2 && Eoil == 0) {
											System.out.println("장전을 합니다.");
											System.out.println("상대는  기름도 없는데 회피기동을 시도합니다.");
											reload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나장전 산대 회피 실패
											// 27
										else if (e == 3 && com == 3) {
											System.out.println("장전합니다.");
											System.out.println("상대방도 장전합니다.");
											reload += 1;
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + Ehp);
										} // 나장전 상대 장전

									} else if (d == 2) {
										if (plain > 0 && sub > 0) {
											plain--;
											System.out.println("함제기 발진!!!!! ");
											try {
												Thread.sleep(500);
											} catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											System.out.println("잔여 함제기" + plain);
											Random random11 = new Random();
											int data11 = random11.nextInt(4) + 1;
											if (data11 == 1) {
												try {
													Thread.sleep(500);
												} catch (InterruptedException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												System.out.println("어뢰가 적중합니다.");
												try {
													Thread.sleep(500);
												} catch (InterruptedException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												System.out.println("적탄실에 적중했습니다!!!!");
												try {
													Thread.sleep(500);
												} catch (InterruptedException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												System.out.println("유폭이 발생했습니다!!!!!!!!!!");
												Ehp = Ehp - 450;
												if (Ehp < 0) {
													Ehp = 0;
												}
												System.out.println("적 함선 : " + Ehp);
												PlainCount++;

											} else if (data11 == 2) {
												System.out.println("어뢰가 영~ 좋지 못한 곳을 스칩니다.");
												System.out.println("대미지는 입어드릴께요");
												Ehp = Ehp - 100;
												if (Ehp < 0) {
													Ehp = 0;
												}
												System.out.println("적 함선 : " + Ehp);
												PlainCount++;

											} else if (data11 == 3) {
												System.out.println("적은 현란한 무빙으로 어뢰를 피해갑니다.");
												System.out.println("단 1의 피해도 입히지 못하였습니다.");

											} else if (data11 == 4) {
												System.out.println("해류가 심해서 어뢰가 모두 잘못된 방향으로 나갑니다.");
												System.out.println("적 합선이 당신의 조준실력에 비웃음을 보냅니다.");

											}

										} else if (plain <= 0) {
											System.out.println("탑제 합제기 수가 부족합니다.");
										} else if (sub <= 0) {
											System.out.println("어뢰적제량이 바닥났습니다.");
										}

									}

								} while (hp > 0 && Ehp > 0);// 전투 끝지점
								if (Ehp <= 0 && hp > 0) {
									tr = tr + 3;
									System.out.println("전투에서 승리하셨습니다.");
									System.out.println("내순양함 : " + hp + "자제 : " + tr);
								}

							}

							else if (data == 2) {
								System.out.println("보물이다!!!!");
								tr++;
								System.out.println("내 순양함 : " + hp + "자제" + tr);
							}

							else if (data == 3) {
								System.out.println("허탕이다~~~~");

							}
						}

						else if (c == 2) {
							System.out.println("수리합니다.");
							hp = 1000;
							tr--;
							System.out.println("내순양함 : " + hp + " 자제 " + tr);
						}

						else if (c == 3) {
							System.out.println("강화합니다.");
							if (tr >= 10) {
								tr = tr - 10;
								str = str + 50;
								plain+=2;
								System.out.println("자재잔량 " + tr + " 공격력 " + str);
								power++;// 강화 횟수 증가

								}
							if (power == 1 && reject1 == 0) {
								System.out.println("강화 횟수가 5번이상입니다.");
								System.out.println("함장님의 배속이 전함으로 이전되십니다.");
								System.out.println("전함의 함장이 되시겠습니까?");
								System.out.println("1.네                2.아니요");
								Scanner num111 = new Scanner(System.in);
								int e = num111.nextInt();
								if (e == 1) {
									break;
								} else if (e == 2) {
									System.out.println("이런 기회는 다시는 없을것입니다.");
									reject1++;
								}

							} else if (tr < 10) {
								System.out.println("자제가 부족합니다.");
							}

						}
						if (PlainCount >= 1 && reject2 == 0) {
							System.out.println("비행기 공격 횟수가 5번이상입니다.");
							System.out.println("함장님의 배속이 항공모함으로 이전되십니다.");
							System.out.println("항공모함의 함장이 되시겠습니까?");
							System.out.println("1.네                2.아니요");
							Scanner num111 = new Scanner(System.in);
							int e = num111.nextInt();
							if (e == 1) {
								airSuc++;
								break;
							} else if (e == 2) {
								System.out.println("이런 기회는 다시는 없을것입니다.");
								reject2++;
							}

						}
					}
					hp = hp + 1500;
					int battle = 0;// 전투 횟수
					while (power == 1 && hp > 0) {
						// int battle = 0;// 전투 횟수
						int evadeNum = 3;// 회피 갯수
						System.out.println("전함을 운용합니다.");
						System.out.println("1.출격       2.보급 및 강화");
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
							System.out.println("출격합니다.");

							battle++;
							System.out.println("적과 조우하였습니다.");

							System.out.println("전투를 시작합니다.");
							System.out.println("전투는 발포와 회피로 피해를 조정합니다.");
							System.out.println("회피는 " + oil + "번 가능합니다");
							System.out.println("발포를 한 후는 장전을 해야합니다.");
							System.out.println("장전을 많이하면 많이할수록 대미지가 큽니다.");
							System.out.println("전투를 시작합니다.");
							Random random2 = new Random();
							int enmy = random2.nextInt(3) + 1;
							if (enmy == 1) {
								do {
									// esey
									System.out.println("야생의 구축함이 나타났습니다.");
									System.out.println("1:기본공격 ");
									Scanner num1111 = new Scanner(System.in);
									d = num1111.nextInt();
									if (d == 1) {
										System.out.println("전투를 진행합니다.");
										System.out.println("지휘를 내려주십시요");
										System.out.println("1.발포 2.회피 3.장전 ");
										Scanner num11 = new Scanner(System.in);
										e = num11.nextInt();
										Random random1 = new Random();
										int com = random1.nextInt(3) + 1;
										// 1
										if (e == 1 && com == 1 && reload > 0 && comreload > 0) {
											System.out.println("서로가 서로에게 발포를 합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (eseystr * comreload);
											eseyHp -= (str * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
											reload = 0;
											comreload = 0;
										} // 서로 발포
											// 2
										else if (e == 1 && com == 1 && reload > 0 && comreload == 0) {
											System.out.println("역시 AI는 아직 인간을 뛰어넘지 못합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											eseyHp -= (str * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
											reload = 0;
											comreload = 0;
										} // 나만 장전
											// 3
										else if (e == 1 && com == 1 && reload == 0 && comreload == 0) {
											System.out.println("장전이 준비되지않았습니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
											reload = 0;
											comreload = 0;
										} // 서로 장전 X
											// 4
										else if (e == 1 && com == 1 && reload == 0 && comreload > 0) {
											System.out.println("장전이 준비되지않았습니다.");
											System.out.println("그런대 상대방은 전투의 준비가 끝난모양이군요.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (eseystr * comreload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
											reload = 0;
											comreload = 0;
										} // 상대만 장전
											// 5
										else if (e == 1 && com == 2 && reload > 0 && reload < 3 && Eoil > 0) {
											System.out.println("발포합니다.");
											System.out.println("적이 회피기동은 사용하였습니다.");
											System.out.println("한발도 맞지 않았습니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											Eoil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
											reload = 0;
										} // 나 발포 상대 회피
											// 6
										else if (e == 1 && com == 2 && reload >= 3 && Eoil > 0) {
											System.out.println("발포합니다.");
											System.out.println("적이 회피기동은 사용하였습니다.");
											System.out.println("장전이 많이 되어 탄막이 충분히 형성되었습니다.");
											System.out.println("피해를 조금 입힙니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											eseyHp -= (str * (reload / 3));
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
											reload = 0;
										} // 나 발포 성공 상대 회피
											// 7
										else if (e == 1 && com == 2 && reload > 0 && reload < 3 && Eoil == 0) {
											System.out.println("발포합니다.");
											System.out.println("적이 멍청하게도 회피를 사용못하는데 회피기동을 명령했습니다.");
											System.out.println("피해를 입힙니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											eseyHp -= (str * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
											reload = 0;
										} // 나발포 상대 회피불가
											// 8
										else if (e == 1 && com == 2 && reload == 0 && Eoil > 0) {
											System.out.println("포대에 포탄이 없습니다.");
											System.out.println("상대는 겁을먹고 회피기동을 시행합니다.");
											System.out.println("피해를 입히지도 입지도 않았습니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											Eoil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
										} // 나 발포 준비 X상대 회피
											// 9
										else if (e == 1 && com == 2 && reload == 0 && Eoil == 0) {
											System.out.println("포대에 포탄 없습니다.");
											System.out.println("상대도 준비가 안된상태로 회피기동합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
										} // 나발포 준비 안됨 산대 회피 불가
											// 10
										else if (e == 1 && com == 3 && reload > 0) {
											System.out.println("발포합니다.");
											System.out.println("적은 장전중입니다.");
											System.out.println("프리딜타임~~");
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											eseyHp -= (str * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
											reload = 0;
										} // 나발포 상대장전
											// 11
										else if (e == 1 && com == 3 && reload == 0) {
											System.out.println("포대에 포탄이 없습니다.");
											System.out.println("상대는 전투를 준비하는군요.");
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 : " + hp + "컴퓨터꺼 : " + eseyHp);
										} // 나 발포불가 상대장전
											// 12
										else if (e == 2 && com == 1 && oil > 0 && comreload > 0 && comreload < 3) {
											System.out.println("회피기동을 합니다.");
											System.out.println("상대는 발포했습니다.");
											System.out.println("상대의 탄을 소비합니다.");
											System.out.println("아주 좋소.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											oil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
										} // 나 회피 상대 발포
											// 13
										else if (e == 2 && com == 1 && oil > 0 && comreload >= 3) {
											System.out.println("회피기동을 합니다.");
											System.out.println("적기에서 도저히 회피할 수 없는 탄막이 나라옵니다.");
											System.out.println("부디 피해가 경미하기만을 기도합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											oil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (eseystr * (comreload / 3));
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
											comreload = 0;
										} // 나 회피 상대 3번모아 발포
											// 14
										else if (e == 2 && com == 1 && oil > 0 && comreload == 0) {
											System.out.println("회피기동을 시행합니다.");
											System.out.println("상대도 발포를 하려합니다.");
											System.out.println("그런대 탄이 발사되지 않았습니다.");
											System.out.println("역시 인간은 위대합니다(푸흡)");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											oil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
											comreload = 0;
										} // 나 회피 상대 발포 실패
											// 15
										else if (e == 2 && com == 2 && oil == 0 && comreload > 0) {
											System.out.println("회피기동을 실시 합니다.");
											System.out.println(".");
											System.out.println(".");
											System.out.println(".");
											System.out.println("아니 안되잖아?");
											System.out.println("회피가 안되");
											System.out.println("아...안되....");
											System.out.println("앙돼");
											System.out.println("으아아아아아ㅏ아아아아ㅏ아아아아앙");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (eseystr * comreload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
											comreload = 0;
										} // 나 회피 불가 상대 발포 성공
											// 16
										else if (e == 2 && com == 1 && oil == 0 && comreload == 0) {
											System.out.println("둘다 바보입니다.");
											System.out.println("제발 자신의 적제량을 확인하세요.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
											comreload = 0;
										} // 나 회피 불가 상대 발포 실패
											// 17
										else if (e == 2 && com == 2 && oil > 0 && Eoil > 0) {
											System.out.println("회피기동을 합니다.");
											System.out.println("상대도 회피기동을 합니다.");
											System.out.println("아까운 기름만 날렸군요.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
										} // 나 회피 상대 회피
											// 18
										else if (e == 2 && com == 2 && oil == 0 && Eoil > 0) {
											System.out.println("기름없습니다.");
											System.out.println("상대방도 허공에 기름을 낭비하는군요.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											Eoil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
										} // 나 회피 불가 상대 회피 가능
											// 19
										else if (e == 2 && com == 2 && oil > 0 && Eoil == 0) {
											System.out.println("회피 기동을 실시합니다.");
											System.out.println("상대는 기름이 다떨어졌습니다.");
											System.out.println("기름만 낭비하셨군요?");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											oil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
										} // 나회피가능 상대회피 불가
											// 20
										else if (e == 2 && com == 2 && oil == 0 && Eoil == 0) {
											System.out.println("기름이 부족하다고");
											System.out.println("상대도 부족합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
										} // 나회피불가 산대 회피불가
											// 21
										else if (e == 2 && com == 3 && oil > 0) {
											System.out.println("회피기동을 시도합니다.");
											System.out.println("상대는 장전합니다.");
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
										} // 나 회피 상대 장전
											// 22
										else if (e == 2 && com == 3 && oil == 0) {
											System.out.println("회피기동이 기름이 없어서 실패했습니다.");
											System.out.println("상대는 장전하여 더강한 공격력을 보유합니다.");
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
										} // 나 회피불가 상대 장전
											// 23
										else if (e == 3 && com == 1 && comreload > 0) {
											System.out.println("장전 합니다.");
											System.out.println("상대는 발포합니다.");
											System.out.println("걍 쳐 맞으세여");
											reload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (eseystr * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
											comreload = 0;
										} // 나 장전 상대 발싸
											// 24
										else if (e == 3 && com == 1 && comreload == 0) {
											System.out.println("장전을 합니다.");
											System.out.println("상대는 장전의 중요성을 모르는 모양입니다.");
											reload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
										} // 나 장전 상대 발포실패
											// 25
										else if (e == 3 && com == 2 && Eoil > 0) {
											System.out.println("장전을 합니다. ");
											System.out.println("상대는 회피기동을 합니다.");
											System.out.println("상대는 기름을 허공에 뿌렸습니다.");
											reload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											Eoil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
										} // 나 장전 상대 회피
											// 26
										else if (e == 3 && com == 2 && Eoil == 0) {
											System.out.println("장전을 합니다.");
											System.out.println("상대는  기름도 없는데 회피기동을 시도합니다.");
											reload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
										} // 나장전 산대 회피 실패
											// 27
										else if (e == 3 && com == 3) {
											System.out.println("장전합니다.");
											System.out.println("상대방도 장전합니다.");
											reload += 1;
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + eseyHp);
										} // 나장전 상대 장전
									}

								} while (hp > 0 && eseyHp > 0);// 전투 끝지점
								if (eseyHp <= 0 || nomalHp <= 0 || hardHp<=0 && hp > 0) {
									tr = tr + 3;
									System.out.println("전투에서 승리하셨습니다.");
									System.out.println("내전함 : " + hp + " 자제 : " + tr);
								}

							} else if (enmy == 2) {
								do {
									// nomal
									System.out.println("야생의 순양함이 나타났다.");
									System.out.println("1:기본공격 ");
									Scanner num1111 = new Scanner(System.in);
									d = num1111.nextInt();
									if (d == 1) {
										System.out.println("전투를 진행합니다.");
										System.out.println("지휘를 내려주십시요");
										System.out.println("1.발포 2.회피 3.장전 ");
										Scanner num11 = new Scanner(System.in);
										e = num11.nextInt();
										Random random1 = new Random();
										int com = random1.nextInt(3) + 1;
										// 1
										if (e == 1 && com == 1 && reload > 0 && comreload > 0) {
											System.out.println("서로가 서로에게 발포를 합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (nomalstr * comreload);
											nomalHp -= (str * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
											reload = 0;
											comreload = 0;
										} // 서로 발포
											// 2
										else if (e == 1 && com == 1 && reload > 0 && comreload == 0) {
											System.out.println("역시 AI는 아직 인간을 뛰어넘지 못합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											nomalHp -= (str * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
											reload = 0;
											comreload = 0;
										} // 나만 장전
											// 3
										else if (e == 1 && com == 1 && reload == 0 && comreload == 0) {
											System.out.println("장전이 준비되지않았습니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
											reload = 0;
											comreload = 0;
										} // 서로 장전 X
											// 4
										else if (e == 1 && com == 1 && reload == 0 && comreload > 0) {
											System.out.println("장전이 준비되지않았습니다.");
											System.out.println("그런대 상대방은 전투의 준비가 끝난모양이군요.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (nomalstr * comreload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
											reload = 0;
											comreload = 0;
										} // 상대만 장전
											// 5
										else if (e == 1 && com == 2 && reload > 0 && reload < 3 && Eoil > 0) {
											System.out.println("발포합니다.");
											System.out.println("적이 회피기동은 사용하였습니다.");
											System.out.println("한발도 맞지 않았습니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											Eoil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
											reload = 0;
										} // 나 발포 상대 회피
											// 6
										else if (e == 1 && com == 2 && reload >= 3 && Eoil > 0) {
											System.out.println("발포합니다.");
											System.out.println("적이 회피기동은 사용하였습니다.");
											System.out.println("장전이 많이 되어 탄막이 충분히 형성되었습니다.");
											System.out.println("피해를 조금 입힙니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											nomalHp -= (str * (reload / 3));
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
											reload = 0;
										} // 나 발포 성공 상대 회피
											// 7
										else if (e == 1 && com == 2 && reload > 0 && reload < 3 && Eoil == 0) {
											System.out.println("발포합니다.");
											System.out.println("적이 멍청하게도 회피를 사용못하는데 회피기동을 명령했습니다.");
											System.out.println("피해를 입힙니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											nomalHp -= (str * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
											reload = 0;
										} // 나발포 상대 회피불가
											// 8
										else if (e == 1 && com == 2 && reload == 0 && Eoil > 0) {
											System.out.println("포대에 포탄이 없습니다.");
											System.out.println("상대는 겁을먹고 회피기동을 시행합니다.");
											System.out.println("피해를 입히지도 입지도 않았습니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											Eoil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
										} // 나 발포 준비 X상대 회피
											// 9
										else if (e == 1 && com == 2 && reload == 0 && Eoil == 0) {
											System.out.println("포대에 포탄 없습니다.");
											System.out.println("상대도 준비가 안된상태로 회피기동합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
										} // 나발포 준비 안됨 산대 회피 불가
											// 10
										else if (e == 1 && com == 3 && reload > 0) {
											System.out.println("발포합니다.");
											System.out.println("적은 장전중입니다.");
											System.out.println("프리딜타임~~");
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											nomalHp -= (str * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
											reload = 0;
										} // 나발포 상대장전
											// 11
										else if (e == 1 && com == 3 && reload == 0) {
											System.out.println("포대에 포탄이 없습니다.");
											System.out.println("상대는 전투를 준비하는군요.");
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 : " + hp + "컴퓨터꺼 : " + nomalHp);
										} // 나 발포불가 상대장전
											// 12
										else if (e == 2 && com == 1 && oil > 0 && comreload > 0 && comreload < 3) {
											System.out.println("회피기동을 합니다.");
											System.out.println("상대는 발포했습니다.");
											System.out.println("상대의 탄을 소비합니다.");
											System.out.println("아주 좋소.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											oil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
										} // 나 회피 상대 발포
											// 13
										else if (e == 2 && com == 1 && oil > 0 && comreload >= 3) {
											System.out.println("회피기동을 합니다.");
											System.out.println("적기에서 도저히 회피할 수 없는 탄막이 나라옵니다.");
											System.out.println("부디 피해가 경미하기만을 기도합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											oil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (nomalstr * (comreload / 3));
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
											comreload = 0;
										} // 나 회피 상대 3번모아 발포
											// 14
										else if (e == 2 && com == 1 && oil > 0 && comreload == 0) {
											System.out.println("회피기동을 시행합니다.");
											System.out.println("상대도 발포를 하려합니다.");
											System.out.println("그런대 탄이 발사되지 않았습니다.");
											System.out.println("역시 인간은 위대합니다(푸흡)");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											oil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
											comreload = 0;
										} // 나 회피 상대 발포 실패
											// 15
										else if (e == 2 && com == 2 && oil == 0 && comreload > 0) {
											System.out.println("회피기동을 실시 합니다.");
											System.out.println(".");
											System.out.println(".");
											System.out.println(".");
											System.out.println("아니 안되잖아?");
											System.out.println("회피가 안되");
											System.out.println("아...안되....");
											System.out.println("앙돼");
											System.out.println("으아아아아아ㅏ아아아아ㅏ아아아아앙");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (nomalstr * comreload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
											comreload = 0;
										} // 나 회피 불가 상대 발포 성공
											// 16
										else if (e == 2 && com == 1 && oil == 0 && comreload == 0) {
											System.out.println("둘다 바보입니다.");
											System.out.println("제발 자신의 적제량을 확인하세요.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
											comreload = 0;
										} // 나 회피 불가 상대 발포 실패
											// 17
										else if (e == 2 && com == 2 && oil > 0 && Eoil > 0) {
											System.out.println("회피기동을 합니다.");
											System.out.println("상대도 회피기동을 합니다.");
											System.out.println("아까운 기름만 날렸군요.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
										} // 나 회피 상대 회피
											// 18
										else if (e == 2 && com == 2 && oil == 0 && Eoil > 0) {
											System.out.println("기름없습니다.");
											System.out.println("상대방도 허공에 기름을 낭비하는군요.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											Eoil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
										} // 나 회피 불가 상대 회피 가능
											// 19
										else if (e == 2 && com == 2 && oil > 0 && Eoil == 0) {
											System.out.println("회피 기동을 실시합니다.");
											System.out.println("상대는 기름이 다떨어졌습니다.");
											System.out.println("기름만 낭비하셨군요?");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											oil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
										} // 나회피가능 상대회피 불가
											// 20
										else if (e == 2 && com == 2 && oil == 0 && Eoil == 0) {
											System.out.println("기름이 부족하다고");
											System.out.println("상대도 부족합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
										} // 나회피불가 산대 회피불가
											// 21
										else if (e == 2 && com == 3 && oil > 0) {
											System.out.println("회피기동을 시도합니다.");
											System.out.println("상대는 장전합니다.");
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
										} // 나 회피 상대 장전
											// 22
										else if (e == 2 && com == 3 && oil == 0) {
											System.out.println("회피기동이 기름이 없어서 실패했습니다.");
											System.out.println("상대는 장전하여 더강한 공격력을 보유합니다.");
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
										} // 나 회피불가 상대 장전
											// 23
										else if (e == 3 && com == 1 && comreload > 0) {
											System.out.println("장전 합니다.");
											System.out.println("상대는 발포합니다.");
											System.out.println("걍 쳐 맞으세여");
											reload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (nomalstr * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
											comreload = 0;
										} // 나 장전 상대 발싸
											// 24
										else if (e == 3 && com == 1 && comreload == 0) {
											System.out.println("장전을 합니다.");
											System.out.println("상대는 장전의 중요성을 모르는 모양입니다.");
											reload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
										} // 나 장전 상대 발포실패
											// 25
										else if (e == 3 && com == 2 && Eoil > 0) {
											System.out.println("장전을 합니다. ");
											System.out.println("상대는 회피기동을 합니다.");
											System.out.println("상대는 기름을 허공에 뿌렸습니다.");
											reload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											Eoil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
										} // 나 장전 상대 회피
											// 26
										else if (e == 3 && com == 2 && Eoil == 0) {
											System.out.println("장전을 합니다.");
											System.out.println("상대는  기름도 없는데 회피기동을 시도합니다.");
											reload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
										} // 나장전 산대 회피 실패
											// 27
										else if (e == 3 && com == 3) {
											System.out.println("장전합니다.");
											System.out.println("상대방도 장전합니다.");
											reload += 1;
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + nomalHp);
										} // 나장전 상대 장전
									}

								} while (hp > 0 && nomalHp > 0);// 전투 끝지점
								if (eseyHp <= 0 || nomalHp <= 0 || hardHp<=0 && hp > 0) {
									tr = tr + 3;
									System.out.println("전투에서 승리하셨습니다.");
									System.out.println("내전함 : " + hp + " 자제 : " + tr);
								}
							} else if (enmy == 3) {
								do {
									System.out.println("야생의 전함이 나타났습니다.");
									System.out.println("1:기본공격 ");
									Scanner num1111 = new Scanner(System.in);
									d = num1111.nextInt();
									if (d == 1) {
										System.out.println("전투를 진행합니다.");
										System.out.println("지휘를 내려주십시요");
										System.out.println("1.발포 2.회피 3.장전 ");
										Scanner num11 = new Scanner(System.in);
										e = num11.nextInt();
										Random random1 = new Random();
										int com = random1.nextInt(3) + 1;
										// 1
										if (e == 1 && com == 1 && reload > 0 && comreload > 0) {
											System.out.println("서로가 서로에게 발포를 합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (hardstr * comreload);
											hardHp -= (str * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
											reload = 0;
											comreload = 0;
										} // 서로 발포
											// 2
										else if (e == 1 && com == 1 && reload > 0 && comreload == 0) {
											System.out.println("역시 AI는 아직 인간을 뛰어넘지 못합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hardHp -= (str * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
											reload = 0;
											comreload = 0;
										} // 나만 장전
											// 3
										else if (e == 1 && com == 1 && reload == 0 && comreload == 0) {
											System.out.println("장전이 준비되지않았습니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
											reload = 0;
											comreload = 0;
										} // 서로 장전 X
											// 4
										else if (e == 1 && com == 1 && reload == 0 && comreload > 0) {
											System.out.println("장전이 준비되지않았습니다.");
											System.out.println("그런대 상대방은 전투의 준비가 끝난모양이군요.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (hardstr * comreload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
											reload = 0;
											comreload = 0;
										} // 상대만 장전
											// 5
										else if (e == 1 && com == 2 && reload > 0 && reload < 3 && Eoil > 0) {
											System.out.println("발포합니다.");
											System.out.println("적이 회피기동은 사용하였습니다.");
											System.out.println("한발도 맞지 않았습니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											Eoil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
											reload = 0;
										} // 나 발포 상대 회피
											// 6
										else if (e == 1 && com == 2 && reload >= 3 && Eoil > 0) {
											System.out.println("발포합니다.");
											System.out.println("적이 회피기동은 사용하였습니다.");
											System.out.println("장전이 많이 되어 탄막이 충분히 형성되었습니다.");
											System.out.println("피해를 조금 입힙니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hardHp -= (str * (reload / 3));
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
											reload = 0;
										} // 나 발포 성공 상대 회피
											// 7
										else if (e == 1 && com == 2 && reload > 0 && reload < 3 && Eoil == 0) {
											System.out.println("발포합니다.");
											System.out.println("적이 멍청하게도 회피를 사용못하는데 회피기동을 명령했습니다.");
											System.out.println("피해를 입힙니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hardHp -= (str * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
											reload = 0;
										} // 나발포 상대 회피불가
											// 8
										else if (e == 1 && com == 2 && reload == 0 && Eoil > 0) {
											System.out.println("포대에 포탄이 없습니다.");
											System.out.println("상대는 겁을먹고 회피기동을 시행합니다.");
											System.out.println("피해를 입히지도 입지도 않았습니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											Eoil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
										} // 나 발포 준비 X상대 회피
											// 9
										else if (e == 1 && com == 2 && reload == 0 && Eoil == 0) {
											System.out.println("포대에 포탄 없습니다.");
											System.out.println("상대도 준비가 안된상태로 회피기동합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
										} // 나발포 준비 안됨 산대 회피 불가
											// 10
										else if (e == 1 && com == 3 && reload > 0) {
											System.out.println("발포합니다.");
											System.out.println("적은 장전중입니다.");
											System.out.println("프리딜타임~~");
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hardHp -= (str * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
											reload = 0;
										} // 나발포 상대장전
											// 11
										else if (e == 1 && com == 3 && reload == 0) {
											System.out.println("포대에 포탄이 없습니다.");
											System.out.println("상대는 전투를 준비하는군요.");
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 : " + hp + "컴퓨터꺼 : " + hardHp);
										} // 나 발포불가 상대장전
											// 12
										else if (e == 2 && com == 1 && oil > 0 && comreload > 0 && comreload < 3) {
											System.out.println("회피기동을 합니다.");
											System.out.println("상대는 발포했습니다.");
											System.out.println("상대의 탄을 소비합니다.");
											System.out.println("아주 좋소.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											oil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
										} // 나 회피 상대 발포
											// 13
										else if (e == 2 && com == 1 && oil > 0 && comreload >= 3) {
											System.out.println("회피기동을 합니다.");
											System.out.println("적기에서 도저히 회피할 수 없는 탄막이 나라옵니다.");
											System.out.println("부디 피해가 경미하기만을 기도합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											oil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (hardstr * (comreload / 3));
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
											comreload = 0;
										} // 나 회피 상대 3번모아 발포
											// 14
										else if (e == 2 && com == 1 && oil > 0 && comreload == 0) {
											System.out.println("회피기동을 시행합니다.");
											System.out.println("상대도 발포를 하려합니다.");
											System.out.println("그런대 탄이 발사되지 않았습니다.");
											System.out.println("역시 인간은 위대합니다(푸흡)");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											oil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
											comreload = 0;
										} // 나 회피 상대 발포 실패
											// 15
										else if (e == 2 && com == 2 && oil == 0 && comreload > 0) {
											System.out.println("회피기동을 실시 합니다.");
											System.out.println(".");
											System.out.println(".");
											System.out.println(".");
											System.out.println("아니 안되잖아?");
											System.out.println("회피가 안되");
											System.out.println("아...안되....");
											System.out.println("앙돼");
											System.out.println("으아아아아아ㅏ아아아아ㅏ아아아아앙");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (hardstr * comreload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
											comreload = 0;
										} // 나 회피 불가 상대 발포 성공
											// 16
										else if (e == 2 && com == 1 && oil == 0 && comreload == 0) {
											System.out.println("둘다 바보입니다.");
											System.out.println("제발 자신의 적제량을 확인하세요.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
											comreload = 0;
										} // 나 회피 불가 상대 발포 실패
											// 17
										else if (e == 2 && com == 2 && oil > 0 && Eoil > 0) {
											System.out.println("회피기동을 합니다.");
											System.out.println("상대도 회피기동을 합니다.");
											System.out.println("아까운 기름만 날렸군요.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
										} // 나 회피 상대 회피
											// 18
										else if (e == 2 && com == 2 && oil == 0 && Eoil > 0) {
											System.out.println("기름없습니다.");
											System.out.println("상대방도 허공에 기름을 낭비하는군요.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											Eoil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
										} // 나 회피 불가 상대 회피 가능
											// 19
										else if (e == 2 && com == 2 && oil > 0 && Eoil == 0) {
											System.out.println("회피 기동을 실시합니다.");
											System.out.println("상대는 기름이 다떨어졌습니다.");
											System.out.println("기름만 낭비하셨군요?");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											oil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
										} // 나회피가능 상대회피 불가
											// 20
										else if (e == 2 && com == 2 && oil == 0 && Eoil == 0) {
											System.out.println("기름이 부족하다고");
											System.out.println("상대도 부족합니다.");
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
										} // 나회피불가 산대 회피불가
											// 21
										else if (e == 2 && com == 3 && oil > 0) {
											System.out.println("회피기동을 시도합니다.");
											System.out.println("상대는 장전합니다.");
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
										} // 나 회피 상대 장전
											// 22
										else if (e == 2 && com == 3 && oil == 0) {
											System.out.println("회피기동이 기름이 없어서 실패했습니다.");
											System.out.println("상대는 장전하여 더강한 공격력을 보유합니다.");
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
										} // 나 회피불가 상대 장전
											// 23
										else if (e == 3 && com == 1 && comreload > 0) {
											System.out.println("장전 합니다.");
											System.out.println("상대는 발포합니다.");
											System.out.println("걍 쳐 맞으세여");
											reload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											hp -= (hardstr * reload);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
											comreload = 0;
										} // 나 장전 상대 발싸
											// 24
										else if (e == 3 && com == 1 && comreload == 0) {
											System.out.println("장전을 합니다.");
											System.out.println("상대는 장전의 중요성을 모르는 모양입니다.");
											reload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
										} // 나 장전 상대 발포실패
											// 25
										else if (e == 3 && com == 2 && Eoil > 0) {
											System.out.println("장전을 합니다. ");
											System.out.println("상대는 회피기동을 합니다.");
											System.out.println("상대는 기름을 허공에 뿌렸습니다.");
											reload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											Eoil -= 1;
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
										} // 나 장전 상대 회피
											// 26
										else if (e == 3 && com == 2 && Eoil == 0) {
											System.out.println("장전을 합니다.");
											System.out.println("상대는  기름도 없는데 회피기동을 시도합니다.");
											reload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
										} // 나장전 산대 회피 실패
											// 27
										else if (e == 3 && com == 3) {
											System.out.println("장전합니다.");
											System.out.println("상대방도 장전합니다.");
											reload += 1;
											comreload += 1;
											System.out.println("서로의 장전횟수");
											System.out.println("내꺼 : " + reload + "컴퓨터꺼 : " + comreload);
											System.out.println("서로의 회피가능 횟수");
											System.out.println("내꺼" + oil + "상대꺼" + Eoil);
											System.out.println("내꺼 hp : " + hp + "컴퓨터꺼 hp : " + hardHp);
										} // 나장전 상대 장전
									}

								} while (hp > 0 && hardHp > 0);// 전투 끝지점
								if (eseyHp <= 0 || nomalHp <= 0 || hardHp<=0 && hp > 0) {
									tr = tr + 3;
									System.out.println("전투에서 승리하셨습니다.");
									System.out.println("내전함 : " + hp + " 자제 : " + tr);
								}
							}

							if (eseyHp <= 0 && hp > 0 && tr>0) {
								System.out.println("수리합니다.");
								hp += 500;
								str = str + 100;
								tr--;

							}
							else if (nomalHp <= 0 && hp > 0 && tr>0) {
								System.out.println("수리합니다.");
								hp += 1000;
								str = str + 500;
								tr--;
							}
							else if (hardHp <= 0 && hp > 0 && tr>0) {
								System.out.println("수리합니다.");
								hp += 2000;
								str = str + 1000;
								tr--;
							}

						} else if (e == 2 && tr>0) {
							System.out.println("체력을 보급합니다.");
							hp = hp + 500;
							str+=100;
							tr--;

						}
						if (battle == 10) {
							System.out.println("적의 중심지로 들어왔습니다.");
							System.out.println("야마토와 조우했습니다.");
							System.out.println("무운을...........");
							System.out.println("전투를 시작합니다.");

							do {

								System.out.println("내전함 :" + hp + "야먀토" + Yhp);

								System.out.println("1:가위 2:바위 3:보");
								Scanner num11111 = new Scanner(System.in);
								att = num11111.nextInt();
								int sis = 1, rok = 2, pap = 3;
								Random random1 = new Random();
								int com = random1.nextInt(3) + 1;
								if (att == com) {
									System.out.println("비기셨습니다.");

									System.out.println("내전함 :" + hp + "야마토" + Yhp);
								} else if ((att == 1 && com == 2) || (att == 2 && com == 3) || (att == 3 && com == 1)) {
									System.out.println("지셨습니다.");
									hp = hp - Ystr;

									System.out.println("내전함 :" + hp + "야마토" + Yhp);
								} else if ((att == 1 && com == 3) || (att == 2 && com == 1) || (att == 3 && com == 2)) {
									System.out.println("이기셨습니다.");
									Yhp = Yhp - str;

									System.out.println("내전함 :" + hp + "야마토" + Yhp);
								}

							} while (hp > 0 && Yhp > 0);// 전투 끝지점

						}

					} // 전함 끝지점
					int battle1 = 0;// 전투 횟수
					while (airSuc == 1 && hp > 0) {
						System.out.println("항공모함을 운용합니다.");
						System.out.println("1.출격       2.보급");
						Scanner num111 = new Scanner(System.in);
						int e = num111.nextInt();
						if (e == 1) {
							Ehp = 500;// 적 체력
							System.out.println("출격합니다.");

							System.out.println("적과 조우하였습니다.");

							System.out.println("전투 준비");
						

							System.out.println("전투를 시작합니다.");
							do {

								System.out.println("1:기본공격 ");
								Scanner num1111 = new Scanner(System.in);
								d = num1111.nextInt();
								if (d == 1) {
									if (plain > 0 && sub > 0) {
										plain--;
										System.out.println("함제기 발진!!!!! ");
										
										System.out.println("잔여 함제기" + plain);
										Random random11 = new Random();
										int data11 = random11.nextInt(4) + 1;
										if (data11 == 1) {
											
											System.out.println("어뢰가 적중합니다.");
											
											System.out.println("적탄실에 적중했습니다!!!!");
											
											System.out.println("유폭이 발생했습니다!!!!!!!!!!");
											Ehp = Ehp - 450;
											if (Ehp < 0) {
												Ehp = 0;
											}
											System.out.println("적 함선 : " + Ehp);
											PlainCount++;

										} else if (data11 == 2) {
											System.out.println("어뢰가 영~ 좋지 못한 곳을 스칩니다.");
											System.out.println("대미지는 입어드릴께요");
											Ehp = Ehp - 100;
											if (Ehp < 0) {
												Ehp = 0;
											}
											System.out.println("적 함선 : " + Ehp);
											PlainCount++;

										} else if (data11 == 3) {
											System.out.println("적은 현란한 무빙으로 어뢰를 피해갑니다.");
											System.out.println("단 1의 피해도 입히지 못하였습니다.");

										} else if (data11 == 4) {
											System.out.println("해류가 심해서 어뢰가 모두 잘못된 방향으로 나갑니다.");
											System.out.println("적 합선이 당신의 조준실력에 비웃음을 보냅니다.");

										}

									} else if (plain <= 0) {
										System.out.println("탑제 합제기 수가 부족합니다.");
									} else if (sub <= 0) {
										System.out.println("어뢰적제량이 바닥났습니다.");
									}

								}

						
							} while (hp > 0 && Ehp > 0);// 전투 끝지점

							if (Ehp == 0 && hp > 0) {
								System.out.println("강화합니다.");
								hp += 1000;
								plain+=2;
								tr--;

							}

						} else if (e == 2) {
							System.out.println("체력및 항공기를 보급합니다.");
							hp = hp + 500;
							plain+=5;
							battle1++;
							tr--;

						}
						if (battle1 == 10) {
							System.out.println("적의 중심지로 들어왔습니다.");
							System.out.println("야마토와 조우했습니다.");
							System.out.println("무운을...........");
							System.out.println("전투를 시작합니다.");

							do {
								if (plain > 0 && sub > 0) {
									plain--;
									System.out.println("함제기 발진!!!!! ");
									
									System.out.println("잔여 함제기" + plain);
									Random random11 = new Random();
									int data11 = random11.nextInt(4) + 1;
									if (data11 == 1) {
										
										System.out.println("어뢰가 적중합니다.");
										
										System.out.println("적탄실에 적중했습니다!!!!");
										
										System.out.println("유폭이 발생했습니다!!!!!!!!!!");
										Yhp = Yhp - 5000;
										if (Yhp < 0) {
											Yhp = 0;
										}
										System.out.println("적 함선 : " + Ehp);
						

									} else if (data11 == 2) {
										System.out.println("어뢰가 영~ 좋지 못한 곳을 스칩니다.");
										System.out.println("대미지는 입어드릴께요");
										Yhp = Yhp - 2000;
										if (Yhp < 0) {
											Yhp = 0;
										}
										System.out.println("적 함선 : " + Ehp);
									
									} else if (data11 == 3) {
										System.out.println("야마토는 엄청난 떡대로 걍 어뢰를 치고갑니다..");
										System.out.println("단 1의 피해도 입히지 못하였습니다.");
										Yhp-=1000;
										System.out.println("적 함선 : " + Ehp);

									} else if (data11 == 4) {
										System.out.println("해류가 심해서 어뢰가 모두 잘못된 방향으로 나갑니다.");
										System.out.println("야마토가 당신의 조준실력에 비웃음을 보냅니다.");
										System.out.println("적 함선 : " + Ehp);
						


									}

								} else if (plain <= 0) {
									System.out.println("탑제 합제기 수가 부족합니다.");
								} else if (sub <= 0) {
									System.out.println("어뢰적제량이 바닥났습니다.");
								}

							

					
								

							} while (hp > 0 && Yhp > 0||plain<=0);// 전투 끝지점
							break;

						}

					}
					if (Yhp>0) {
						System.out.println("절대 함선 야마토에게 패배하였습니다.");
						System.out.println("ㅋ ");
						System.out.println("다시 노가다 허쉴?");
					}

					else if (Yhp<=0) {
						System.out.println("절대 함선 야마토를 잡았습니다.");
						System.out.println("축하드립니다. ");
						System.out.println("다시 노가다 허쉴?");
						str+=10;
					}

				}
				continue;
				// 순양함 끝나는 부분

			}

			else if (a == 2) {
				System.out.println("종료합니다.");
				break;
			}

		}

	}

}