package braveheart;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListTest extends JFrame implements ListSelectionListener {
	
	private JPanel panel;
	private JLabel myLabel;
	private JList<String> myList;
	
	public ListTest() {
		this.setBounds(100, 100, 400, 200);
		this.setTitle("List Test");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(new Color(180, 0, 180));
		
		String[] programingLanguage = { "C���", "C++���", "Java", "Pascal", "Fortran"};
		myList = new JList<>( programingLanguage );
		myList.addListSelectionListener(this);
		panel.add(myList);
		
		myLabel = new JLabel("����Ʈ �׸��� ������ �ּ���");
		panel.add(myLabel);
		
		this.add(panel);
	}

	public static void main(String[] args) {
		new ListTest().setVisible(true);	
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		myLabel.setText( myList.getSelectedValue() );
	}

}
