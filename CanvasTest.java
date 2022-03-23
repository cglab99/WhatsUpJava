package braveheart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	public MyPanel() {
		this.setForeground(Color.GREEN);
		this.setSize(100, 100);
	}
	
	protected void paintComponent(Graphics g) {
		g.drawString("³» Äµ¹ö½º", 10,  20);
		g.drawOval(40, 40, 50, 50);
		g.drawLine(30, 30, 60, 60);
		g.drawRect(0, 0, 99, 99);
	}
	
}

public class CanvasTest extends JFrame {

	MyPanel myPanel;
	
	public CanvasTest() {
		this.setBounds(100, 100, 400, 200);
		this.setTitle("Canvas Test");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		myPanel = new MyPanel();
		
		this.add(myPanel);
	}
	
	public static void main(String[] args) {
		new CanvasTest().setVisible(true);
	}

}
