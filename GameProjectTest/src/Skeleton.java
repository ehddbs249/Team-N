

import java.util.Random;

public class Skeleton extends Monster {
	Random r = new Random();
	
	public Skeleton() {
		this.hp = 300 + r.nextInt(200);
		this.atk = 100;
		this.def = 10;
	}
	@Override
	public void drop_item() {
		// TODO Auto-generated method stub

	}

}
