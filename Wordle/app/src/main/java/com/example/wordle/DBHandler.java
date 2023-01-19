package com.example.wordle;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.Locale;

public class DBHandler extends SQLiteOpenHelper {

    private static final String DB_NAME = "Users";

    private static final int DB_VERSION = 1;

    private static final String TABLE_NAME = "myusers";

    private static final String ID_COL = "id";

    private static final String FNAME_COL = "firstname";

    private static final String LNAME_COL = "lastname";

    private static final String EMAIL_COL = "email";

    private static final String PASSWORD_COL = "password";

    public DBHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + ID_COL + " TEXT, "
                + FNAME_COL + " TEXT,"
                + LNAME_COL + " TEXT,"
                + EMAIL_COL + " TEXT,"
                + PASSWORD_COL + " TEXT)";
        db.execSQL(query);
    }

    public void addNewUser(String id,String firstname, String lastname, String email, String password) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(ID_COL, id);
        values.put(FNAME_COL, firstname);
        values.put(LNAME_COL, lastname);
        values.put(EMAIL_COL, email);
        values.put(PASSWORD_COL, password);

        db.insert(TABLE_NAME, null, values);

        db.close();
    }
    public void deleteUser(String email) {

        SQLiteDatabase db = this.getWritableDatabase();

        db.delete(TABLE_NAME, "email=?", new String[]{email});
        db.close();
    }
    public void updateUser( String originalUserPassword,String email, String password)  {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();


        values.put(EMAIL_COL, email);
        values.put(PASSWORD_COL, password);

        db.update(TABLE_NAME, values, "password=?", new String[]{originalUserPassword});
        db.close();
    }

    public boolean  login(String tryfirstname,String trypassword) {
        String[] columns = {
                "id"
        };
        SQLiteDatabase db = this.getReadableDatabase();

        String selection= "firstname= ?"+" AND "+"password"+" = ?";
        String[] selectionArgs={tryfirstname.toLowerCase(),trypassword};
        Cursor cursor = db.query(TABLE_NAME,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null);
        int cursorCount = cursor.getCount();
        cursor.close();
        db.close();
        if (cursorCount > 0) {
            return true;
        }
        return false;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
