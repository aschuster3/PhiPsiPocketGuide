package org.gtphipsi.phipsipocketguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HistoryActivity extends Activity implements OnItemClickListener {
	
	private ListView histList;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_history);
		
		//Find the ListView and set it to histList, then creates the adapter and
		//sets it to histList
		histList = (ListView) findViewById(R.id.historyList);
		
		ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, 
				History.histList());
		
		histList.setAdapter(listAdapter);
		histList.setOnItemClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.history, menu);
		return true;
	}

	@Override
	public void onItemClick(AdapterView<?> adapter, View v, int position, long id) {
		
		//Creates the intent that passes on the button clicked information
		Intent histScreen = new Intent(this, HistoryDisplayActivity.class);
		Bundle hist = new Bundle();
		hist.putInt("index", position);
		histScreen.putExtras(hist);
		
		startActivity(histScreen);
	}

}
