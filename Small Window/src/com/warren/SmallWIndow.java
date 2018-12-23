/**
 * 
 */
package com.warren;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @author charl
 *
 */
public class SmallWIndow extends Frame {

	public SmallWIndow(String title) {
		super(title);
		setSize(500, 140);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Font sansSerifLarge = new Font("SensSerif", Font.BOLD, 18);
		Font sansSerifSmall = new Font("SensSerif", Font.BOLD, 12);
		g.setFont(sansSerifLarge);
		g.drawString("A Simple Window", 80, 80);
		g.setFont(sansSerifSmall);
		g.drawString("by Warren", 80, 100);
	}
}
