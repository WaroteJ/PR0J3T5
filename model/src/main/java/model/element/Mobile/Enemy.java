package model.element.Mobile;

import model.element.Permeability;
import model.element.Sprite;

public class Enemy extends Mobile{

	private static final Sprite SPRITE = new Sprite ('2',"Bat1.png");
		
	Enemy() {
		super(SPRITE, Permeability.BLOCKING);
		// TODO Auto-generated constructor stub
	}

}
