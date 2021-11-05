package monster.map;

import java.awt.Image;
import java.awt.TextArea;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import monster.character.Boss;
import monster.character.Monster;
import monster.character.Player;

public class BossbattleMap extends JFrame{
	String bsText = null;
	public BossbattleMap(Player p, Boss m,int i) {
		
		
		JFrame frm = new JFrame("Monster");
		
		// 프레임 크기 설정
		frm.setSize(600,600);
		
		
		// 프레임을 화면 가운데에 배치
		frm.setLocationRelativeTo(null);
		
		
		// 프레임을 닫았을 때 메모리에서 제거되도록 설정
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// 레이아웃 설정
		frm.getContentPane().setLayout(null);
		
		
		TextArea bs = new TextArea("임시 문자열",40,30);
		
		JButton atk_btn = new JButton("공격");
		JButton ski_btn1 = new JButton("스킬1");
		JButton ski_btn2 = new JButton("스킬2");
		JButton Run_btn = new JButton("도망치기");
		JButton Inven = new JButton("인벤토리");
		
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
		JLabel playerMp = new JLabel();
		
		
		playerName.setBounds(30,186,274,50);
		playerHp.setBounds(30,215,274,50);
		playerLevel.setBounds(30,200,274,50);
		playerMp.setBounds(30,230,274,50);
		
		
		playerName.setText("Name : "+p.getName());
		playerLevel.setText("Level : "+p.getLevel());
		playerHp.setText("Hp : "+p.getHp()+" / "+p.getMaxHp());
		playerMp.setText("Mp : "+p.getMp()+" / "+p.getMaxMp());
		
		
		frm.getContentPane().add(playerHp);
		frm.getContentPane().add(playerLevel);
		frm.getContentPane().add(playerName);
		frm.getContentPane().add(playerMp);
		frm.getContentPane().add(Inven);
		
		
		// 이미지
		JLabel playerImg = new JLabel();
		JLabel monsterImg = new JLabel();
		
		ImageIcon MI = new ImageIcon();
		ImageIcon PI = new ImageIcon("player.jpg");
		if(i==1) {
			MI = new ImageIcon("Blue_wolf.png");
		} else if (i==2 ) {
			MI = new ImageIcon("red_wolf.png");
		} else if (i==3) {
			MI = new ImageIcon("Bear.jpg");
		} else if (i==4) {
			MI = new ImageIcon("Zombie.png");
		} else if (i==5) {
			MI = new ImageIcon("Ribbon_pig.png");
		} else if (i==6) {
			MI = new ImageIcon("Goblin.png");
		} else if (i==7) {
			MI = new ImageIcon("Goblin_Hop.png");
		} else if (i==8) {
			MI = new ImageIcon("Skeleton.png");
		} else if (i==9) {
			MI = new ImageIcon("Hapi.png");
		} else if (i==10) {
			MI = new ImageIcon("Baby_Dragon.png");
		}
		
		
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
		
		
		bsText = "@@@@@@@@@@@@@@@@@전투를 시작합니다.@@@@@@@@@@@@@@\n";
		bs.setText(bsText);

		
		
			atk_btn.addActionListener(evnet->{
				if(p.getHp()>0||m.getHp()>0) {
					p.attack(m);
					bs.append("\n"+p.getName()+"가 "+ m.getName() + "에게" + String.valueOf(p.attack(m))+"의 피해를 입혔습니다.\n");
					monsterHp.setText("Hp : "+m.getHp()+" / "+m.getMaxHp());
					
					
					if(m.getHp()>0) {
						m.attack(p);
						bs.append(m.getName()+"가 "+ p.getName() + "에게" + String.valueOf(m.attack(p))+"의 피해를 입혔습니다.\n");
						playerHp.setText("Hp : "+p.getHp()+" / "+p.getMaxHp());
						if(p.getHp()<1) {
							JOptionPane.showMessageDialog(null, "패배");
							System.exit(0);
						}
					}else {
						JOptionPane.showMessageDialog(null, "승리");
						
						int potionDropCount = m.dropItem(p);
						if(p.getExp()>=p.getMaxExp()) {
							p.levelUp();
						}
						m.setHp(m.getMaxHp());
						
						new Town2(p);
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
			
			
	
		// 프레임이 보이도록 설정
		frm.setVisible(true);
	}
}
