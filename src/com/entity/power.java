package com.entity;

import java.math.BigDecimal;

public class power {
    private Integer pid;

    private String pname;

    private BigDecimal pprice;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
	public String toString() {
		return "power [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
	}

	public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public BigDecimal getPprice() {
        return pprice;
    }

    public void setPprice(BigDecimal pprice) {
        this.pprice = pprice;
    }
}