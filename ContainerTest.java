package braveheart;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ContainerTest extends JFrame {
	
	JButton myButton1, myButton2;
	JLabel myLabel;
	JPanel p1, p2;
	
	public ContainerTest() {
		this.setBounds(100, 100, 400, 200);
		this.setTitle("Container Test");
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setBackground(Color.CYAN);
		myButton1 = new JButton("버튼 #1");
		p1.add(myButton1);
		myButton2 = new JButton("버튼 #2");
		p1.add(myButton2);
		this.add(p1);		
		
		p2 = new JPanel();
		p2.setBackground(Color.RED);
		myLabel = new JLabel("레이블", JLabel.CENTER);
		myLabel.setBackground(Color.YELLOW);
		p2.add(myLabel);
		this.add(p2);

	}

	public static void main(String[] args) {
		new ContainerTest().setVisible(true);
	}

}
