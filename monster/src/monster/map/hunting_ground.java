package monster.map;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import monster.character.*;
import monster.character.Monster;
import monster.item.HpPotion;
import monster.item.MpPotion;

public class hunting_ground extends JFrame{
	
	HpPotion smallHpItem =new HpPotion("작은체력물약",50,30);
	HpPotion NormalHpItem =new HpPotion("보통체력물약",100,100);
	HpPotion BigHpItem =new HpPotion("큰체력물약",300,400);
	
	MpPotion smallMpItem = new MpPotion("작은마나물약", 50, 30);
	MpPotion NormalMpItem = new MpPotion("보통마나물약", 100, 100);
	MpPotion BigMpItem = new MpPotion("큰마나물약", 300, 40);
	
	Monster Blue_Wolf = new Monster("Blue_Wolf", 100, 100, 10, 0, 100, 100, 1, "물기",(HpPotion) smallHpItem,(MpPotion) smallMpItem);
	Monster Red_Wolf = new Monster("Red_Wolf", 200, 200, 15, 0, 200, 200, 2, "물기",(HpPotion) smallHpItem,(MpPotion) smallMpItem);
	
	Monster Bear = new Monster("Bear", 370, 370, 26, 5, 400, 250, 3, "물기",(HpPotion) smallHpItem,(MpPotion) smallMpItem);
	
	Monster Zombie = new Monster("Zombie", 600, 600, 38, 5, 700, 560, 4, "물기",(HpPotion) smallHpItem,(MpPotion) smallMpItem);
	
	
	Monster Ribbon_Pig = new Monster("Ribbon_Pig", 780, 780, 56, 10, 1000, 780, 5, "물기",(HpPotion) smallHpItem,(MpPotion) smallMpItem);
	Monster Goblin= new Monster("Goblin", 1000, 1000, 78, 16, 1500, 900, 6, "물기",(HpPotion) smallHpItem,(MpPotion) smallMpItem);
	
	Monster Goblin_Hop = new Monster("Goblin_Hop", 1270, 1270, 100, 26, 1700, 1100, 7, "물기",(HpPotion) smallHpItem,(MpPotion) smallMpItem);
	
	Monster Skeleton  = new Monster("Skeleton", 1670, 1670, 120, 36, 2000, 1300, 8, "물기",(HpPotion) smallHpItem,(MpPotion) smallMpItem);
	Monster Hapi = new Monster("Hapi", 2100, 2100, 140, 58, 2200, 1400, 9, "물기",(HpPotion) smallHpItem,(MpPotion) smallMpItem);
	
	Monster Baby_Dragon  = new Monster("Baby_Dragon", 2500, 2500, 150, 70, 2500, 1500, 10, "물기",(HpPotion) smallHpItem,(MpPotion) smallMpItem);
	
	public hunting_ground(Player player) {
	
		
		
		JFrame frm = new JFrame("Hunting_Ground");
		
		frm.setSize(300,300);
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frm.getContentPane().setLayout(null);
		
		frm.setVisible(true);
		
		JButton stage1 = new JButton("1");
		JButton stage2 = new JButton("2");
		JButton stage3 = new JButton("3");
		JButton stage4 = new JButton("4");
		JButton stage5 = new JButton("5");
		JButton stage6 = new JButton("6");
		JButton stage7 = new JButton("7");
		JButton stage8 = new JButton("8");
		JButton stage9 = new JButton("9");
		JButton stage10 = new JButton("10");
		JButton Undo = new JButton("뒤로가기");
		
		stage1.setBounds(10, 10, 130, 30);
		stage2.setBounds(150,10,130,30);
		stage3.setBounds(10, 50, 130, 30);
		stage4.setBounds(150,50,130,30);
		stage5.setBounds(10, 90, 130, 30);
		stage6.setBounds(150,90,130,30);
		stage7.setBounds(10, 130, 130, 30);
		stage8.setBounds(150,130,130,30);
		stage9.setBounds(10, 170, 130, 30);
		stage10.setBounds(150,170,130,30);
		Undo.setBounds(50,210,200,30);
		
		stage1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new battleMap(player, Blue_Wolf,1);
			}
		});
		stage2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new battleMap(player, Red_Wolf,2);
			}
		});
		stage3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new battleMap(player, Bear,3);
			}
		});
		stage4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new battleMap(player, Zombie,4);
			}
		});
		stage5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new battleMap(player, Ribbon_Pig,5);
			}
		});
		stage6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new battleMap(player, Goblin,6);
			}
		});
		stage7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new battleMap(player, Goblin_Hop,7);
			}
		});
		stage8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new battleMap(player, Skeleton,8);
			}
		});
		stage9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new battleMap(player, Hapi,9);
			}
		});
		stage10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new battleMap(player, Baby_Dragon,10);
			}
		});
		
		frm.getContentPane().add(stage1);
		frm.getContentPane().add(stage2);
		frm.getContentPane().add(stage3);
		frm.getContentPane().add(stage4);
		frm.getContentPane().add(stage5);
		frm.getContentPane().add(stage6);
		frm.getContentPane().add(stage7);
		frm.getContentPane().add(stage8);
		frm.getContentPane().add(stage9);
		frm.getContentPane().add(stage10);
		frm.getContentPane().add(Undo);
	}
	
}
