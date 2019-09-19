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
