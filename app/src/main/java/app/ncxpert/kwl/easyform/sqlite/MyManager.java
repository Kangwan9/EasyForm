package app.ncxpert.kwl.easyform.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by kangwan on 9/17/2017 AD.
 */

public class MyManager {

    private Context context;
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase sqLiteDatabase;

    public MyManager(Context context) {
        this.context = context;
        myOpenHelper = new MyOpenHelper(context);
        sqLiteDatabase = myOpenHelper.getWritableDatabase();
    }

    public long addNameToSQLite(String strName,
                                String strGender,
                                String strProvince) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("Name",strName);
        contentValues.put("Gender",strGender);
        contentValues.put("Province",strProvince);
        return sqLiteDatabase.insert("nameTable",null,contentValues);
    }


}   // Main Class
