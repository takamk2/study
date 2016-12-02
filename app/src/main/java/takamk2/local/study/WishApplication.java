package takamk2.local.study;

import android.app.Application;
import android.content.res.Configuration;

import timber.log.Timber;

/**
 * Created by takamk2 on 16/12/03.
 * <p/>
 * The Edit Fragment of Base Class.
 */
public class WishApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
        Timber.i("onCreate - start");
    }

    @Override
    public void onTerminate() {
        Timber.i("onTerminate - start");
        super.onTerminate();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        Timber.i("onConfigurationChanged - start");
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        Timber.i("onLowMemory - start");
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        Timber.i("onTrimMemory - start");
        super.onTrimMemory(level);
    }
}
