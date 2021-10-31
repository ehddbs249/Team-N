package monster;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import monster.map.Town1;


public class player_Info extends JFrame{
	
	private JPanel contentPane;
	private JTextField textField;
	
	public player_Info() {
		JFrame frm = new JFrame();
		
		frm.setTitle("Monster");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(100,100,569,507);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100,149,237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frm.setContentPane(contentPane);
		contentPane.setLayout(null);
		frm.setVisible(true);
		
		JButton Nextbtn = new JButton("Next");
		Nextbtn.setForeground(new Color(0, 0, 0));
		Nextbtn.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		Nextbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				dispose();
				String playerName = textField.getText();
				Town1 frame = new Town1(playerName);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(600,600);
				frame.setVisible(true);
				frm.setVisible(false);
				
			}
		});
		Nextbtn.setBounds(213,293,138,35);
		contentPane.add(Nextbtn);
		JLabel lblNewLabel = new JLabel("Monster");
		lblNewLabel.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 53));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(119, 82, 313, 81);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(67, 226, 438, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ÇÃ·¹ÀÌ¾î ÀÌ¸§À» µî·ÏÇÏ¼¼¿ä");
		lblNewLabel_1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(89, 186, 393, 20);
		contentPane.add(lblNewLabel_1);
	}

}
