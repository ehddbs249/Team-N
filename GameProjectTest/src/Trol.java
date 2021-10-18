
public class Trol extends Monster {

	private Trol() {
		this.mobName = "Trol";
		this.hp = 5000 + r.nextInt(1000);
		this.atk = 670 + r.nextInt(750);
		this.def = 200;
		this.recovery = 250;

	}
	@Override
	public void drop_item() {
		// TODO Auto-generated method stub

	}

}
