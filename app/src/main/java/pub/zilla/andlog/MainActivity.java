package pub.zilla.andlog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.orhanobut.logger.Logger;

import pub.zilla.logzilla.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("==onCreate==");
        Log.e("error", new Exception("hahaha"));
        Log.e("error info");
    }

}
