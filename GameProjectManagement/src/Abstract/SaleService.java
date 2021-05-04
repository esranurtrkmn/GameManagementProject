package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SaleService {

	void Sale(Gamer gamer,Game game);
	void Sale(Gamer gamer,Game game,Campaign campaign);
}
