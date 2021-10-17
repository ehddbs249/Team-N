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
		
		
		while(true) {
			// 선택인풋박스
			String sTarget = JOptionPane.showInputDialog("무엇을 사용하시겠습니까");
			
			// 널값이나 빈값이 입력되면 종료
			if (sTarget == null || sTarget.equals("")) {
				System.exit(0);
			}
			
			// 형변환
			int target = Integer.parseInt(sTarget);
			
			if(target == 1) {
				p.attack(w);
			} else {
				System.out.println("스킬 추가 예정");
			}
			
			}
				

	}

}
