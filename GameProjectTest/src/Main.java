import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		

		Wolf w = new Wolf();
		Player p = new Player("�÷��̾�");
		
		new BattleShow(p,w);
		
		w.display();
		
		
		while(true) {
			// ������ǲ�ڽ�
			String sTarget = JOptionPane.showInputDialog("������ ����Ͻðڽ��ϱ�");
			
			// �ΰ��̳� ���� �ԷµǸ� ����
			if (sTarget == null || sTarget.equals("")) {
				System.exit(0);
			}
			
			// ����ȯ
			int target = Integer.parseInt(sTarget);
			
			if(target == 1) {
				p.attack(w);
			} else {
				System.out.println("��ų �߰� ����");
			}
			
			}
				

	}

}
