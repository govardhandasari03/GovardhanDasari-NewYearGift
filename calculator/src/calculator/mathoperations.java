package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
//import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class mathoperations {

	private JFrame frame;
	private JTextField value1;
	private JTextField value2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mathoperations window = new mathoperations();
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
	public mathoperations() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.getContentPane().setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		editorPane.setBounds(10, 11, 297, 90);
		frame.getContentPane().add(editorPane);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setBackground(UIManager.getColor("CheckBox.background"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+7);
			}
		});
		btnNewButton.setBounds(11, 125, 68, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("4");
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+4);
			}
		});
		button.setBounds(11, 187, 68, 50);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("1");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+1);
			}
		});
		button_1.setBounds(11, 247, 68, 50);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("8");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+8);
			}
		});
		button_2.setBounds(83, 125, 68, 50);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+5);
			}
		});
		button_3.setBounds(83, 185, 68, 50);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("2");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+2);
			}
		});
		button_4.setBounds(83, 245, 68, 50);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("9");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+9);
			}
		});
		button_5.setBounds(157, 126, 68, 50);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+6);
			}
		});
		button_6.setBounds(157, 185, 68, 50);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("3");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+3);
			}
		});
		button_7.setBounds(157, 245, 68, 50);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("=");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int one=Integer.parseInt(value1.getText());
				int two=Integer.parseInt(value2.getText());
				
				if(actionRecived.getText().equals("sub"))
				{int sub=one-two;
				 value1.setText(String.valueOf(sub));
				}
				if(actionRecived.getText().equals("add"))
				{int add=one+two;
				 value1.setText(String.valueOf(add));
				}
				if(actionRecived.getText().equals("div"))
				{int div=one/two;
				 value1.setText(String.valueOf(div));
				}
				if(actionRecived.getText().equals("mul"))
				{int mul=one*two;
				 value1.setText(String.valueOf(mul));
				}
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_8.setBounds(159, 301, 68, 46);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+0);
			}
		});
		button_9.setBounds(12, 300, 141, 49);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecived.setText("sub");
				value2.setText(null);
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_10.setBounds(231, 124, 68, 50);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("+");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecived.setText("add");
				value2.setText(null);
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_11.setBounds(232, 184, 68, 50);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecived.setText("div");
				value2.setText(null);
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_12.setBounds(234, 242, 68, 50);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("*");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecived.setText("mul");
				value2.setText(null);
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_13.setBounds(232, 302, 72, 44);
		frame.getContentPane().add(button_13);
		
		value1 = new JTextField();
		value1.setHorizontalAlignment(SwingConstants.RIGHT);
		value1.setFont(new Font("Tahoma", Font.BOLD, 18));
		value1.setBorder(null);
		value1.setBounds(10, 55, 297, 46);
		frame.getContentPane().add(value1);
		value1.setColumns(10);
		
		value2 = new JTextField();
		value2.setHorizontalAlignment(SwingConstants.LEFT);
		value2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		value2.setBounds(10, 11, 297, 46);
		frame.getContentPane().add(value2);
		value2.setColumns(10);
		
		actionRecived = new JLabel("");
		actionRecived.setBounds(11, 353, 72, 38);
		frame.getContentPane().add(actionRecived);
		
		JButton btnNewButton_1 = new JButton("c");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(null);
				value2.setText(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(232, 353, 75, 46);
		frame.getContentPane().add(btnNewButton_1);
		frame.setBounds(500, 100, 331, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
    private	JLabel actionRecived;

}
