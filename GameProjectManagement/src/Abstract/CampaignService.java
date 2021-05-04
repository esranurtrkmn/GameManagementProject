package Abstract;

import Entities.Campaign;

public interface CampaignService {
	
	void Save(Campaign campaign);
	void Update(Campaign campaign);
	void Delete(Campaign campaign);

}
