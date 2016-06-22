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
    public static final String Create_Table = "CREATE TABLE sequels ( id INTE PRIMARY KEY, name TEXT);";
    public static final String DROP_TABLE = "DROP TABLE IF EXISTS sequel;";

    public Databasehelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Create_Table);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
         db.execSQL(DROP_TABLE);
        onCreate(db);
    }


    //not an overide

    public void seedDatabse() {

    }
    public void insertSequel(int id, String name) {

        
    }

}
