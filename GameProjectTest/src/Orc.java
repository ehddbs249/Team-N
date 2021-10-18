
public class Orc extends Monster {
	
	
	public Orc() {
		this.mobName = "Orc";
		this.hp = 2000 + r.nextInt(500);
		this.atk = 500;
		this.def = 100;
		this.recovery = 125;
	}
	@Override
	public void drop_item() {
		// TODO Auto-generated method stub
		

	}

}
