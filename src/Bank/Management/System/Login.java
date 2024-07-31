package Bank.Management.System;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;


public class Login extends JFrame implements ActionListener{
	
	JLabel label1,label2,label3;
	JTextField textfield2;
	JPasswordField passwordfield3;
	JButton button1,button2,button3;
	
	Login(){
		super("Bank Management System");
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank.png"));
		Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel iimage = new JLabel(i3);
		iimage.setBounds(350,10,100,100);
		add(iimage);  
		
		ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource("card.png"));
		Image j2 = j1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon j3 = new ImageIcon(j2);
		JLabel jimage = new JLabel(j3);
		jimage.setBounds(630,350,100,100);
		add(jimage);
		
		label1 = new JLabel("WELCOME TO ATM");
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("AvantGarde",Font.BOLD,38));
		label1.setBounds(230,125,450,40);
		add(label1);
		
		label2 = new JLabel("Card No: ");
		label2.setFont(new Font("Ralway",Font.BOLD,28));
		label2.setForeground(Color.WHITE);
		label2.setBounds(150,190,375,30);
		add(label2);
		
		textfield2 = new JTextField(15);
		textfield2.setBounds(325,190,230,30);
		textfield2.setFont(new Font("Arial",Font.BOLD,14));
		add(textfield2);
		
		label3 = new JLabel("PIN: ");
		label3.setFont(new Font("Ralway",Font.BOLD,28));
		label3.setForeground(Color.WHITE);
		label3.setBounds(150,240,375,30);
		add(label3);
		
		passwordfield3 = new JPasswordField(15);
		passwordfield3.setBounds(325,250,230,30);
		passwordfield3.setFont(new Font("Arial",Font.BOLD,14));
		add(passwordfield3);
		
		button1 = new JButton("SIGN IN");
		button1.setFont(new Font("Arial",Font.BOLD,14));
		button1.setForeground(Color.WHITE);
		button1.setBackground(Color.BLACK);
		button1.setBounds(300,300,100,30);
		button1.addActionListener(this);
		add(button1);
		
		button2 = new JButton("CLEAR");
		button2.setFont(new Font("Arial",Font.BOLD,14));
		button2.setForeground(Color.WHITE);
		button2.setBackground(Color.BLACK);
		button2.setBounds(430,300,100,30);
		button2.addActionListener(this);
		add(button2);
		
		button3 = new JButton("SIGN UP");
		button3.setFont(new Font("Arial",Font.BOLD,14));
		button3.setForeground(Color.WHITE);
		button3.setBackground(Color.BLACK);
		button3.setBounds(300,350,230,30);
		button3.addActionListener(this);
		add(button3);
		
		ImageIcon k1 = new ImageIcon(ClassLoader.getSystemResource("backbg.png"));
		Image k2 = k1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
		ImageIcon k3 = new ImageIcon(k2);
		JLabel kimage = new JLabel(k3);
		kimage.setBounds(0,0,850,480);
		add(kimage);
		
		
		setLayout(null);
		setSize(850,480);
		setUndecorated(true);
		setVisible(true);
		setLocation(350,200);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource() == button1) {
				Conc c = new Conc();
				String cardno = textfield2.getText();
				String pin = passwordfield3.getText();
				String q = "select * from login where card_no = '"+cardno+"' and pin = '"+pin+"'";
				ResultSet resultset = c.statement.executeQuery(q);
				if(resultset.next()) {
					setVisible(false);
					new main_class(pin);
				}else {
					JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
				}
				
			}
			else if(e.getSource() == button2) {
				textfield2.setText("");
				passwordfield3.setText("");
			}
			else if(e.getSource() == button3) {
				new Signup();
				setVisible(false);
			}
		}
		catch(Exception E){
			E.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Login();
	}

}
