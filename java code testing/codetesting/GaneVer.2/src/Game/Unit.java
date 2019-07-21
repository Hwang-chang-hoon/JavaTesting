package Game;

import java.util.Random;
import java.util.Scanner;

public class Unit {

	String name;
	public int hp;//체력
	public int hp_;//체력 초기화
	public int atk;//공격력
	public int oil;//연료
	public int reload;//잔탄수
	public int power;//강화횟수
	public boolean isPowered;//강화 횟수 판단
	public boolean dead;//죽음 판단
	
	public Unit (String name, int hp, int hp_, int atk, int oil, int reload ) {
		this.name=name;
		this.hp_=hp_;
		this.hp=hp;
		this.atk=atk;
		this.oil=oil;
		this.reload=reload;
		this.power=0;
		this.dead=false;
	}
	
	
	public boolean isPowered() {
		return power>10 ? false:true; 
	}
	
	public boolean checkDead() {
		if(this.hp<=0)
			dead=true;
		return dead;
	}

	public static void battle(Unit user, Unit opposite) {
		System.out.println("전투를 진행합니다.");
		System.out.println("지휘를 내려주십시요");
		System.out.println("1.발포 2.회피 3.장전 ");
		Scanner num1111 = new Scanner(System.in);
		int e = num1111.nextInt();
		Random random1 = new Random();
		int com = random1.nextInt(3) + 1;
		// 1
		if (e == 1 && com == 1 && user.reload > 0 && opposite.reload > 0) {
			System.out.println("서로가 서로에게 발포를 합니다.");
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			user.hp -= (opposite.atk * opposite.reload);
			opposite.hp -= (user.atk * user.reload);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
			user.reload = 0;
			opposite.reload = 0;
		} // 서로 발포
			// 2
		else if (e == 1 && com == 1 && user.reload > 0 && opposite.reload == 0) {
			System.out.println("역시 AI는 아직 인간을 뛰어넘지 못합니다.");
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			opposite.hp -= (user.atk * user.reload);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
			user.reload = 0;
			opposite.reload = 0;
		} // 나만 장전
			// 3
		else if (e == 1 && com == 1 && user.reload == 0 && opposite.reload == 0) {
			System.out.println("장전이 준비되지않았습니다.");
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
			user.reload = 0;
			opposite.reload = 0; 
		} // 서로 장전 X
			// 4
		else if (e == 1 && com == 1 && user.reload == 0 && opposite.reload > 0) {
			System.out.println("장전이 준비되지않았습니다.");
			System.out.println("그런대 상대방은 전투의 준비가 끝난모양이군요.");
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			user.hp -= (opposite.atk * opposite.reload);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
			user.reload = 0;
			opposite.reload = 0;
		} // 상대만 장전
			// 5
		else if (e == 1 && com == 2 && user.reload > 0 && user.reload < 3 && opposite.oil > 0) {
			System.out.println("발포합니다.");
			System.out.println("적이 회피기동은 사용하였습니다.");
			System.out.println("한발도 맞지 않았습니다.");
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			opposite.oil -= 1;
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
			user.reload = 0;
		} // 나 발포 상대 회피
			// 6
		else if (e == 1 && com == 2 && user.reload >= 3 && opposite.oil > 0) {
			System.out.println("발포합니다.");
			System.out.println("적이 회피기동은 사용하였습니다.");
			System.out.println("장전이 많이 되어 탄막이 충분히 형성되었습니다.");
			System.out.println("피해를 조금 입힙니다.");
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			opposite.hp -= (user.atk * (user.reload / 3));
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
			user.reload = 0;
		} // 나 발포 성공 상대 회피
			// 7
		else if (e == 1 && com == 2 && user.reload > 0 && user.reload < 3 && opposite.oil == 0) {
			System.out.println("발포합니다.");
			System.out.println("적이 멍청하게도 회피를 사용못하는데 회피기동을 명령했습니다.");
			System.out.println("피해를 입힙니다.");
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			opposite.hp -= (user.atk * user.reload);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
			user.reload = 0;
		} // 나발포 상대 회피불가
			// 8
		else if (e == 1 && com == 2 && user.reload == 0 && opposite.oil > 0) {
			System.out.println("포대에 포탄이 없습니다.");
			System.out.println("상대는 겁을먹고 회피기동을 시행합니다.");
			System.out.println("피해를 입히지도 입지도 않았습니다.");
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			opposite.oil -= 1;
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
		} // 나 발포 준비 X상대 회피
			// 9
		else if (e == 1 && com == 2 && user.reload == 0 && opposite.oil == 0) {
			System.out.println("포대에 포탄 없습니다.");
			System.out.println("상대도 준비가 안된상태로 회피기동합니다.");
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
		} // 나발포 준비 안됨 산대 회피 불가
			// 10
		else if (e == 1 && com == 3 && user.reload > 0) {
			System.out.println("발포합니다.");
			System.out.println("적은 장전중입니다.");
			System.out.println("프리딜타임~~");
			opposite.reload += 1;
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			opposite.hp -= (user.atk * user.reload);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
			user.reload = 0;
		} // 나발포 상대장전
			// 11
		else if (e == 1 && com == 3 && user.reload == 0) {
			System.out.println("포대에 포탄이 없습니다.");
			System.out.println("상대는 전투를 준비하는군요.");
			opposite.reload += 1;
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			System.out.println("내꺼 : " + user.hp + "컴퓨터꺼 : " + opposite.hp);
		} // 나 발포불가 상대장전
			// 12
		else if (e == 2 && com == 1 && user.oil > 0 && opposite.reload > 0 && opposite.reload < 3) {
			System.out.println("회피기동을 합니다.");
			System.out.println("상대는 발포했습니다.");
			System.out.println("상대의 탄을 소비합니다.");
			System.out.println("아주 좋소.");
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			user.oil -= 1;
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
			opposite.reload = 0;
		} // 나 회피 상대 발포
			// 13
		else if (e == 2 && com == 1 && user.oil > 0 && opposite.reload >= 3) {
			System.out.println("회피기동을 합니다.");
			System.out.println("적기에서 도저히 회피할 수 없는 탄막이 나라옵니다.");
			System.out.println("부디 피해가 경미하기만을 기도합니다.");
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			user.oil -= 1;
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			user.hp -= (opposite.atk * (opposite.reload / 3));
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
			opposite.reload = 0;
		} // 나 회피 상대 3번모아 발포
			// 14
		else if (e == 2 && com == 1 && user.oil > 0 && opposite.reload == 0) {
			System.out.println("회피기동을 시행합니다.");
			System.out.println("상대도 발포를 하려합니다.");
			System.out.println("그런대 탄이 발사되지 않았습니다.");
			System.out.println("역시 인간은 위대합니다(푸흡)");
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			user.oil -= 1;
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
			opposite.reload = 0;
		} // 나 회피 상대 발포 실패
			// 15
		else if (e == 2 && com == 2 && user.oil == 0 && opposite.reload > 0) {
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
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			user.hp -= (opposite.atk * opposite.reload);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
			opposite.reload = 0;
		} // 나 회피 불가 상대 발포 성공
			// 16
		else if (e == 2 && com == 1 && user.oil == 0 && opposite.reload == 0) {
			System.out.println("둘다 바보입니다.");
			System.out.println("제발 자신의 적제량을 확인하세요.");
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
			opposite.reload = 0;
		} // 나 회피 불가 상대 발포 실패
			// 17
		else if (e == 2 && com == 2 && user.oil > 0 && opposite.oil > 0) {
			System.out.println("회피기동을 합니다.");
			System.out.println("상대도 회피기동을 합니다.");
			System.out.println("아까운 기름만 날렸군요.");
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
		} // 나 회피 상대 회피
			// 18
		else if (e == 2 && com == 2 && user.oil == 0 && opposite.oil > 0) {
			System.out.println("기름없습니다.");
			System.out.println("상대방도 허공에 기름을 낭비하는군요.");
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			opposite.oil -= 1;
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
		} // 나 회피 불가 상대 회피 가능
			// 19
		else if (e == 2 && com == 2 && user.oil > 0 && opposite.oil == 0) {
			System.out.println("회피 기동을 실시합니다.");
			System.out.println("상대는 기름이 다떨어졌습니다.");
			System.out.println("기름만 낭비하셨군요?");
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			user.oil -= 1;
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
		} // 나회피가능 상대회피 불가
			// 20
		else if (e == 2 && com == 2 && user.oil == 0 && opposite.oil == 0) {
			System.out.println("기름이 부족하다고");
			System.out.println("상대도 부족합니다.");
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
		} // 나회피불가 산대 회피불가
			// 21
		else if (e == 2 && com == 3 && user.oil > 0) {
			System.out.println("회피기동을 시도합니다.");
			System.out.println("상대는 장전합니다.");
			opposite.reload += 1;
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
		} // 나 회피 상대 장전
			// 22
		else if (e == 2 && com == 3 && user.oil == 0) {
			System.out.println("회피기동이 기름이 없어서 실패했습니다.");
			System.out.println("상대는 장전하여 더강한 공격력을 보유합니다.");
			opposite.reload += 1;
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
		} // 나 회피불가 상대 장전
			// 23
		else if (e == 3 && com == 1 && opposite.reload > 0) {
			System.out.println("장전 합니다.");
			System.out.println("상대는 발포합니다.");
			System.out.println("걍 쳐 맞으세여");
			user.reload += 1;
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			user.hp -= (opposite.atk * user.reload);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
			opposite.reload = 0;
		} // 나 장전 상대 발싸
			// 24
		else if (e == 3 && com == 1 && opposite.reload == 0) {
			System.out.println("장전을 합니다.");
			System.out.println("상대는 장전의 중요성을 모르는 모양입니다.");
			user.reload += 1;
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
		} // 나 장전 상대 발포실패
			// 25
		else if (e == 3 && com == 2 && opposite.oil > 0) {
			System.out.println("장전을 합니다. ");
			System.out.println("상대는 회피기동을 합니다.");
			System.out.println("상대는 기름을 허공에 뿌렸습니다.");
			user.reload += 1;
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			opposite.oil -= 1;
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
		} // 나 장전 상대 회피
			// 26
		else if (e == 3 && com == 2 && opposite.oil == 0) {
			System.out.println("장전을 합니다.");
			System.out.println("상대는  기름도 없는데 회피기동을 시도합니다.");
			user.reload += 1;
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
		} // 나장전 산대 회피 실패
			// 27
		else if (e == 3 && com == 3) {
			System.out.println("장전합니다.");
			System.out.println("상대방도 장전합니다.");
			user.reload += 1;
			opposite.reload += 1;
			System.out.println("서로의 장전횟수");
			System.out.println("내꺼 : " + user.reload + "컴퓨터꺼 : " + opposite.reload);
			System.out.println("서로의 회피가능 횟수");
			System.out.println("내꺼" + user.oil + "상대꺼" + opposite.oil);
			System.out.println("내꺼 user.hp : " + user.hp + "컴퓨터꺼 user.hp : " + opposite.hp);
		} // 나장전 상대 장전

	}

}

