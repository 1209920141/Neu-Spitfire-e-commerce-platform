package com.neusoft.bsp.model;

import java.math.BigDecimal;
import java.util.Date;

public class walletAccountFund {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column waf_wallet_account_fund.BUYER_ID
     *
     * @mbg.generated
     */
    private Integer buyerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column waf_wallet_account_fund.AVAILABLE_MONEY
     *
     * @mbg.generated
     */
    private BigDecimal availableMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column waf_wallet_account_fund.DEPOSITING_MONEY
     *
     * @mbg.generated
     */
    private BigDecimal depositingMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column waf_wallet_account_fund.WITHDRAWING_MONEY
     *
     * @mbg.generated
     */
    private BigDecimal withdrawingMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column waf_wallet_account_fund.CREATE_BY
     *
     * @mbg.generated
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column waf_wallet_account_fund.CREATE_TIME
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column waf_wallet_account_fund.LAST_UPDATE_BY
     *
     * @mbg.generated
     */
    private String lastUpdateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column waf_wallet_account_fund.LAST_UPDATE_TIME
     *
     * @mbg.generated
     */
    private Date lastUpdateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column waf_wallet_account_fund.CURRENCY
     *
     * @mbg.generated
     */
    private String currency;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waf_wallet_account_fund
     *
     * @mbg.generated
     */
    public walletAccountFund(Integer buyerId, BigDecimal availableMoney, BigDecimal depositingMoney, BigDecimal withdrawingMoney, String createBy, Date createTime, String lastUpdateBy, Date lastUpdateTime, String currency) {
        this.buyerId = buyerId;
        this.availableMoney = availableMoney;
        this.depositingMoney = depositingMoney;
        this.withdrawingMoney = withdrawingMoney;
        this.createBy = createBy;
        this.createTime = createTime;
        this.lastUpdateBy = lastUpdateBy;
        this.lastUpdateTime = lastUpdateTime;
        this.currency = currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waf_wallet_account_fund
     *
     * @mbg.generated
     */
    public walletAccountFund() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column waf_wallet_account_fund.BUYER_ID
     *
     * @return the value of waf_wallet_account_fund.BUYER_ID
     *
     * @mbg.generated
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column waf_wallet_account_fund.BUYER_ID
     *
     * @param buyerId the value for waf_wallet_account_fund.BUYER_ID
     *
     * @mbg.generated
     */
    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column waf_wallet_account_fund.AVAILABLE_MONEY
     *
     * @return the value of waf_wallet_account_fund.AVAILABLE_MONEY
     *
     * @mbg.generated
     */
    public BigDecimal getAvailableMoney() {
        return availableMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column waf_wallet_account_fund.AVAILABLE_MONEY
     *
     * @param availableMoney the value for waf_wallet_account_fund.AVAILABLE_MONEY
     *
     * @mbg.generated
     */
    public void setAvailableMoney(BigDecimal availableMoney) {
        this.availableMoney = availableMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column waf_wallet_account_fund.DEPOSITING_MONEY
     *
     * @return the value of waf_wallet_account_fund.DEPOSITING_MONEY
     *
     * @mbg.generated
     */
    public BigDecimal getDepositingMoney() {
        return depositingMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column waf_wallet_account_fund.DEPOSITING_MONEY
     *
     * @param depositingMoney the value for waf_wallet_account_fund.DEPOSITING_MONEY
     *
     * @mbg.generated
     */
    public void setDepositingMoney(BigDecimal depositingMoney) {
        this.depositingMoney = depositingMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column waf_wallet_account_fund.WITHDRAWING_MONEY
     *
     * @return the value of waf_wallet_account_fund.WITHDRAWING_MONEY
     *
     * @mbg.generated
     */
    public BigDecimal getWithdrawingMoney() {
        return withdrawingMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column waf_wallet_account_fund.WITHDRAWING_MONEY
     *
     * @param withdrawingMoney the value for waf_wallet_account_fund.WITHDRAWING_MONEY
     *
     * @mbg.generated
     */
    public void setWithdrawingMoney(BigDecimal withdrawingMoney) {
        this.withdrawingMoney = withdrawingMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column waf_wallet_account_fund.CREATE_BY
     *
     * @return the value of waf_wallet_account_fund.CREATE_BY
     *
     * @mbg.generated
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column waf_wallet_account_fund.CREATE_BY
     *
     * @param createBy the value for waf_wallet_account_fund.CREATE_BY
     *
     * @mbg.generated
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column waf_wallet_account_fund.CREATE_TIME
     *
     * @return the value of waf_wallet_account_fund.CREATE_TIME
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column waf_wallet_account_fund.CREATE_TIME
     *
     * @param createTime the value for waf_wallet_account_fund.CREATE_TIME
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column waf_wallet_account_fund.LAST_UPDATE_BY
     *
     * @return the value of waf_wallet_account_fund.LAST_UPDATE_BY
     *
     * @mbg.generated
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column waf_wallet_account_fund.LAST_UPDATE_BY
     *
     * @param lastUpdateBy the value for waf_wallet_account_fund.LAST_UPDATE_BY
     *
     * @mbg.generated
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column waf_wallet_account_fund.LAST_UPDATE_TIME
     *
     * @return the value of waf_wallet_account_fund.LAST_UPDATE_TIME
     *
     * @mbg.generated
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column waf_wallet_account_fund.LAST_UPDATE_TIME
     *
     * @param lastUpdateTime the value for waf_wallet_account_fund.LAST_UPDATE_TIME
     *
     * @mbg.generated
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column waf_wallet_account_fund.CURRENCY
     *
     * @return the value of waf_wallet_account_fund.CURRENCY
     *
     * @mbg.generated
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column waf_wallet_account_fund.CURRENCY
     *
     * @param currency the value for waf_wallet_account_fund.CURRENCY
     *
     * @mbg.generated
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }
}