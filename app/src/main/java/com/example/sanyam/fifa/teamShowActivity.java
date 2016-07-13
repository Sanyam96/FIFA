package com.example.sanyam.fifa;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class teamShowActivity extends AppCompatActivity {

    ListView mTeamListView;
    ArrayList<perTeamData> data;
    perTeamDataAdapter adapter;
    RelativeLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams);

        rl = (RelativeLayout)findViewById(R.id.rl);
        rl.setBackgroundColor(Color.parseColor("#ffff00"));
        mTeamListView = (ListView)findViewById(R.id.teamListView);
        data = new ArrayList<>();

        fifaAPIInterface apiService = TeamClient.getServices();
        Call<teamDataResponse> call = apiService.getTeams();
        call.enqueue(new Callback<teamDataResponse>() {
            @Override
            public void onResponse(Call<teamDataResponse> call, Response<teamDataResponse> response) {
                if(response.isSuccessful()){
                    ArrayList<perTeamData> teams = response.body().getPerTeamDataData();

                    if(teams == null){
                        return;
                    }
                    data.clear();
                    for (perTeamData p : teams){
                        data.add(p);
                    }
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<teamDataResponse> call, Throwable t) {

            }
        });

        adapter = new perTeamDataAdapter(this, data);
        mTeamListView.setAdapter(adapter);
        mTeamListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

    }
}
