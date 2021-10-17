
import java.util.Random;

public class Goblin_Hop extends Monster {
	Random r = new Random();
	
	public Goblin_Hop() {
		this.hp = 400 + r.nextInt(30);
		this.atk = 60 + r.nextInt(20);
		this.def = 5 + r.nextInt(2);
		this.recovery = 5;
	}
	@Override
	public void drop_item() {
		// TODO Auto-generated method stub

	}

}
