package com.entity;

public class sheet2 {
    private Integer aid;

    private Integer fid;

    private String fname;

    private String pnum;

    private String gong;

    private String gprice;

    private String gdian;

    private String gsav;

    private String maxprice;

    private String minprice;

    private String psave;

    private String zprice;

    private String zhuan;

    private String qing;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    @Override
	public String toString() {
		return "sheet2 [aid=" + aid + ", fid=" + fid + ", fname=" + fname + ", pnum=" + pnum + ", gong=" + gong
				+ ", gprice=" + gprice + ", gdian=" + gdian + ", gsav=" + gsav + ", maxprice=" + maxprice
				+ ", minprice=" + minprice + ", psave=" + psave + ", zprice=" + zprice + ", zhuan=" + zhuan + ", qing="
				+ qing + "]";
	}

	public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public String getPnum() {
        return pnum;
    }

    public void setPnum(String pnum) {
        this.pnum = pnum == null ? null : pnum.trim();
    }

    public String getGong() {
        return gong;
    }

    public void setGong(String gong) {
        this.gong = gong == null ? null : gong.trim();
    }

    public String getGprice() {
        return gprice;
    }

    public void setGprice(String gprice) {
        this.gprice = gprice == null ? null : gprice.trim();
    }

    public String getGdian() {
        return gdian;
    }

    public void setGdian(String gdian) {
        this.gdian = gdian == null ? null : gdian.trim();
    }

    public String getGsav() {
        return gsav;
    }

    public void setGsav(String gsav) {
        this.gsav = gsav == null ? null : gsav.trim();
    }

    public String getMaxprice() {
        return maxprice;
    }

    public void setMaxprice(String maxprice) {
        this.maxprice = maxprice == null ? null : maxprice.trim();
    }

    public String getMinprice() {
        return minprice;
    }

    public void setMinprice(String minprice) {
        this.minprice = minprice == null ? null : minprice.trim();
    }

    public String getPsave() {
        return psave;
    }

    public void setPsave(String psave) {
        this.psave = psave == null ? null : psave.trim();
    }

    public String getZprice() {
        return zprice;
    }

    public void setZprice(String zprice) {
        this.zprice = zprice == null ? null : zprice.trim();
    }

    public String getZhuan() {
        return zhuan;
    }

    public void setZhuan(String zhuan) {
        this.zhuan = zhuan == null ? null : zhuan.trim();
    }

    public String getQing() {
        return qing;
    }

    public void setQing(String qing) {
        this.qing = qing == null ? null : qing.trim();
    }
}