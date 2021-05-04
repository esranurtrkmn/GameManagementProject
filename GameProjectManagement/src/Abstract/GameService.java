package Abstract;

import Entities.Game;

public interface GameService {
	
	void Save(Game game);
	void Update(Game game);
	void Delete(Game game);

}
