package train;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JTextArea;

public class Hotel {
	
	int f=0;
	String str1,str2,str3;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel window = new Hotel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 987, 632);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(21, 69, 351, 255);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setFont(new Font("Traditional Arabic", Font.BOLD, 14));
		lblChickenBurger.setBounds(24, 30, 119, 14);
		panel.add(lblChickenBurger);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setFont(new Font("Traditional Arabic", Font.BOLD, 14));
		lblChickenBurgerMeal.setBounds(24, 61, 145, 14);
		panel.add(lblChickenBurgerMeal);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setFont(new Font("Traditional Arabic", Font.BOLD, 14));
		lblCheeseBurger.setBounds(24, 89, 108, 14);
		panel.add(lblCheeseBurger);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setBounds(197, 27, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setBounds(197, 58, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setBounds(197, 86, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Traditional Arabic", Font.BOLD, 14));
		lblDrink.setBounds(35, 136, 46, 14);
		panel.add(lblDrink);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Traditional Arabic", Font.BOLD, 14));
		lblQty.setBounds(197, 136, 46, 14);
		panel.add(lblQty);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tea", "Coffe", "Cocke"}));
		comboBox.setBounds(33, 161, 61, 20);
		panel.add(comboBox);
		
		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setBounds(197, 161, 52, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JRadioButton rdbtnHomeDelivery = new JRadioButton("Home Delivery");
		rdbtnHomeDelivery.setBounds(24, 225, 109, 23);
		panel.add(rdbtnHomeDelivery);
		
		JRadioButton rdbtnTax = new JRadioButton("Tax");
		rdbtnTax.setBounds(234, 225, 46, 23);
		panel.add(rdbtnTax);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(382, 69, 211, 255);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
		lblCurrencyConverter.setBounds(23, 11, 167, 28);
		panel_1.add(lblCurrencyConverter);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Indian Rupee", "US dollar", "British Pound"}));
		comboBox_1.setBounds(46, 58, 112, 20);
		panel_1.add(comboBox_1);
		
		textField_7 = new JTextField();
		textField_7.setBounds(46, 125, 112, 20);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String a=(String)comboBox_1.getSelectedItem();
				 float amount=Float.parseFloat((String)textField_7.getText()); //float drq=Float.parseFloat((String)textField_3.getText());
				 float camount=0;
				 if(a.equals("Indian Rupee"))
					{
						camount=amount;
					}
				if(a.equals("US dollar"))
				{
					camount=amount/71;
				}
				if(a.equals("British Pound"))
				{
					camount=amount/92;
				}
				textField_7.setText(String.valueOf(camount));
			}  
		});
		btnConvert.setFont(new Font("Traditional Arabic", Font.BOLD, 12));
		btnConvert.setBounds(23, 208, 77, 23);
		panel_1.add(btnConvert);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_7.setText("");
			}
		});
		btnClose.setFont(new Font("Traditional Arabic", Font.BOLD, 12));
		btnClose.setBounds(118, 208, 72, 23);
		panel_1.add(btnClose);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(21, 337, 351, 124);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDrink = new JLabel("Cost of drink");
		lblCostOfDrink.setFont(new Font("Traditional Arabic", Font.BOLD, 14));
		lblCostOfDrink.setBounds(32, 11, 96, 14);
		panel_2.add(lblCostOfDrink);
		
		JLabel lblCostOfMeal = new JLabel("Cost of meal");
		lblCostOfMeal.setFont(new Font("Traditional Arabic", Font.BOLD, 14));
		lblCostOfMeal.setBounds(32, 50, 86, 14);
		panel_2.add(lblCostOfMeal);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of delivery");
		lblCostOfDelivery.setFont(new Font("Traditional Arabic", Font.BOLD, 14));
		lblCostOfDelivery.setBounds(32, 87, 105, 14);
		panel_2.add(lblCostOfDelivery);
		
		textField_4 = new JTextField();
		textField_4.setBounds(195, 8, 86, 20);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(195, 47, 86, 20);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(195, 84, 86, 20);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(382, 335, 211, 126);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Traditional Arabic", Font.BOLD, 14));
		lblTax.setBounds(25, 11, 46, 14);
		panel_3.add(lblTax);
		
		JLabel lblNewLabel = new JLabel("Sub Total");
		lblNewLabel.setFont(new Font("Traditional Arabic", Font.BOLD, 14));
		lblNewLabel.setBounds(25, 45, 70, 14);
		panel_3.add(lblNewLabel);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Traditional Arabic", Font.BOLD, 14));
		lblTotal.setBounds(25, 82, 46, 14);
		panel_3.add(lblTotal);
		
		textField_8 = new JTextField();
		textField_8.setBounds(115, 8, 86, 20);
		panel_3.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(115, 42, 86, 20);
		panel_3.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(115, 79, 86, 20);
		panel_3.add(textField_10);
		textField_10.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(21, 479, 572, 63);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {//float c=Float.parseFloat((String)comboBox_2.getSelectedItem());
			public void actionPerformed(ActionEvent e) {
			float c,b,ch,cbr=60,cbmr=100,chbr=45,cb=0,cbm=0,chb=0;	
			 c=Float.parseFloat((String)textField.getText());
			cb=cbr*c;
			 b=Float.parseFloat((String)textField_1.getText());
			cbm=cbmr*b; 	
			 ch=Float.parseFloat((String)textField_2.getText());
			 chb=chbr*ch;
			 double mtotal=cb+cbm+chb;
			 textField_5.setText(String.valueOf(mtotal));			//textField_1.setText(String.valueOf(tax));
			 String a=(String)comboBox.getSelectedItem();
			 float dr=0;
			 if(a.equals("Tea"))
			 {
				dr=20; 
			 }
			 if(a.equals("Coffe"))
			 {
				dr=20; 
			 }
			 
			 if(a.equals("Cocke"))
			 {
				dr=25; 
			 }
			 //String n=String.valueOf(dr);
			 //textField_4.setText(n);
	
			float drq=Float.parseFloat((String)textField_3.getText());
			double dtotal=drq*dr;
			textField_4.setText(String.valueOf(dtotal));
			float dlch=0;
			if(rdbtnHomeDelivery.isSelected())
			{
				dlch=(c+b+ch+drq)*5;
			}
			textField_6.setText(String.valueOf(dlch));
			float tax=0;
			if(rdbtnTax.isSelected())
			{
				tax=(c+b+ch+drq)*4;
			}
			textField_8.setText(String.valueOf(tax));
			double stotal=(float)mtotal+dtotal+dlch;
			textField_9.setText(String.valueOf(stotal));
			double  total=stotal+tax;
			textField_10.setText(String.valueOf(total));
			textField_7.setText(String.valueOf(total));
			
			}
		});
		btnTotal.setFont(new Font("Traditional Arabic", Font.BOLD, 12));
		btnTotal.setBounds(36, 29, 89, 23);
		panel_5.add(btnTotal);
		
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Traditional Arabic", Font.BOLD, 12));
		btnExit.setBounds(317, 29, 89, 23);
		panel_5.add(btnExit);
		
		
		JLabel lblHotelMnag = new JLabel("Hotel Management System");
		lblHotelMnag.setFont(new Font("Traditional Arabic", Font.BOLD, 25));
		lblHotelMnag.setBounds(273, 28, 320, 30);
		frame.getContentPane().add(lblHotelMnag);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(617, 80, 320, 466);
		frame.getContentPane().add(tabbedPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		tabbedPane.addTab("Calculator", null, layeredPane, null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 315, 438);
		layeredPane.add(panel_4);
		
		tf = new JTextField();
		tf.setColumns(10);
		tf.setBounds(22, 57, 239, 49);
		panel_4.add(tf);
		
		JButton button_1 = new JButton("C");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("");
				
			}
		});
		button_1.setBounds(29, 135, 50, 36);
		panel_4.add(button_1);
		
		JButton button_3 = new JButton("+");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=tf.getText();
				tf.setText("");
				str2=button_3.getText();
			}
		});
		button_3.setBounds(207, 135, 50, 36);
		panel_4.add(button_3);
		
		JButton button_4 = new JButton("7");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1){
					
						tf.setText("");	
						f=0;
					}
			tf.setText(tf.getText().concat(button_4.getText())); 
				
			}
		});
		button_4.setBounds(29, 197, 50, 36);
		panel_4.add(button_4);
		
		JButton button_5 = new JButton("8");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1){
					
						tf.setText("");	
						f=0;
					}
			tf.setText(tf.getText().concat(button_5.getText())); 
			
				
			}
		});
		button_5.setBounds(89, 197, 50, 36);
		panel_4.add(button_5);
		
		JButton button_6 = new JButton("9");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1){
					
						tf.setText("");	
						f=0;
					}
			tf.setText(tf.getText().concat(button_6.getText())); 
			
			}
		});
		button_6.setBounds(152, 197, 50, 36);
		panel_4.add(button_6);
		
		JButton button_7 = new JButton("-");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=tf.getText();
				tf.setText("");
				str2=button_7.getText();
			}
		});
		button_7.setBounds(211, 197, 50, 36);
		panel_4.add(button_7);
		
		JButton button_8 = new JButton("4");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1){
					
						tf.setText("");	
						f=0;
					}
			tf.setText(tf.getText().concat(button_8.getText())); 
			
			}
		});
		button_8.setBounds(29, 255, 50, 36);
		panel_4.add(button_8);
		
		JButton button_9 = new JButton("5");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1){
					
						tf.setText("");	
						f=0;
					}
			tf.setText(tf.getText().concat(button_9.getText())); 
			
			}
		});
		button_9.setBounds(89, 255, 50, 36);
		panel_4.add(button_9);
		
		JButton button_10 = new JButton("6");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1){
					
						tf.setText("");	
						f=0;
					}
			tf.setText(tf.getText().concat(button_10.getText())); 
			
			}
		});
		button_10.setBounds(152, 255, 50, 36);
		panel_4.add(button_10);
		
		JButton button_11 = new JButton("*");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=tf.getText();
				tf.setText("");
				str2=button_11.getText();
			}
		});
		button_11.setBounds(211, 255, 50, 36);
		panel_4.add(button_11);
		
		JButton button_12 = new JButton("1");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1){
					
						tf.setText("");	
						f=0;
					}
			tf.setText(tf.getText().concat(button_12.getText())); 
			
			}
		});
		button_12.setBounds(29, 313, 50, 36);
		panel_4.add(button_12);
		
		JButton button_13 = new JButton("2");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
					{
						tf.setText("");	
						f=0;
					}
			tf.setText(tf.getText().concat(button_13.getText())); 
			
			}
		});
		button_13.setBounds(89, 313, 50, 36);
		panel_4.add(button_13);
		
		JButton button_14 = new JButton("3");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1){
					
						tf.setText("");	
						f=0;
					}
			tf.setText(tf.getText().concat(button_14.getText())); 
			
			}
		});
		button_14.setBounds(152, 313, 50, 36);
		panel_4.add(button_14);
		
		JButton button_15 = new JButton("/");
		button_15.addActionListener(new ActionListener() {//
			public void actionPerformed(ActionEvent e) {
				str1=tf.getText();
				tf.setText("");
				str2=button_15.getText();
			}
		});
		button_15.setBounds(211, 313, 50, 36);
		panel_4.add(button_15);
		
		JButton button_16 = new JButton("0");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1){
					
						tf.setText("");	
						f=0;
					}
			tf.setText(tf.getText().concat(button_16.getText())); 
			
			}
		});
		button_16.setBounds(89, 135, 50, 36);
		panel_4.add(button_16);
		
		JButton button_17 = new JButton(".");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
				tf.setText("");
				f=0;
				}
				tf.setText(tf.getText().concat(button_17.getText()));
			}	
		});
		button_17.setBounds(152, 135, 50, 36);
		panel_4.add(button_17);
		
		JButton button_19 = new JButton("=");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float res1=Float.parseFloat(str1);
				float res2=Float.parseFloat((String)tf.getText()); //drq=Float.parseFloat((String)textField_3.getText());
				f=1;
				switch(str2)
				{
				case "+":
					tf.setText(String.valueOf(res1+res2)); 
					break;
				case "-":
					tf.setText(String.valueOf(res1-res2)); 
					break;
				case "*":
					tf.setText(String.valueOf(res1*res2)); 
					break;	
				case "/":
					tf.setText(String.valueOf(res1/res2)); 
					break;
					
				}
			}
		});
		button_19.setBounds(126, 367, 135, 36);
		panel_4.add(button_19);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		tabbedPane.addTab("Reciept", null, layeredPane_1, null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 295, 416);
		layeredPane_1.add(textArea);
		JButton btnRecip = new JButton("Receipt");
		btnRecip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Cost of drinks : "+textField_4.getText()+"\nCost of meal : "+textField_5.getText()
				+"\nCost of delivery : "+textField_6.getText()+"\nSub Total : "+textField_9.getText()+"\nTax : "
				+textField_8.getText()+"\n\n Total : "+textField_10.getText() );
			}
		});
		btnRecip.setFont(new Font("Traditional Arabic", Font.BOLD, 12));
		btnRecip.setBounds(435, 28, 89, 23);
		panel_5.add(btnRecip);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("0");
				textField_1.setText("0");
				textField_2.setText("0");
				textField_3.setText("0");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_8.setText("");
				textField_7.setText("");
				textField_9.setText("");
				textField_10.setText("");
				rdbtnHomeDelivery.setSelected(false);
				rdbtnTax.setSelected(false);
				textArea.setText(null);
				
			}
		});
		btnReset.setFont(new Font("Traditional Arabic", Font.BOLD, 12));
		btnReset.setBounds(175, 29, 89, 23);
		panel_5.add(btnReset);
		
		
	}
}
