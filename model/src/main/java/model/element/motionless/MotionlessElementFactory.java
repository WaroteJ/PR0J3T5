package model.element.motionless;

public abstract class MotionlessElementFactory {

	private static final Background 	BACKGROUND = new Background();
	
	private static final Dirt 			DIRT	   = new Dirt();

	private static final Wall 			WALL 	   = new Wall();

	private static final Exit 			EXIT 	   = new Exit();

	private static MotionlessElement[] motionlessElements = {
			BACKGROUND,
			DIRT,
			WALL,
			EXIT,};
	
	public static MotionlessElement createBackground() {
		return BACKGROUND;
	}

	public static MotionlessElement createDirt() {
		return DIRT;
	}
	
	public static MotionlessElement createWall() {
		return WALL;
	}
	
	public static MotionlessElement createExit() {
		return EXIT;
	}	
	
	public static MotionlessElement getFromFIleSymbol(final char fileSymbol) {
        for (final MotionlessElement motionlessElement : motionlessElements) {
            if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
                return motionlessElement;
            }
        }
        return BACKGROUND;	
	}
}
