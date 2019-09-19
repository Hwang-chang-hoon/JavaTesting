package Ship;

import java.util.Random;

import Game.*;

public class Destroyer extends Unit {
	static public int sub;

	public Destroyer(String name, int hp, int hp_, int atk, int atk_, int oil, int oil_, int reload, int tr, int sub) {
		super(name, hp, hp_, atk, atk_, oil, oil_, reload, tr);
		this.sub = sub;
	}

	

}
