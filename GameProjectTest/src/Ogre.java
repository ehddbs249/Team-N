
public class Ogre extends Monster {

	
	public Ogre() {
		this.mobName = "Ogre";
		this.hp = 3500 + r.nextInt(500);
		this.def = 150;
		this.recovery = 160;
	}
	@Override
	public void drop_item() {
		// TODO Auto-generated method stub

	}

}
