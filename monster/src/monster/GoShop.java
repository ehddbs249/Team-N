package monster;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import monster.character.Player;
import monster.item.HpPotion;
import monster.item.MpPotion;

public class GoShop {
	
	HpPotion smallHpItem =new HpPotion("작은체력물약",50,30);
	HpPotion NormalHpItem =new HpPotion("보통체력물약",100,100);
	HpPotion BigHpItem =new HpPotion("큰체력물약",300,400);
	
	MpPotion smallMpItem = new MpPotion("작은마나물약", 50, 30);
	MpPotion NormalMpItem = new MpPotion("보통마나물약", 100, 100);
	MpPotion BigMpItem = new MpPotion("큰마나물약", 300, 40);
	
	public GoShop(Player player) {
		JFrame frm = new JFrame("Shop");
		
		frm.setSize(800,300);
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frm.getContentPane().setLayout(null);
		
		frm.setVisible(true);
		
		JButton BuyStrPotion1 = new JButton("작은 힘 물약");
		JButton BuyStrPotion2 = new JButton("보통 힘 물약");
		JButton BuyStrPotion3 = new JButton("큰 힘 물약");
		
		JButton BuyDefPotion1 = new JButton("작은 방어 물약");
		JButton BuyDefPotion2 = new JButton("보통 방어 물약");
		JButton BuyDefPotion3 = new JButton("큰 방어 물약");
		
		JButton Undo = new JButton("뒤로가기");
		JLabel MoneyShow = new JLabel("Gold : " + player.getMoney());

		BuyStrPotion1.setBounds(20, 20, 300, 50);
		BuyStrPotion2.setBounds(340, 20, 300, 50);
		BuyStrPotion3.setBounds(20, 80, 300, 50);
		BuyDefPotion1.setBounds(340, 80, 300, 50);
		BuyDefPotion2.setBounds(20, 140, 300, 50);
		BuyDefPotion3.setBounds(340, 140, 300, 50);
		
		Undo.setBounds(20, 200, 300, 50);
		MoneyShow.setBounds(340, 200, 300, 50);
		
		frm.getContentPane().add(BuyDefPotion1);
		frm.getContentPane().add(BuyDefPotion2);
		frm.getContentPane().add(BuyDefPotion3);

		frm.getContentPane().add(BuyStrPotion1);
		frm.getContentPane().add(BuyStrPotion2);
		frm.getContentPane().add(BuyStrPotion3);
		frm.getContentPane().add(Undo);
		frm.getContentPane().add(MoneyShow);
		
		BuyDefPotion1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player.getMoney()>300) {
					player.setMoney(player.getMoney()-300);
					player.setDefense(player.getDefense()*1.2);
				}
				MoneyShow.setText("Gold : " + player.getMoney());
			}
		});BuyDefPotion2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player.getMoney()>1000) {
					player.setMoney(player.getMoney()-1000);
					player.setDefense(player.getDefense()*1.8);
				}
				MoneyShow.setText("Gold : " + player.getMoney());
			}
		});BuyDefPotion3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player.getMoney()>5000) {
					player.setMoney(player.getMoney()-5000);
					player.setDefense(player.getDefense()*3.0);
				}
				MoneyShow.setText("Gold : " + player.getMoney());
			}
		});BuyStrPotion1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player.getMoney()>300) {
					player.setMoney(player.getMoney()-300);
					player.setStrength(player.getStrength()*1.2);
				}
				MoneyShow.setText("Gold : " + player.getMoney());
			}
		});BuyStrPotion2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player.getMoney()>1000) {
					player.setMoney(player.getMoney()-1000);
					player.setStrength(player.getStrength()*1.8);
				}
				MoneyShow.setText("Gold : " + player.getMoney());
			}
		});BuyStrPotion3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player.getMoney()>5000) {
					player.setMoney(player.getMoney()-5000);
					player.setStrength(player.getStrength()*3.0);
				}
				MoneyShow.setText("Gold : " + player.getMoney());
			}
		});Undo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frm.dispose();
			}
		});
	}
	
}
