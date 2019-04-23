package com.sandalen.CF;



import java.io.Serializable;

public class ItemSimilarity implements Serializable {
    private String itemid1;
    private String itemid2;
    private Double simi;

    public ItemSimilarity(String itemid1, String itemid2, Double simi) {
        this.itemid1 = itemid1;
        this.itemid2 = itemid2;
        this.simi = simi;
    }

    public String getItemid1() {
        return itemid1;
    }

    public void setItemid1(String itemid1) {
        this.itemid1 = itemid1;
    }

    public String getItemid2() {
        return itemid2;
    }

    public void setItemid2(String itemid2) {
        this.itemid2 = itemid2;
    }

    public Double getSimi() {
        return simi;
    }

    public void setSimi(Double simi) {
        this.simi = simi;
    }
}
