package com.ktck124.lop124ltdd04.nhom05;

public class thongtinnhom {
    private String tennhom;
    private String chucvu;
    private String msv;

    public thongtinnhom() {
    }

    public thongtinnhom(String tennhom, String msv, String chucvu) {
        this.tennhom = tennhom;
        this.msv = msv;
        this.chucvu = chucvu;
    }

    public String getTennhom() {
        return tennhom;
    }

    public void setTennhom(String tennhom) {
        this.tennhom = tennhom;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }
}
