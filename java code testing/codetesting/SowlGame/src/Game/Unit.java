package Game;

public class Unit {
	
	String name;
	int hp;//체력
	int ad;//공격력
	int dep;//방어력
	int cannonball;//잔탄수
	boolean dead;//죽음 판단
	
	public Unit (String name, int hp, int ad, int dep, int cannonball) {
		this.name=name;
		this.hp=hp;
		this.ad=ad;
		this.dep=dep;
		this.dead=false;
	}
	
	
	public void checkDead() {
		if(this.hp<=0)
			dead=true;
	}
}
