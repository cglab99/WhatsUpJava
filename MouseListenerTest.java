import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyPanel extends JPanel implements MouseMotionListener, MouseListener {
	JLabel myLabel, myLabel2;
	public MyPanel() {
		this.setBounds(100, 100, 400, 300);
		this.setLayout(null);

		this.addMouseMotionListener(this);
		this.addMouseListener(this);

		myLabel = new JLabel("hello");
		myLabel.setBounds(0, 0, 150, 20);
		this.add(myLabel);
		
		myLabel2 = new JLabel("-------");
		myLabel2.setBounds(200, 0, 150, 20);
		this.add(myLabel2);

	}
	@Override
	public void mouseDragged(MouseEvent e) {
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		myLabel.setText(e.getX() + "," + e.getY() );
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		myLabel2.setText( "**********" );
	}
	@Override
	public void mousePressed(MouseEvent e) {
		myLabel2.setText( "@@@@@@@@@@" );
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		myLabel2.setText( "+++++++++" );
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
}

public class MouseListenerTest extends JFrame {
	JLabel myLabel;
	MyPanel panel;
	public MouseListenerTest() {
		this.setTitle("Mouse Test");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100, 100, 400, 300);
		this.setLayout(null);
		
		panel = new MyPanel();
		panel.setBounds(0, 0, 385, 240);
		this.add(panel);
	}
	public static void main(String[] args) {
		new MouseListenerTest().setVisible(true);
	}
}
