package com.how2java.springboot.pojo;

import java.util.Date;

public class salebill extends salebillKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salebill.saleNum
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    private Integer salenum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salebill.saleDate
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    private Date saledate;
    
    private merchbill merchbill;

    public merchbill getMerchbill() {
		return merchbill;
	}

	public void setMerchbill(merchbill merchbill) {
		this.merchbill = merchbill;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salebill.saleNum
     *
     * @return the value of salebill.saleNum
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    public Integer getSalenum() {
        return salenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salebill.saleNum
     *
     * @param salenum the value for salebill.saleNum
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    public void setSalenum(Integer salenum) {
        this.salenum = salenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salebill.saleDate
     *
     * @return the value of salebill.saleDate
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    public Date getSaledate() {
        return saledate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salebill.saleDate
     *
     * @param saledate the value for salebill.saleDate
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    public void setSaledate(Date saledate) {
        this.saledate = saledate;
    }
}