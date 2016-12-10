package clertonleal.com.hotmart.view.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;

import clertonleal.com.hotmart.R;
import clertonleal.com.hotmart.databinding.ActivityMainBinding;
import clertonleal.com.hotmart.databinding.NavHeaderMainBinding;
import clertonleal.com.hotmart.model.Menu;
import clertonleal.com.hotmart.view.fragment.MessagesFragment;
import clertonleal.com.hotmart.view.fragment.MyProfileFragment;
import clertonleal.com.hotmart.view.fragment.MySellsFragment;
import clertonleal.com.hotmart.viewModel.DrawerViewModel;

public class MainActivity extends BaseActivity implements MainView {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        DrawerViewModel viewModel = new DrawerViewModel(this);
        binding.setViewModel(viewModel);

        configureActionBar(binding);
        configureDrawer(binding);
        configureNavigationView(binding, viewModel);

        MessagesFragment messagesFragment = new MessagesFragment();
        addFragment(messagesFragment);
    }

    private void configureNavigationView(ActivityMainBinding binding, DrawerViewModel viewModel) {
        NavigationView navigationView = binding.navView;
        NavHeaderMainBinding.bind(navigationView.getHeaderView(0)).setViewModel(viewModel);
    }

    private void configureDrawer(ActivityMainBinding binding) {
        DrawerLayout drawer = binding.drawerLayout;
        Toolbar toolbar = binding.appBarMain.toolbar;
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    private void configureActionBar(ActivityMainBinding binding) {
        setSupportActionBar(binding.appBarMain.toolbar);
    }

    @Override
    public void onBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.getViewModel().closeDrawer();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void openFragment(Menu menu) {
        if (menu.getName() == R.string.my_account) {
            binding.getViewModel().setCounterVisible(false);
            replaceFragment(new MyProfileFragment());
        } else if (menu.getName() == R.string.my_sells) {
            binding.getViewModel().setCounterVisible(false);
            replaceFragment(new MySellsFragment());
        } else if (menu.getName() == R.string.messages) {
            MessagesFragment messagesFragment = new MessagesFragment();
            binding.getViewModel().setCounterVisible(true);
            replaceFragment(messagesFragment);
        }

        binding.drawerLayout.closeDrawer(GravityCompat.START);
    }
}
