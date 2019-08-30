
package com.valtech.apiDemo.model;

import java.util.List;

public class Sp {

    private List<Sl> sl = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sp() {
    }

    /**
     * 
     * @param sl
     */
    public Sp(List<Sl> sl) {
        super();
        this.sl = sl;
    }

    public List<Sl> getSl() {
        return sl;
    }

    public void setSl(List<Sl> sl) {
        this.sl = sl;
    }

}
