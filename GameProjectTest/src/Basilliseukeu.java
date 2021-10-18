
public class Basilliseukeu extends Monster {

	public Basilliseukeu() {
		this.mobName = "Basilliseukeu";
		this.hp = 200000 + r.nextInt(150000);
		this.atk = 26000 + r.nextInt(9000);
		this.def = 6000 + r.nextInt(2000);
		this.recovery = 2000;
		
	}
	@Override
	public void drop_item() {
		// TODO Auto-generated method stub

	}

}
