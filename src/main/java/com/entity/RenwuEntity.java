package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 任务
 *
 * @author 
 * @email
 */
@TableName("renwu")
public class RenwuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public RenwuEntity() {

	}

	public RenwuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 家具
     */
    @TableField(value = "jiaju_id")

    private Integer jiajuId;


    /**
     * 任务编号
     */
    @TableField(value = "renwu_uuid_number")

    private String renwuUuidNumber;


    /**
     * 任务名称
     */
    @TableField(value = "renwu_name")

    private String renwuName;


    /**
     * 任务介绍
     */
    @TableField(value = "renwu_content")

    private String renwuContent;


    /**
     * 执行状态
     */
    @TableField(value = "zhixingzhuangtai_types")

    private Integer zhixingzhuangtaiTypes;


    /**
     * 任务状态
     */
    @TableField(value = "renwuzhuangtai_types")

    private Integer renwuzhuangtaiTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "renwu_delete")

    private Integer renwuDelete;


    /**
     * 执行时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "zhixing_time")

    private Date zhixingTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：家具
	 */
    public Integer getJiajuId() {
        return jiajuId;
    }
    /**
	 * 获取：家具
	 */

    public void setJiajuId(Integer jiajuId) {
        this.jiajuId = jiajuId;
    }
    /**
	 * 设置：任务编号
	 */
    public String getRenwuUuidNumber() {
        return renwuUuidNumber;
    }
    /**
	 * 获取：任务编号
	 */

    public void setRenwuUuidNumber(String renwuUuidNumber) {
        this.renwuUuidNumber = renwuUuidNumber;
    }
    /**
	 * 设置：任务名称
	 */
    public String getRenwuName() {
        return renwuName;
    }
    /**
	 * 获取：任务名称
	 */

    public void setRenwuName(String renwuName) {
        this.renwuName = renwuName;
    }
    /**
	 * 设置：任务介绍
	 */
    public String getRenwuContent() {
        return renwuContent;
    }
    /**
	 * 获取：任务介绍
	 */

    public void setRenwuContent(String renwuContent) {
        this.renwuContent = renwuContent;
    }
    /**
	 * 设置：执行状态
	 */
    public Integer getZhixingzhuangtaiTypes() {
        return zhixingzhuangtaiTypes;
    }
    /**
	 * 获取：执行状态
	 */

    public void setZhixingzhuangtaiTypes(Integer zhixingzhuangtaiTypes) {
        this.zhixingzhuangtaiTypes = zhixingzhuangtaiTypes;
    }
    /**
	 * 设置：任务状态
	 */
    public Integer getRenwuzhuangtaiTypes() {
        return renwuzhuangtaiTypes;
    }
    /**
	 * 获取：任务状态
	 */

    public void setRenwuzhuangtaiTypes(Integer renwuzhuangtaiTypes) {
        this.renwuzhuangtaiTypes = renwuzhuangtaiTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getRenwuDelete() {
        return renwuDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setRenwuDelete(Integer renwuDelete) {
        this.renwuDelete = renwuDelete;
    }
    /**
	 * 设置：执行时间
	 */
    public Date getZhixingTime() {
        return zhixingTime;
    }
    /**
	 * 获取：执行时间
	 */

    public void setZhixingTime(Date zhixingTime) {
        this.zhixingTime = zhixingTime;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Renwu{" +
            "id=" + id +
            ", jiajuId=" + jiajuId +
            ", renwuUuidNumber=" + renwuUuidNumber +
            ", renwuName=" + renwuName +
            ", renwuContent=" + renwuContent +
            ", zhixingzhuangtaiTypes=" + zhixingzhuangtaiTypes +
            ", renwuzhuangtaiTypes=" + renwuzhuangtaiTypes +
            ", renwuDelete=" + renwuDelete +
            ", zhixingTime=" + zhixingTime +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
