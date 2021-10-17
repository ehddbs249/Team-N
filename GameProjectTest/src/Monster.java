import java.util.Random;

import javax.swing.JOptionPane;

public abstract class Monster {
	Random r = new Random();
	String mobName;
	int hp =0; //ü��
	int recovery = 0; // ü�� ��� 
	int atk = 0; // ���ݷ�
	int def = 0; // ����
	Item[] items;
	
	
	public void display() {
		System.out.println("<<<<<<<<< " + this.mobName+" >>>>>>>>>");
		System.out.println("Hp   : " + this.hp);
		System.out.println("���ݷ� : " + this.atk);
		System.out.println("-------------------------------------");
	}
	public int attack(Player p) {
		System.out.println(this.mobName+"��(��)+"+p.name+ "�� �����߽��ϴ�.");
		p.hp -= (this.atk);
		
		if(p.hp < 1) {
			JOptionPane.showMessageDialog(null, "Game Over");
			System.out.println(0);
		}
		p.hp_check();
		
		return 0;
	};
	
	public void hp_check() {
		System.out.println(this.mobName+"�� ü����"+this.hp+"�Դϴ�.");
	}
	public void recovey_hp() {
		this.hp += this.recovery;
	}
	public abstract void drop_item();
}
