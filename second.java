package pksoft;

import java.awt.*;


import javax.swing.*;

public  class second extends JPanel {
// Graphics Desgn
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	this.setBackground(Color.white);
	// now drawing
	g.setColor(Color.BLACK);
	g.fillRect(30, 30, 100, 90);
	// another for custom RGB
	
	// for text
	
	g.setColor(Color.GREEN);
	g.drawString("Purushottam Kafle - Hello World", 5, 90);
	}

	
}
