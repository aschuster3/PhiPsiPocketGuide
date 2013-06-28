package org.gtphipsi.testspace;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.gtphipsi.phipsipocketguide.R;

/**
 * User: Andrew Schuster
 * Date: 5/29/13
 */
public class SongsFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View songDisplay = inflater.inflate(R.layout.fragment_songs, container, false);
        TextView song = (TextView) songDisplay.findViewById(R.id.songDisplay);


        return songDisplay;
    }
}