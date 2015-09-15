package com.rnfsoft.contactquiz;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by taehee on 9/14/15.
 */
public class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
