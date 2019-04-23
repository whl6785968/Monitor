package model;

import java.util.Date;

public class Indexos {
    private String iid;

    private Date itime;

    private Float tss;

    private Float cod;

    private Float tn;

    private Float tp;

    private Float dissolve;

    private Float ph;

    private Float temper;

    private Float nhn;

    private Float conductivity;

    public String getIid() {
        return iid;
    }

    public void setIid(String iid) {
        this.iid = iid == null ? null : iid.trim();
    }

    public Date getItime() {
        return itime;
    }

    public void setItime(Date itime) {
        this.itime = itime;
    }

    public Float getTss() {
        return tss;
    }

    public void setTss(Float tss) {
        this.tss = tss;
    }

    public Float getCod() {
        return cod;
    }

    public void setCod(Float cod) {
        this.cod = cod;
    }

    public Float getTn() {
        return tn;
    }

    public void setTn(Float tn) {
        this.tn = tn;
    }

    public Float getTp() {
        return tp;
    }

    public void setTp(Float tp) {
        this.tp = tp;
    }

    public Float getDissolve() {
        return dissolve;
    }

    public void setDissolve(Float dissolve) {
        this.dissolve = dissolve;
    }

    public Float getPh() {
        return ph;
    }

    public void setPh(Float ph) {
        this.ph = ph;
    }

    public Float getTemper() {
        return temper;
    }

    public void setTemper(Float temper) {
        this.temper = temper;
    }

    public Float getNhn() {
        return nhn;
    }

    public void setNhn(Float nhn) {
        this.nhn = nhn;
    }

    public Float getConductivity() {
        return conductivity;
    }

    public void setConductivity(Float conductivity) {
        this.conductivity = conductivity;
    }
}