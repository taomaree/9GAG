package me.storm.ninegag.ui;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.MenuItem;

import me.storm.ninegag.R;
import me.storm.ninegag.ui.fragment.PreferenceFragment;

/**
 * Created by storm on 14-4-16.
 */
public class PreferenceActivity extends SwipeBackActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);
        getFragmentManager().beginTransaction().replace(R.id.container, new PreferenceFragment())
                .commit();

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        setTitle(R.string.action_settings);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
