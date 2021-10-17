
import java.util.Random;

public class Goblin extends Monster {
	Random r = new Random();
	
	public Goblin() {
		this.mobName = "Goblin";
		this.hp = 90;
		this.atk = 20;
		this.def = 2;
		this.recovery = 1;
	}
	@Override
	public void drop_item() {
		// TODO Auto-generated method stub

	}

}
