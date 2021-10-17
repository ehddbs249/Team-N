import java.util.Random;

public class Zombie extends Monster{
	Random r = new Random();
	
	public Zombie() {
		this.mobName = "Zombie";
		this.hp = 150 + r.nextInt(50);
		this.atk = 5;
		this.recovery = 2;
	}
	@Override
	public void drop_item() {
		// TODO Auto-generated method stub
		
	}

}
