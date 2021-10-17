import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BattleShow extends JFrame{
	public BattleShow(Player p, Monster m) {
		
		
		
		JFrame frm = new JFrame("Monster");
		
		// ������ ũ�� ����
		frm.setSize(350,300);
		
		// �������� ȭ�� ����� ��ġ
		frm.setLocationRelativeTo(null);
		
		// �������� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ���̾ƿ� ����
		frm.getContentPane().setLayout(null);
		
		
		JButton atk_btn = new JButton("����");
		JButton ski_btn1 = new JButton("��ų");
		
		atk_btn.setBounds(30,170,122,30);
		ski_btn1.setBounds(182, 170, 122, 30);
		
		// �����ӿ� ��ư�߰�
		frm.getContentPane().add(atk_btn);
		frm.getContentPane().add(ski_btn1);
		
		JLabel lbl = new JLabel();
		lbl.setBounds(30, 200, 274, 50);
		lbl.setText("������ �����մϴ�.");
		lbl.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(lbl);
		
		atk_btn.addActionListener(event -> {
			p.attack(m);
		});
		
		// �������� ���̵��� ����
		frm.setVisible(true);
	}
}
