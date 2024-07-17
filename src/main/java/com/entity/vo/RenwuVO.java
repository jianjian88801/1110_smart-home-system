package com.entity.vo;

import com.entity.RenwuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 任务
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("renwu")
public class RenwuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
