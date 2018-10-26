package com.mycompany.myapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Context context = getApplicationContext();

        Intent mainIntent = new Intent(Intent.ACTION_MAIN, null);
        mainIntent.addCategory(Intent.CATEGORY_LAUNCHER);
        List<ResolveInfo> apps = context.getPackageManager().queryIntentActivities( mainIntent, 0);

        for (ResolveInfo info : apps) {
//            File file = new File(info.activityInfo.applicationInfo.publicSourceDir);
//            Log.d("AppLIST",pkgAppsList.toString());
//            Log.d("APPS",info.activityInfo.applicationInfo.publicSourceDir);
            Log.d("APPS",info.activityInfo.applicationInfo.publicSourceDir);
//            Log.d("NAMES",info.activityInfo.applicationInfo);
            Log.d("LABLES",info.loadLabel(context.getPackageManager()).toString());

            // Copy the .apk file to wherever
        }
    }
}

