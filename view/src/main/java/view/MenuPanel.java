package view;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.Serializable;

import javax.swing.JPanel;

public class MenuPanel extends JPanel implements Serializable {
	private static final long serialVersionUID = 1L;
	protected Image buffer[][] = new Image[22][40];
	private Font font = new Font("Courier", Font.BOLD, 15);
	private CreateMenu createMenu;


	public MenuPanel(CreateMenu createMenu) {
		this.createMenu = createMenu;
	}
	
	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	public void paintComponent(Graphics g) {

	}

	/**
	 * Update the map when a mouvement is done
	 */
	public void update() {
		this.repaint();
	}
}