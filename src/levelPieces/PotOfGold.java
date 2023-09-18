package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class PotOfGold extends GamePiece{

	public PotOfGold(char symbol, String label, int location) {
		super('G', "Pot o' Gold", location);
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(getLocation()==playerLocation) {
			return InteractionResult.GET_POINT;
		}
		return null;
	}
	
}
