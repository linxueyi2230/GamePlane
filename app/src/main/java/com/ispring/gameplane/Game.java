package com.ispring.gameplane;

import android.app.Application;

import com.ego.game.mi.Mi;
import com.ego.shadow.Shadow;

/**
 * @author lxy
 * @time 2018/8/31  11:37
 */
public class Game extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Shadow.init(this,"1809011252",MainActivity.class);
        Mi.init(this,"2882303761517864105","5751786413105",BuildConfig.DEBUG);
//        Mi.demo(this);
    }
}
