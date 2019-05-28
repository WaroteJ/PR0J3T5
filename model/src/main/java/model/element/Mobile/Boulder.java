package model.element.Mobile;

import model.element.Permeability;
import model.element.Sprite;

public class Boulder extends Mobile{

	private static final Sprite SPRITE = new Sprite ('3',"Rock1.png");
		
	Boulder() {
		super(SPRITE, Permeability.BLOCKING);
		// TODO Auto-generated constructor stub
	}

}
