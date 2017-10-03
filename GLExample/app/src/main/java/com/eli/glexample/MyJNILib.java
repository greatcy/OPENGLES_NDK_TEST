package com.eli.glexample;

import android.util.Log;

/**
 * Created by chenjunheng on 2017/10/3.
 */

public class MyJNILib {
    static String TAG = MyJNILib.class.getSimpleName();

    static {
        System.loadLibrary("gles-lib");
    }

    public static native void init();

    public static native String testGetString();
}
