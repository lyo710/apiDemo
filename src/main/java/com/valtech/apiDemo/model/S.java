
package com.valtech.apiDemo.model;

public class S {

    private long p;
    private long i;
    private long a;
    private long l;
    private long c;

    /**
     * No args constructor for use in serialization
     * 
     */
    public S() {
    }

    /**
     * 
     * @param c
     * @param a
     * @param p
     * @param l
     * @param i
     */
    public S(long p, long i, long a, long l, long c) {
        super();
        this.p = p;
        this.i = i;
        this.a = a;
        this.l = l;
        this.c = c;
    }

    public long getP() {
        return p;
    }

    public void setP(long p) {
        this.p = p;
    }

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    public long getA() {
        return a;
    }

    public void setA(long a) {
        this.a = a;
    }

    public long getL() {
        return l;
    }

    public void setL(long l) {
        this.l = l;
    }

    public long getC() {
        return c;
    }

    public void setC(long c) {
        this.c = c;
    }

}
