package clertonleal.com.hotmart.model;

import java.util.Date;

public class Sell {

    public Sell(String title, Long id, Date date, Float value) {
        this.title = title;
        this.id = id;
        this.date = date;
        this.value = value;
    }

    public Sell(String title, Long id, Date date, Float value, boolean alert) {
        this.title = title;
        this.id = id;
        this.date = date;
        this.value = value;
        this.alert = alert;
    }

    private String title;

    private Long id;

    private Date date;

    private Float value;

    private boolean alert;

    public Sell() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public boolean isAlert() {
        return alert;
    }

    public void setAlert(boolean alert) {
        this.alert = alert;
    }
}
