
package com.valtech.apiDemo.model;

public class Is {

    private boolean i4;
    private boolean i6;
    private boolean i14;
    private boolean i15;
    private boolean i16;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Is() {
    }

    /**
     * 
     * @param i14
     * @param i15
     * @param i16
     * @param i6
     * @param i4
     */
    public Is(boolean i4, boolean i6, boolean i14, boolean i15, boolean i16) {
        super();
        this.i4 = i4;
        this.i6 = i6;
        this.i14 = i14;
        this.i15 = i15;
        this.i16 = i16;
    }

    public boolean isI4() {
        return i4;
    }

    public void setI4(boolean i4) {
        this.i4 = i4;
    }

    public boolean isI6() {
        return i6;
    }

    public void setI6(boolean i6) {
        this.i6 = i6;
    }

    public boolean isI14() {
        return i14;
    }

    public void setI14(boolean i14) {
        this.i14 = i14;
    }

    public boolean isI15() {
        return i15;
    }

    public void setI15(boolean i15) {
        this.i15 = i15;
    }

    public boolean isI16() {
        return i16;
    }

    public void setI16(boolean i16) {
        this.i16 = i16;
    }

}
