package com.neusoft.bsp.model;

import java.util.Date;

public class storeOrder {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sto_store_order.STO_ID
     *
     * @mbg.generated
     */
    private Integer stoId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sto_store_order.STR_ID
     *
     * @mbg.generated
     */
    private Integer strId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sto_store_order.ORDER_ID
     *
     * @mbg.generated
     */
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sto_store_order.ORDER_CREATED_TIME
     *
     * @mbg.generated
     */
    private String orderCreatedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sto_store_order.PAID_TIME
     *
     * @mbg.generated
     */
    private String paidTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sto_store_order.LAST_MODIFIED_TIME
     *
     * @mbg.generated
     */
    private String lastModifiedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sto_store_order.CREATED_BY
     *
     * @mbg.generated
     */
    private String createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sto_store_order.CREATION_DATE
     *
     * @mbg.generated
     */
    private Date creationDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sto_store_order.LAST_UPDATE_BY
     *
     * @mbg.generated
     */
    private String lastUpdateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sto_store_order.LAST_UPDATE_DATE
     *
     * @mbg.generated
     */
    private Date lastUpdateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sto_store_order.CALL_CNT
     *
     * @mbg.generated
     */
    private Integer callCnt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sto_store_order.REMARK
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sto_store_order.STS_CD
     *
     * @mbg.generated
     */
    private String stsCd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sto_store_order.PLATEFORM_TYPE
     *
     * @mbg.generated
     */
    private String plateformType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sto_store_order.CANCEL_COMPLETE_DATE
     *
     * @mbg.generated
     */
    private String cancelCompleteDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sto_store_order
     *
     * @mbg.generated
     */
    public storeOrder(Integer stoId, Integer strId, String orderId, String orderCreatedTime, String paidTime, String lastModifiedTime, String createdBy, Date creationDate, String lastUpdateBy, Date lastUpdateDate, Integer callCnt, String remark, String stsCd, String plateformType, String cancelCompleteDate) {
        this.stoId = stoId;
        this.strId = strId;
        this.orderId = orderId;
        this.orderCreatedTime = orderCreatedTime;
        this.paidTime = paidTime;
        this.lastModifiedTime = lastModifiedTime;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.lastUpdateBy = lastUpdateBy;
        this.lastUpdateDate = lastUpdateDate;
        this.callCnt = callCnt;
        this.remark = remark;
        this.stsCd = stsCd;
        this.plateformType = plateformType;
        this.cancelCompleteDate = cancelCompleteDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sto_store_order
     *
     * @mbg.generated
     */
    public storeOrder() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sto_store_order.STO_ID
     *
     * @return the value of sto_store_order.STO_ID
     *
     * @mbg.generated
     */
    public Integer getStoId() {
        return stoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sto_store_order.STO_ID
     *
     * @param stoId the value for sto_store_order.STO_ID
     *
     * @mbg.generated
     */
    public void setStoId(Integer stoId) {
        this.stoId = stoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sto_store_order.STR_ID
     *
     * @return the value of sto_store_order.STR_ID
     *
     * @mbg.generated
     */
    public Integer getStrId() {
        return strId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sto_store_order.STR_ID
     *
     * @param strId the value for sto_store_order.STR_ID
     *
     * @mbg.generated
     */
    public void setStrId(Integer strId) {
        this.strId = strId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sto_store_order.ORDER_ID
     *
     * @return the value of sto_store_order.ORDER_ID
     *
     * @mbg.generated
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sto_store_order.ORDER_ID
     *
     * @param orderId the value for sto_store_order.ORDER_ID
     *
     * @mbg.generated
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sto_store_order.ORDER_CREATED_TIME
     *
     * @return the value of sto_store_order.ORDER_CREATED_TIME
     *
     * @mbg.generated
     */
    public String getOrderCreatedTime() {
        return orderCreatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sto_store_order.ORDER_CREATED_TIME
     *
     * @param orderCreatedTime the value for sto_store_order.ORDER_CREATED_TIME
     *
     * @mbg.generated
     */
    public void setOrderCreatedTime(String orderCreatedTime) {
        this.orderCreatedTime = orderCreatedTime == null ? null : orderCreatedTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sto_store_order.PAID_TIME
     *
     * @return the value of sto_store_order.PAID_TIME
     *
     * @mbg.generated
     */
    public String getPaidTime() {
        return paidTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sto_store_order.PAID_TIME
     *
     * @param paidTime the value for sto_store_order.PAID_TIME
     *
     * @mbg.generated
     */
    public void setPaidTime(String paidTime) {
        this.paidTime = paidTime == null ? null : paidTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sto_store_order.LAST_MODIFIED_TIME
     *
     * @return the value of sto_store_order.LAST_MODIFIED_TIME
     *
     * @mbg.generated
     */
    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sto_store_order.LAST_MODIFIED_TIME
     *
     * @param lastModifiedTime the value for sto_store_order.LAST_MODIFIED_TIME
     *
     * @mbg.generated
     */
    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime == null ? null : lastModifiedTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sto_store_order.CREATED_BY
     *
     * @return the value of sto_store_order.CREATED_BY
     *
     * @mbg.generated
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sto_store_order.CREATED_BY
     *
     * @param createdBy the value for sto_store_order.CREATED_BY
     *
     * @mbg.generated
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sto_store_order.CREATION_DATE
     *
     * @return the value of sto_store_order.CREATION_DATE
     *
     * @mbg.generated
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sto_store_order.CREATION_DATE
     *
     * @param creationDate the value for sto_store_order.CREATION_DATE
     *
     * @mbg.generated
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sto_store_order.LAST_UPDATE_BY
     *
     * @return the value of sto_store_order.LAST_UPDATE_BY
     *
     * @mbg.generated
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sto_store_order.LAST_UPDATE_BY
     *
     * @param lastUpdateBy the value for sto_store_order.LAST_UPDATE_BY
     *
     * @mbg.generated
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sto_store_order.LAST_UPDATE_DATE
     *
     * @return the value of sto_store_order.LAST_UPDATE_DATE
     *
     * @mbg.generated
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sto_store_order.LAST_UPDATE_DATE
     *
     * @param lastUpdateDate the value for sto_store_order.LAST_UPDATE_DATE
     *
     * @mbg.generated
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sto_store_order.CALL_CNT
     *
     * @return the value of sto_store_order.CALL_CNT
     *
     * @mbg.generated
     */
    public Integer getCallCnt() {
        return callCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sto_store_order.CALL_CNT
     *
     * @param callCnt the value for sto_store_order.CALL_CNT
     *
     * @mbg.generated
     */
    public void setCallCnt(Integer callCnt) {
        this.callCnt = callCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sto_store_order.REMARK
     *
     * @return the value of sto_store_order.REMARK
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sto_store_order.REMARK
     *
     * @param remark the value for sto_store_order.REMARK
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sto_store_order.STS_CD
     *
     * @return the value of sto_store_order.STS_CD
     *
     * @mbg.generated
     */
    public String getStsCd() {
        return stsCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sto_store_order.STS_CD
     *
     * @param stsCd the value for sto_store_order.STS_CD
     *
     * @mbg.generated
     */
    public void setStsCd(String stsCd) {
        this.stsCd = stsCd == null ? null : stsCd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sto_store_order.PLATEFORM_TYPE
     *
     * @return the value of sto_store_order.PLATEFORM_TYPE
     *
     * @mbg.generated
     */
    public String getPlateformType() {
        return plateformType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sto_store_order.PLATEFORM_TYPE
     *
     * @param plateformType the value for sto_store_order.PLATEFORM_TYPE
     *
     * @mbg.generated
     */
    public void setPlateformType(String plateformType) {
        this.plateformType = plateformType == null ? null : plateformType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sto_store_order.CANCEL_COMPLETE_DATE
     *
     * @return the value of sto_store_order.CANCEL_COMPLETE_DATE
     *
     * @mbg.generated
     */
    public String getCancelCompleteDate() {
        return cancelCompleteDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sto_store_order.CANCEL_COMPLETE_DATE
     *
     * @param cancelCompleteDate the value for sto_store_order.CANCEL_COMPLETE_DATE
     *
     * @mbg.generated
     */
    public void setCancelCompleteDate(String cancelCompleteDate) {
        this.cancelCompleteDate = cancelCompleteDate == null ? null : cancelCompleteDate.trim();
    }
}