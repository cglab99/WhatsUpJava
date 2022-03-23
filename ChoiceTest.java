package braveheart;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChoiceTest extends JFrame implements ActionListener {

	private JPanel panel;
	private JLabel myLabel;
	private JComboBox<String> myChoice;
	
	public ChoiceTest() {
		this.setBounds(100, 100,  400, 200);
		this.setTitle("Choice Test");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setBackground(new Color(180, 0, 0));

		myChoice = new JComboBox<String>();
		myChoice.addItem("C언어");
		myChoice.addItem("C++언어");
		myChoice.addItem("Java");
		myChoice.addActionListener(this);
		panel.add(myChoice);
	
		myLabel = new JLabel("초이스 항목을 선택해주세요.");
		panel.add(myLabel);		
		
		this.add(panel);
	}
	
	public static void main(String[] args) {
		new ChoiceTest().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		myLabel.setText( myChoice.getSelectedItem().toString() ) ;
	}

}
