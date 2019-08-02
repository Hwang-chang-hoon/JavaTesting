package Ship;

import java.util.Random;

import Game.*;

public class Cruiser extends Unit {
	static public int plain;
	static public int plain_;
	static public int plain_atk;
	static public int plainCount;
	static boolean upgrade;// 업그래이드 판단
	public static boolean air_deney;//항공모함 거절

	public Cruiser(String name, int hp, int hp_, int atk, int atk_, int oil, int oil_, int reload, int tr, int plain, int plain_,
			int plain_atk) {
		super(name, hp, hp_, atk, atk_, oil, oil_, reload, tr);
		this.plain = plain;
		this.plain_ = plain_;
		this.plain_atk = plain_atk;
		this.upgrade = false;
		this.air_deney = true;
	}

	public boolean up_grade() {
		return plainCount >= 1 ? true : false;
	}

	public static void plainFihgt(Cruiser u, Unit o) {
		if (u.plain > 0) {
			u.plain--;
			System.out.println("함제기 발진!!!!! ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("잔여 함제기" + u.plain);
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
				o.hp = o.hp - 450;
				if (o.hp < 0) {
					o.hp = 0;
				}
				System.out.println("적 함선 : " + o.hp);
				u.plainCount++;

			} else if (data11 == 2) {
				System.out.println("어뢰가 영~ 좋지 못한 곳을 스칩니다.");
				System.out.println("대미지는 입어드릴께요");
				o.hp = o.hp - 100;
				if (o.hp < 0) {
					o.hp = 0;
				}
				System.out.println("적 함선 : " + o.hp);
				u.plainCount++;

			} else if (data11 == 3) {
				System.out.println("적은 현란한 무빙으로 어뢰를 피해갑니다.");
				System.out.println("단 1의 피해도 입히지 못하였습니다.");

			} else if (data11 == 4) {
				System.out.println("해류가 심해서 어뢰가 모두 잘못된 방향으로 나갑니다.");
				System.out.println("적 합선이 당신의 조준실력에 비웃음을 보냅니다.");

			}

		} else if (u.plain <= 0) {
			System.out.println("탑제 합제기 수가 부족합니다.");
		}
	}

	public static void air_convert(Unit user) {
		System.out.println("와 정말많은 항공대를 성공시키셨군요");
		System.out.println("당신은 항공모함의 함장으로의 진급이 가능하실정도로 많은 경력이 쌓였음을 확인 했씁니다.");
		System.out.println("진급하시겠습니까?");
		System.out.println("1. 하겠습니다.   2. 안하겠씁니다.");
		
	}
	public static void air_agree(Unit user) {
		System.out.println("항공모함으로의 배속이 신고되었습니다.");
		System.out.println("당신은 이제부터 무패일 것입니다.");
		System.out.println("");
		user.choice=1;
	}
	public static void air_reject(Cruiser user) {
		System.out.println("안타깝군요.");
		user.plainCount = 0;
		user.air_deney = false;
	}
	public static void recharge(Cruiser user) {
		user.plain = 10;
	}
	

}
