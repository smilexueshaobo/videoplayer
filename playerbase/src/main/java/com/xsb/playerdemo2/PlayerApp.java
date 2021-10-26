package com.xsb.playerdemo2;

import android.app.Application;
import android.content.Context;

import com.kk.taurus.playerbase.config.PlayerConfig;
import com.kk.taurus.playerbase.config.PlayerLibrary;
import com.kk.taurus.playerbase.entity.DecoderPlan;
import com.kk.taurus.playerbase.record.PlayRecordManager;
import com.xsb.playerdemo2.ijkplayer.IjkPlayer;

/**
 * Created by Taurus on 2018/4/15.
 */

public class PlayerApp{
    public static final int PLAN_ID_IJK = 1;
    public static final int PLAN_ID_EXO = 2;

    public static void initPlayer(Context context){
        PlayerConfig.addDecoderPlan(new DecoderPlan(PLAN_ID_IJK, IjkPlayer.class.getName(), "IjkPlayer"));
        PlayerConfig.addDecoderPlan(new DecoderPlan(PLAN_ID_EXO, ExoMediaPlayer.class.getName(), "ExoPlayer"));
        PlayerConfig.setDefaultPlanId(PLAN_ID_IJK);

        //use default NetworkEventProducer.
        PlayerConfig.setUseDefaultNetworkEventProducer(true);

        PlayerConfig.playRecord(true);

        PlayRecordManager.setRecordConfig(
                new PlayRecordManager.RecordConfig.Builder()
                        .setMaxRecordCount(100).build());

        PlayerLibrary.init(context);
    }
}
