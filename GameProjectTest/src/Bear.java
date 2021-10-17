import java.util.Random;

public class Bear extends Monster {
	Random r = new Random();
	
	public Bear() {
		this.mobName = "Bear";
		this.atk = 15;
		this.recovery = 1;
		this.def = 2;
	}
	@Override
	public void drop_item() {
		// TODO Auto-generated method stub

	}

}
