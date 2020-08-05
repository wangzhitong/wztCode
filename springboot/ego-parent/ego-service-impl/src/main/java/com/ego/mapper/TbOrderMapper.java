package com.ego.mapper;

import com.ego.pojo.TbOrder;
import com.ego.pojo.TbOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    int countByExample(TbOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    int deleteByExample(TbOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    int insert(TbOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    int insertSelective(TbOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    List<TbOrder> selectByExample(TbOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    TbOrder selectByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    int updateByExampleSelective(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    int updateByExample(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    int updateByPrimaryKeySelective(TbOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    int updateByPrimaryKey(TbOrder record);
}