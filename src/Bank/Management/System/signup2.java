package Bank.Management.System;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class signup2 extends JFrame implements ActionListener{
	
	String formno;
	JComboBox combobox,combobox2,combobox3,combobox4,combobox5;
	JTextField textpan,textadhaar;
	JRadioButton r1,r2,r3,r4;
	JButton next;
	
	signup2(String formno){
		super("Application form");
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank.png"));
		Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel iimage = new JLabel(i3);
		iimage.setBounds(150,5,100,100);
		add(iimage);
		
		this.formno = formno;
		
		JLabel l1 = new JLabel("Page 2 :- ");
		l1.setFont(new Font("Raleway",Font.BOLD,22));
		l1.setBounds(300,30,600,40);
		add(l1);
		
		JLabel l2 = new JLabel("Additional Details");
		l2.setFont(new Font("Raleway",Font.BOLD,22));
		l2.setBounds(300,60,600,40);
		add(l2);
		
		JLabel l3 = new JLabel("Religion : ");
		l3.setFont(new Font("Raleway",Font.BOLD,18));
		l3.setBounds(100,120,100,30);
		add(l3);
		
		String religion[] = {"Christian","Hindu","Muslim"};
		combobox = new JComboBox(religion);
		combobox.setBackground(new Color(176,224,230));
		combobox.setFont(new Font("Raleway",Font.BOLD,14));
		combobox.setBounds(350,120,320,30);
		add(combobox);
		
		JLabel l4 = new JLabel("Category : ");
		l4.setFont(new Font("Raleway",Font.BOLD,18));
		l4.setBounds(100,170,100,30);
		add(l4);
		
		String category[] = {"General","OBC","SC","ST","Other"};
		combobox2 = new JComboBox(category);
		combobox2.setBackground(new Color(176,224,230));
		combobox2.setFont(new Font("Raleway",Font.BOLD,14));
		combobox2.setBounds(350,170,320,30);
		add(combobox2);
		
		JLabel l5 = new JLabel("Income : ");
		l5.setFont(new Font("Raleway",Font.BOLD,18));
		l5.setBounds(100,220,100,30);
		add(l5);
		
		String income[] = {"Null","<1,50,000","2,50,000","5,00,000","Above 5,00,000"};
		combobox3 = new JComboBox(income);
		combobox3.setBackground(new Color(176,224,230));
		combobox3.setFont(new Font("Raleway",Font.BOLD,14));
		combobox3.setBounds(350,220,320,30);
		add(combobox3);
		
		JLabel l6= new JLabel("Educational : ");
		l6.setFont(new Font("Raleway",Font.BOLD,18));
		l6.setBounds(100,270,150,30);
		add(l6);
		
		String educational[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
		combobox4 = new JComboBox(educational);
		combobox4.setBackground(new Color(176,224,230));
		combobox4.setFont(new Font("Raleway",Font.BOLD,14));
		combobox4.setBounds(350,270,320,30);
		add(combobox4);
		
		JLabel l7= new JLabel("Occupation : ");
		l7.setFont(new Font("Raleway",Font.BOLD,18));
		l7.setBounds(100,320,150,30);
		add(l7);
		
		String occupation[] = {"Salaried","Self-Employed","Business","Student","Retired","Others"};
		combobox5 = new JComboBox(occupation);
		combobox5.setBackground(new Color(176,224,230));
		combobox5.setFont(new Font("Raleway",Font.BOLD,14));
		combobox5.setBounds(350,320,320,30);
		add(combobox5);
		
		JLabel l8= new JLabel("PAN Number : ");
		l8.setFont(new Font("Raleway",Font.BOLD,18));
		l8.setBounds(100,370,150,30);
		add(l8);
		
		textpan = new JTextField();
		textpan.setFont(new Font("Raleway",Font.BOLD,18));
		textpan.setBounds(350,370,320,30);
		add(textpan);
		
		JLabel l9= new JLabel("Adhaar Number : ");
		l9.setFont(new Font("Raleway",Font.BOLD,18));
		l9.setBounds(100,410,180,30);
		add(l9);
		
		textadhaar = new JTextField();
		textadhaar.setFont(new Font("Raleway",Font.BOLD,18));
		textadhaar.setBounds(350,410,320,30);
		add(textadhaar);
		
		JLabel l10= new JLabel("Senior Citizen : ");
		l10.setFont(new Font("Raleway",Font.BOLD,18));
		l10.setBounds(100,460,180,30);
		add(l10);
		
		r1 = new JRadioButton("YES");
		r1.setFont(new Font("Raleway",Font.BOLD,18));
		r1.setBackground(new Color(176,224,230));
		r1.setBounds(350,460,100,30);
		add(r1);
		
		r2 = new JRadioButton("NO");
		r2.setFont(new Font("Raleway",Font.BOLD,18));
		r2.setBackground(new Color(176,224,230));
		r2.setBounds(460,460,100,30);
		add(r2);
		
		ButtonGroup bt = new ButtonGroup();
		bt.add(r1);
		bt.add(r2);

		
		JLabel l11= new JLabel("Existing Account : ");
		l11.setFont(new Font("Raleway",Font.BOLD,18));
		l11.setBounds(100,510,180,30);
		add(l11);
		
		r3 = new JRadioButton("YES");
		r3.setFont(new Font("Raleway",Font.BOLD,18));
		r3.setBackground(new Color(176,224,230));
		r3.setBounds(350,510,100,30);
		add(r3);
		
		r4 = new JRadioButton("NO");
		r4.setFont(new Font("Raleway",Font.BOLD,18));
		r4.setBackground(new Color(176,224,230));
		r4.setBounds(460,510,100,30);
		add(r4);
		
		ButtonGroup bt1 = new ButtonGroup();
		bt1.add(r3);
		bt1.add(r4);

		
		JLabel l12= new JLabel("Form No : ");
		l12.setFont(new Font("Raleway",Font.BOLD,18));
		l12.setBounds(650,10,100,30);
		add(l12);
		
		JLabel l13= new JLabel(formno);
		l13.setFont(new Font("Raleway",Font.BOLD,18));
		l13.setBounds(750,10,60,30);
		add(l13);
		
		next = new JButton("Next");
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setBounds(570,640,100,30);
		next.addActionListener(this);
		add(next);
		
		
		setLayout(null);
		setSize(850,750);
		setLocation(450,50);
		getContentPane().setBackground(new Color(176,224,230));
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String rel = (String)combobox.getSelectedItem();
		String cate = (String)combobox2.getSelectedItem();
		String inc = (String)combobox3.getSelectedItem();
		String edu = (String)combobox4.getSelectedItem();
		String occ = (String)combobox5.getSelectedItem();
		
		String pan = textpan.getText();
		String aadhar = textadhaar.getText();
		
		String scitizen = "";
		if(r1.isSelected()) {
			scitizen = "YES";
		}
		else if(r2.isSelected()) {
			scitizen = "NO";
		}
		
		String eaccount = "";
		if(r3.isSelected()) {
			eaccount = "YES";
		}
		else if(r4.isSelected()) {
			eaccount = "NO";
		}
		
		try {
			if(textpan.getText().equals("") || textadhaar.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Fill all the fields");
			}
			else {
				Conc c1 = new Conc();
				String q = "insert into signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
				c1.statement.executeUpdate(q);
				new Signup3(formno);
				setVisible(false);
			}
			
			
		}catch(Exception E) {
			E.printStackTrace();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new signup2("");
	}

}
