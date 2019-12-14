package com.entity;

public class Company {
	
	

    private Integer cid;
    private Integer fid;

    private String cname;
    private String fname;

    private String ctotal;
    private String price;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Company [cid=" + cid + ", fid=" + fid + ", cname=" + cname + ", fname=" + fname + ", ctotal=" + ctotal
				+ ", price=" + price + "]";
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getCtotal() {
		return ctotal;
	}
	public void setCtotal(String ctotal) {
		this.ctotal = ctotal;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
    
    

}
