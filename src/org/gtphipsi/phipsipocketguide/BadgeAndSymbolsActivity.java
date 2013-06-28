package org.gtphipsi.phipsipocketguide;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class BadgeAndSymbolsActivity extends Activity implements OnItemSelectedListener{

    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_badge_and_symbols);
		
		//assigns spinner
        Spinner picSpinner = (Spinner) findViewById(R.id.picSpinner);
		
		//creates adapter
		ArrayAdapter<CharSequence> picAdapter = ArrayAdapter.createFromResource(this, 
				R.array.pictures, android.R.layout.simple_spinner_item);
		picAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		//sets adapters and listeners to the spinner
		picSpinner.setAdapter(picAdapter);
		picSpinner.setOnItemSelectedListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.badge_and_symbols, menu);
		return true;
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View v, int location,
			long id) {
		ImageView picDisplayed = (ImageView) findViewById(R.id.displayed_pic);
		
		switch (location) {
		
		//Coat of Arms
		case 0:
			picDisplayed.setImageResource(R.drawable.coat_of_arms);
			break;
			
		//Brother Badge
		case 1:
			picDisplayed.setImageResource(R.drawable.brother_badge);
			break;
			
		//The Flag
		case 2:
			picDisplayed.setImageResource(R.drawable.phi_psi_flag);
			break;
		}
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// do nothing
	}

}
