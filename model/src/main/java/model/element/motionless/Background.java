package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Background extends MotionlessElement{

	private static final Sprite SPRITE = new Sprite ('0',"Background.png");
	
	Background() {
		super(SPRITE, Permeability.PENETRABLE);
		// TODO Auto-generated constructor stub
	}

}

