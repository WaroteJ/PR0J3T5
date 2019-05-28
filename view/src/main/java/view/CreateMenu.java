package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
//import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JOptionPane;

import contract.ICreateMenu;
import contract.LvlObservator;


public class CreateMenu extends JFrame implements Observer, ICreateMenu {

	private static final long serialVersionUID = 1L;
	private Font font = new Font("Courier", Font.BOLD, 15);
	private int choice = 0;
	private MenuPanel menuPanel;
//	private JLabel background;
	private Image image;
	List<LvlObservator> observators = new ArrayList<>();

	/**
	 * Getter of observators
	 * @return observators
	 */
	@Override
	public List<LvlObservator> getObservators() {
		return observators;
	}

	/**
	 * Setter of observators
	 * @param observators
	 */
	@Override
	public void setObservators(List<LvlObservator> observators) {
		this.observators = observators;
	}

	/**
	 * Method which create the Menu
	 * @throws IOException 
	 */
	public CreateMenu() throws IOException {
		setSize(new Dimension(700, 400));
		setResizable(false);
		setLayout(new BorderLayout());
		setFocusable(true);
//		background = new JLabel(new ImageIcon("image/menu.png"));
		image = ImageIO.read(new File("image/menu.png"));
//		add(background);
//		background.setLayout(new FlowLayout());
		menuPanel = new MenuPanel(this);
		JButton bouton2 = new JButton("Choose Level");
		bouton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				String[] level = {"Score", "Level 1", "Level 2", "Level 3", "Level 4", "Level 5"};
				JOptionPane jop = new JOptionPane();
				String name = (String) jop.showInputDialog(null, "Choose your level!", "The choice",
						JOptionPane.QUESTION_MESSAGE, null, level, level[2]);
				if (name == "Level 1") {
					choice = 1;
				}
				if (name == "Level 2") {
					choice = 2;
				}
				if (name == "Level 3") {
					choice = 3;
				}
				if (name == "Level 4") {
					choice = 4;
				}
				if (name == "Level 5") {
					choice = 5;
				}
				if (name == "Score"){
					choice = 42;
				}
				for (LvlObservator observator : observators) {
					observator.onLevelSelected(choice);
				}
			}
		});
		menuPanel.add(bouton2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(menuPanel, BorderLayout.SOUTH);
		this.setContentPane(menuPanel);
		this.setVisible(true);
	}

	/**
	 * Getter of choice
	 * @return choice
	 */
	@Override
	public int getChoice() {
		return choice;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
