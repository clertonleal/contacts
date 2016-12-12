package clertonleal.com.hotmart.view.activity;


import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import clertonleal.com.hotmart.R;
import clertonleal.com.hotmart.view.activity.interfaces.BaseView;

public class BaseActivity extends AppCompatActivity implements BaseView {

    @Override
    public void addFragment(Fragment fragment) {
        addFragment(fragment, false);
    }

    @Override
    public void addFragment(Fragment fragment, boolean addToBackStack) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        if (addToBackStack) {
            fragmentTransaction.addToBackStack(null);
        }

        fragmentTransaction.add(R.id.fragment_container, fragment).commit();
    }

    @Override
    public void replaceFragment(Fragment fragment) {
        replaceFragment(fragment, false);
    }

    @Override
    public void replaceFragment(Fragment fragment, boolean addToBackStack) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        if (addToBackStack) {
            fragmentTransaction.addToBackStack(null);
        }

        fragmentTransaction.replace(R.id.fragment_container, fragment).commit();
    }

    @Override
    public void openActivity(Class clazz) {
        startActivity(new Intent(this, clazz));
    }

    @Override
    public void setToolbarTitle(String title) {
        setTitle(title);
    }

    @Override
    public void setToolbarTitle(@StringRes int title) {
        setTitle(title);
    }
}
