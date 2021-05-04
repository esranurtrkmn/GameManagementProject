package Concrete;

import Abstract.BaseGamerManager;
import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager extends BaseGamerManager{

		
	private GamerCheckService gamerCheckService;
	
	
	public GamerManager() {
		
	}
	
	public GamerManager(GamerCheckService gamerCheckService) {
		
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void Save(Gamer gamer) throws Exception {
		
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			super.Save(gamer);
		}
		
		else {
			throw new Exception("Not a valid person");
			
		}
	}



	
}
