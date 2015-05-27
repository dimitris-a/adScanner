package auth.hci.adscanner.model;

public class Store 
{
 private String name;
 private String address;
 private String city;
 private String country;
 private String telephone;
 
 /*
  * Store Constructor
  */
 public Store(String sName, String sAddress, String sCity, String sCountry, String sTelephone)
 {
	 this.name = sName;
	 this.address = sAddress;
	 this.city = sCity;
	 this.country = sCountry;
	 this.telephone = sTelephone;
 }
 
 /*
  * Get functions	
  */
 public String getName()
 {
	 return this.name;
 }
 
 public String getAddress()
 {
	 return this.address;
 }
 
 public String getCity()
 {
	 return this.city;
 }
 
 public String getCountry()
 {
	 return this.country;
 }
 
 public String getTelephone()
 {
	 return this.telephone;
 }
 
 /*
  * Set functions
  */
 public void setName(String storeName)
 {
	 this.name = storeName;
 }
 
 public void setAddress(String storeAddress)
 {
	 this.address = storeAddress;
 }
 
 public void setTelephone(String storeTelephone)
 {
	 this.telephone = storeTelephone;
 }
 
 public void setCity(String storeCity)
 {
	 this.city = storeCity;
 }
 
 public void setCountry(String storeCountry)
 {
	 this.country = storeCountry;
 }
 
 /*
  * Get the full store's address
  */
 public String getStoreFullAddress()
 {
	 return this.address + "," + this.city + "," + this.country;
 }
 
}
