package com.ispring.gameplane;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ego.game.mi.ad.Ad;


public class MainActivity extends Activity implements View.OnClickListener{

    private Ad ad = Ad.of();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.iv_plane).setOnClickListener(this);
        findViewById(R.id.tv_start).setOnClickListener(this);
        ad.onBanner(this);
        ad.show("a02c533778a2e8b53f2be4522180ab1f");

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ad.onDestroy();
    }
}