package com.zhenhunfan.exit.app;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * activity收集器
 */
public class ActivityCollector {
    //存放所有的activity
    public static List<Activity> activities = new ArrayList<>();

    /**
     * 往activities中添加activity
     */
    public static void addActivity(Activity activity){
        if(activity!=null){
            activities.add(activity);
        }
    }

    /**
     * 从activities中移除activity
     * @param activity
     */
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    /**
     * 移除并关闭所有的activity
     */
    public static void finishAll(){
        for(Activity activity : activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
        activities.clear();
    }
}
