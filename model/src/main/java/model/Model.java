package model;

import java.util.Observable;

import contract.IElement;
import contract.IModel;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public final class Model extends Observable implements IModel {

	/** The helloWorld. */
	private IElement[][] onTheBoard;

	/**
	 * Instantiates a new model.
	 */
	public Model() {
		super();
		//this.loadMap(code);
	}


	/**
     * Load hello world.
     *
     * @param code
     *            the code
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage(java.lang.String)
	 */
	@Override
	public void loadMap(final String code) {
		/*try {
			final DAOHelloWorld daoHelloWorld = new DAOHelloWorld(DBConnection.getInstance().getConnection());
			this.setHelloWorld(daoHelloWorld.find(code));
		} catch (final SQLException e) {
			e.printStackTrace();
		}*/
	}
	
	@Override
	public IElement getXY(int x, int y) {
		return this.onTheBoard[x][y];
	}

	private void setXY(final IElement element, final int x, final int y) {
		this.onTheBoard[x][y]=element;
	}
	
	@Override
	public void setMobileHasChanged() {
		this.setChanged();
		this.notifyObservers();
	}
	/**
     * Gets the observable.
     *
     * @return the observable
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	@Override
	public Observable getObservable() {
		return this;
	}


}
