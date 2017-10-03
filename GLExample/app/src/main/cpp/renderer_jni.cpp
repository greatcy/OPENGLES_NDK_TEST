#include <jni.h>
#include <string>

JNIEXPORT void JNICALL
Java_com_eli_glexample_MyJNILib_init(JNIEnv *env, jobject instance) {
    // TODO

}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_eli_glexample_MyJNILib_testGetString(JNIEnv *env, jobject instance) {
    // TODO
    std::string returnValue = "test string";
    return env->NewStringUTF(returnValue.c_str());
}