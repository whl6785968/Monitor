package com.sandalen.CF;

import java.io.Serializable;

public class RecommendItem implements Serializable {
    private String userId;
    private String itemid;
    private Double simi;

    public RecommendItem(String userId, String itemid,Double simi) {
        this.userId = userId;
        this.itemid = itemid;
        this.simi = simi;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public Double getSimi() {
        return simi;
    }

    public void setSimi(Double simi) {
        this.simi = simi;
    }
}
