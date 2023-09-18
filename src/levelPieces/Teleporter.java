package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;
import java.util.Random;

public class Teleporter extends GamePiece implements Moveable{

	public Teleporter(char symbol, String label, int location) {
		super('T', "Teleporter", location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(getLocation() == playerLocation) {
			return InteractionResult.HIT;
		}
		return InteractionResult.NONE;
			
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		
		int random = new Random().nextInt(gameBoard.length-1);
		
		while(gameBoard[random] != null) {
			random = new Random().nextInt(gameBoard.length-1);
		}
		setLocation(random);		
	}
	
}
