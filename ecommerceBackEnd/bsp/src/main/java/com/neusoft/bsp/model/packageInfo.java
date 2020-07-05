package com.neusoft.bsp.model;

import java.math.BigDecimal;
import java.util.Date;

public class packageInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pck_package_info.PCK_ID
     *
     * @mbg.generated
     */
    private Integer pckId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pck_package_info.WAR_ID
     *
     * @mbg.generated
     */
    private Integer warId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pck_package_info.PRO_ID
     *
     * @mbg.generated
     */
    private Integer proId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pck_package_info.TYPE_CD
     *
     * @mbg.generated
     */
    private String typeCd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pck_package_info.WIDTH
     *
     * @mbg.generated
     */
    private BigDecimal width;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pck_package_info.HEIGHT
     *
     * @mbg.generated
     */
    private BigDecimal height;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pck_package_info.LENGTH
     *
     * @mbg.generated
     */
    private BigDecimal length;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pck_package_info.WEIGHT
     *
     * @mbg.generated
     */
    private BigDecimal weight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pck_package_info.CREATED_BY
     *
     * @mbg.generated
     */
    private String createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pck_package_info.CREATION_DATE
     *
     * @mbg.generated
     */
    private Date creationDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pck_package_info.LAST_UPDATE_BY
     *
     * @mbg.generated
     */
    private String lastUpdateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pck_package_info.LAST_UPDATE_DATE
     *
     * @mbg.generated
     */
    private Date lastUpdateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pck_package_info.CALL_CNT
     *
     * @mbg.generated
     */
    private Integer callCnt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pck_package_info.REMARK
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pck_package_info.STS_CD
     *
     * @mbg.generated
     */
    private String stsCd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pck_package_info.HEAVY_CARGO
     *
     * @mbg.generated
     */
    private String heavyCargo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pck_package_info.LOGISTICS_COMPANY
     *
     * @mbg.generated
     */
    private String logisticsCompany;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pck_package_info
     *
     * @mbg.generated
     */
    public packageInfo(Integer pckId, Integer warId, Integer proId, String typeCd, BigDecimal width, BigDecimal height, BigDecimal length, BigDecimal weight, String createdBy, Date creationDate, String lastUpdateBy, Date lastUpdateDate, Integer callCnt, String remark, String stsCd, String heavyCargo, String logisticsCompany) {
        this.pckId = pckId;
        this.warId = warId;
        this.proId = proId;
        this.typeCd = typeCd;
        this.width = width;
        this.height = height;
        this.length = length;
        this.weight = weight;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.lastUpdateBy = lastUpdateBy;
        this.lastUpdateDate = lastUpdateDate;
        this.callCnt = callCnt;
        this.remark = remark;
        this.stsCd = stsCd;
        this.heavyCargo = heavyCargo;
        this.logisticsCompany = logisticsCompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pck_package_info
     *
     * @mbg.generated
     */
    public packageInfo() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pck_package_info.PCK_ID
     *
     * @return the value of pck_package_info.PCK_ID
     *
     * @mbg.generated
     */
    public Integer getPckId() {
        return pckId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pck_package_info.PCK_ID
     *
     * @param pckId the value for pck_package_info.PCK_ID
     *
     * @mbg.generated
     */
    public void setPckId(Integer pckId) {
        this.pckId = pckId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pck_package_info.WAR_ID
     *
     * @return the value of pck_package_info.WAR_ID
     *
     * @mbg.generated
     */
    public Integer getWarId() {
        return warId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pck_package_info.WAR_ID
     *
     * @param warId the value for pck_package_info.WAR_ID
     *
     * @mbg.generated
     */
    public void setWarId(Integer warId) {
        this.warId = warId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pck_package_info.PRO_ID
     *
     * @return the value of pck_package_info.PRO_ID
     *
     * @mbg.generated
     */
    public Integer getProId() {
        return proId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pck_package_info.PRO_ID
     *
     * @param proId the value for pck_package_info.PRO_ID
     *
     * @mbg.generated
     */
    public void setProId(Integer proId) {
        this.proId = proId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pck_package_info.TYPE_CD
     *
     * @return the value of pck_package_info.TYPE_CD
     *
     * @mbg.generated
     */
    public String getTypeCd() {
        return typeCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pck_package_info.TYPE_CD
     *
     * @param typeCd the value for pck_package_info.TYPE_CD
     *
     * @mbg.generated
     */
    public void setTypeCd(String typeCd) {
        this.typeCd = typeCd == null ? null : typeCd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pck_package_info.WIDTH
     *
     * @return the value of pck_package_info.WIDTH
     *
     * @mbg.generated
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pck_package_info.WIDTH
     *
     * @param width the value for pck_package_info.WIDTH
     *
     * @mbg.generated
     */
    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pck_package_info.HEIGHT
     *
     * @return the value of pck_package_info.HEIGHT
     *
     * @mbg.generated
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pck_package_info.HEIGHT
     *
     * @param height the value for pck_package_info.HEIGHT
     *
     * @mbg.generated
     */
    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pck_package_info.LENGTH
     *
     * @return the value of pck_package_info.LENGTH
     *
     * @mbg.generated
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pck_package_info.LENGTH
     *
     * @param length the value for pck_package_info.LENGTH
     *
     * @mbg.generated
     */
    public void setLength(BigDecimal length) {
        this.length = length;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pck_package_info.WEIGHT
     *
     * @return the value of pck_package_info.WEIGHT
     *
     * @mbg.generated
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pck_package_info.WEIGHT
     *
     * @param weight the value for pck_package_info.WEIGHT
     *
     * @mbg.generated
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pck_package_info.CREATED_BY
     *
     * @return the value of pck_package_info.CREATED_BY
     *
     * @mbg.generated
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pck_package_info.CREATED_BY
     *
     * @param createdBy the value for pck_package_info.CREATED_BY
     *
     * @mbg.generated
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pck_package_info.CREATION_DATE
     *
     * @return the value of pck_package_info.CREATION_DATE
     *
     * @mbg.generated
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pck_package_info.CREATION_DATE
     *
     * @param creationDate the value for pck_package_info.CREATION_DATE
     *
     * @mbg.generated
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pck_package_info.LAST_UPDATE_BY
     *
     * @return the value of pck_package_info.LAST_UPDATE_BY
     *
     * @mbg.generated
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pck_package_info.LAST_UPDATE_BY
     *
     * @param lastUpdateBy the value for pck_package_info.LAST_UPDATE_BY
     *
     * @mbg.generated
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pck_package_info.LAST_UPDATE_DATE
     *
     * @return the value of pck_package_info.LAST_UPDATE_DATE
     *
     * @mbg.generated
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pck_package_info.LAST_UPDATE_DATE
     *
     * @param lastUpdateDate the value for pck_package_info.LAST_UPDATE_DATE
     *
     * @mbg.generated
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pck_package_info.CALL_CNT
     *
     * @return the value of pck_package_info.CALL_CNT
     *
     * @mbg.generated
     */
    public Integer getCallCnt() {
        return callCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pck_package_info.CALL_CNT
     *
     * @param callCnt the value for pck_package_info.CALL_CNT
     *
     * @mbg.generated
     */
    public void setCallCnt(Integer callCnt) {
        this.callCnt = callCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pck_package_info.REMARK
     *
     * @return the value of pck_package_info.REMARK
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pck_package_info.REMARK
     *
     * @param remark the value for pck_package_info.REMARK
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pck_package_info.STS_CD
     *
     * @return the value of pck_package_info.STS_CD
     *
     * @mbg.generated
     */
    public String getStsCd() {
        return stsCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pck_package_info.STS_CD
     *
     * @param stsCd the value for pck_package_info.STS_CD
     *
     * @mbg.generated
     */
    public void setStsCd(String stsCd) {
        this.stsCd = stsCd == null ? null : stsCd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pck_package_info.HEAVY_CARGO
     *
     * @return the value of pck_package_info.HEAVY_CARGO
     *
     * @mbg.generated
     */
    public String getHeavyCargo() {
        return heavyCargo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pck_package_info.HEAVY_CARGO
     *
     * @param heavyCargo the value for pck_package_info.HEAVY_CARGO
     *
     * @mbg.generated
     */
    public void setHeavyCargo(String heavyCargo) {
        this.heavyCargo = heavyCargo == null ? null : heavyCargo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pck_package_info.LOGISTICS_COMPANY
     *
     * @return the value of pck_package_info.LOGISTICS_COMPANY
     *
     * @mbg.generated
     */
    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pck_package_info.LOGISTICS_COMPANY
     *
     * @param logisticsCompany the value for pck_package_info.LOGISTICS_COMPANY
     *
     * @mbg.generated
     */
    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany == null ? null : logisticsCompany.trim();
    }
}