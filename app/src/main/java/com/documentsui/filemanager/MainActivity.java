package com.documentsui.filemanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

public class MainActivity extends Activity {


    Intent intent = new Intent();

    @Override
    public void onCreate(Bundle savedInstanceState) {
//        intent.setAction(android.settings.INTERNAL_STORAGE_SETTINGS);

        intent.setAction(Intent.ACTION_VIEW);
        intent.setType("*/*");
        intent.setClassName("com.google.android.documentsui", "com.android.documentsui.files.FilesActivity");
        startActivity(intent);

        if (Build.VERSION.SDK_INT >= 21) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        }

        finish();
        super.onCreate(savedInstanceState);
    }

}
