package braveheart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class ScrollbarTest extends JFrame implements AdjustmentListener {
	JPanel panel;
	JLabel myLabel;
	JScrollBar myScrollbar;
	
	public ScrollbarTest() {
		this.setBounds(100, 100, 400, 200);
		this.setTitle("ScrollBar Test");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout() );
		
		myScrollbar = new JScrollBar(JScrollBar.HORIZONTAL, 50, 0, 1, 100);
		myScrollbar.addAdjustmentListener(this);
		panel.add(BorderLayout.NORTH, myScrollbar );
		
		myLabel = new JLabel();
		myLabel.setText("스크롤바를 조정하세요");
		myLabel.setHorizontalAlignment(JLabel.CENTER);
		panel.add(BorderLayout.CENTER, myLabel );
		
		this.add(panel);		
	}

	public static void main(String[] args) {
		new ScrollbarTest().setVisible(true);
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		myLabel.setText("위치: " + myScrollbar.getValue());
	}

}
