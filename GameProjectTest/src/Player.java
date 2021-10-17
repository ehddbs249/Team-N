import javax.swing.JOptionPane;

class Player {
	
	String name = "플레이어";
	int hp = 10000000;
	int atk = 10;
	
	public Player(String n) {
		name = n;
	}
	
	public int attack(Monster m) {
		System.out.println(this.name+"이(가)+"+m.mobName+ "을 공격했습니다.");
		m.hp -= (this.atk);
		
		if(m.hp < 1) {
			JOptionPane.showMessageDialog(null, "Game Clear");
			System.out.println(0);
		}
		m.hp_check();
		
		return 0;
	};
	
	public void hp_check() {
		System.out.println(this.name+"의 체력은"+this.hp+"입니다.");
	}

}
