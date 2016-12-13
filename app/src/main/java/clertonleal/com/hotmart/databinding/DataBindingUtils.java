package clertonleal.com.hotmart.databinding;

import android.databinding.BindingAdapter;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import net.qiujuer.genius.blur.StackBlur;

import clertonleal.com.hotmart.R;

public class DataBindingUtils {

    @BindingAdapter("app:text")
    public static void setText(TextView textView, @StringRes int text) {
        textView.setText(text);
    }

    @BindingAdapter("android:src")
    public static void setImageDrawable(ImageView view, @DrawableRes int drawable) {
        view.setImageResource(drawable);
    }

    @BindingAdapter("app:urlBlur")
    public static void setImageDrawableWithBlur(ImageView view, String imageUrl) {
        Picasso.with(view.getContext()).load(imageUrl).placeholder(R.drawable.profile_placeholder).error(R.drawable.profile_placeholder).into(new Target() {
            @Override
            public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                view.setImageBitmap(StackBlur.blurNatively(bitmap, 20, false));
                view.invalidate();
            }

            @Override
            public void onBitmapFailed(Drawable errorDrawable) {
                view.setImageDrawable(errorDrawable);
            }

            @Override
            public void onPrepareLoad(Drawable placeHolderDrawable) {
                view.setImageDrawable(placeHolderDrawable);
            }
        });
    }

    @BindingAdapter("app:url")
    public static void setImageDrawable(ImageView view, String imageUrl) {
        Picasso.with(view.getContext()).load(imageUrl).placeholder(R.drawable.profile_placeholder).error(R.drawable.profile_placeholder).into(view);
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
