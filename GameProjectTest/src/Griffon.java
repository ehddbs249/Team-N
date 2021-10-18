
public class Griffon extends Monster {

	public Griffon() {
		this.mobName = "Griffon";
		this.hp = 470000 + r.nextInt(200000);
		this.atk = 45000 + r.nextInt(15000);
		this.def = 10000;
		this.recovery = 2500 + r.nextInt(1500);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void drop_item() {
		// TODO Auto-generated method stub

	}

}
