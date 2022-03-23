package braveheart;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckboxTest extends JFrame implements ActionListener {
	
	JLabel myLabel;
	JCheckBox myCheckbox1, myCheckbox2, myCheckbox3;
	
	public CheckboxTest() {
		this.setBounds(100, 100, 400, 200);
		this.setTitle("Checkbox Test");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		// panel.setBackground(new Color(0, 0, 255));
		
		myCheckbox1 = new JCheckBox();
		myCheckbox1.setText("C언어");
		// myCheckbox1.setBackground(panel.getBackground());
		// myCheckbox1.setForeground(Color.GREEN);
		myCheckbox1.addActionListener(this);
		panel.add(myCheckbox1);

		myCheckbox2 = new JCheckBox("C++언어");
		myCheckbox2.addActionListener(this);
		panel.add(myCheckbox2);

		myCheckbox3 = new JCheckBox("Java");
		myCheckbox3.addActionListener(this);
		panel.add(myCheckbox3);
		
		myLabel = new JLabel("체크박스를 선택해주세요!");
		myLabel.setHorizontalAlignment(JLabel.CENTER);
		myLabel.setForeground(Color.YELLOW);
		panel.add(myLabel);
		
		this.add(panel);
	}

	public static void main(String[] args) {
		new CheckboxTest().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch( e.getActionCommand() ) {
		case "C언어":
			myLabel.setText( e.getActionCommand() + ( (myCheckbox1.isSelected())?"선택":"해제") );
			break;
		case "C++언어":
			myLabel.setText( e.getActionCommand() + ( (myCheckbox2.isSelected())?"선택":"해제") );
			break;
		case "Java":
			myLabel.setText( e.getActionCommand() + ( (myCheckbox3.isSelected())?"선택":"해제") );
			break;
		}
		
		//if( e.getSource() == myCheckbox1 ) myLabel.setText( e.getActionCommand() + ( (myCheckbox1.isSelected())?"선택":"해제") );
		//if( e.getSource() == myCheckbox2 ) myLabel.setText( e.getActionCommand() + ( (myCheckbox2.isSelected())?"선택":"해제") );
		//if( e.getSource() == myCheckbox3 ) myLabel.setText( e.getActionCommand() + ( (myCheckbox3.isSelected())?"선택":"해제") );
	}

}
