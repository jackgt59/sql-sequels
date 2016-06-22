package com.jackrocks.sequels;

import android.content.ContentValues;
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
        insertSequel(1, "Empire Strikes Back");
        insertSequel(2, "Toy Story 2");
        insertSequel(3, "Raiders of the Lost Ark");
        insertSequel(4, "Halloweed 2");
        insertSequel(5, "Moulin Rouge 2");
        insertSequel(6, "Taken 2");
        insertSequel(7, "Jaws2");
        insertSequel(8, "Deathwish 2");
        insertSequel(9, "Zoolander 2");
        insertSequel(10, "Die Harder with a Vengeance");

    }
    public void insertSequel(int id, String name) {
//insert into table name valuse (1,Blah)
        SQLiteDatabase db = getReadableDatabase();
        //special type of HashMap for Database Values
        ContentValues values = new ContentValues();
        values.put("id", id);
        values.put("name", name);
        //great place to put a break point

        db.insert("Sequels", null, values);

        
    }

}
