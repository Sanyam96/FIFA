package com.example.sanyam.fifa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Sanyam on 11-07-2016.
 */
public class perTeamDataAdapter extends ArrayAdapter<perTeamData> {

    ArrayList<perTeamData> mData;
    Context context;

    public perTeamDataAdapter(Context context, ArrayList<perTeamData> objects) {
        super(context, 0, objects);
        mData = objects;
        this.context = context;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if( v == null ){
            v = LayoutInflater.from(context).inflate(R.layout.teamlist_item, parent, false);
        }

        ImageView Flag = (ImageView)v.findViewById(R.id.countryFlag);
        TextView Country = (TextView)v.findViewById(R.id.Country);
        TextView WorldRanking = (TextView)v.findViewById(R.id.WorldRanking);

        perTeamData currentTeam = mData.get(position);
        String FlagIcon = currentTeam.getC_LogoImage();
        String CountryName = currentTeam.getC_Team_en();
        String WorldRankingPostion = currentTeam.getN_WorldRanking();

        Picasso.with(context).load(FlagIcon).into(Flag);
        Country.setText(CountryName);
        WorldRanking.setText(WorldRankingPostion);


        return v;
        //return super.getView(position, convertView, parent);
    }
}
