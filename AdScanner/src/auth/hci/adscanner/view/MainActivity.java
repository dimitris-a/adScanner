package auth.hci.adscanner.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import auth.hci.adscanner.R;
import auth.hci.adscanner.controller.GPSTracker;

public class MainActivity extends Activity {

	private TextView location;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		location = (TextView)findViewById(R.id.locationText);
		GPSTracker gps = new GPSTracker(this);
		if(gps.canGetLocation())
		{
			location.setText("Langtitude: " + gps.getLatitude() + "\nLongtitude: " + gps.getLongitude());
		}
		else
		{
			gps.showSettingsAlert();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
