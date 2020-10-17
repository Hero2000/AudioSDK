package com.jeffmony.playerlib;

import android.text.TextUtils;

import com.jeffmony.playerlib.utils.LogUtils;

public class NativePlayer {

    static {
        System.loadLibrary("nativeplayer");
        System.loadLibrary("avcodec");
        System.loadLibrary("avfilter");
        System.loadLibrary("avformat");
        System.loadLibrary("avutil");
        System.loadLibrary("postproc");
        System.loadLibrary("swresample");
        System.loadLibrary("swscale");
    }

    private String mUrl;

    public void setDataSource(String url) {
        mUrl = url;
    }

    public void prepare() {
        if (TextUtils.isEmpty(mUrl)) {
            LogUtils.w("Current Url is Empty");
            return;
        }

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }

    private native void n_prepare(String url);
}