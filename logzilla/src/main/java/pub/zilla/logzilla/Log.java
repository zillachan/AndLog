package pub.zilla.logzilla;

import pub.zilla.logzilla.imp.AndroidLog;

/**
 * Log Util
 * Created by zilla on 9/20/17.
 */

public class Log {

    private static LogInterface log = new AndroidLog();
    private static boolean open = true;

    public static class Builder {
        public Builder client(LogInterface logInterface) {
            log = logInterface;
            return this;
        }

        public Builder logStatus(boolean status) {
            open = status;
            return this;
        }
    }

    public static void v(String msg) {
        if (open)
            log.v(msg);
    }

    public static void v(String tag, String msg) {
        if (open)
            log.v(tag, msg);
    }

    public static void v(String tag, String msg, Throwable tr) {
        if (open)
            log.v(tag, msg, tr);
    }

    public static void i(String msg) {
        if (open)
            log.i(msg);
    }

    public static void i(String tag, String msg) {
        if (open)
            log.i(tag, msg);
    }

    public static void i(String tag, String msg, Throwable tr) {
        if (open)
            log.i(tag, msg, tr);
    }

    public static void d(String msg) {
        if (open)
            log.d(msg);
    }

    public static void d(String tag, String msg) {
        if (open)
            log.d(tag, msg);
    }

    public static void d(String tag, String msg, Throwable tr) {
        if (open)
            log.d(tag, msg, tr);
    }

    public static void e(String msg) {
        if (open)
            log.e(msg);
    }

    public static void e(String tag, String msg) {
        if (open)
            log.e(tag, msg);
    }

    public static void e(String tag, String msg, Throwable tr) {
        if (open)
            log.e(tag, msg, tr);
    }
}
