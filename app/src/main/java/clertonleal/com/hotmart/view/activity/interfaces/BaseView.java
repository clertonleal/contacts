package clertonleal.com.hotmart.view.activity.interfaces;


import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;

public interface BaseView {

    void addFragment(Fragment fragment, boolean addToBackStack);
    void addFragment(Fragment fragment);
    void replaceFragment(Fragment fragment, boolean addToBackStack);
    void replaceFragment(Fragment fragment);
    void openActivity(Class clazz);
    void setToolbarTitle(String title);
    void setToolbarTitle(@StringRes int title);

}
