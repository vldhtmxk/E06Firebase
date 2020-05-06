package net.skhu;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Memo implements Serializable {
    final static SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일, HH:mm:ss");
    String title;
    Date date;
    String body;
    boolean checked;

    public Memo(String title,String body, Date date) {
        this.title = title;
        this.body = body;
        this.date = date;

    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title =title;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getBody() {return body;}
    public void setBody(String body) { this.body = body;}
    public String getDateFormatted() {
        return format.format(date);
    }
    public boolean isChecked() {
        return checked;
    }
    public void setChecked(boolean checked) {
        this.checked = checked;
    }

}
