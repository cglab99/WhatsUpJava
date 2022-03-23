package braveheart;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class CheckboxGroupTest extends JFrame implements ActionListener {

	private JPanel panel;
	private JLabel myLabel;
	private JRadioButton myCheckbox1, myCheckbox2, myCheckbox3;
	private ButtonGroup group;
	
	public CheckboxGroupTest() {
		this.setBounds(100, 100, 400, 200);
		this.setTitle("Checkbox Group Test");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		group = new ButtonGroup();
		
		myCheckbox1 = new JRadioButton("C언어");
		myCheckbox1.addActionListener(this);
		group.add(myCheckbox1);
		panel.add(myCheckbox1);
		myCheckbox2 = new JRadioButton("C++언어");
		myCheckbox2.addActionListener(this);
		group.add(myCheckbox2);
		panel.add(myCheckbox2);
		myCheckbox3 = new JRadioButton("Java");
		myCheckbox3.addActionListener(this);
		group.add(myCheckbox3);
		panel.add(myCheckbox3);
		
		myLabel = new JLabel("라디오버튼을 선택해 주세요");
		panel.add(myLabel);
		
		this.add(panel);
	}
	
	public static void main(String[] args) {
		new CheckboxGroupTest().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == myCheckbox1 ) myLabel.setText( e.getActionCommand() + "선택" );
		else if( e.getSource() == myCheckbox2 ) myLabel.setText( e.getActionCommand() + "선택" );
		else myLabel.setText( e.getActionCommand() + "선택" );
	}

}
