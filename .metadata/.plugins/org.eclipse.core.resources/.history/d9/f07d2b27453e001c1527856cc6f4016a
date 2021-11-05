package monster;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import monster.map.battleMap;


public class MainFrame extends JFrame {

	
	public MainFrame() {
		JFrame mainfrm = new JFrame();
		
		mainfrm.setTitle("Monster");
		mainfrm.setLocationRelativeTo(null);
		
		mainfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainfrm.setBounds(100,100,569,507);
		
		mainfrm.getContentPane().setLayout(null);
		
		mainfrm.setVisible(true);
		
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(100,149,237));
		
		mainfrm.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Start_btn = new JButton("Start");
		
		Start_btn.setForeground(new Color(0,0,0));
		
		Start_btn.setFont(new Font("±¼¸²",Font.PLAIN,14));
		
		Start_btn.setBounds(205, 239, 138, 35);
		contentPane.add(Start_btn);
		
		Start_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				dispose();
				new player_Info();
				mainfrm.setVisible(false);
			}
		});
		
		JButton Exit_btn = new JButton("Exit");
		Exit_btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		Exit_btn.setForeground(new Color(0, 0, 0));
		Exit_btn.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		
		Exit_btn.setBounds(205, 306, 138, 35);
		
		contentPane.add(Exit_btn);
		
		JLabel lblNewLabel = new JLabel("Monster");
		lblNewLabel.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 53));
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(118, 133, 313, 81);
		
		contentPane.add(lblNewLabel);
	}
	
}