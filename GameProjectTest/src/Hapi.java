

public class Hapi extends Monster {
	public Hapi() {
		this.mobName = "Hapi";
		this.hp = 600 + r.nextInt(300);
		this.atk = 150 + r.nextInt(50);
		this.def = 6 + r.nextInt(9);
		this.recovery = 20;
	}
	@Override
	public void drop_item() {
		// TODO Auto-generated method stub

	}

}
