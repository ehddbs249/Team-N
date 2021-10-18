
public class Kraken extends Monster {
	public Kraken() {
		// TODO Auto-generated constructor stub
		this.mobName = " Kraken";
		this.hp = 800000 + r.nextInt(1200000);
		this.atk = 56000 + r.nextInt(29000);
		this.def = 40000;
	}
	@Override
	public void drop_item() {
		// TODO Auto-generated method stub

	}

}
