package com.entity.vo;

import com.entity.JiajuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 家具
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiaju")
public class JiajuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
