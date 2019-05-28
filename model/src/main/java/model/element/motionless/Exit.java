package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Exit extends MotionlessElement{

	private static final Sprite SPRITE = new Sprite ('7',"Void1.png");
		
	Exit() {
		super(SPRITE, Permeability.BLOCKING);
		// TODO Auto-generated constructor stub
	}

}
