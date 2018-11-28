import java.awt.Container;


import javax.swing.JFrame;


/**
 * Execute MyFrame class
 * @Author (Munesato)
 * @Version (2018/11/28)
 */
public class MyFrame extends JFrame {
	public MyPanel panel;
	
	public MyFrame() {
		this.setTitle("slotto");
		this.setSize(250, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		
		panel = new MyPanel();
		panel.setSize(250, 150);
		
		Container c =  this.getContentPane();
		c.add(panel);
		
		panel.setFocusable(true);
		panel.requestFocus();
		
		this.setVisible(true);
	}
}
