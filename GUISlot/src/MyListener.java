import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;

/**
 * Execute MyFrame class
 * @Author (Munesato)
 * @Version (2018/11/28)
 */
public class MyListener extends KeyAdapter {
	JLabel leftNum;
	JLabel centerNum;
	JLabel rightNum;
	JLabel bottomNum;
	
	public MyListener(Object o1, Object o2, Object o3, Object o4) {
		leftNum = (JLabel)o1;
		centerNum = (JLabel)o2;
		rightNum = (JLabel)o3;
		bottomNum = (JLabel)o4;
	}
	
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyChar();
		
		if(keyCode == '\n') {
			int x = (int)(Math.random()*5);
			leftNum.setText(Integer.toString(x));
			
			int y = (int)(Math.random()*5);
			centerNum.setText(Integer.toString(y));
			
			int z = (int)(Math.random()*5);
			rightNum.setText(Integer.toString(z));
			
			if(x == y && y == z) {
				bottomNum.setText("축하합니다!!");
			}else {
				bottomNum.setText("아쉽군요");
			}
		}
	}
}
