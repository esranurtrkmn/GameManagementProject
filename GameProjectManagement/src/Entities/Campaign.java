package Entities;

public class Campaign {

	private int id;
	private String campaignName;
	private double rateOfDiscount;
	
	public Campaign(int id, String campaignName, double rateOfDiscount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.rateOfDiscount = rateOfDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getRateOfDiscount() {
		return rateOfDiscount;
	}

	public void setRateOfDiscount(double rateOfDiscount) {
		this.rateOfDiscount = rateOfDiscount;
	}
	
	public double getDiscount(double gamePrice) {
		
		return gamePrice-((gamePrice*rateOfDiscount)/100);
		
	}
	
	
	
	
	
	
	
}
