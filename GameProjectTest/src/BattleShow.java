import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BattleShow extends JFrame{
	public BattleShow(Player p, Monster m) {
		
		
		
		JFrame frm = new JFrame("Monster");
		
		// 프레임 크기 설정
		frm.setSize(350,300);
		
		// 프레임을 화면 가운데에 배치
		frm.setLocationRelativeTo(null);
		
		// 프레임을 닫았을 때 메모리에서 제거되도록 설정
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 레이아웃 설정
		frm.getContentPane().setLayout(null);
		
		
		JButton atk_btn = new JButton("공격");
		JButton ski_btn1 = new JButton("스킬");
		
		atk_btn.setBounds(30,170,122,30);
		ski_btn1.setBounds(182, 170, 122, 30);
		
		// 프레임에 버튼추가
		frm.getContentPane().add(atk_btn);
		frm.getContentPane().add(ski_btn1);
		
		JLabel lbl = new JLabel();
		lbl.setBounds(30, 200, 274, 50);
		lbl.setText("전투를 시작합니다.");
		lbl.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(lbl);
		
		atk_btn.addActionListener(event -> {
			p.attack(m);
		});
		
		// 프레임이 보이도록 설정
		frm.setVisible(true);
	}
}
