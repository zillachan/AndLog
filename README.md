# AndLog
The abstruction of android log framework, support a union interface for the porpular log frameworks.

[![](https://jitpack.io/v/zillachan/AndLog.svg)](https://jitpack.io/#zillachan/AndLog)

## How to use

```
repositories {
        jcenter()
        maven { url "https://jitpack.io" }
   }
   dependencies {
         compile 'com.github.zillachan:AndLog:1.1'
   }
```
### Step1
```
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        new Log.Builder().client(new LoggerLog()).logStatus(true);
    }
}
```
### Step2
```
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

```