package com.ego.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbItemParamItem  implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_param_item.id
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_param_item.item_id
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    private Long itemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_param_item.created
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_param_item.updated
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    private Date updated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_param_item.param_data
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    private String paramData;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_param_item.id
     *
     * @return the value of tb_item_param_item.id
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_param_item.id
     *
     * @param id the value for tb_item_param_item.id
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_param_item.item_id
     *
     * @return the value of tb_item_param_item.item_id
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_param_item.item_id
     *
     * @param itemId the value for tb_item_param_item.item_id
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_param_item.created
     *
     * @return the value of tb_item_param_item.created
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_param_item.created
     *
     * @param created the value for tb_item_param_item.created
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_param_item.updated
     *
     * @return the value of tb_item_param_item.updated
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_param_item.updated
     *
     * @param updated the value for tb_item_param_item.updated
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_param_item.param_data
     *
     * @return the value of tb_item_param_item.param_data
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    public String getParamData() {
        return paramData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_param_item.param_data
     *
     * @param paramData the value for tb_item_param_item.param_data
     *
     * @mbggenerated Wed Sep 18 10:20:34 CST 2019
     */
    public void setParamData(String paramData) {
        this.paramData = paramData == null ? null : paramData.trim();
    }
}