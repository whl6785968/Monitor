package com.sandalen.CF;

import java.io.Serializable;

public class CommonUse implements Serializable {
    private String itemid;
    private Integer num;
    public CommonUse(String itemid,Integer num)
    {
        this.itemid = itemid;
        this.num = num;
    }
    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
