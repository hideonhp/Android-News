package com.example.apple_ios.docbao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {

//    private static final String DATABASE_NAME = "DatabaseSql";
//    private static final int DATABASE_VERSION = 1;
//    private static final String TABLE_NAME = "DatabaseSqlStorage";
//
//    private static final String KEY_idDb = "idDb";
//    private static final String KEY_imgDb = "imgDb";
//    private static final String KEY_linkDb = "linkDb";
//    private static final String KEY_dateDb = "dateDb";
//    private static final String KEY_titleDb = "titleDb";
    public DatabaseHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    //Database handler là một class mà Android cho phép bạn xử lý các thao tác đối với database của SQLite,
    //vì vậy bạn có thể tạo một class khác thừa kế nó và tùy chỉnh việc điều khiển database theo ý mình

    //Truy vấn không trả kết quả, thêm, cập nhập, xóa.
    public void QueryData(String sql){
       SQLiteDatabase database=getWritableDatabase();
        database.execSQL(sql);
    }
    //Truy vấn có kết quả, select only
    public Cursor GetData(String sql){ //kieu con tro
        SQLiteDatabase database=getReadableDatabase();
        return database.rawQuery(sql,null);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
//        String create_students_table = String.format("CREATE TABLE %s(%s INTEGER PRIMARY KEY, %s TEXT, %s TEXT, %s TEXT, %s TEXT)", TABLE_NAME, KEY_idDb, KEY_imgDb, KEY_linkDb, KEY_dateDb, KEY_titleDb);
//        sqLiteDatabase.execSQL(create_students_table);
        /// bị lỗi roài :(
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
//        String drop_students_table = String.format("DROP TABLE IF EXISTS %s", TABLE_NAME);
//        sqLiteDatabase.execSQL(drop_students_table);
//
//        onCreate(sqLiteDatabase);
        /// bị lỗi rồi :(

    }
}
