package Bank.Management.System;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener{
	
	JTextField textname,textfname,textemail,textmarried,textadd,textcity,textpin,textstate;
	JDateChooser dateChooser;
	JRadioButton r1,r2,r3,r4;
	JButton next = new JButton("next");
	
	Random ran = new Random();
	long first4 =(ran.nextLong() % 9000L) + 1000L;
	String first = " "+Math.abs(first4);
	Signup(){
		super("Application form");
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank.png"));
		Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel iimage = new JLabel(i3);
		iimage.setBounds(25,10,100,100);
		add(iimage); 
		
		JLabel label1 = new JLabel("APPLICATION FORM NO:" + first);
		label1.setBounds(160,20,600,40);
		label1.setFont(new Font("RaleWay",Font.BOLD,38));
		add(label1);
		
		JLabel label2 = new JLabel("Page 1");
		label2.setFont(new Font("Raleway",Font.BOLD,22));
		label2.setBounds(330,70,600,30);
		add(label2);
		
		JLabel label3 = new JLabel("Personal Details");
		label3.setFont(new Font("Raleway",Font.BOLD,22));
		label3.setBounds(290,90,600,30);
		add(label3);
		
		JLabel labelname = new JLabel("Name :");
		labelname.setFont(new Font("Raleway",Font.BOLD,20));
		labelname.setBounds(100,190,100,30);
		add(labelname);
		
		textname = new JTextField();
		textname.setFont(new Font("Raleway",Font.BOLD,14));
		textname.setBounds(300,190,400,30);
		add(textname);
		
		JLabel labelfname = new JLabel("Father's Name :");
		labelfname.setFont(new Font("Raleway",Font.BOLD,20));
		labelfname.setBounds(100,240,200,30);
		add(labelfname);
		
		textfname = new JTextField();
		textfname.setFont(new Font("Raleway",Font.BOLD,14));
		textfname.setBounds(300,240,400,30);
		add(textfname);
		
		JLabel dob = new JLabel("Date of Birth : ");
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		dob.setBounds(100,340,200,30);
		add(dob);
		
		dateChooser = new JDateChooser();
		dateChooser.setForeground(new Color(105,105,105));
		dateChooser.setBounds(300,340,400,30);
		add(dateChooser);
		
		JLabel labelg = new JLabel("Gender : ");
		labelg.setFont(new Font("Raleway",Font.BOLD,20));
		labelg.setBounds(100,290,200,30);
		add(labelg);
		
		r1 = new JRadioButton("Male");
		r1.setFont(new Font("Raleway",Font.BOLD,14));
		r1.setBackground(new Color(176,224,230));
		r1.setBounds(300,290,90,30);
		add(r1);
		
		r2 = new JRadioButton("Female");
		r2.setFont(new Font("Raleway",Font.BOLD,14));
		r2.setBackground(new Color(176,224,230));
		r2.setBounds(400,290,90,30);
		add(r2);
		
		ButtonGroup bt = new ButtonGroup();
		bt.add(r1);
		bt.add(r2);
		
		JLabel lemail = new JLabel("Email : ");
		lemail.setFont(new Font("raleway",Font.BOLD,20));
		lemail.setBounds(100,390,200,30);
		add(lemail);
		
		textemail = new JTextField();
		textemail.setFont(new Font("Raleway",Font.BOLD,14));
		textemail.setBounds(300,390,400,30);
		add(textemail);
		
		JLabel lmarried = new JLabel("Marital Status : ");
		lmarried.setFont(new Font("raleway",Font.BOLD,20));
		lmarried.setBounds(100,440,200,30);
		add(lmarried);
		
		r3 = new JRadioButton("Married");
		r3.setFont(new Font("Raleway",Font.BOLD,14));
		r3.setBackground(new Color(176,224,230));
		r3.setBounds(300,440,100,30);
		add(r3);
		
		r4 = new JRadioButton("Unmarried");
		r4.setFont(new Font("Raleway",Font.BOLD,14));
		r4.setBackground(new Color(176,224,230));
		r4.setBounds(400,440,150,30);
		add(r4);
		
		ButtonGroup bt1 = new ButtonGroup();
		bt1.add(r3);
		bt1.add(r4);
		
		JLabel ladd = new JLabel("Address : ");
		ladd.setFont(new Font("raleway",Font.BOLD,20));
		ladd.setBounds(100,490,200,30);
		add(ladd);
		
		textadd = new JTextField();
		textadd.setFont(new Font("Raleway",Font.BOLD,14));
		textadd.setBounds(300,490,400,30);
		add(textadd);
		
		JLabel lcity = new JLabel("City : ");
		lcity.setFont(new Font("raleway",Font.BOLD,20));
		lcity.setBounds(100,540,200,30);
		add(lcity);
		
		textcity = new JTextField();
		textcity.setFont(new Font("Raleway",Font.BOLD,14));
		textcity.setBounds(300,540,400,30);
		add(textcity);
		
		JLabel lpin = new JLabel("PIN Code : ");
		lpin.setFont(new Font("raleway",Font.BOLD,20));
		lpin.setBounds(100,590,200,30);
		add(lpin);
		
		textpin = new JTextField();
		textpin.setFont(new Font("Raleway",Font.BOLD,14));
		textpin.setBounds(300,590,400,30);
		add(textpin);
		
		JLabel lstate = new JLabel("State : ");
		lstate.setFont(new Font("raleway",Font.BOLD,20));
		lstate.setBounds(100,640,200,30);
		add(lstate);
		
		textstate = new JTextField();
		textstate.setFont(new Font("Raleway",Font.BOLD,14));
		textstate.setBounds(300,640,400,30);
		add(textstate);
		
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setBounds(620,710,80,30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(new Color(176,224,230));
		setLayout(null);
		setSize(850,800);
		setLocation(360,20);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String formno = first;
		String name = textname.getText();
		String fname = textfname.getText();
		String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		String gender = null;
		if(r1.isSelected()) {
			gender = "Male";
		}
		else if(r2.isSelected()) {
			gender = "Female";
		}
		String email = textemail.getText();
		String mari = null;
		if(r3.isSelected()) {
			mari = "Married";
		}
		else if(r4.isSelected()) {
			mari = "Unmarried";
		}
		String add = textadd.getText();
		String city = textcity.getText();
		String pin = textpin.getText();
		String state = textstate.getText();
		
		try {
			if(textname.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Fill all the fields");
			}else {
				Conc con1 = new Conc();
				String q ="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+mari+"','"+add+"','"+city+"','"+pin+"','"+state+"')" ;
				con1.statement.executeUpdate(q);
				new signup2(formno);
				setVisible(false);			}
		}catch(Exception E) {
			E.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Signup();

	}

}
