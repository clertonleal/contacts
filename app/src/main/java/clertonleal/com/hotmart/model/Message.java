package clertonleal.com.hotmart.model;

import android.support.annotation.DrawableRes;

public class Message {

    private String contactName;

    private String contactImage;

    @DrawableRes
    private int contactColor;

    public Message(String contactName, String contactImage, int contactColor) {
        this.contactName = contactName;
        this.contactImage = contactImage;
        this.contactColor = contactColor;
    }

    public Message(String contactName, int contactColor) {
        this.contactName = contactName;
        this.contactColor = contactColor;
    }

    public Message() {
    }

    public String getContactInitial() {
        return contactName.substring(0, 1);
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactImage() {
        return contactImage;
    }

    public void setContactImage(String contactImage) {
        this.contactImage = contactImage;
    }

    public int getContactColor() {
        return contactColor;
    }

    public void setContactColor(int contactColor) {
        this.contactColor = contactColor;
    }
}
