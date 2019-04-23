package model;

public class Equipment {
    private Long eid;

    private String ename;

    private Float eparam1;

    private Float eparam2;

    private Float eparam3;

    private Float eparam4;

    private Float eparam5;

    private Float eparam6;

    private Float eparam7;

    private String estate1;

    private String estate2;

    private String estate3;

    private String equipic;

    public Long getEid() {
        return eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public Float getEparam1() {
        return eparam1;
    }

    public void setEparam1(Float eparam1) {
        this.eparam1 = eparam1;
    }

    public Float getEparam2() {
        return eparam2;
    }

    public void setEparam2(Float eparam2) {
        this.eparam2 = eparam2;
    }

    public Float getEparam3() {
        return eparam3;
    }

    public void setEparam3(Float eparam3) {
        this.eparam3 = eparam3;
    }

    public Float getEparam4() {
        return eparam4;
    }

    public void setEparam4(Float eparam4) {
        this.eparam4 = eparam4;
    }

    public Float getEparam5() {
        return eparam5;
    }

    public void setEparam5(Float eparam5) {
        this.eparam5 = eparam5;
    }

    public Float getEparam6() {
        return eparam6;
    }

    public void setEparam6(Float eparam6) {
        this.eparam6 = eparam6;
    }

    public Float getEparam7() {
        return eparam7;
    }

    public void setEparam7(Float eparam7) {
        this.eparam7 = eparam7;
    }

    public String getEstate1() {
        return estate1;
    }

    public void setEstate1(String estate1) {
        this.estate1 = estate1 == null ? null : estate1.trim();
    }

    public String getEstate2() {
        return estate2;
    }

    public void setEstate2(String estate2) {
        this.estate2 = estate2 == null ? null : estate2.trim();
    }

    public String getEstate3() {
        return estate3;
    }

    public void setEstate3(String estate3) {
        this.estate3 = estate3 == null ? null : estate3.trim();
    }

    public String getEquipic() {
        return equipic;
    }

    public void setEquipic(String equipic) {
        this.equipic = equipic == null ? null : equipic.trim();
    }
}