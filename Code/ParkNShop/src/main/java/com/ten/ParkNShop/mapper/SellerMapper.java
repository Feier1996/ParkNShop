package com.ten.ParkNShop.mapper;

import com.ten.ParkNShop.entity.Seller;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SellerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer sellerid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller
     *
     * @mbggenerated
     */
    int insert(Seller record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller
     *
     * @mbggenerated
     */
    int insertSelective(Seller record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller
     *
     * @mbggenerated
     */
    Seller selectByPrimaryKey(Integer sellerid);

    Seller selectByShopname(String shopname);

    Seller selectBySellername(String sellername);


    int selectShopStatus(int sellerId);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Seller record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Seller seller);

    int updateShopStatusToWaitToApproved(int sellerId);

    int updateShopStatusToApproved(int sellerId);

    int updateShopStatusToUnapproved(int sellerId);

    int updateShopStatusToBan(int sellerId);
    int sellerRegister(Seller seller);

    Seller findBySellerEmail(@Param("sellerEmail") String sellerEmail,@Param("sellerPassword") String sellerPassword);

    int findByEmail(String sellerEmail);

    List<Seller> selectAllRegisterShop(@Param("start")int start,@Param("pageSize")int pageSize);
    List<Seller> selectAllApprovedShop(@Param("start")int start,@Param("pageSize")int pageSize);
    List<Seller> selectAllUnapprovedShop(@Param("start")int start,@Param("pageSize")int pageSize);
    List<Seller> selectAllBlacklistShop(@Param("start")int start,@Param("pageSize")int pageSize);



}