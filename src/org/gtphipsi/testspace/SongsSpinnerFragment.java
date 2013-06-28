package org.gtphipsi.testspace;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import org.gtphipsi.phipsipocketguide.R;

/**
 * Created with IntelliJ IDEA.
 * User: aschuster93
 * Date: 5/29/13
 */
public class SongsSpinnerFragment extends Fragment {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //retrieves song spinner and populates it
        Spinner songsSpinner = (Spinner) getView().findViewById(R.id.songSpinner);

        ArrayAdapter<CharSequence> songAdapter = ArrayAdapter.createFromResource(null,
                R.array.songs, android.R.layout.simple_spinner_item);
        songAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        songsSpinner.setAdapter(songAdapter);
    }
}