package takamk2.local.study.util;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import takamk2.local.study.R;
import timber.log.Timber;

/**
 * Created by takamk2 on 16/12/04.
 * <p/>
 * The Edit Fragment of Base Class.
 */
public class FragmentUtil {

    public static void startFragment(Activity activity, Fragment fragment) {
        startFragment(activity, fragment, R.id.fragment_container);
    }

    public static void startFragment(Activity activity, Fragment fragment, int containerId) {
        Timber.i("startFragment - start : activity=%s fragment=%s",
                activity.getClass().getName(), fragment.getClass().getName());

        String tag = fragment.getClass().getName();
        FragmentManager fragmentManager = activity.getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(containerId, fragment, tag);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
