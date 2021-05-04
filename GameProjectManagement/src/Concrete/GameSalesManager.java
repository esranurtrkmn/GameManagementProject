package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameSalesManager implements SaleService{

	@Override
	public void Sale(Gamer gamer, Game game) {
		System.out.println("The game " + game.getGameName() + " was bought by "+gamer.getFirstName()+" for "+game.getPrice());
		
	}

	@Override
	public void Sale(Gamer gamer, Game game, Campaign campaign) {
		System.out.println("The game "+game.getGameName()+" was bought by "+gamer.getFirstName()+" for "+campaign.getDiscount(game.getPrice())+" with the campaign named "+campaign.getCampaignName());
		
	}

	

}
