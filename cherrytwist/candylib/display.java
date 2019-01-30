package cherrytwist.candylib.display;

import java.awt.Component;

import javax.swing.JFrame;

public class Display {
	private JFrame frame;
	
	public Display() {
		this.frame = new JFrame();
	}
	
	/**
	 * sets a display's title.
	 */
	public void setTitle(String title) {
		this.frame.setTitle(title);
	}
	
	/**
	 * sets a display's size.
	 */
	public void setSize(int width, int height) {
		this.frame.setSize(width, height);
	}
	
	/**
	 * adds a component to a display
	 */
	public void add(Component c) {
		this.frame.add(c);
	}
	
	public JFrame getDisplay() {
		return this.frame;
	}
	
	public void init() {
		this.frame.setVisible(true);
	}
}
