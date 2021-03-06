package com.curefit.sensorapp.sync;

import android.net.Uri;

/**
 * Created by rahul on 24/08/17.
 */

public class SensorDataContract {
    public static final String CONTENT_AUTHORITY = "com.curefit.sync";

    static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    // Database information
    static final String DB_NAME = "sensordata_db";
    static final int DB_VERSION = 1;

    /**
     * This represents our sqlite table for Accelerometer data.
     */
    public static abstract class AccReadings {
        public static final String TABLE_NAME = "AccData";
        public static final String TIMESTAMP = "CURTIME";
        public static final String ACCX = "ACCX";
        public static final String ACCY = "ACCY";
        public static final String ACCZ = "ACCZ";
        public static final String PATH_ACC = "acc_readings";


        // ContentProvider information for acc readings
        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_ACC).build();
        public static final String CONTENT_TYPE =  "vnd.android.cursor.dir/" + CONTENT_URI + "/" + PATH_ACC;
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/" + CONTENT_URI + "/" + PATH_ACC;
    }

    /*
        User data.
     */
    public static abstract class UserData {
        public static final String TABLE_NAME = "UserData";
        public static final String NAME = "NAME";
        public static final String EMAIL = "EMAIL";
        public static final String TIMESTAMP = "CURTIME";
        public static final String PATH_USER = "user";

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_USER).build();
        public static final String CONTENT_TYPE =  "vnd.android.cursor.dir/" + CONTENT_URI + "/" + PATH_USER;
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/" + CONTENT_URI + "/" + PATH_USER;
    }

    /*
        Light Data
     */
    public static abstract class LightReadings {
        public static final String TABLE_NAME = "LightData";
        public static final String TIMESTAMP = "CURTIME";
        public static final String LIGHT = "LIGHT";
        public static final String PATH_LIGHT = "light_readings";

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_LIGHT).build();
        public static final String CONTENT_TYPE =  "vnd.android.cursor.dir/" + CONTENT_URI + "/" + PATH_LIGHT;
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/" + CONTENT_URI + "/" + PATH_LIGHT;
    }

    /*
        Screen Data
     */
    public static abstract class ScreenReadings {
        public static final String TABLE_NAME = "ScreenData";
        public static final String TIMESTAMP = "CURTIME";
        public static final String SCREEN = "STATE";
        public static final String PATH_SCREEN = "screen_readings";

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_SCREEN).build();
        public static final String CONTENT_TYPE =  "vnd.android.cursor.dir/" + CONTENT_URI + "/" + PATH_SCREEN;
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/" + CONTENT_URI + "/" + PATH_SCREEN;
    }
}
