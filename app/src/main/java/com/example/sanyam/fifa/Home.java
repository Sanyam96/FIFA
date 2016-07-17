package com.example.sanyam.fifa;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {

    ImageButton ib1;
    HomeListener mListener;


    public Home() {
        // Required empty public constructor
    }

    public interface HomeListener {
        void imageButtonClicked();
    }

    public void setHomeListener(HomeListener listener) {
        mListener = listener;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.home_fragment, container, false);

        ib1 = (ImageButton)v.findViewById(R.id.teamsButton);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i = new Intent();
//                i.setClass(this, teamShowActivity.class);
//                startActivity(i);
                if(mListener != null){
                    mListener.imageButtonClicked();
                }
            }
        });

        return v;
    }

}
