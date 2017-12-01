package com.jnidemo_iv;

/**
 * Created by DengJf on 2017/11/30.
 */

public class JniUtil {
    public native int sum(int a,int b);


    static {
        System.loadLibrary("demo_lib");
    }
}
