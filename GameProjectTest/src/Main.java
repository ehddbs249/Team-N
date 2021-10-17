import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wolf w = new Wolf();
		Player p = new Player("플레이어");
		
		new BattleShow(p,w);
		
		w.display();
		
			

			
				

	}

}
