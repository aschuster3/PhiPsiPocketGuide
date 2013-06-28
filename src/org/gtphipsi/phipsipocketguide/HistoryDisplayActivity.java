package org.gtphipsi.phipsipocketguide;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class HistoryDisplayActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_history_display);
		
		Bundle hist = this.getIntent().getExtras();
		int position = hist.getInt("index");
		
		//retrieves all necessary views
		TextView header = (TextView) findViewById(R.id.history_box_top);
		TextView mid = (TextView) findViewById(R.id.history_box_middle);
		TextView lower = (TextView) findViewById(R.id.history_box_bottom);
		ImageView firstImage = (ImageView) findViewById(R.id.history_image_first);
		ImageView secondImage = (ImageView) findViewById(R.id.history_image_second);
		
		switch (position) {
		
		//Fraternity Founding
		case 0:
			header.setText("Phi Kappa Psi was founded February 19th, 1852, by William Henry Letterman and " +
					"Charles Page Thomas Moore (pictured below) at Jefferson College (now Washington and " +
					"Jefferson College) in Canonsburg, Pennsylvania, during a typhoid outbreak.  These two " +
					"men and their friends found great joy in selflessly helping their fellow man and thus " +
					"formed the Fraternity so they may recruit others to experience \"The Great Joy of Serving" +
					" Others.\"");
			//firstImage.setImageResource(
		default:
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.history_display, menu);
		return true;
	}

}
