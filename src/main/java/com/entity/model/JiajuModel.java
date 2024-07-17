package com.entity.model;

import com.entity.JiajuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 家具
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiajuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 家具编号
     */
    private String jiajuUuidNumber;


    /**
     * 家具名称
     */
    private String jiajuName;


    /**
     * 家具照片
     */
    private String jiajuPhoto;


    /**
     * 家具类型
     */
    private Integer jiajuTypes;


    /**
     * 区域
     */
    private Integer quyuTypes;


    /**
     * 家具介绍
     */
    private String jiajuContent;


    /**
     * 状态
     */
    private Integer zhuangtaiTypes;


    /**
     * 逻辑删除
     */
    private Integer jiajuDelete;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：家具编号
	 */
    public String getJiajuUuidNumber() {
        return jiajuUuidNumber;
    }


    /**
	 * 设置：家具编号
	 */
    public void setJiajuUuidNumber(String jiajuUuidNumber) {
        this.jiajuUuidNumber = jiajuUuidNumber;
    }
    /**
	 * 获取：家具名称
	 */
    public String getJiajuName() {
        return jiajuName;
    }


    /**
	 * 设置：家具名称
	 */
    public void setJiajuName(String jiajuName) {
        this.jiajuName = jiajuName;
    }
    /**
	 * 获取：家具照片
	 */
    public String getJiajuPhoto() {
        return jiajuPhoto;
    }


    /**
	 * 设置：家具照片
	 */
    public void setJiajuPhoto(String jiajuPhoto) {
        this.jiajuPhoto = jiajuPhoto;
    }
    /**
	 * 获取：家具类型
	 */
    public Integer getJiajuTypes() {
        return jiajuTypes;
    }


    /**
	 * 设置：家具类型
	 */
    public void setJiajuTypes(Integer jiajuTypes) {
        this.jiajuTypes = jiajuTypes;
    }
    /**
	 * 获取：区域
	 */
    public Integer getQuyuTypes() {
        return quyuTypes;
    }


    /**
	 * 设置：区域
	 */
    public void setQuyuTypes(Integer quyuTypes) {
        this.quyuTypes = quyuTypes;
    }
    /**
	 * 获取：家具介绍
	 */
    public String getJiajuContent() {
        return jiajuContent;
    }


    /**
	 * 设置：家具介绍
	 */
    public void setJiajuContent(String jiajuContent) {
        this.jiajuContent = jiajuContent;
    }
    /**
	 * 获取：状态
	 */
    public Integer getZhuangtaiTypes() {
        return zhuangtaiTypes;
    }


    /**
	 * 设置：状态
	 */
    public void setZhuangtaiTypes(Integer zhuangtaiTypes) {
        this.zhuangtaiTypes = zhuangtaiTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getJiajuDelete() {
        return jiajuDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setJiajuDelete(Integer jiajuDelete) {
        this.jiajuDelete = jiajuDelete;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
