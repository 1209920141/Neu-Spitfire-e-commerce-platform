package com.neusoft.bsp.dao;

import com.neusoft.bsp.model.productDescrition;

public interface productDescritionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdn_product_descrition
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer pdnId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdn_product_descrition
     *
     * @mbg.generated
     */
    int insert(productDescrition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdn_product_descrition
     *
     * @mbg.generated
     */
    int insertSelective(productDescrition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdn_product_descrition
     *
     * @mbg.generated
     */
    productDescrition selectByPrimaryKey(Integer pdnId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdn_product_descrition
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(productDescrition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdn_product_descrition
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(productDescrition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdn_product_descrition
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(productDescrition record);
}