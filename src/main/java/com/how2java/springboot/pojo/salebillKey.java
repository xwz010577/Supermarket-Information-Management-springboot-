package com.how2java.springboot.pojo;

public class salebillKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salebill.saleBillID
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    private String salebillid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salebill.merchID
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    private String merchid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salebill.saleBillID
     *
     * @return the value of salebill.saleBillID
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    public String getSalebillid() {
        return salebillid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salebill.saleBillID
     *
     * @param salebillid the value for salebill.saleBillID
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    public void setSalebillid(String salebillid) {
        this.salebillid = salebillid == null ? null : salebillid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salebill.merchID
     *
     * @return the value of salebill.merchID
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    public String getMerchid() {
        return merchid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salebill.merchID
     *
     * @param merchid the value for salebill.merchID
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    public void setMerchid(String merchid) {
        this.merchid = merchid == null ? null : merchid.trim();
    }
}