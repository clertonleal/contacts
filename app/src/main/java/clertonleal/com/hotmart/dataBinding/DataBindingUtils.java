package clertonleal.com.hotmart.dataBinding;


import android.databinding.BindingAdapter;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import clertonleal.com.hotmart.R;

public class DataBindingUtils {

    @BindingAdapter("android:text")
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

}
