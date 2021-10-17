

import java.util.Random;

public class Wolf extends Monster{
	Random r = new Random();
	
	public Wolf() {
		this.mobName = "wolf";
		this.hp = 100 + r.nextInt(20);
		this.atk = 10;
	}

	@Override
	public void drop_item() {
		// TODO Auto-generated method stub
		
	}

}
