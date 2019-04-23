package model;

public class Mproduct {
    private String pid;

    private String pname;

    private Long pstorage;

    private Long psaled;

    private Float price;

    private Float rate;

    private Long predict;

    private String place;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Long getPstorage() {
        return pstorage;
    }

    public void setPstorage(Long pstorage) {
        this.pstorage = pstorage;
    }

    public Long getPsaled() {
        return psaled;
    }

    public void setPsaled(Long psaled) {
        this.psaled = psaled;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public Long getPredict() {
        return predict;
    }

    public void setPredict(Long predict) {
        this.predict = predict;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }
}