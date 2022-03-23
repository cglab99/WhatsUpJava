package braveheart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaTest extends JFrame implements KeyListener {
	
	private JPanel panel;
	private JLabel myLabel;
    private JTextArea myTextArea;
	
	public TextAreaTest() {
		this.setBounds(100, 100, 400, 200);
		this.setTitle("TextArea Test");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		myTextArea = new JTextArea(20,10);
		myTextArea.addKeyListener(this);
		panel.add(BorderLayout.CENTER, myTextArea);		
		
		myLabel = new JLabel();
		myLabel.setText("글을 입력해 주세요");
		panel.add(BorderLayout.SOUTH, myLabel);
		
		this.add(panel);
	}
	

	public static void main(String[] args) {
		new TextAreaTest().setVisible(true);
	}

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

}
