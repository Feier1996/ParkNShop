package com.ten.ParkNShop.mapper;

import com.ten.ParkNShop.entity.Admin;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admins
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer adminid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admins
     *
     * @mbggenerated
     */
    int insert(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admins
     *
     * @mbggenerated
     */
    int insertSelective(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admins
     *
     * @mbggenerated
     */
    Admin selectByPrimaryKey(Integer adminid);
    
    /**
     * @Author: Archibald
     * @Date: 4:22 PM 12/6/2017
     *
     * @Description: 查找adminpassword
     * @Param:
     * @Return:
     */
    String selectAdminPassword(String adminAccount);

    /**
     * @Author: Archibald
     * @Date: 4:22 PM 12/6/2017
     *
     * @Description: 查找adminstatus
     * @Param:
     * @Return:
     */
    int selectAdminStatus(String adminAccount);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admins
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admins
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Admin record);
    
    int updateAdminStatusToActive(String adminAcount);

    int updateAdminStatusToInactive(String adminAcount);

}