package takamk2.local.study.ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;

import timber.log.Timber;

/**
 * Created by takamk2 on 16/12/03.
 * <p/>
 * The Edit Fragment of Base Class.
 */
// Todo: To extend this base activity
public abstract class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        Timber.plant(new Timber.DebugTree());
        Timber.i("%s#onCreate - start", getClass().getSimpleName());
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        Timber.i("%s#onStart - start", getClass().getSimpleName());
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Timber.i("%s#onRestart - start", getClass().getSimpleName());
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Timber.i("%s#onResume - start", getClass().getSimpleName());
        super.onResume();
    }

    @Override
    protected void onPause() {
        Timber.i("%s#onPause - start", getClass().getSimpleName());
        super.onPause();
    }

    @Override
    protected void onStop() {
        Timber.i("%s#onStop - start", getClass().getSimpleName());
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Timber.i("%s#onDestroy - start", getClass().getSimpleName());
        super.onDestroy();
    }
}
