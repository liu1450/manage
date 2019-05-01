package com.lh.mapper;

import com.lh.entity.MsNotice;
import com.lh.entity.MsNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsNoticeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_notice
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int countByExample(MsNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_notice
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int deleteByExample(MsNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_notice
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int deleteByPrimaryKey(Long noticeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_notice
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int insert(MsNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_notice
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int insertSelective(MsNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_notice
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    List<MsNotice> selectByExample(MsNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_notice
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    MsNotice selectByPrimaryKey(Long noticeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_notice
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int updateByExampleSelective(@Param("record") MsNotice record, @Param("example") MsNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_notice
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int updateByExample(@Param("record") MsNotice record, @Param("example") MsNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_notice
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int updateByPrimaryKeySelective(MsNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_notice
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int updateByPrimaryKey(MsNotice record);
}