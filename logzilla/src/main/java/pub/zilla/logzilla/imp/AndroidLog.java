package pub.zilla.logzilla.imp;

import android.util.Log;

import pub.zilla.logzilla.LogInterface;

/**
 * Android Log implements
 * Created by zilla on 9/20/17.
 */

public class AndroidLog implements LogInterface {

    @Override
    public void v(String msg) {
        Log.v("", msg);
    }

    @Override
    public void v(String tag, String msg) {
        Log.v(tag, msg);
    }

    @Override
    public void v(String tag, String msg, Throwable tr) {
        Log.v(tag, msg, tr);
    }

    @Override
    public void v(String msg, Throwable tr) {
        Log.v("", msg, tr);
    }

    @Override
    public void i(String msg) {
        Log.i("", msg);

    }

    @Override
    public void i(String tag, String msg) {
        Log.i(tag, msg);
    }

    @Override
    public void i(String tag, String msg, Throwable tr) {
        Log.i(tag, msg, tr);
    }

    @Override
    public void i(String msg, Throwable tr) {
        Log.i("", msg, tr);
    }

    @Override
    public void d(String msg) {
        Log.d("", msg);
    }

    @Override
    public void d(String tag, String msg) {
        Log.d(tag, msg);
    }

    @Override
    public void d(String tag, String msg, Throwable tr) {
        Log.d(tag, msg, tr);
    }

    @Override
    public void d(String msg, Throwable tr) {
        Log.d("", msg, tr);
    }

    @Override
    public void e(String msg) {
        Log.e("", msg);
    }

    @Override
    public void e(String tag, String msg) {
        Log.e(tag, msg);
    }

    @Override
    public void e(String tag, String msg, Throwable tr) {
        Log.e(tag, msg, tr);
    }

    @Override
    public void e(String msg, Throwable tr) {
        Log.e("", msg, tr);
    }

    @Override
    public void ex(Object obj) {
        Log.d("", obj.toString());
    }
}
