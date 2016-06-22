package com.jackrocks.sequels;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

/**
 * Created by TheDude on 6/22/16.
 */
public class Databasehelper extends SQLiteOpenHelper {

    public static final int DB_VERSION = 1;   ///change as we update
    public static final String DB_NAME = "ReallyBadSequels.db";

    public Databasehelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
