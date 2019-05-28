package model.element.Mobile;



public abstract class MobileElementFactory {
	private static final Boulder 	BOULDER    = new Boulder();
	
	private static final Enemy 		ENEMY	   = new Enemy();

	private static final Diamond 	DIAMOND    = new Diamond();


	private static Mobile[] MobileElements = {
			BOULDER,
			ENEMY,
			DIAMOND,};
	
	public static Mobile createBoulder() {
		return BOULDER;
	}
	
	public static Mobile createEnemy() {
		return ENEMY;
	}
	
	public static Mobile createDiamond() {
		return DIAMOND;
	}
	
    public static Mobile getFromFileSymbol(final char fileSymbol) {
        for (final Mobile motionlessElement : MobileElements) {
            if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
                return motionlessElement;
            }
        }
        return null;
    }
}
