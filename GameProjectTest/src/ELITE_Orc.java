
public class ELITE_Orc extends Monster {

	
	public ELITE_Orc() {
		// TODO Auto-generated constructor stub
		this.mobName = "ELITE_Orc";
		this.hp = 8000 + r.nextInt(1500);
		this.atk = 1100;
		this.def = 400;
		this.recovery = 100 + r.nextInt(700);
	}
	@Override
	public void drop_item() {
		// TODO Auto-generated method stub

	}

}
