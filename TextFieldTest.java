package braveheart;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldTest extends JFrame {
	
	private JPanel panel;
	private JLabel myLabel;
	private JTextField myTextField;
	
	public TextFieldTest() {
		this.setBounds(100, 100, 400, 200);
		this.setTitle("TextField Test");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(new Color(180, 0, 180));
		
		myTextField = new JTextField(20);
		myTextField.addActionListener( e -> {
				myTextField.setText("입력완료");
				});		
		myTextField.addKeyListener( new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				myLabel.setText( "" + e.getKeyChar() );
			}
			@Override
			public void keyPressed(KeyEvent e) {
			}
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		panel.add(myTextField);	
		
		myLabel = new JLabel();
		myLabel.setText("글을 입력해 주세요");
		panel.add(myLabel);
		
		this.add(panel);
	}

	public static void main(String[] args) {
		new TextFieldTest().setVisible(true);
	}
	
}
