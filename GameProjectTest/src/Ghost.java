
import java.util.Random;

public class Ghost extends Monster {

	Random r = new Random();
	
	public Ghost() {
		this.mobName = "Ghost";
		this.hp = 15 + r.nextInt(10);
		this.atk = 30 + r.nextInt(10);
	}
	@Override
	public void drop_item() {
		// TODO Auto-generated method stub

	}

}
