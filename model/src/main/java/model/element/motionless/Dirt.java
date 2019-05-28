package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Dirt extends MotionlessElement{

	private static final Sprite SPRITE = new Sprite ('5',"Dirt.png");
		
	Dirt() {
		super(SPRITE, Permeability.PENETRABLE);
		// TODO Auto-generated constructor stub
	}

}
