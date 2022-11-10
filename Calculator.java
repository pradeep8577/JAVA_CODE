import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Calculator extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(40, 10, 201, 34);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("7");
			}
		});
		btnNewButton.setBounds(40, 90, 44, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("8");
			}
		});
		btnNewButton_1.setBounds(90, 90, 44, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("9");
			}
		});
		btnNewButton_2.setBounds(140, 90, 44, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("4");
			}
		});
		btnNewButton_3.setBounds(40, 120, 44, 21);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("5");
			}
		});
		btnNewButton_4.setBounds(90, 120, 44, 21);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("6");
			}
		});
		btnNewButton_5.setBounds(140, 120, 44, 21);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("1");
			}
		});
		btnNewButton_6.setBounds(40, 150, 44, 21);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("2");
			}
		});
		btnNewButton_7.setBounds(90, 150, 44, 21);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("3");
			}
		});
		btnNewButton_8.setBounds(140, 150, 44, 21);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("0");
			}
		});
		btnNewButton_9.setBounds(40, 181, 94, 21);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton(".");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(".");
			}
		});
		btnNewButton_10.setBounds(140, 180, 44, 21);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("+");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("+");
			}
		});
		btnNewButton_11.setBounds(190, 85, 51, 56);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("=");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] str=new String[2];
				if(textArea.getText().contains("-"))
				{
					str=textArea.getText().split("-");
					double x=Double.parseDouble(str[0]);
					double y=Double.parseDouble(str[1]);
					double z=x-y;
					textArea.setText(str[0]+" - "+str[1]+" = "+String.valueOf(z));
				}
				else if(textArea.getText().contains("*"))
				{
					str=textArea.getText().split("\\*");
					double x=Double.parseDouble(str[0]);
					double y=Double.parseDouble(str[1]);
					double z=x*y;
					textArea.setText(str[0]+" * "+str[1]+" = "+String.valueOf(z));
				}
				else if(textArea.getText().contains("/"))
				{
					str=textArea.getText().split("/");
					double x=Double.parseDouble(str[0]);
					double y=Double.parseDouble(str[1]);
					double z=x/y;
					textArea.setText(str[0]+" / "+str[1]+" = "+String.valueOf(z));
				}
				else if(textArea.getText().contains("+"))
				{
					str=textArea.getText().split("\\+");
					double x=Double.parseDouble(str[0]);
					double y=Double.parseDouble(str[1]);
					double z=x+y;
					textArea.setText(str[0]+" + "+str[1]+" = "+String.valueOf(z));
				}
			}
		});
		btnNewButton_12.setBounds(190, 150, 51, 51);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("-");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("-");
			}
		});
		btnNewButton_13.setBounds(190, 59, 51, 21);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("*");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("*");
			}
		});
		btnNewButton_14.setBounds(142, 59, 44, 21);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("/");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("/");
			}
		});
		btnNewButton_15.setBounds(90, 59, 44, 21);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("C");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		btnNewButton_16.setBounds(40, 60, 44, 21);
		contentPane.add(btnNewButton_16);
		
	}
}