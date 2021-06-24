package com.example.loginapplication.remainder;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = {UsernamePassword.class, com.example.loginapplication.remainder.Reminders.class},version = 1)
@TypeConverters({DateTypeConverter.class})
public abstract class AppDatabase extends RoomDatabase {

    private static com.example.loginapplication.remainder.AppDatabase INSTANCE = null;

    public abstract RoomDAO getRoomDAO();

    public static com.example.loginapplication.remainder.AppDatabase geAppdatabase(Context context){

        if(INSTANCE==null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), com.example.loginapplication.remainder.AppDatabase.class,"users")
                    .allowMainThreadQueries()
                    .build();
        }

        return INSTANCE;

    }

    public static void destroyInstance(){
        INSTANCE = null;
    }

}
