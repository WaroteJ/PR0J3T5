package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Wall extends MotionlessElement{

	private static final Sprite SPRITE = new Sprite ('6',"Bloc1.png");
		
	Wall() {
		super(SPRITE, Permeability.BLOCKING);
		// TODO Auto-generated constructor stub
	}

}
