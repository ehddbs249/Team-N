
public class Lycan extends Monster {

	public Lycan() {
		// TODO Auto-generated constructor stub
		this.mobName = "Lycan";
		this.hp = 200000 + r.nextInt(130000);
		this.atk = 40000;
		this.def = 9000;
		this.recovery = 3500;
	}
	@Override
	public void drop_item() {
		// TODO Auto-generated method stub

	}

}
