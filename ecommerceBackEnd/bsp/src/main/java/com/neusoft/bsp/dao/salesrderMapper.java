package com.neusoft.bsp.dao;

import com.neusoft.bsp.model.salesrder;

public interface salesrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sao_sales_order
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer saoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sao_sales_order
     *
     * @mbg.generated
     */
    int insert(salesrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sao_sales_order
     *
     * @mbg.generated
     */
    int insertSelective(salesrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sao_sales_order
     *
     * @mbg.generated
     */
    salesrder selectByPrimaryKey(Integer saoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sao_sales_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(salesrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sao_sales_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(salesrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sao_sales_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(salesrder record);
}