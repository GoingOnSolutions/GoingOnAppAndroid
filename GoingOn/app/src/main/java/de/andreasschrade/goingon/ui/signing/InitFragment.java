package de.andreasschrade.goingon.ui.signing;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import de.andreasschrade.goingon.R;
import de.andreasschrade.goingon.ui.base.BaseActivity;
import de.andreasschrade.goingon.ui.base.BaseFragment;

/**
 * Shows the quote detail page.
 *
 * Created by Andreas Schrade on 14.12.2015.
 */
public class InitFragment extends BaseFragment {

    /**
     * The argument represents the dummy item ID of this fragment.
     */
    public static final String ARG_ITEM_ID = "item_id";

    @Bind(R.id.textoPrueba)
    TextView textoPrueba;

    @Bind(R.id.imgInitLogo)
    ImageView imgInitLogo;

    @Bind(R.id.signing_toolbar)
    Toolbar toolbar;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(false);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflateAndBind(inflater, container, R.layout.fragment_init);

        if (!((BaseActivity) getActivity()).providesActivityToolbar()) {
            // No Toolbar present. Set include_signing_toolbar:
            toolbar.setTitle(getResources().getString(R.string.no_string));
            ((BaseActivity) getActivity()).setToolbar(toolbar);
        }

        return rootView;
    }

    public static InitFragment newInstance(String itemID) {
        InitFragment fragment = new InitFragment();
        Bundle args = new Bundle();
        args.putString(InitFragment.ARG_ITEM_ID, itemID);
        fragment.setArguments(args);
        return fragment;
    }

    public InitFragment() {}
}
