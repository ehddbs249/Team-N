
public class Baby_Dragon extends Monster {
	
	public Baby_Dragon() {
		this.mobName = "Baby_Dragon";
		this.hp = 1000 + r.nextInt(500);
		this.atk = 400;
		this.def = 30;
		this.recovery = 50;
	}

	@Override
	public void drop_item() {
		// TODO Auto-generated method stub

	}

}
