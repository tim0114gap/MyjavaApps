
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


/**
 * Execute MyFrame class
 * @Author (Munesato)
 * @Version (2018/11/28)
 */
public class MyPanel extends JPanel {
	JLabel leftNum;
	JLabel centerNum;
	JLabel rightNum;
	JLabel bottomNum;
	
	public MyPanel() {
		this.setLayout(null);
		
		leftNum = new JLabel("0");
		leftNum.setSize(50, 30);
		leftNum.setLocation(30, 20);
		leftNum.setOpaque(true);
		leftNum.setBackground(Color.MAGENTA);
		leftNum.setForeground(Color.YELLOW);
		leftNum.setHorizontalAlignment(SwingConstants.CENTER);
		leftNum.setFont(new Font("Arial", Font.ITALIC, 20));
		this.add(leftNum);
		
		centerNum = new JLabel("0");
		centerNum.setSize(50, 30);
		centerNum.setLocation(90, 20);
		centerNum.setOpaque(true);
		centerNum.setBackground(Color.MAGENTA);
		centerNum.setForeground(Color.YELLOW);
		centerNum.setHorizontalAlignment(SwingConstants.CENTER);
		centerNum.setFont(new Font("Arial", Font.ITALIC, 20));
		this.add(centerNum);
		
		rightNum = new JLabel("0");
		rightNum.setSize(50, 30);
		rightNum.setLocation(150, 20);
		rightNum.setOpaque(true);
		rightNum.setBackground(Color.MAGENTA);
		rightNum.setForeground(Color.YELLOW);
		rightNum.setHorizontalAlignment(SwingConstants.CENTER);
		rightNum.setFont(new Font("Arial", Font.ITALIC, 20));
		this.add(rightNum);
		
		bottomNum = new JLabel("시작합니다.");
		bottomNum.setSize(100, 50);
		bottomNum.setLocation(80, 60);
		this.add(bottomNum);
		
		this.addKeyListener(new MyListener(leftNum, centerNum, rightNum, bottomNum));
	}
}
