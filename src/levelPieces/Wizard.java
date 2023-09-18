package levelPieces;

import java.util.Random;
import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Wizard extends GamePiece implements Moveable{

	public Wizard(char symbol, String label, int location) {
		super('W', "Wizard", 0);
		
	}

	//if the wizard is two spots away from the player, there is a one in three chance his spell works and the player dies.
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(Math.abs(playerLocation)-getLocation() == 2)
			if(new Random().nextInt(2) == 2) {
				return InteractionResult.KILL;
			}
		return InteractionResult.NONE;
	}


	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		
		for(int newPosition=getLocation(); newPosition < gameBoard.length; newPosition++) {
			if(gameBoard[newPosition] == null && newPosition != playerLocation) {
				setLocation(newPosition);
				return;
			}
		}
			
	}

}
