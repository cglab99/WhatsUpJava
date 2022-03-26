package graphicsTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyPanel extends JPanel {
	int x1, y1, x2, y2;
	Color color;
	int shape=0; // 0:line, 1:box, 2:oval
	protected void paintComponent(Graphics g) {
		g.setColor(color);
		switch( shape ) {
			case 0 :
				g.drawLine(x1,y1,x2,y2);  // 시작점(x1, y1), 끝점(x2,y2)을 연결하는 직선
				break;
			case 1:
				g.drawRect(x1, y1, 50, 50 );   // 시작점(x1, y1)에서 시작하는 가로 세로 50짜리 사각형
				break;
			case 2:
				g.drawOval(x1, y1, 50, 30);	//중심점(x1, y1)을 기준으로 가로반지름 50, 세로반지름 30인 타원 
				break;
		}
	}
	public MyPanel() {
		
	}
}

public class GraphicsTest extends JFrame implements ActionListener, MouseListener {
	
	JTextField x1, y1, x2, y2;
	JComboBox<String> color, shape;
	JButton draw;
	MyPanel panel;
	
	public GraphicsTest() {
		this.setTitle("마우스클릭 좌(시작점)/우(끝점)으로 좌표 지정.");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100, 100, 500, 400);
		this.setLayout(null);		
		
		x1 = new JTextField("0");
		x1.setBounds(0, 0, 50, 20);
		this.add(x1);
		y1 = new JTextField("0");
		y1.setBounds(60, 0, 50, 20);
		this.add(y1);
		x2 = new JTextField("0");
		x2.setBounds(120, 0, 50, 20);
		this.add(x2);
		y2 = new JTextField("0");
		y2.setBounds(180, 0, 50, 20);
		this.add(y2);
		
		draw = new JButton("Draw");
		draw.setBounds(240, 0, 70, 20);
		draw.addActionListener(this);
		this.add(draw);

		color = new JComboBox<>();
		color.addItem("검정");
		color.addItem("빨강");
		color.setBounds(320, 0, 60, 20);
		color.addItemListener( new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				switch( e.getItem().toString() ) {
				case "검정" :
					panel.color = Color.BLACK;
					break;
				case "빨강" :
					panel.color = Color.RED;
				}
			}
		});
		this.add(color);
		
		shape = new JComboBox<>();
		shape.addItem("직선");
		shape.addItem("사각형");
		shape.addItem("원");
		shape.setBounds(400, 0, 60, 20);
		shape.addItemListener(e -> {
			switch( e.getItem().toString() ) {
			case "직선" :
				panel.shape = 0;  // 직선
				break;
			case "사각형" :
				panel.shape = 1;  // 사각형
				break;
			case "원":
				panel.shape = 2;  // 사각형
				break;
			}
		});
		this.add(shape);
		
		panel = new MyPanel();
		panel.setBounds(0, 20, 485, 375);
		panel.addMouseListener(this);
		
		this.add(panel);
		
	}
	
	public static void main(String[] args) {
		new GraphicsTest().setVisible(true);
	}
	// draw 버튼을 누르면 좌표를 읽어와서 다시 그린다.  
	@Override
	public void actionPerformed(ActionEvent e) {
		panel.x1 = Integer.parseInt( x1.getText() );
		panel.y1 = Integer.parseInt( y1.getText() );
		panel.x2 = Integer.parseInt( x2.getText() );
		panel.y2 = Integer.parseInt( y2.getText() );
		repaint();
	}
	// 마우스 좌버튼(1번)를 클릭하면 클릭된 지점으로 시작좌표를 설정해 준다.
	// 마우스 우버튼(3번)를 클릭하면 클릭된 지점으로 끝좌표를 설정해 준다.      
	@Override
	public void mouseClicked(MouseEvent e) {
		if( e.getButton() == 1 ) {
			x1.setText( Integer.toString(e.getX()) );
			y1.setText( Integer.toString(e.getY()) );
		} else if( e.getButton() == 3 ) {
			x2.setText( Integer.toString(e.getX()) );
			y2.setText( Integer.toString(e.getY()) );
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
