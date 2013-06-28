package org.gtphipsi.phipsipocketguide;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class SelectionScreenActivity extends TabActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_selection_screen);
		
		//This is the activity for displaying the creed
		Intent historyActivity = new Intent(this, HistoryActivity.class);
		
		//This is the activity for displaying the songs
		Intent songsActivity = new Intent(this, SongsActivity.class);
		
		//This is the activity for displaying the badge and symbols
		Intent badgeAndSymbolsActivity = new Intent(this, BadgeAndSymbolsActivity.class);
		
		TabHost tabController = getTabHost();
		
		
		
		//Songs Tab
		tabController.addTab(tabController.newTabSpec("tab one")
				 	 .setIndicator("Songs")
				 	 .setContent(songsActivity));
		
		//Badge and Symbols Tab
		tabController.addTab(tabController.newTabSpec("tab two")
				 	 .setIndicator("Symbols")
				 	 .setContent(badgeAndSymbolsActivity));
		
		//Creed Tab (To be replaced with History Tab)
		tabController.addTab(tabController.newTabSpec("tab three")
					 .setIndicator("History")
					 .setContent(historyActivity));
		
		
		tabController.setCurrentTab(1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.selection_screen, menu);
		return true;
	}
}
