package guiapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class exp_12 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exp_12 frame = new exp_12();
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
	public exp_12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int k=e.getKeyCode();
				String str="";
				if(k==KeyEvent.VK_F1)
				{
					str+="F1";
				}
				if(k==KeyEvent.VK_F2)
				{
					str+="F2";
				}
				if(k==KeyEvent.VK_F3)
				{
					str+="F3";
				}
				if(k==KeyEvent.VK_F4)
				{
					str+="F4";
				}
				if(k==KeyEvent.VK_F5)
				{
					str+="F5";
				}
				if(k==KeyEvent.VK_F6)
				{
					str+="F6";
				}
				if(k==KeyEvent.VK_F7)
				{
					str+="F7";
				}
				if(k==KeyEvent.VK_F8)
				{
					str+="F8";
				}
				if(k==KeyEvent.VK_F9)
				{
					str+="F9";
				}
				if(k==KeyEvent.VK_F10)
				{
					str+="F10";
				}
				if(k==KeyEvent.VK_F11)
				{
					str+="F11";
				}
				if(k==KeyEvent.VK_F12)
				{
					str+="F12";
				}
				if(k==KeyEvent.VK_CAPS_LOCK)
				{
					str+="Caps Lock";
				}
				if(k==KeyEvent.VK_SHIFT)
				{
					str+="shift";
				}
				if(k==KeyEvent.VK_BACK_SPACE)
				{
					str+="Back Space";
				}
				if(k==KeyEvent.VK_ESCAPE)
				{
					str+="Escape";
				}
				if(k==KeyEvent.VK_ALT)
				{
					str+="ALT";
				}
				if(k==KeyEvent.VK_ENTER)
				{
					str+="enter";
				}
				textField.setText(str);
			}
			@Override
			public void keyReleased(KeyEvent e) {
				textField.setText("");
			}
		});
		textField.setBounds(59, 20, 221, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				textField_1.setText("x = "+String.valueOf(e.getX())+" y = "+String.valueOf(e.getY()));
			}
		});
		textField_1.setBounds(59, 72, 221, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i=e.getButton();
				if(i==1)
				{
					textField_2.setText("Mouse left clicked"+"X"+String.valueOf(e.getX()+"y"+String.valueOf(e.getY())));
				}
				if(i==2)
				{
					textField_2.setText("Mouse middle clicked"+"x"+String.valueOf(e.getX())+"y"+String.valueOf(e.getY()));
				}
				if(i==3)
				{
					textField_2.setText("Mouse RIGHT clicked"+"x"+String.valueOf(e.getX())+"y"+String.valueOf(e.getY()));
				}
			}
		});
		textField_2.setBounds(59, 124, 221, 30);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		
		
		
		
	}
}
