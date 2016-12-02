package takamk2.local.study.ui;

import android.app.Fragment;
import android.os.Bundle;

import icepick.State;
import takamk2.local.study.R;
import takamk2.local.study.state.StateMachine;
import takamk2.local.study.util.FragmentUtil;

public class MainActivity extends BaseActivity {

    // Todo: create the StateMachine Class
    @State
    StateMachine.State mState = StateMachine.State.INITIALIZED;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (mState == StateMachine.State.INITIALIZED) {
            FragmentUtil.startFragment(this, WishDispFragment.newInstance());
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Fragment fragment = getFragmentManager().findFragmentByTag(WishDispFragment.class.getName());
    }
}
