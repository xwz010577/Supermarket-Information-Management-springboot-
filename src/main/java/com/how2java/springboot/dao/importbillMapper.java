package com.how2java.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.how2java.springboot.pojo.importbill;
import com.how2java.springboot.pojo.importbillExample;
@Mapper
public interface importbillMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table importbill
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    long countByExample(importbillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table importbill
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    int deleteByExample(importbillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table importbill
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    int deleteByPrimaryKey(String imortbillid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table importbill
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    int insert(importbill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table importbill
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    int insertSelective(importbill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table importbill
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    List<importbill> selectByExampleWithBLOBs(importbillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table importbill
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    List<importbill> selectByExample(@Param(value = "page") Integer page,@Param(value = "limit") Integer limit);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table importbill
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    importbill selectByPrimaryKey(@Param("imortbillid")String  imortbillid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table importbill
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    int updateByExampleSelective(@Param("record") importbill record, @Param("example") importbillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table importbill
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") importbill record, @Param("example") importbillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table importbill
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    int updateByExample(@Param("record") importbill record, @Param("example") importbillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table importbill
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    int updateByPrimaryKeySelective(importbill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table importbill
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(importbill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table importbill
     *
     * @mbg.generated Fri Mar 13 11:23:59 CST 2020
     */
    int updateByPrimaryKey(importbill record);
}