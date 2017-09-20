package pub.zilla.andlog;

import android.app.Application;

import pub.zilla.logzilla.Log;
import pub.zilla.logzilla.imp.LoggerLog;

/**
 * Created by zilla on 9/20/17.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        new Log.Builder().client(new LoggerLog()).logStatus(true);
    }
}
