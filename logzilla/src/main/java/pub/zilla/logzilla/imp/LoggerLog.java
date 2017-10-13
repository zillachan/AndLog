package pub.zilla.logzilla.imp;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

import pub.zilla.logzilla.Log;
import pub.zilla.logzilla.LogInterface;

/**
 * Logger implements
 * Created by zilla on 9/20/17.
 */

public class LoggerLog implements LogInterface {

    public LoggerLog() {
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(true)  // (Optional) Whether to show thread info or not. Default true
                .methodCount(2)         // (Optional) How many method line to show. Default 2
                .methodOffset(2)        // (Optional) Hides internal method calls up to offset. Default 5
//                .logStrategy(customLog) // (Optional) Changes the log strategy to print out. Default LogCat
//                .tag("My custom tag")   // (Optional) Global tag for every log. Default PRETTY_LOGGER
                .build();
        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy));
    }

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
    public void v(String msg, Throwable tr) {
        Logger.v(msg, tr);
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
    public void i(String msg, Throwable tr) {
        Logger.i(msg, tr);
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
    public void d(String msg, Throwable tr) {
        Logger.d(msg, tr);
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
        Logger.e(tr, tag, msg);
    }

    @Override
    public void e(String msg, Throwable tr) {
        Logger.e(tr, msg);
    }

    @Override
    public void ex(Object obj) {
        Logger.d(obj);
    }
}
