package com.jasonko.newservicetimer;


import android.os.Handler;
import android.os.Message;

/**
 * Created by kolichung on 5/6/15.
 */
public class UIHandler extends Handler {

    public static String MSG = "UIHandler";
    private MainActivity mActivity;

    public UIHandler(MainActivity activity){
        mActivity = activity;
    }

    @Override
    public void handleMessage(Message msg) {
        if (msg.getData().get(MSG).equals("stop"))
            mActivity.setSwichButtonState();
    }

}
