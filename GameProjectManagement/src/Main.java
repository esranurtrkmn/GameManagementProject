import Abstract.BaseGamerManager;
import Adapters.MernisServiceAdapter;
import Concrete.GameCampaignManager;
import Concrete.GameManager;
import Concrete.GameSalesManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Gamer gamer=new Gamer(1,"Esranur","Türkmen",1996,111111111111L);
		Game game=new Game(2,"PUBG MOBILE",1000);
		Campaign campaign=new Campaign(3,"Buyer within 2 days will receive a gift of 1 character.",40);
		
		BaseGamerManager gamerManager=new GamerManager(new MernisServiceAdapter());
		gamerManager.Save(gamer);
		
		System.out.println("------");
		
		GameManager gameManager=new GameManager();
		gameManager.Save(game);
		
		System.out.println("------");
		
		GameCampaignManager campaignManager=new GameCampaignManager();
		campaignManager.Save(campaign);
		
		System.out.println("------");

		GameSalesManager gameSale1=new GameSalesManager();
		gameSale1.Sale(gamer, game);
		
		System.out.println("------");
		
		
		GameSalesManager gameSale2=new GameSalesManager();
		gameSale2.Sale(gamer, game, campaign);
		
		

	}

}
