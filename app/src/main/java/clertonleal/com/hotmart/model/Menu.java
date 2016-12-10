package clertonleal.com.hotmart.model;


import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;

public class Menu {

    public Menu(int image, int name) {
        this.image = image;
        this.name = name;
    }

    public Menu(int image, int name, int count) {
        this.image = image;
        this.name = name;
        this.count = count;
    }

    @DrawableRes
    private int image;

    @StringRes
    private int name;

    private int count;

    public int getImage() {
        return image;
    }

    public void setImage(@DrawableRes int image) {
        this.image = image;
    }

    public int getName() {
        return name;
    }

    public void setName(@StringRes int name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
