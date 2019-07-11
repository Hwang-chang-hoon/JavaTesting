package Ship;

import Game.*;
public class Cruiser extends Unit {
	int plain;
	int plain_atk;

	public Cruiser(String name, int hp, int atk, int oil, int reload, int plain, int plain_atk) {
		super(name, hp, atk, oil, reload);
		this.plain=plain;
		this.plain_atk=plain_atk;
	}

}
