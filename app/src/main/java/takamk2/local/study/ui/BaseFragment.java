package takamk2.local.study.ui;

import android.animation.Animator;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import timber.log.Timber;

/**
 * Created by takamk2 on 16/12/05.
 * <p/>
 * The Edit Fragment of Base Class.
 */
public class BaseFragment extends Fragment {

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        Timber.i("%s#onHiddenChanged - start", getClass().getName());
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Timber.i("%s#onActivityResult - start", getClass().getName());
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        Timber.i("%s#onRequestPermissionsResult - start", getClass().getName());
    }

    @Override
    public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        super.onInflate(context, attrs, savedInstanceState);
        Timber.i("%s#onInflate - start", getClass().getName());
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        super.onAttachFragment(childFragment);
        Timber.i("%s#onAttachFragment - start", getClass().getName());
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Timber.i("%s#onAttach - start", getClass().getName());
    }

    @Override
    public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) {
        Timber.i("%s#onCreateAnimator - start", getClass().getName());
        return super.onCreateAnimator(transit, enter, nextAnim);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Timber.i("%s#onCreate - start", getClass().getName());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Timber.i("%s#onCreateView - start", getClass().getName());
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Timber.i("%s#onViewCreated - start", getClass().getName());
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Timber.i("%s#onActivityCreated - start", getClass().getName());
    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Timber.i("%s#onViewStateRestored - start", getClass().getName());
    }

    @Override
    public void onStart() {
        super.onStart();
        Timber.i("%s#onStart - start", getClass().getName());
    }

    @Override
    public void onResume() {
        super.onResume();
        Timber.i("%s#onResume - start", getClass().getName());
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Timber.i("%s#onSaveInstanceState - start", getClass().getName());
    }

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        super.onMultiWindowModeChanged(isInMultiWindowMode);
        Timber.i("%s#onMultiWindowModeChanged - start", getClass().getName());
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
        Timber.i("%s#onPictureInPictureModeChanged - start", getClass().getName());
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Timber.i("%s#onConfigurationChanged - start", getClass().getName());
    }

    @Override
    public void onPause() {
        super.onPause();
        Timber.i("%s#onPause - start", getClass().getName());
    }

    @Override
    public void onStop() {
        super.onStop();
        Timber.i("%s#onStop - start", getClass().getName());
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Timber.i("%s#onLowMemory - start", getClass().getName());
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Timber.i("%s#onTrimMemory - start", getClass().getName());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Timber.i("%s#onDestroyView - start", getClass().getName());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Timber.i("%s#onDestroy - start", getClass().getName());
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Timber.i("%s#onDetach - start", getClass().getName());
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        Timber.i("%s#onCreateOptionsMenu - start", getClass().getName());
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        Timber.i("%s#onPrepareOptionsMenu - start", getClass().getName());
    }

    @Override
    public void onDestroyOptionsMenu() {
        super.onDestroyOptionsMenu();
        Timber.i("%s#onDestroyOptionsMenu - start", getClass().getName());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Timber.i("%s#onOptionsItemSelected - start", getClass().getName());
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
        super.onOptionsMenuClosed(menu);
        Timber.i("%s#onOptionsMenuClosed - start", getClass().getName());
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        Timber.i("%s#onCreateContextMenu - start", getClass().getName());
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Timber.i("%s#onContextItemSelected - start", getClass().getName());
        return super.onContextItemSelected(item);
    }
}
