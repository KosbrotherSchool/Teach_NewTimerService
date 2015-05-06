package com.jasonko.newservicetimer;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by kolichung on 5/6/15.
 */
public class TimerService extends IntentService {

    static boolean isRun = false;

    public TimerService(){
        super("TimerService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        while ( isRun ){

            try{
            // sleep 1 sec
                Thread.sleep(1000);
            }catch (Exception e){

            }

            Log.i("TimerService", "Still runnging");


        }

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

}
