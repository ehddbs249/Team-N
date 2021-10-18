
public class Viking extends Monster {
	
	public Viking() {
		// TODO Auto-generated constructor stub
		this.mobName = "Viking";
		this.hp = 100000 + r.nextInt(40000);
		this.atk = 20000;
		this.def = 3000;
		this.recovery = 500;
	}
	@Override
	public void drop_item() {
		// TODO Auto-generated method stub

	}

}
