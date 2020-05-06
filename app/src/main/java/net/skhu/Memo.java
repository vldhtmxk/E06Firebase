package net.skhu;

import java.io.Serializable;
import java.util.Date;

public class Memo implements Serializable {
    String title;

    public Memo(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

}
