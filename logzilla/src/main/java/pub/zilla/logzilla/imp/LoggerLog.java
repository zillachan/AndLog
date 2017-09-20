package pub.zilla.logzilla.imp;

import com.orhanobut.logger.Logger;

import pub.zilla.logzilla.Log;
import pub.zilla.logzilla.LogInterface;

/**
 * Logger implements
 * Created by zilla on 9/20/17.
 */

public class LoggerLog implements LogInterface {
    @Override
    public void v(String msg) {
        Logger.v(msg);
    }

    @Override
    public void v(String tag, String msg) {
        Logger.v(tag, msg);
    }

    @Override
    public void v(String tag, String msg, Throwable tr) {
        Logger.v(tag, msg, tr);
    }

    @Override
    public void i(String msg) {
        Logger.i(msg);
    }

    @Override
    public void i(String tag, String msg) {
        Log.i(tag, msg);
    }

    @Override
    public void i(String tag, String msg, Throwable tr) {
        Logger.i(tag, msg, tr);
    }

    @Override
    public void d(String msg) {
        Logger.d(msg);
    }

    @Override
    public void d(String tag, String msg) {
        Logger.d(tag, msg);

    }

    @Override
    public void d(String tag, String msg, Throwable tr) {
        Logger.d(tag, msg, tr);
    }

    @Override
    public void e(String msg) {
        Logger.e(msg);
    }

    @Override
    public void e(String tag, String msg) {
        Logger.e(tag, msg);
    }

    @Override
    public void e(String tag, String msg, Throwable tr) {
        Logger.e(tag, msg, tr);
    }

    @Override
    public void ex(Object obj) {
        Logger.d(obj);
    }
}
