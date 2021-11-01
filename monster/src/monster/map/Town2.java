package monster.map;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import monster.Skill;
import monster.character.Boss;
import monster.character.Player;
import monster.item.HpPotion;
import monster.item.MpPotion;

public class Town2 extends JFrame{
	ImageIcon icon;
	JScrollPane scrollPane;
	
	public Town2(Player player) {
		int Dday = 10;
		
		HpPotion smallHpItem =new HpPotion("작은체력물약",50,30);
		HpPotion NormalHpItem =new HpPotion("보통체력물약",100,100);
		HpPotion BigHpItem =new HpPotion("큰체력물약",300,400);
		
		MpPotion smallMpItem = new MpPotion("작은마나물약", 50, 30);
		MpPotion NormalMpItem = new MpPotion("보통마나물약", 100, 100);
		MpPotion BigMpItem = new MpPotion("큰마나물약", 300, 40);
		Boss Champion_Goblin = new Boss("Champion_Goblin",5000,5000,300,200,4000,50000,13,"휘두르기",(HpPotion) NormalHpItem,(MpPotion) NormalMpItem,300,300,null,null,null,null);
		
		
		
		icon = new ImageIcon("background.png");
		
		
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		
		
		 JButton hunt_btn = new JButton("사냥터");
	     background.add(hunt_btn);
	     hunt_btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(player.getDayCount()>0) {
						new hunting_ground(player);
					} else {
						new battleMap(player, Champion_Goblin,11);
					}
					
				}
			});
	     scrollPane = new JScrollPane(background);
	     setContentPane(scrollPane);
		
		
		
	}
}
