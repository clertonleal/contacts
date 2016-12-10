package clertonleal.com.hotmart;

import android.databinding.BindingAdapter;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DataBindingUtils {

    @BindingAdapter("app:text")
    public static void setText(TextView textView, @StringRes int text) {
        textView.setText(text);
    }

    @BindingAdapter("android:src")
    public static void setImageDrawable(ImageView view, @DrawableRes int drawable) {
        view.setImageResource(drawable);
    }

    @BindingAdapter("app:url")
    public static void setImageDrawable(ImageView view, String imageUrl) {
        Picasso.with(view.getContext()).load(imageUrl).error(R.drawable.profile_placeholder).into(view);
    }

    @BindingAdapter("app:drawerControl")
    public static void controlDrawer(DrawerLayout drawerLayout, boolean open) {
        if (open) {
            drawerLayout.openDrawer(GravityCompat.START);
        } else {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    @BindingAdapter("app:title")
    public static void setTitle(Toolbar toolbar, String title) {
        toolbar.setTitle(title);
    }
}
