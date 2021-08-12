package cn.kdcrm.service;

import cn.kdcrm.pojo.SystemRole;

import java.util.List;

public interface SystemRoleService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_ROLE
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_ROLE
     *
     * @mbggenerated
     */
    int insert(SystemRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_ROLE
     *
     * @mbggenerated
     */
    SystemRole selectByPrimaryKey(String roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_ROLE
     *
     * @mbggenerated
     */
    List<SystemRole> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_ROLE
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SystemRole record);
}
