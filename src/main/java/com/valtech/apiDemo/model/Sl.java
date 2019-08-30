
package com.valtech.apiDemo.model;

import java.util.List;

public class Sl {

    private Id id;
    private long rv;
    private Is is;
    private List<St> st = null;
    private List<Object> al = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sl() {
    }

    /**
     * 
     * @param id
     * @param al
     * @param is
     * @param st
     * @param rv
     */
    public Sl(Id id, long rv, Is is, List<St> st, List<Object> al) {
        super();
        this.id = id;
        this.rv = rv;
        this.is = is;
        this.st = st;
        this.al = al;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public long getRv() {
        return rv;
    }

    public void setRv(long rv) {
        this.rv = rv;
    }

    public Is getIs() {
        return is;
    }

    public void setIs(Is is) {
        this.is = is;
    }

    public List<St> getSt() {
        return st;
    }

    public void setSt(List<St> st) {
        this.st = st;
    }

    public List<Object> getAl() {
        return al;
    }

    public void setAl(List<Object> al) {
        this.al = al;
    }

}
