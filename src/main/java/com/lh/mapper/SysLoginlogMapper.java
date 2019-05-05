package com.lh.mapper;

import com.lh.entity.SysLoginlog;
import com.lh.entity.SysLoginlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLoginlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_loginlog
     *
     * @mbggenerated Fri May 03 20:59:56 CST 2019
     */
    int countByExample(SysLoginlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_loginlog
     *
     * @mbggenerated Fri May 03 20:59:56 CST 2019
     */
    int deleteByExample(SysLoginlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_loginlog
     *
     * @mbggenerated Fri May 03 20:59:56 CST 2019
     */
    int deleteByPrimaryKey(Integer logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_loginlog
     *
     * @mbggenerated Fri May 03 20:59:56 CST 2019
     */
    int insert(SysLoginlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_loginlog
     *
     * @mbggenerated Fri May 03 20:59:56 CST 2019
     */
    int insertSelective(SysLoginlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_loginlog
     *
     * @mbggenerated Fri May 03 20:59:56 CST 2019
     */
    List<SysLoginlog> selectByExample(SysLoginlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_loginlog
     *
     * @mbggenerated Fri May 03 20:59:56 CST 2019
     */
    SysLoginlog selectByPrimaryKey(Integer logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_loginlog
     *
     * @mbggenerated Fri May 03 20:59:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") SysLoginlog record, @Param("example") SysLoginlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_loginlog
     *
     * @mbggenerated Fri May 03 20:59:56 CST 2019
     */
    int updateByExample(@Param("record") SysLoginlog record, @Param("example") SysLoginlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_loginlog
     *
     * @mbggenerated Fri May 03 20:59:56 CST 2019
     */
    int updateByPrimaryKeySelective(SysLoginlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_loginlog
     *
     * @mbggenerated Fri May 03 20:59:56 CST 2019
     */
    int updateByPrimaryKey(SysLoginlog record);
}