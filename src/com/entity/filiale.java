package com.entity;

public class filiale {
//	¹«Ë¾
    private Integer fid;

    private String fname;

    private String fprice;

    private Integer fstatus;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    @Override
	public String toString() {
		return "filiale [fid=" + fid + ", fname=" + fname + ", fprice=" + fprice + ", fstatus=" + fstatus + "]";
	}

	public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public String getFprice() {
        return fprice;
    }

    public void setFprice(String fprice) {
        this.fprice = fprice == null ? null : fprice.trim();
    }

    public Integer getFstatus() {
        return fstatus;
    }

    public void setFstatus(Integer fstatus) {
        this.fstatus = fstatus;
    }
}