package clertonleal.com.hotmart.view.fragment;


import android.content.Context;
import android.support.v4.app.Fragment;

import clertonleal.com.hotmart.view.activity.interfaces.MainView;

public abstract class BaseFragment extends Fragment {

    private MainView mainView;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (getActivity() instanceof MainView) {
            mainView = (MainView) getActivity();
        } else {
            throw new IllegalStateException("Activity should implement MainView interface");
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        mainView.setToolbarTitle(getTitle());
    }

    protected abstract int getTitle();
}
