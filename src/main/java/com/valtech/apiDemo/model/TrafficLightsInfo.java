
package com.valtech.apiDemo.model;

public class TrafficLightsInfo {

    private long t;
    private long cr;
    private long sv;
    private long st;
    private long zt;
    private Sp sp;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TrafficLightsInfo() {
    }

    /**
     * 
     * @param cr
     * @param t
     * @param sp
     * @param zt
     * @param sv
     * @param st
     */
    public TrafficLightsInfo(long t, long cr, long sv, long st, long zt, Sp sp) {
        super();
        this.t = t;
        this.cr = cr;
        this.sv = sv;
        this.st = st;
        this.zt = zt;
        this.sp = sp;
    }

    public long getT() {
        return t;
    }

    public void setT(long t) {
        this.t = t;
    }

    public long getCr() {
        return cr;
    }

    public void setCr(long cr) {
        this.cr = cr;
    }

    public long getSv() {
        return sv;
    }

    public void setSv(long sv) {
        this.sv = sv;
    }

    public long getSt() {
        return st;
    }

    public void setSt(long st) {
        this.st = st;
    }

    public long getZt() {
        return zt;
    }

    public void setZt(long zt) {
        this.zt = zt;
    }

    public Sp getSp() {
        return sp;
    }

    public void setSp(Sp sp) {
        this.sp = sp;
    }

}
