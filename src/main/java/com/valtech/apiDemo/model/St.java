
package com.valtech.apiDemo.model;

import java.util.List;

public class St {

    private long g;
    private List<S> s = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public St() {
    }

    /**
     * 
     * @param g
     * @param s
     */
    public St(long g, List<S> s) {
        super();
        this.g = g;
        this.s = s;
    }

    public long getG() {
        return g;
    }

    public void setG(long g) {
        this.g = g;
    }

    public List<S> getS() {
        return s;
    }

    public void setS(List<S> s) {
        this.s = s;
    }

}
