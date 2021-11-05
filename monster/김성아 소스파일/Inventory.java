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
	
	HpPotion smallHpItem =new HpPotion("����ü�¹���",50,30);
	HpPotion NormalHpItem =new HpPotion("����ü�¹���",100,100);
	HpPotion BigHpItem =new HpPotion("ūü�¹���",300,400);
	
	MpPotion smallMpItem = new MpPotion("������������", 50, 30);
	MpPotion NormalMpItem = new MpPotion("���븶������", 100, 100);
	MpPotion BigMpItem = new MpPotion("ū��������", 300, 40);
	
	
	public Inventory(Player player) {
		
		JFrame m = new JFrame("�κ��丮");
		
		m.setTitle("�κ��丮");
		m.setSize(800,600);
		
		m.setLocationRelativeTo(null);
		
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		m.getContentPane().setLayout(null);
		
		JButton SmallHp = new JButton("���� Hp����");
		JButton NormalHp = new JButton("���� Hp����");
		JButton BigHp = new JButton("ū Hp����");
		
		JButton SmallMp = new JButton("���� Mp����");
		JButton NormalMp = new JButton("���� Mp����");
		JButton BigMp = new JButton("ū Mp����");
		
		JButton Exit = new JButton("������");
		
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
					JOptionPane.showMessageDialog(null, "�����ִ� ������ �����ϴ�");
				} else if (player.getMaxHp() - player.getHp() > smallHpItem.getHp()) {
					player.getLowHpPotions().remove(0);
					SmallHpStore.setText("X "+String.valueOf(player.getLowHpPotions().size()));
					player.setHp(player.getHp()+smallHpItem.getHp());
					JOptionPane.showMessageDialog(null, "hp�� "+ smallHpItem.getHp()+ "��ŭ ä�����ϴ�.");
				} else {
					player.getLowHpPotions().remove(0);
					SmallHpStore.setText("X "+String.valueOf(player.getLowHpPotions().size()));
					JOptionPane.showMessageDialog(null, "hp�� "+ (int)(player.getMaxHp()-player.getHp())+ "��ŭ ä�����ϴ�.");
					player.setHp(player.getMaxHp());
				}
			}
		});
		
		NormalHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player.getLowHpPotions().size()==0) {
					JOptionPane.showMessageDialog(null, "�����ִ� ������ �����ϴ�");
				} else if (player.getMaxHp() - player.getHp() > NormalHpItem.getHp()) {
					player.getLowHpPotions().remove(0);
					NormalHpStore.setText("X "+String.valueOf(player.getMidHpPotions().size()));
					player.setHp(player.getHp()+NormalHpItem.getHp());
					JOptionPane.showMessageDialog(null, "hp�� "+ NormalHpItem.getHp()+ "��ŭ ä�����ϴ�.");
				} else {
					player.getLowHpPotions().remove(0);
					NormalHpStore.setText("X "+String.valueOf(player.getMidHpPotions().size()));
					JOptionPane.showMessageDialog(null, "hp�� "+ (int)(player.getMaxHp()-player.getHp())+ "��ŭ ä�����ϴ�.");
					player.setHp(player.getMaxHp());
				}
			}
		});
		
		BigHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player.getLowHpPotions().size()==0) {
					JOptionPane.showMessageDialog(null, "�����ִ� ������ �����ϴ�");
				} else if (player.getMaxHp() - player.getHp() > BigHpItem.getHp()) {
					player.getLowHpPotions().remove(0);
					BigHpStore.setText("X "+String.valueOf(player.getHighHpPotions().size()));
					player.setHp(player.getHp()+BigHpItem.getHp());
					JOptionPane.showMessageDialog(null, "hp�� "+ BigHpItem.getHp()+ "��ŭ ä�����ϴ�.");
				} else {
					player.getLowHpPotions().remove(0);
					BigHpStore.setText("X "+String.valueOf(player.getHighHpPotions().size()));
					JOptionPane.showMessageDialog(null, "hp�� "+ (int)(player.getMaxHp()-player.getHp())+ "��ŭ ä�����ϴ�.");
					player.setHp(player.getMaxHp());
				}
			}
		});
		
		SmallMp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player.getLowMpPotions().size()==0) {
					JOptionPane.showMessageDialog(null, "�����ִ� ������ �����ϴ�");
				} else if (player.getMaxMp() - player.getMp() > smallMpItem.getMp()) {
					player.getLowMpPotions().remove(0);
					SmallMpStore.setText("X "+String.valueOf(player.getLowHpPotions().size()));
					player.setHp(player.getMp()+smallMpItem.getMp());
					JOptionPane.showMessageDialog(null, "Mp�� "+ smallMpItem.getMp()+ "��ŭ ä�����ϴ�.");
				} else {
					player.getLowMpPotions().remove(0);
					SmallMpStore.setText("X "+String.valueOf(player.getLowHpPotions().size()));
					JOptionPane.showMessageDialog(null, "Mp�� "+ (int)(player.getMaxMp()-player.getMp())+ "��ŭ ä�����ϴ�.");
					player.setHp(player.getMaxMp());
				}
			}
		});
		
		NormalMp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player.getLowMpPotions().size()==0) {
					JOptionPane.showMessageDialog(null, "�����ִ� ������ �����ϴ�");
				} else if (player.getMaxMp() - player.getMp() > NormalMpItem.getMp()) {
					player.getLowMpPotions().remove(0);
					NormalMpStore.setText("X "+String.valueOf(player.getMidHpPotions().size()));
					player.setHp(player.getMp()+NormalMpItem.getMp());
					JOptionPane.showMessageDialog(null, "Mp�� "+ NormalMpItem.getMp()+ "��ŭ ä�����ϴ�.");
				} else {
					player.getLowMpPotions().remove(0);
					NormalMpStore.setText("X "+String.valueOf(player.getMidHpPotions().size()));
					JOptionPane.showMessageDialog(null, "Mp�� "+ (int)(player.getMaxMp()-player.getMp())+ "��ŭ ä�����ϴ�.");
					player.setHp(player.getMaxMp());
				}
			}
		});
		
		BigMp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player.getLowMpPotions().size()==0) {
					JOptionPane.showMessageDialog(null, "�����ִ� ������ �����ϴ�");
				} else if (player.getMaxMp() - player.getMp() > smallMpItem.getMp()) {
					player.getLowMpPotions().remove(0);
					BigMpStore.setText("X "+String.valueOf(player.getHighHpPotions().size()));
					player.setHp(player.getMp()+smallMpItem.getMp());
					JOptionPane.showMessageDialog(null, "Mp�� "+ smallMpItem.getMp()+ "��ŭ ä�����ϴ�.");
				} else {
					player.getLowMpPotions().remove(0);
					BigMpStore.setText("X "+String.valueOf(player.getHighHpPotions().size()));
					JOptionPane.showMessageDialog(null, "Mp�� "+ (int)(player.getMaxMp()-player.getMp())+ "��ŭ ä�����ϴ�.");
					player.setHp(player.getMaxMp());
				}
			}
		});
		m.setVisible(true);
	}

}
