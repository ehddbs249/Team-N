
public class ELITE_Ogre extends Monster {

	public ELITE_Ogre() {
		this.mobName = "ELITE_Ogre";
		this.hp = 8000 + r.nextInt(1500);
		this.atk = 1100;
		this.def = 400;
		this.recovery = 100 + r.nextInt(700);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void drop_item() {
		// TODO Auto-generated method stub

	}

}
