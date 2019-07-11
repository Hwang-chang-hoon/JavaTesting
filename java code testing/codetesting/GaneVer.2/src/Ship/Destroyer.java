package Ship;

import Game.*;

public class Destroyer extends Unit {
	int sub;
	int sub_atk;
	

	public Destroyer(String name, int hp, int atk, int oil, int reload, int sub, int sub_atk) {
		super(name, hp, atk, oil, reload);
		this.sub=sub;
		this.sub_atk=sub_atk;
	}

}
