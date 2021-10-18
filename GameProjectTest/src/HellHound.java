
public class HellHound extends Monster {

	
	public HellHound() {
		// TODO Auto-generated constructor stub
		this.mobName = "HellHound";
		this.hp = 10000000;
		this.atk = 99994 + r.nextInt(40006);
		this.def = 99999;
		this.recovery = 100 + r.nextInt(39900);
	}
	@Override
	public void drop_item() {
		// TODO Auto-generated method stub

	}

}
