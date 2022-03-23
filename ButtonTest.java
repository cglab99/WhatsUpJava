package braveheart;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonTest extends JFrame implements ActionListener {
	JPanel myPanel;
	JLabel myLabel;
	JButton myButton1, myButton2, myButton3;

	public ButtonTest() {
		
		this.setBounds(100, 100, 400, 200);
		this.setTitle("Button Test");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		myPanel = new JPanel();
		myPanel.setBackground(Color.PINK);
		
		myButton1 = new JButton();
		myButton1.setText("C언어");
		myButton1.addActionListener(this);
		myPanel.add(myButton1);
		
		myButton2 = new JButton("C++언어");
		myButton2.addActionListener(this);
		myPanel.add(myButton2);

		myButton3 = new JButton("Java");
		myButton3.addActionListener(this);
		myPanel.add(myButton3);
 
		myLabel = new JLabel();
		myLabel.setText("버튼을 눌러 주세요");
		myLabel.setHorizontalAlignment(JLabel.CENTER);
		myLabel.setForeground(Color.YELLOW);
		myPanel.add(myLabel);
		
		this.add(myPanel);
	}
	public static void main(String[] args) {
		new ButtonTest().setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if( e.getSource() == myButton1 ) myLabel.setText( "선택: C언어");
		else if( e.getSource() == myButton2 ) myLabel.setText( "선택: C++언어");
		else myLabel.setText( "선택: Java");
				
		// myLabel.setText( e.getActionCommand() + "를 눌렀어요");	
	}

}
