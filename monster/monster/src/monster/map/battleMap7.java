package monster.map;

import monster.MainFrame;
import monster.character.*;
import monster.item.*;

import java.awt.Image;
import java.awt.TextArea;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class battleMap7 extends JFrame{
	
	String bsText = null;
	public battleMap7(Player p, Monster m) {
		
		
		
		JFrame frm = new JFrame("Monster");
		
		// ������ ũ�� ����
		frm.setSize(600,600);
		
		
		// �������� ȭ�� ����� ��ġ
		frm.setLocationRelativeTo(null);
		
		
		// �������� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// ���̾ƿ� ����
		frm.getContentPane().setLayout(null);
		
		
		TextArea bs = new TextArea("�ӽ� ���ڿ�",40,30);
		
		JButton atk_btn = new JButton("����");
		JButton ski_btn1 = new JButton("��ų1");
		JButton ski_btn2 = new JButton("��ų2");
		JButton Run_btn = new JButton("����ġ��");
		JButton Inven = new JButton("�κ��丮");
		
		// Label
		
		
		atk_btn.setBounds(248-200,270,160,30);
		ski_btn1.setBounds(430-200, 270, 160, 30);
		ski_btn2.setBounds(248-200,310, 160, 30);
		Run_btn.setBounds(430-200, 310, 160, 30);
		Inven.setBounds(600-200, 270, 160, 30);
		bs.setBounds(10, 350, 600, 200);
		
		
		JLabel monsterName = new JLabel();
		JLabel monsterHp = new JLabel();
		
	
		
		monsterName.setBounds(400,200,274,50);
		monsterHp.setBounds(400,230,274,50);
		
		
		monsterName.setText("Name : "+m.getName());
		monsterHp.setText("Hp : "+m.getHp()+" / "+m.getMaxHp());
		
		
		frm.getContentPane().add(monsterHp);
		frm.getContentPane().add(monsterName);
		
		
		JLabel playerName = new JLabel();
		JLabel playerHp = new JLabel();
		JLabel playerLevel = new JLabel();
		
		
		playerName.setBounds(30,200,274,50);
		playerHp.setBounds(30,230,274,50);
		playerLevel.setBounds(30,215,274,50);
		
		
		playerName.setText("Name : "+p.getName());
		playerLevel.setText("Level : "+p.getLevel());
		playerHp.setText("Hp : "+p.getHp()+" / "+p.getMaxHp());
		
		
		frm.getContentPane().add(playerHp);
		frm.getContentPane().add(playerLevel);
		frm.getContentPane().add(playerName);
		frm.getContentPane().add(Inven);
		
		
		// �̹���
		JLabel playerImg = new JLabel();
		JLabel monsterImg = new JLabel();
		
		
		ImageIcon PI = new ImageIcon("player.jpg");
		ImageIcon MI = new ImageIcon("Skeleton.png");
		
		Image img = PI.getImage();
		Image updateImg = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon updateIcon = new ImageIcon(updateImg);
		
		Image img1 = MI.getImage();
		Image updateImg1 = img1.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon updateIcon1 = new ImageIcon(updateImg1);
		
		
		playerImg.setIcon(updateIcon);
		monsterImg.setIcon(updateIcon1);
	
		
		playerImg.setBounds(30, 15, 178, 175);
		playerImg.setHorizontalAlignment(JLabel.CENTER);
		
		monsterImg.setBounds(377, 15, 178, 175);
		monsterImg.setHorizontalAlignment(JLabel.CENTER);
		
		frm.getContentPane().add(playerImg);
		frm.getContentPane().add(monsterImg);
		frm.setVisible(true);

		
	
		
		frm.getContentPane().add(atk_btn);
		frm.getContentPane().add(ski_btn1);
		frm.getContentPane().add(ski_btn2);
		frm.getContentPane().add(Run_btn);
		frm.getContentPane().add(bs);
		frm.getContentPane().add(monsterImg);
		
		
		bsText = "@@@@@@@@@@@@@@@@@������ �����մϴ�.@@@@@@@@@@@@@@\n";
		bs.setText(bsText);

		
		
			atk_btn.addActionListener(evnet->{
				if(p.getHp()>0||m.getHp()>0) {
					p.attack(m);
					bs.append("\n"+p.getName()+"�� "+ m.getName() + "����" + String.valueOf(p.attack(m))+"�� ���ظ� �������ϴ�.\n");
					monsterHp.setText("Hp : "+m.getHp()+" / "+m.getMaxHp());
					
					
					if(m.getHp()>0) {
						m.attack(p);
						bs.append(m.getName()+"�� "+ p.getName() + "����" + String.valueOf(m.attack(p))+"�� ���ظ� �������ϴ�.\n");
						playerHp.setText("Hp : "+p.getHp()+" / "+p.getMaxHp());
						if(p.getHp()<1) {
							JOptionPane.showMessageDialog(null, "�й�");
							System.exit(0);
						}
					}else {
						JOptionPane.showMessageDialog(null, "�¸�");
						
						int potionDropCount = m.dropItem(p);
						if(p.getExp()>=p.getMaxExp()) {
							p.levelUp();
						}
						m.setHp(m.getMaxHp());
						frm.dispose();
					}
				}
			});
			
			
			ski_btn1.addActionListener(evnet ->{
				
				p.useSkill(p.getSkill(), m);
				monsterHp.setText("Hp : "+m.getHp()+" / "+m.getMaxHp());
				
				m.attack(p);
				playerHp.setText("Hp : "+p.getHp()+" / "+p.getMaxHp());
			});
			
			
			
			Run_btn.addActionListener(evnet ->{
				m.setHp(m.getMaxHp());
				frm.dispose();
			});
			
			
			
			Inven.addActionListener(evnet -> {
				new Inventory(p);
			});
			
			
	
		// �������� ���̵��� ����
		frm.setVisible(true);
	}
}