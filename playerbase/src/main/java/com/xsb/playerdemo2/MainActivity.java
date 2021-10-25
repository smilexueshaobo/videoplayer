package com.xsb.playerdemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kk.taurus.playerbase.entity.DataSource;
import com.kk.taurus.playerbase.widget.BaseVideoView;

public class MainActivity extends AppCompatActivity {
    public static final String VIDEO_URL_10 = "http://gimg2.baidu.com/image_search/src=http%3A%2F%2Ftupian.qqjay.com%2Fu%2F2018%2F0222%2F2_163119_13.jpg&refer=http%3A%2F%2Ftupian.qqjay.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1637548006&t=a885995da885212f0516128aa4ba7ceb";
    private BaseVideoView mVideoView;
    public static final String VIDEO_URL_09 = "https://mov.bn.netease.com/open-movie/nos/mp4/2017/05/31/SCKR8V6E9_hd.mp4";
    public static final String VIDEO_URL_07 = "http://jiajunhui.cn/video/trailer.mp4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mVideoView = findViewById(R.id.baseVideoView);
        mVideoView.rePlay(0);
        DataSource dataSource = new DataSource(VIDEO_URL_07);
        dataSource.setTitle("音乐和艺术如何改变世界");
        mVideoView.setDataSource(dataSource);
        mVideoView.start();
    }
}