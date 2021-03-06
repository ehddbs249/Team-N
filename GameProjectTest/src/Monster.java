
import java.util.Random;

import javax.swing.JOptionPane;

public abstract class Monster {
	Random r = new Random();
	public String mobName;
	public int hp =0; //체력
	int recovery = 0; // 체력 재생 
	int atk = 0; // 공격력
	int def = 0; // 방어력
	Item[] items;
	
	
	public void display() {
		System.out.println("<<<<<<<<< " + this.mobName+" >>>>>>>>>");
		System.out.println("Hp   : " + this.hp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("-------------------------------------");
	}
	public int attack(Player p) {
		System.out.println(this.mobName+"이(가)+"+p.name+ "을 공격했습니다.");
		p.hp -= (this.atk);
		
		if(p.hp < 1) {
			JOptionPane.showMessageDialog(null, "Game Over");
			System.out.println(0);
		}
		p.hp_check();
		
		return 0;
	};
	
	public String hp_check() {
		String a = this.mobName+"의 체력은"+this.hp+"입니다.";
		return a;
	}
	public void recovey_hp() {
		this.hp += this.recovery;
	}
	public abstract void drop_item();
}
