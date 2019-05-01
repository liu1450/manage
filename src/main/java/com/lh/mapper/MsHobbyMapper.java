package com.lh.mapper;

import com.lh.entity.MsHobby;
import com.lh.entity.MsHobbyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsHobbyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_hobby
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int countByExample(MsHobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_hobby
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int deleteByExample(MsHobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_hobby
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int deleteByPrimaryKey(Long hobbyid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_hobby
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int insert(MsHobby record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_hobby
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int insertSelective(MsHobby record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_hobby
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    List<MsHobby> selectByExample(MsHobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_hobby
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    MsHobby selectByPrimaryKey(Long hobbyid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_hobby
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int updateByExampleSelective(@Param("record") MsHobby record, @Param("example") MsHobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_hobby
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int updateByExample(@Param("record") MsHobby record, @Param("example") MsHobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_hobby
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int updateByPrimaryKeySelective(MsHobby record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_hobby
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    int updateByPrimaryKey(MsHobby record);
}