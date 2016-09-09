package com.yqw.it.tools.tools;

import android.util.Log;

/**
 * Created by yqw on 2016/9/9.
 * 日志 类
 */

public class L {
    private static final int DEBUG_RANK = 5;
    private static final int DEBUG_V = 0;
    private static final int DEBUG_D = 1;

    private static final int DEBUG_I = 2;
    private static final int DEBUG_E = 3;
    private static final int DEBUG_W = 4;
    private static final int DEBUG_A = 5;


    private static final String TAG = "maytag";

    /**
     * @param mgs 第一个参数是  TAG  第二个参数是 msg 消息s
     */
    public static void e(String... mgs) {
        if (mgs == null || mgs.length == 0)
            return;

        if (DEBUG_RANK < DEBUG_E+1) {
            if (mgs.length > 1) {
                Log.e(mgs[0], mgs[1]);
            } else {
                Log.e(TAG, mgs[1]);
            }
        }
    }


    /**
     * @param mgs 第一个参数是  TAG  第二个参数是 msg 消息s
     */
    public static void w(String... mgs) {
        if (mgs == null || mgs.length == 0)
            return;
        if (DEBUG_RANK > DEBUG_W+1) {
            if (mgs.length > 1) {
                Log.w(mgs[0], mgs[1]);
            } else {
                Log.w(TAG, mgs[1]);
            }
        }
    }

    /**
     * @param mgs 第一个参数是  TAG  第二个参数是 msg 消息s
     */
    public static void i(String... mgs) {
        if (mgs == null || mgs.length == 0)
            return;
        if (DEBUG_RANK < DEBUG_I+1) {
            if (mgs.length > 1) {
                Log.i(mgs[0], mgs[1]);
            } else {
                Log.i(TAG, mgs[1]);
            }
        }
    }
    /**
     * @param mgs 第一个参数是  TAG  第二个参数是 msg 消息s
     */
    public static void v(String... mgs) {
        if (mgs == null || mgs.length == 0)
            return;
        if (DEBUG_RANK < DEBUG_V+1) {
            if (mgs.length > 1) {
                Log.v(mgs[0], mgs[1]);
            } else {
                Log.v(TAG, mgs[1]);
            }
        }
    }
    /**
     * @param mgs 第一个参数是  TAG  第二个参数是 msg 消息s
     */
    public static void d(String... mgs) {
        if (mgs == null || mgs.length == 0)
            return;
        if (DEBUG_RANK < DEBUG_D+1) {
            if (mgs.length > 1) {
                Log.d(mgs[0], mgs[1]);
            } else {
                Log.d(TAG, mgs[1]);
            }
        }
    }

}
