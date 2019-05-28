package model.element.Mobile;

import model.element.Permeability;
import model.element.Sprite;

public class Diamond extends Mobile{

	private static final Sprite SPRITE = new Sprite ('4',"Diamond1.png");
		
	Diamond() {
		super(SPRITE, Permeability.PENETRABLE);
		// TODO Auto-generated constructor stub
	}

}
