package de.andreasschrade.goingon.ui.signing;

import android.os.Bundle;

import de.andreasschrade.goingon.R;
import de.andreasschrade.goingon.ui.base.BaseActivity;

public class SigningActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signing);

        // Show the Up button in the action bar.
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        InitFragment fragment =  InitFragment.newInstance(getIntent().getStringExtra(InitFragment.ARG_ITEM_ID));
        getFragmentManager().beginTransaction().replace(R.id.signing_container, fragment).commit();
    }

    @Override
    public boolean providesActivityToolbar() {
        return false;
    }
}
