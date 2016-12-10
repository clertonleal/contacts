package clertonleal.com.hotmart.view.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;

import clertonleal.com.hotmart.R;
import clertonleal.com.hotmart.databinding.ActivityMainBinding;
import clertonleal.com.hotmart.databinding.NavHeaderMainBinding;
import clertonleal.com.hotmart.viewModel.DrawerViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        DrawerViewModel viewModel = new DrawerViewModel();
        binding.setViewModel(viewModel);

        configureActionBar(binding);
        configureDrawer(binding);
        configureNavigationView(binding, viewModel);
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
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
