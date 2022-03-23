package braveheart;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class ParaPanel extends JPanel {
	private String arg;
	public ParaPanel(String arg) {
		this.arg = arg;
	}

	protected void paintComponent(Graphics g) {
		g.drawString( arg , 50, 100);
	}	
}

public class ParameterTest extends JFrame {
	
	public ParameterTest(String arg) {
		this.setSize(300, 200);
		ParaPanel panel = new ParaPanel(arg);
		this.add(panel);
	}

	public static void main(String[] args) {
		new ParameterTest(args[0]).setVisible(true);
	}
}
