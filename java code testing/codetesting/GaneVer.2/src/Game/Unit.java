package Game;

public class Unit {

	String name;
	int hp;//Ã¼·Â
	int atk;//°ø°Ý·Â
	int oil;//¿¬·á
	int reload;//ÀÜÅº¼ö
	boolean dead;//Á×À½ ÆÇ´Ü
	
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
