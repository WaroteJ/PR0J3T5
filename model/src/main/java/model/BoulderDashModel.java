package model;

import java.io.IOException;

import contract.IBoulderDashModel;
import contract.IMobile;
import contract.IModel;
import model.element.Mobile.Player;

public class BoulderDashModel implements IBoulderDashModel {

	private IModel model;
	
	private IMobile myPlayer;
	
    public BoulderDashModel(final String fileName, final int myPlayerStartX, final int myPlayerStartY)
            throws IOException {
        this.setModel(new Model(fileName));
        this.setMyPlayer(new Player(myPlayerStartX, myPlayerStartY, this.getModel()));
    }
	
	
	@Override
	public IModel getModel() {
		return this.model;
	}
	
	private void setModel(final IModel model) {
		this.model=model;
	}

	@Override
	public IMobile getMyPlayer() {
		return this.myPlayer;
	}

	private void setMyPlayer(final IMobile myPlayer) {
		this.myPlayer=myPlayer;
	}
}
