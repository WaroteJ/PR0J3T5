package model.element.Mobile;

import java.io.IOException;

import contract.IModel;
import model.element.Permeability;
import model.element.Sprite;

public class Player extends Mobile {

    /** The Constant SPRITE. */
    private static final Sprite sprite          = new Sprite('H', "Player.png");

    /** The Constant spriteTurnLeft. */
    private static final Sprite spriteLeft  = new Sprite('H', "PlayerLeft.png");

    /** The Constant spriteTurnRight. */
    private static final Sprite spriteRight = new Sprite('H', "PlayerRight.png");

    /** The Constant spriteTurnLeft. */
    private static final Sprite spriteUp  = new Sprite('H', "PlayerUp.png");

    /** The Constant spriteTurnRight. */
    private static final Sprite spriteDown = new Sprite('H', "PlayerDown.png");
    
    /** The Constant spriteExplode. */
    private static final Sprite spriteDie   = new Sprite('H', "PlayerDown.png");
    
    
	Player(int x, int y,IModel model) throws IOException {
		super(x, y, sprite, model, Permeability.BLOCKING);
		spriteLeft.loadImage();
		spriteRight.loadImage();
		spriteUp.loadImage();
		spriteDown.loadImage();
	}

	@Override
	public final void moveLeft() {
		super.moveLeft();
		this.setSprite(spriteLeft);
	}
	
	@Override
	public final void moveRight() {
		super.moveRight();
		this.setSprite(spriteRight);
	}
	
	@Override
	public final void moveUp() {
		super.moveUp();
		this.setSprite(spriteUp);
	}
	
	@Override
	public final void moveDown() {
		super.moveDown();
		this.setSprite(spriteDown);
	}
	
	@Override
	public final void die() {
		super.die();
		this.setSprite(spriteDie);
	}	
	
	@Override
	public final void doNothing() {
		super.doNothing();
		this.setSprite(sprite);
	}		
	
}
