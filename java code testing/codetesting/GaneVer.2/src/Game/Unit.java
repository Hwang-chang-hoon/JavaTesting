package Game;

public class Unit {

	String name;
	int hp;//ü��
	int atk;//���ݷ�
	int oil;//����
	int reload;//��ź��
	boolean dead;//���� �Ǵ�
	
	public Unit (String name, int hp, int atk, int oil, int reload ) {
		this.name=name;
		this.hp=hp;
		this.atk=atk;
		this.oil=oil;
		this.reload=reload;
		this.dead=false;
	}
	
	
	
	public void checkDead() {
		if(this.hp<=0)
			dead=true;
	}

}
