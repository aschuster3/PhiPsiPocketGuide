package org.gtphipsi.phipsipocketguide;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SongsActivity extends Activity implements OnItemSelectedListener{
	
	private TextView songDisplay;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_songs);
		
		//Assigns the text view for the songs
		songDisplay = (TextView) findViewById(R.id.songDisplay);
		
		//Brings up spinner
		Spinner songSpinner = (Spinner) findViewById(R.id.songSpinner);
		
		//Sets defaults for the adapter
		ArrayAdapter<CharSequence> songList = ArrayAdapter.createFromResource(this, 
				R.array.songs, android.R.layout.simple_spinner_item);
		songList.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		//Sets the adapter to the spinner
		songSpinner.setAdapter(songList);
		songSpinner.setOnItemSelectedListener((OnItemSelectedListener) this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.songs, menu);
		return true;
	}
	
	@Override
	public void onItemSelected(AdapterView<?> songChoosen, View arg1, int location,
			long arg3) {
		String songShown;
		
		switch (location) {
		
		//The Creed
		case 0:
			songShown = getString(R.string.creed);
			break;
			
		//Amici
		case 1:
			songShown = getString(R.string.amici);
			break;
			
		//Noble Fraternity
		case 2:
			songShown = getString(R.string.noble_fraternity);
			break;
			
		default:
			songShown = "";
		}
		
		songDisplay.setText(songShown);
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

}
