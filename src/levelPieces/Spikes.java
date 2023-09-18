package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Spikes extends GamePiece {

	public Spikes(char symbol, String label, int location) {
		super('w', "Spikes", location);
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(getLocation() == playerLocation) {
			return InteractionResult.HIT;
		}
		return InteractionResult.NONE;
	}
	
}
