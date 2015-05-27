package auth.hci.adscanner.controller;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;

public class AddressConverter 
{	
	public AddressConverter()
	{
		/*
		 * Empty constructor
		 */
	}
	
	public Location getAddressLocation(String address, Geocoder locGeoCoder)
	{
		Location location = new Location(address);
		try
		{
			Address geoCoderAddress = locGeoCoder.getFromLocationName(address, 1).get(0);
			location.setLatitude(geoCoderAddress.getLatitude());
			location.setLongitude(geoCoderAddress.getLongitude());
		}
		catch (Exception ex) {

	        ex.printStackTrace();
	    }
		return location;
	}
}
