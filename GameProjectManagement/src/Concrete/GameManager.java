package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void Save(Game game) {
		
		System.out.println("Game saved: " +game.getGameName());
		
	}

	@Override
	public void Update(Game game) {
		
		System.out.println("Game updated: " +game.getGameName());
		
	}

	@Override
	public void Delete(Game game) {
		
		System.out.println("Game deleted: " +game.getGameName());
		
	}

}
