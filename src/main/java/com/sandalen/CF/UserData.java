package com.sandalen.CF;

import java.io.Serializable;

public class UserData implements Serializable {
    private String userid;
    private String itemid;
    public UserData(String userid,String itemid)
    {
        this.userid = userid;
        this.itemid = itemid;
    }
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }
}
