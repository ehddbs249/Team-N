package monster;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import monster.character.Player;

public class Status extends JFrame{
	
	private Font f = new Font("����", Font.PLAIN, 17);

	public Status(Player player) {
		JFrame frm = new JFrame("Hunting_Ground");
		
		frm.setSize(500,200);
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frm.getContentPane().setLayout(null);
		
		frm.setVisible(true);
		
		JLabel playerName = new JLabel();
		JLabel playerHp = new JLabel();
		JLabel playerMp = new JLabel();
		JLabel playerExp = new JLabel();
		JLabel playerDay = new JLabel();
		
		playerName.setBounds(10, 10, 230, 20);
		playerHp.setBounds(10, 30, 230, 20);
		playerMp.setBounds(10, 50, 230, 20);
		playerExp.setBounds(10, 70, 230, 20);
		playerDay.setBounds(10, 90, 230, 20);
		
		playerName.setText("�̸� : "+player.getName());
		playerHp.setText("Hp : "+player.getHp() + " / "+player.getMaxHp());
		playerMp.setText("Mp : "+player.getMp() + " / "+player.getMaxMp());
		playerExp.setText("Exp("+player.getLevel()+") : "+player.getExp()+" / "+player.getMaxExp());
		playerDay.setText("D-Day : "+player.getDayCount());
		
		playerName.setFont(f);
		playerHp.setFont(f);
		playerMp.setFont(f);
		playerExp.setFont(f);
		playerDay.setFont(f);
		
		frm.getContentPane().add(playerDay);
		frm.getContentPane().add(playerName);
		frm.getContentPane().add(playerHp);
		frm.getContentPane().add(playerExp);
		frm.getContentPane().add(playerMp);
		
		JButton Undo = new JButton("�ڷΰ���");
		
		Undo.setBounds(50,120,200,30);
		
		Undo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frm.dispose();
			}
		});
		
		frm.getContentPane().add(Undo);
	}
}