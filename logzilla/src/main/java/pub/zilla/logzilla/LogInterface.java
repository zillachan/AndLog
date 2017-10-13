package pub.zilla.logzilla;

/**
 * LogInterface interface
 * Created by zilla on 9/20/17.
 */

public interface LogInterface {

    void v(String msg);

    void v(String tag, String msg);

    void v(String tag, String msg, Throwable tr);

    void v(String msg, Throwable tr);

    void i(String msg);

    void i(String tag, String msg);

    void i(String tag, String msg, Throwable tr);

    void i(String msg, Throwable tr);

    void d(String msg);

    void d(String tag, String msg);

    void d(String tag, String msg, Throwable tr);

    void d(String msg, Throwable tr);

    void e(String msg);

    void e(String tag, String msg);

    void e(String tag, String msg, Throwable tr);

    void e(String msg, Throwable tr);

    /**
     * external object support
     *
     * @param obj
     */
    void ex(Object obj);

}
