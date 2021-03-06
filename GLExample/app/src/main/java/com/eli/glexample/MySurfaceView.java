package com.eli.glexample;

import android.content.Context;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by chenjunheng on 2017/10/3.
 */

public class MySurfaceView extends GLSurfaceView{
    public MySurfaceView(Context context) {
        super(context);
        init();
    }

    private void init(){
        setRenderer(new MyRenderer());
    }

    private class MyRenderer implements Renderer{

        @Override
        public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {

        }

        @Override
        public void onSurfaceChanged(GL10 gl10, int i, int i1) {

        }

        @Override
        public void onDrawFrame(GL10 gl10) {

        }
    }
}
