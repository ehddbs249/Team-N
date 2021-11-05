package monster.map;

import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import monster.Skill;
import monster.character.Boss;
import monster.character.Player;
import monster.item.HpPotion;
import monster.item.MpPotion;

public class Town1 extends JFrame{
	ImageIcon icon;
	JScrollPane scrollPane;
	
	public Town1(String playerName) {
		int Dday = 10;
		Player player = new Player(//����� �ɸ��� ��ü �ʱ�ȭ
                playerName,
                150, 
                150,
                50,
                50,
                20,//150
                2,//100
                1000,//10000
                0,
                100,//300
                1,
                "��������",
                null,
                null,
                new Skill("��ų1", 1, 200, 2000),
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<HpPotion>(),
                new ArrayList<HpPotion>(),
                new ArrayList<HpPotion>(),
                new ArrayList<MpPotion>(),
                new ArrayList<MpPotion>(),
                new ArrayList<MpPotion>(),
                10
        );
		
		HpPotion smallHpItem =new HpPotion("����ü�¹���",50,30);
		HpPotion NormalHpItem =new HpPotion("����ü�¹���",100,100);
		HpPotion BigHpItem =new HpPotion("ūü�¹���",300,400);
		
		MpPotion smallMpItem = new MpPotion("������������", 50, 30);
		MpPotion NormalMpItem = new MpPotion("���븶������", 100, 100);
		MpPotion BigMpItem = new MpPotion("ū��������", 300, 40);
		Boss Champion_Goblin = new Boss("Champion_Goblin",5000,5000,300,200,4000,50000,13,"�ֵθ���",(HpPotion) NormalHpItem,(MpPotion) NormalMpItem,300,300,null,null,null,null);
		
		
		
		icon = new ImageIcon("background.png");
		
		
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		
		
		
		
		 JButton hunt_btn = new JButton("�����");
	     background.add(hunt_btn);
	     hunt_btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(player.getDayCount()>0) {
						new hunting_ground(player);
					} else if(player.getDayCount()==0) {
						new BossbattleMap(player, Champion_Goblin, 10);
					} else {
						player.setDayCount(0);
					}
						
					
					
				}
			});
	     
	     JButton Status = new JButton("����â");
	     background.add(Status);
	     Status.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new monster.Status(player);
				}
			});
	     
	     JButton Shop = new JButton("����");
	     background.add(Shop);
	     Shop.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new monster.GoShop(player);
				}
			});
	     scrollPane = new JScrollPane(background);
	     setContentPane(scrollPane);
	     
	     
		
		
		
	}
}
