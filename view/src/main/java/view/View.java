package view;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IMobile;
import contract.IModel;
import contract.IView;

/**
 * The Class View.
 *
 * @author Jean-Aymeric Diet
 */
public final class View implements IView, Runnable {

	/** The frame. */
	private final ViewFrame viewFrame;
    /** The Constant squareSize. */
    private static final int squareSize = 50;

    /** The Constant closeView. */
    private Rectangle        closeView;

    /** The road. */
    private IModel            model;

    /** My vehicle. */
    private IMobile          player;

    /** The view. */
    private int              view;

    /** The order performer. */
    private IController  orderPerformer;
	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 * @throws IOException 
	 */
	public View(final IModel model, final IMobile player) throws IOException {
		this.viewFrame = new ViewFrame(model);
		this.setView(10);
		this.setModel(model);
		this.setPlayer(player);
		this.getPlayer().getSprite().loadImage();
		this.setCloseView(new Rectangle(0,this.getPlayer().getY(),16,10));
		SwingUtilities.invokeLater(this);
	}

	/**
	 * Key code to controller order.
	 *
	 * @param keyCode
	 *          the key code
	 * @return the controller order
	 */
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
		switch (keyCode) {
			case KeyEvent.VK_LEFT:
				return ControllerOrder.Left;
			case KeyEvent.VK_RIGHT:
				return ControllerOrder.Right;
			case KeyEvent.VK_UP:
				return ControllerOrder.Up;
			case KeyEvent.VK_DOWN:
				return ControllerOrder.Down;
			default:
				return ControllerOrder.NOP;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IView#printMessage(java.lang.String)
	 */
	@Override
	public void printMessage(final String message) {
		this.viewFrame.printMessage(message);
	}
	
	
    public IModel getModel() {
		return this.model;
	}

	public void setModel(IModel model) {
		this.model = model;
	}

	public IMobile getPlayer() {
		return this.player;
	}

	public void setPlayer(IMobile player) {
		this.player = player;
	}

	private int getView() {
        return this.view;
    }

    /**
     * Sets the view.
     *
     * @param view
     *            the new view
     */
    private void setView(final int view) {
        this.view = view;
    }

    /**
     * Gets the close view.
     *
     * @return the close view
     */
    private Rectangle getCloseView() {
        return this.closeView;
    }

    /**
     * Sets the close view.
     *
     * @param closeView
     *            the new close view
     */
    private void setCloseView(final Rectangle closeView) {
        this.closeView = closeView;
    }
	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		this.viewFrame.setVisible(true);
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}
}
