package Game;

public class Unit {
	
	String name;
	int hp;//ü��
	int ad;//���ݷ�
	int dep;//����
	int cannonball;//��ź��
	boolean dead;//���� �Ǵ�
	
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
