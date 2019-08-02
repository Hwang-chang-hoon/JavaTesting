package Ship;

import java.util.Random;

import Game.*;

public class Aircraft_Carrier extends Unit {

	public int air_plain;
	public static int upGrade_Count;

	public Aircraft_Carrier(String name, int hp, int hp_, int atk, int atk_, int oil, int oil_, int reload, int tr,
			int air_plain) {
		super(name, hp, hp_, atk, atk_, oil, oil_, reload, tr);
		this.air_plain = air_plain;
	}

	public static void PlainAttact(Aircraft_Carrier user, Unit opposite) {
		if (user.air_plain > 0) {
			System.out.println("함제기 발진!!!!! ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Random random11 = new Random();
			int data11 = random11.nextInt(5) + 1;
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
				opposite.hp = opposite.hp - user.atk * 4;
				if (opposite.hp < 0) {
					opposite.hp = 0;
				}
				System.out.println("적 함선 : " + opposite.hp);

			} else if (data11 == 2) {
				System.out.println("어뢰가 영~ 좋지 못한 곳을 스칩니다.");
				System.out.println("대미지는 입어드릴께요");
				opposite.hp = opposite.hp - user.atk;
				if (opposite.hp < 0) {
					opposite.hp = 0;
				}
				System.out.println("적 함선 : " + opposite.hp);

			} else if (data11 == 3) {
				System.out.println("항공대가 출격합니다.");
				System.out.println("성과를 가져올때 까지 기다려보죠.");
				System.out.println("충분한 성과가 나온것같습니다.");
				System.out.println("충분한 피해를 입힌 항공대가 귀환했습니다.");
				opposite.hp = opposite.hp - user.hp * (user.air_plain / 2);
				if (opposite.hp < 0) {
					opposite.hp = 0;
				}

			} else if (data11 == 4) {
				System.out.println("항공대가 출격합니다.");
				System.out.println("성과를 가져올때 까지 기다려보죠.");
				System.out.println("충분한 성과가 나온것같습니다.");
				System.out.println("충분한 피해를 입힌 항공대가 귀환했습니다.");
				opposite.hp = opposite.hp - user.hp * user.air_plain;
				if (opposite.hp < 0) {
					opposite.hp = 0;
				}
			} else if (data11 == 5) {
				System.out.println("항공대가 출격합니다.");
				System.out.println("성과를 가져올때 까지 기다려보죠.");
				System.out.println("충분한 성과가 나온것같습니다.");
				System.out.println("그냥 항공정찰을 한것으로 치죠.");
				System.out.println("왜 항공정찰이냐고요?");
				System.out.println("거기에 적이있었으니까 항공기가 피해를 입었겠죠?");
				user.air_plain--;
			}

		} else if (user.air_plain <= 0) {
			System.out.println("탑제 합제기 수가 부족합니다.");
		}
	}

	public static void refitment(Aircraft_Carrier user) {
		System.out.println("항공대가 더들어갈수 있도록 개장을 합니다.");
		System.out.println("10대의 항공기가 당신의 함대에 합류합니다.");
		System.out.println("더욱 강력하게 공격을 하실수있습니다.");
		user.air_plain += 10;
		user.upGrade_Count++;
		System.out.println("잔여 항공대 수 : "+user.air_plain);
	}
	

}
