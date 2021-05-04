package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class GameCampaignManager implements CampaignService {

	@Override
	public void Save(Campaign campaign) {
		
		System.out.println("Campaign saved: "+campaign.getCampaignName());
		
	}

	@Override
	public void Update(Campaign campaign) {
		
		System.out.println("Campaign updated: "+campaign.getCampaignName());
		
	}

	@Override
	public void Delete(Campaign campaign) {
		
		System.out.println("Campaign deleted: "+campaign.getCampaignName());
		
	}

}
