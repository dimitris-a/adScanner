package auth.hci.adscanner.model;

public class Advertisement 
{
	private Store adStore;
	private String adText;
	
	public Advertisement(Store store, String text)
	 {
		 this.adStore = store;
		 this.adText = text;
	 }
	
	/*
	 * Get functions
	 */
	public Store getStore()
	{
		return adStore;
	}
	
	public String getAdvertisementText()
	{
		return adText;
	}
	
	/*
	 * Set functions
	 */
	public void setStore(Store store)
	{
		this.adStore = store;
	}
	
	public void setAdvertisementText(String text)
	{
		this.adText = text;
	}
}
