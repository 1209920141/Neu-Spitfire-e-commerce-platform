package com.neusoft.bsp.dao;

import com.neusoft.bsp.model.product;

public interface productMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_product
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer proId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_product
     *
     * @mbg.generated
     */
    int insert(product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_product
     *
     * @mbg.generated
     */
    int insertSelective(product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_product
     *
     * @mbg.generated
     */
    product selectByPrimaryKey(Integer proId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(product record);
}