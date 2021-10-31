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
import monster.character.Player;
import monster.item.HpPotion;
import monster.item.MpPotion;

public class Town1 extends JFrame{
	ImageIcon icon;
	JScrollPane scrollPane;
	
	public Town1(String playerName) {
		
		Player player = new Player(//사용자 케릭터 객체 초기화
                playerName,
                100,
                100,
                50,
                50,
                10,//150
                2,//100
                1000,//10000
                0,
                100,//300
                1,
                "에너지볼",
                null,
                null,
                new Skill("스킬1", 1, 200, 2000),
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<HpPotion>(),
                new ArrayList<HpPotion>(),
                new ArrayList<HpPotion>(),
                new ArrayList<MpPotion>(),
                new ArrayList<MpPotion>(),
                new ArrayList<MpPotion>()
        );
		
		
		
		
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
					new hunting_ground(player);
					
				}
			});
	     scrollPane = new JScrollPane(background);
	     setContentPane(scrollPane);
		
		
		
	}
}
