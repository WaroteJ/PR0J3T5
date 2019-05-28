package model;

import java.sql.SQLException;
import java.util.Observable;

import contract.IElement;
import contract.IModel;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model extends Observable implements IModel {

	private int width = 25;
	private int height = 25;
	
	private IElement[][] onTheBoard;

	/**
	 * Instantiates a new model.
	 */
	public Model(final String code) {
		super();
		this.loadMap(code);
	}


	/**
     *
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
		try {
			final DAOHelloWorld daoHelloWorld = new DAOHelloWorld(DBConnection.getInstance().getConnection());
			//this.setHelloWorld(daoHelloWorld.find(code));
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
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
