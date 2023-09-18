package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Antelope extends GamePiece{

	public Antelope(char symbol, String label, int location) {
		super('A', "Antelope", location);
		// TODO Auto-generated constructor stub
	}
	//Antelope is facing right. If you are left of the antelope you get hit
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(playerLocation + 1 == getLocation()) {
			return InteractionResult.HIT;
		}
		return InteractionResult.NONE;
	}

}
