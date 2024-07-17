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
 * 家具
 *
 * @author 
 * @email
 */
@TableName("jiaju")
public class JiajuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiajuEntity() {

	}

	public JiajuEntity(T t) {
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
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 家具编号
     */
    @TableField(value = "jiaju_uuid_number")

    private String jiajuUuidNumber;


    /**
     * 家具名称
     */
    @TableField(value = "jiaju_name")

    private String jiajuName;


    /**
     * 家具照片
     */
    @TableField(value = "jiaju_photo")

    private String jiajuPhoto;


    /**
     * 家具类型
     */
    @TableField(value = "jiaju_types")

    private Integer jiajuTypes;


    /**
     * 区域
     */
    @TableField(value = "quyu_types")

    private Integer quyuTypes;


    /**
     * 家具介绍
     */
    @TableField(value = "jiaju_content")

    private String jiajuContent;


    /**
     * 状态
     */
    @TableField(value = "zhuangtai_types")

    private Integer zhuangtaiTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "jiaju_delete")

    private Integer jiajuDelete;


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
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：家具编号
	 */
    public String getJiajuUuidNumber() {
        return jiajuUuidNumber;
    }
    /**
	 * 获取：家具编号
	 */

    public void setJiajuUuidNumber(String jiajuUuidNumber) {
        this.jiajuUuidNumber = jiajuUuidNumber;
    }
    /**
	 * 设置：家具名称
	 */
    public String getJiajuName() {
        return jiajuName;
    }
    /**
	 * 获取：家具名称
	 */

    public void setJiajuName(String jiajuName) {
        this.jiajuName = jiajuName;
    }
    /**
	 * 设置：家具照片
	 */
    public String getJiajuPhoto() {
        return jiajuPhoto;
    }
    /**
	 * 获取：家具照片
	 */

    public void setJiajuPhoto(String jiajuPhoto) {
        this.jiajuPhoto = jiajuPhoto;
    }
    /**
	 * 设置：家具类型
	 */
    public Integer getJiajuTypes() {
        return jiajuTypes;
    }
    /**
	 * 获取：家具类型
	 */

    public void setJiajuTypes(Integer jiajuTypes) {
        this.jiajuTypes = jiajuTypes;
    }
    /**
	 * 设置：区域
	 */
    public Integer getQuyuTypes() {
        return quyuTypes;
    }
    /**
	 * 获取：区域
	 */

    public void setQuyuTypes(Integer quyuTypes) {
        this.quyuTypes = quyuTypes;
    }
    /**
	 * 设置：家具介绍
	 */
    public String getJiajuContent() {
        return jiajuContent;
    }
    /**
	 * 获取：家具介绍
	 */

    public void setJiajuContent(String jiajuContent) {
        this.jiajuContent = jiajuContent;
    }
    /**
	 * 设置：状态
	 */
    public Integer getZhuangtaiTypes() {
        return zhuangtaiTypes;
    }
    /**
	 * 获取：状态
	 */

    public void setZhuangtaiTypes(Integer zhuangtaiTypes) {
        this.zhuangtaiTypes = zhuangtaiTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getJiajuDelete() {
        return jiajuDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setJiajuDelete(Integer jiajuDelete) {
        this.jiajuDelete = jiajuDelete;
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
        return "Jiaju{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", jiajuUuidNumber=" + jiajuUuidNumber +
            ", jiajuName=" + jiajuName +
            ", jiajuPhoto=" + jiajuPhoto +
            ", jiajuTypes=" + jiajuTypes +
            ", quyuTypes=" + quyuTypes +
            ", jiajuContent=" + jiajuContent +
            ", zhuangtaiTypes=" + zhuangtaiTypes +
            ", jiajuDelete=" + jiajuDelete +
            ", createTime=" + createTime +
        "}";
    }
}
