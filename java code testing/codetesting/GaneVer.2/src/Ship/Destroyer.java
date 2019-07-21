package Ship;

import java.util.Random;

import Game.*;

public class Destroyer extends Unit {
	public int sub;
	

	public Destroyer(String name, int hp, int hp_, int atk, int oil, int reload, int sub) {
		super(name, hp, hp_, atk, oil, reload);
		this.sub=sub;
	}
	
	
	public void subattact(Destroyer u, Unit o) {
		if (u.sub > 0) {
			u.sub--;
			System.out.println("어뢰를 발사합니다. ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("어뢰잔량" + u.sub);
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
				o.hp = o.hp - 450;
				if (o.hp < 0) {
					o.hp = 0;
				}
				System.out.println("적 함선 : " + o.hp);
			} else if (data1 == 2) {
				System.out.println("어뢰가 영~ 좋지 못한 곳을 스칩니다.");
				System.out.println("대미지는 입어드릴께요");
				o.hp = o.hp - 100;
				if (o.hp < 0) {
					o.hp = 0;
				}
				System.out.println("적 함선 : " + o.hp);
			} else if (data1 == 3) {
				System.out.println("적은 현란한 무빙으로 어뢰를 피해갑니다.");
				System.out.println("단 1의 피해도 입히지 못하였습니다.");
			} else if (data1 == 4) {
				System.out.println("해류가 심해서 어뢰가 모두 잘못된 방향으로 나갑니다.");
				System.out.println("적 합선이 당신의 조준실력에 비웃음을 보냅니다.");
			}

		} else if (u.sub <= 0) {
			System.out.println("어뢰의 잔량이 없습니다.");
		}

	}

}
