package Bank.Management.System;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;


public class Deposit extends JFrame implements ActionListener{
	String pin;
	
	TextField textfield;
	JButton b1,b2;
	
	Deposit(String pin){
		this.pin = pin;
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm2.png"));
		Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l3 = new JLabel(i3);
		l3.setBounds(0,0,1550,830);
		add(l3);
		
		JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
		label1.setFont(new Font("System",Font.BOLD,16));
		label1.setForeground(Color.WHITE);
		label1.setBounds(460,180,400,35);
		l3.add(label1);
		
		textfield = new TextField();
		textfield.setForeground(Color.WHITE);
		textfield.setBackground(new Color(100,150,230));
		textfield.setBounds(460,230,320,35);
		textfield.setFont(new Font("Raleway",Font.BOLD,22));
		l3.add(textfield);
		
		b1 = new JButton("DEPOSIT");
		b1.setBounds(700,365,150,30);
		b1.setForeground(Color.WHITE);
		b1.setBackground(new Color(100,150,230));
		b1.addActionListener(this);
		l3.add(b1);
		
		b2 = new JButton("BACK");
		b2.setBounds(700,411,150,30);
		b2.setForeground(Color.WHITE);
		b2.setBackground(new Color(100,150,230));
		b2.addActionListener(this);
		l3.add(b2);
		
		
		setLayout(null);
		setSize(1550,1000);
		setLocation(0,0);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new Deposit("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		String amount = textfield.getText();
		Date date = new Date();
		if(e.getSource()==b1) {
			if(textfield.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Please enter the Amount to be deposited");
			}else {
				Conc c = new Conc();
				c.statement.executeUpdate("insert into bank values ('"+pin+"','"+date+"','Deposit','"+amount+"')");
				JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully");
				setVisible(false);
				new main_class(pin);
			}
		}else if(e.getSource()==b2) {
			setVisible(false);
			new main_class(pin);
		}
		
		}catch(Exception E) {
			E.printStackTrace();
		}
		
	}

}
