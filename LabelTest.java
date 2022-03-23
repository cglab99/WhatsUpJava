package braveheart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class LabelTest extends JFrame {
	
	private JPanel panel;
	private JLabel myLabel1, myLabel2, myLabel3;
	
	public LabelTest() {
		this.setBounds(100, 100, 200, 200);
		this.setTitle("Label Test");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.GRAY);
		
		myLabel1 = new JLabel();
		myLabel1.setText("C언어");
		myLabel1.setForeground(Color.CYAN);
		panel.add(myLabel1);

		myLabel2 = new JLabel("C++언어");
		myLabel2.setHorizontalAlignment(JLabel.CENTER);
		myLabel2.setForeground(Color.GREEN);
		panel.add(myLabel2);

		myLabel3 = new JLabel("자바");
		myLabel3.setHorizontalAlignment(JLabel.RIGHT);
		myLabel3.setForeground(Color.YELLOW);
		panel.add(myLabel3);
		
		this.add(panel);
	}

	public static void main(String[] args) {
		new LabelTest().setVisible(true);
	}

}
