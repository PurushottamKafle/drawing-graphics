package pksoft;

import javax.swing.JFrame;

public class first  { 

	public static void main(String args[]) {
		JFrame win = new JFrame("Purushottam");
second s = new second();
win.add(s);
win.setSize(300,200);
win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
win.setVisible(true);
	}
	
}
