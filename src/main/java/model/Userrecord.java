package model;

public class Userrecord {
    private Integer uid;

    private String idsrecord;

    private String picrecord;
    
    private String recommend;

    public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getIdsrecord() {
        return idsrecord;
    }

    public void setIdsrecord(String idsrecord) {
        this.idsrecord = idsrecord == null ? null : idsrecord.trim();
    }

    public String getPicrecord() {
        return picrecord;
    }

    public void setPicrecord(String picrecord) {
        this.picrecord = picrecord == null ? null : picrecord.trim();
    }
}