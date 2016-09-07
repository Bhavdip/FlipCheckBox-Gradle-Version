package com.franlopez.demoflipcheckbox.activites;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.franlopez.demoflipcheckbox.R;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        private Button mBtnNormalStyle, mBtnCustomViewStyle, mBtnNormalStyleGrid, mBtnCustomAcceptStyleGrid;

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            mBtnCustomViewStyle = (Button) rootView.findViewById(R.id.btn__main__custom_view_style);
            mBtnNormalStyle = (Button) rootView.findViewById(R.id.btn__main__normal_style);
            mBtnNormalStyleGrid = (Button) rootView.findViewById(R.id.btn__main__custom_style_grid);
            mBtnCustomAcceptStyleGrid = (Button) rootView.findViewById(R.id.btn__main__custom_accept_style_grid);

            mBtnCustomViewStyle.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent customViewIntent = new Intent(getActivity(), CustomViewStyleActivity.class);
                    startActivity(customViewIntent);
                }
            });

            mBtnNormalStyle.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent normalIntent = new Intent(getActivity(), NormalStyleActivity.class);
                    startActivity(normalIntent);
                }
            });

            mBtnNormalStyleGrid.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent normalIntent = new Intent(getActivity(), CustomStyleGridActivity.class);
                    startActivity(normalIntent);
                }
            });

            mBtnCustomAcceptStyleGrid.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent normalIntent = new Intent(getActivity(), CustomAcceptStyleGridActivity.class);
                    startActivity(normalIntent);
                }
            });

            return rootView;
        }
    }

}
