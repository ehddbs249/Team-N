package monster.map;


import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import monster.item.*;
import monster.player_Info;
import monster.character.Player;

public class Inventory extends JFrame{
	
	HpPotion smallHpItem =new HpPotion("작은체력물약",50,30);
	HpPotion NormalHpItem =new HpPotion("보통체력물약",100,100);
	HpPotion BigHpItem =new HpPotion("큰체력물약",300,400);
	
	MpPotion smallMpItem = new MpPotion("작은마나물약", 50, 30);
	MpPotion NormalMpItem = new MpPotion("보통마나물약", 100, 100);
	MpPotion BigMpItem = new MpPotion("큰마나물약", 300, 40);
	
	
	public Inventory(Player player) {
		
		JFrame m = new JFrame("인벤토리");
		
		m.setTitle("인벤토리");
		m.setSize(800,600);
		
		m.setLocationRelativeTo(null);
		
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		m.getContentPane().setLayout(null);
		
		JButton SmallHp = new JButton("작은 Hp물약");
		JButton NormalHp = new JButton("보통 Hp물약");
		JButton BigHp = new JButton("큰 Hp물약");
		
		JButton SmallMp = new JButton("작은 Mp물약");
		JButton NormalMp = new JButton("보통 Mp물약");
		JButton BigMp = new JButton("큰 Mp물약");
		
		JButton Exit = new JButton("나가기");
		
		JLabel SmallHpStore = new JLabel();
		JLabel NormalHpStore = new JLabel();
		JLabel BigHpStore = new JLabel();
		
		JLabel SmallMpStore = new JLabel();
		JLabel NormalMpStore = new JLabel();
		JLabel BigMpStore = new JLabel();
		
		SmallHp.setBounds(20,20,150,30);
		NormalHp.setBounds(240,20,150,30);
		BigHp.setBounds(460,20,150,30);
		
		Exit.setBounds(30, 500, 150, 30);
		
		SmallMp.setBounds(20,70,150,30);
		NormalMp.setBounds(240,70,150,30);
		BigMp.setBounds(460,70,150,30);
		
		SmallHpStore.setBounds(20,50,100,30);
		NormalHpStore.setBounds(240,50,100,30);
		BigHpStore.setBounds(460,50,100,30);
		
		SmallMpStore.setBounds(20,100,100,30);
		NormalMpStore.setBounds(240,100,100,30);
		BigMpStore.setBounds(460,100,100,30);
		
	
		m.getContentPane().add(NormalHp);
		m.getContentPane().add(SmallHp);
		m.getContentPane().add(BigHp);
		
		m.getContentPane().add(Exit);
		
		m.getContentPane().add(SmallHpStore);
		m.getContentPane().add(NormalHpStore);
		m.getContentPane().add(BigHpStore);
		
		m.getContentPane().add(NormalMp);
		m.getContentPane().add(SmallMp);
		m.getContentPane().add(BigMp);
		
		m.getContentPane().add(SmallMpStore);
		m.getContentPane().add(NormalMpStore);
		m.getContentPane().add(BigMpStore);
		
		SmallHpStore.setText("X "+String.valueOf(player.getLowHpPotions().size()));
		NormalHpStore.setText("X "+String.valueOf(player.getMidHpPotions().size()));
		BigHpStore.setText("X "+String.valueOf(player.getHighHpPotions().size()));
		
		SmallMpStore.setText("X "+String.valueOf(player.getLowHpPotions().size()));
		NormalMpStore.setText("X "+String.valueOf(player.getMidHpPotions().size()));
		BigMpStore.setText("X "+String.valueOf(player.getHighHpPotions().size()));
		
		Exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				m.dispose();
				
			}
		});
		
		SmallHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player.getLowHpPotions().size()==0) {
					JOptionPane.showMessageDialog(null, "남아있는 포션이 없습니다");
				} else if (player.getMaxHp() - player.getHp() > smallHpItem.getHp()) {
					player.getLowHpPotions().remove(0);
					SmallHpStore.setText("X "+String.valueOf(player.getLowHpPotions().size()));
					player.setHp(player.getHp()+smallHpItem.getHp());
					JOptionPane.showMessageDialog(null, "hp를 "+ smallHpItem.getHp()+ "만큼 채웠습니다.");
				} else {
					player.getLowHpPotions().remove(0);
					SmallHpStore.setText("X "+String.valueOf(player.getLowHpPotions().size()));
					JOptionPane.showMessageDialog(null, "hp를 "+ (int)(player.getMaxHp()-player.getHp())+ "만큼 채웠습니다.");
					player.setHp(player.getMaxHp());
				}
			}
		});
		
		NormalHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player.getLowHpPotions().size()==0) {
					JOptionPane.showMessageDialog(null, "남아있는 포션이 없습니다");
				} else if (player.getMaxHp() - player.getHp() > NormalHpItem.getHp()) {
					player.getLowHpPotions().remove(0);
					NormalHpStore.setText("X "+String.valueOf(player.getMidHpPotions().size()));
					player.setHp(player.getHp()+NormalHpItem.getHp());
					JOptionPane.showMessageDialog(null, "hp를 "+ NormalHpItem.getHp()+ "만큼 채웠습니다.");
				} else {
					player.getLowHpPotions().remove(0);
					NormalHpStore.setText("X "+String.valueOf(player.getMidHpPotions().size()));
					JOptionPane.showMessageDialog(null, "hp를 "+ (int)(player.getMaxHp()-player.getHp())+ "만큼 채웠습니다.");
					player.setHp(player.getMaxHp());
				}
			}
		});
		
		BigHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player.getLowHpPotions().size()==0) {
					JOptionPane.showMessageDialog(null, "남아있는 포션이 없습니다");
				} else if (player.getMaxHp() - player.getHp() > BigHpItem.getHp()) {
					player.getLowHpPotions().remove(0);
					BigHpStore.setText("X "+String.valueOf(player.getHighHpPotions().size()));
					player.setHp(player.getHp()+BigHpItem.getHp());
					JOptionPane.showMessageDialog(null, "hp를 "+ BigHpItem.getHp()+ "만큼 채웠습니다.");
				} else {
					player.getLowHpPotions().remove(0);
					BigHpStore.setText("X "+String.valueOf(player.getHighHpPotions().size()));
					JOptionPane.showMessageDialog(null, "hp를 "+ (int)(player.getMaxHp()-player.getHp())+ "만큼 채웠습니다.");
					player.setHp(player.getMaxHp());
				}
			}
		});
		
		SmallMp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player.getLowMpPotions().size()==0) {
					JOptionPane.showMessageDialog(null, "남아있는 포션이 없습니다");
				} else if (player.getMaxMp() - player.getMp() > smallMpItem.getMp()) {
					player.getLowMpPotions().remove(0);
					SmallMpStore.setText("X "+String.valueOf(player.getLowHpPotions().size()));
					player.setHp(player.getMp()+smallMpItem.getMp());
					JOptionPane.showMessageDialog(null, "Mp를 "+ smallMpItem.getMp()+ "만큼 채웠습니다.");
				} else {
					player.getLowMpPotions().remove(0);
					SmallMpStore.setText("X "+String.valueOf(player.getLowHpPotions().size()));
					JOptionPane.showMessageDialog(null, "Mp를 "+ (int)(player.getMaxMp()-player.getMp())+ "만큼 채웠습니다.");
					player.setHp(player.getMaxMp());
				}
			}
		});
		
		NormalMp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player.getLowMpPotions().size()==0) {
					JOptionPane.showMessageDialog(null, "남아있는 포션이 없습니다");
				} else if (player.getMaxMp() - player.getMp() > NormalMpItem.getMp()) {
					player.getLowMpPotions().remove(0);
					NormalMpStore.setText("X "+String.valueOf(player.getMidHpPotions().size()));
					player.setHp(player.getMp()+NormalMpItem.getMp());
					JOptionPane.showMessageDialog(null, "Mp를 "+ NormalMpItem.getMp()+ "만큼 채웠습니다.");
				} else {
					player.getLowMpPotions().remove(0);
					NormalMpStore.setText("X "+String.valueOf(player.getMidHpPotions().size()));
					JOptionPane.showMessageDialog(null, "Mp를 "+ (int)(player.getMaxMp()-player.getMp())+ "만큼 채웠습니다.");
					player.setHp(player.getMaxMp());
				}
			}
		});
		
		BigMp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player.getLowMpPotions().size()==0) {
					JOptionPane.showMessageDialog(null, "남아있는 포션이 없습니다");
				} else if (player.getMaxMp() - player.getMp() > smallMpItem.getMp()) {
					player.getLowMpPotions().remove(0);
					BigMpStore.setText("X "+String.valueOf(player.getHighHpPotions().size()));
					player.setHp(player.getMp()+smallMpItem.getMp());
					JOptionPane.showMessageDialog(null, "Mp를 "+ smallMpItem.getMp()+ "만큼 채웠습니다.");
				} else {
					player.getLowMpPotions().remove(0);
					BigMpStore.setText("X "+String.valueOf(player.getHighHpPotions().size()));
					JOptionPane.showMessageDialog(null, "Mp를 "+ (int)(player.getMaxMp()-player.getMp())+ "만큼 채웠습니다.");
					player.setHp(player.getMaxMp());
				}
			}
		});
		m.setVisible(true);
	}

}
