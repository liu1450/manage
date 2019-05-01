package com.lh.mapper;

import com.lh.entity.DccProvinces;
import com.lh.entity.DccProvincesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DccProvincesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_provinces
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int countByExample(DccProvincesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_provinces
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int deleteByExample(DccProvincesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_provinces
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_provinces
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int insert(DccProvinces record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_provinces
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int insertSelective(DccProvinces record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_provinces
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    List<DccProvinces> selectByExample(DccProvincesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_provinces
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    DccProvinces selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_provinces
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int updateByExampleSelective(@Param("record") DccProvinces record, @Param("example") DccProvincesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_provinces
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int updateByExample(@Param("record") DccProvinces record, @Param("example") DccProvincesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_provinces
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int updateByPrimaryKeySelective(DccProvinces record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_provinces
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int updateByPrimaryKey(DccProvinces record);
}