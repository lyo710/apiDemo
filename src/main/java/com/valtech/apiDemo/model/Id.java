
package com.valtech.apiDemo.model;

public class Id {

    private long rg;
    private long id;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Id() {
    }

    /**
     * 
     * @param id
     * @param rg
     */
    public Id(long rg, long id) {
        super();
        this.rg = rg;
        this.id = id;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
