package com.lion.floatwin.floatview;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author zhangyang
 * @date 2017/12/28
 */

public class Screen {
    public static final int WIDTH = 0;
    public static final int HEIGHT = 1;

    @IntDef({WIDTH, HEIGHT})
    @Retention(RetentionPolicy.SOURCE)
    @interface screenType {
    }
}
