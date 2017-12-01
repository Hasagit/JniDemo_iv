//
// Created by DengJf on 2017/11/30.
//
#include "com_jnidemo_iv_JniUtil.h"
//声明在Hello.c中的sum函数
int sum(int, int);

JNIEXPORT jint JNICALL Java_com_jnidemo_1iv_JniUtil_sum
        (JNIEnv *env, jobject object, jint a, jint b){
    //调用Hello.c中的sum函数
    return sum(a,b);
}