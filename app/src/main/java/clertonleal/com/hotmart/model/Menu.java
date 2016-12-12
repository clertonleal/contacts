package clertonleal.com.hotmart.model;


import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;

import com.google.common.base.Objects;

public class Menu {

    public Menu(int image, int name) {
        this.image = image;
        this.name = name;
    }

    public Menu(int image, int name, int count, boolean enabled) {
        this.image = image;
        this.name = name;
        this.count = count;
        this.enabled = enabled;
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

    private boolean enabled = true;

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

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Menu)) return false;
        Menu menu = (Menu) o;
        return image == menu.image &&
                name == menu.name &&
                count == menu.count &&
                enabled == menu.enabled;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(image, name, count, enabled);
    }
}
