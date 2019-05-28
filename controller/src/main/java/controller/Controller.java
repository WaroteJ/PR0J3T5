package controller;

import contract.ControllerOrder;
import contract.IBoulderDashModel;
import contract.IController;
import contract.IView;

/**
 * The Class Controller.
 */
public final class Controller implements IController {

	/** The view. */
	private IView		view;

	/** The model. */
	private IBoulderDashModel	model;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(final IView view, final IBoulderDashModel model) {
		this.setView(view);
		this.setModel(model);
	}

	/**
     * Control.
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#control()
	 */
	@Override
	public void control() {
		this.view.printMessage("Ici se lancera le jeu");
	}



	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	public IBoulderDashModel getModel() {
		return this.model;
	}
	
	private void setModel(final IBoulderDashModel model) {
		this.model = model;
	}

	public IView getView() {
		return this.view;
	}
	/**
     * Sets the view.
     *
     * @param pview
     *            the new view
     */
	
	private void setView(final IView pview) {
		this.view = pview;
	}
	
	/**
     * Order perform.
     *
     * @param controllerOrder
     *            the controller order
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	@Override
	public void orderPerform(final ControllerOrder controllerOrder) {
		switch (controllerOrder) {
			case Left:
				System.out.println("Left");
				break;
			case Right:
				System.out.println("Right");
				break;
			case Up:
				System.out.println("Up");
				break;
			case Down:
				System.out.println("Down");	
				break;
			default:
				break;
		}
	}

}
