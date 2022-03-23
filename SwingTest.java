package braveheart;

import java.awt.Graphics;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MPanel extends JPanel {
	protected void paintComponent(Graphics g) {
		g.drawString("안녕하세요 감사합니다.", 20, 50);
	}
}

public class SwingTest extends JFrame {
	
	public SwingTest() {
		this.setBounds(100, 100, 300, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		MPanel Panel = new MPanel();
		this.add(Panel);
	}
	
	public static void main(String[] args) {
		new SwingTest().setVisible(true);
	}

}
