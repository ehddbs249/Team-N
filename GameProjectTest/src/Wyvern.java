
public class Wyvern extends Monster {

	public Wyvern() {
		this.mobName = "Wyvern";
		this.hp = 130000 + r.nextInt(40000);
		this.atk = 20000 + r.nextInt(5000);
		this.def = 3000 + r.nextInt(1500);
		this.recovery = 1000 + r.nextInt(200);
	}
	@Override
	public void drop_item() {
		// TODO Auto-generated method stub

	}

}
