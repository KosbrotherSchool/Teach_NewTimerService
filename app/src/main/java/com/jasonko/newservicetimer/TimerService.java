package com.jasonko.newservicetimer;

import android.app.IntentService;
import android.content.Intent;
import android.os.Message;
import android.util.Log;

/**
 * Created by kolichung on 5/6/15.
 */
public class TimerService extends IntentService {

    static boolean isRun = false;
    int remainingTime = 10;
    static UIHandler handler;

    public TimerService(){
        super("TimerService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        while ( isRun ){

            Log.i("TimerService", "Still runnging");

            try{
            // sleep 1 sec
                Thread.sleep(1000);
            }catch (Exception e){

            }

            remainingTime = remainingTime -1;
            if (remainingTime == 0){
                break;
            }

        }

        Message msg = handler.obtainMessage();
        msg.getData().putString(UIHandler.MSG, "stop");
        handler.sendMessage(msg);

    }

    public static void setTimerRun(){
        isRun = true;
    }

    public static void setTimerStop(){
        isRun = false;
    }

    public static boolean isTimerServiceRunning(){
        return isRun;
    }

    public static void registerHandler(UIHandler activityHandler){
        handler = activityHandler;
    }

}
