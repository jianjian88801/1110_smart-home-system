package com.entity.view;

import com.entity.RenwuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 任务
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("renwu")
public class RenwuView extends RenwuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 执行状态的值
		*/
		private String zhixingzhuangtaiValue;
		/**
		* 任务状态的值
		*/
		private String renwuzhuangtaiValue;



		//级联表 jiaju
			/**
			* 家具 的 用户
			*/
			private Integer jiajuYonghuId;
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
				* 家具类型的值
				*/
				private String jiajuValue;
			/**
			* 区域
			*/
			private Integer quyuTypes;
				/**
				* 区域的值
				*/
				private String quyuValue;
			/**
			* 家具介绍
			*/
			private String jiajuContent;
			/**
			* 状态
			*/
			private Integer zhuangtaiTypes;
				/**
				* 状态的值
				*/
				private String zhuangtaiValue;
			/**
			* 逻辑删除
			*/
			private Integer jiajuDelete;

	public RenwuView() {

	}

	public RenwuView(RenwuEntity renwuEntity) {
		try {
			BeanUtils.copyProperties(this, renwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 执行状态的值
			*/
			public String getZhixingzhuangtaiValue() {
				return zhixingzhuangtaiValue;
			}
			/**
			* 设置： 执行状态的值
			*/
			public void setZhixingzhuangtaiValue(String zhixingzhuangtaiValue) {
				this.zhixingzhuangtaiValue = zhixingzhuangtaiValue;
			}
			/**
			* 获取： 任务状态的值
			*/
			public String getRenwuzhuangtaiValue() {
				return renwuzhuangtaiValue;
			}
			/**
			* 设置： 任务状态的值
			*/
			public void setRenwuzhuangtaiValue(String renwuzhuangtaiValue) {
				this.renwuzhuangtaiValue = renwuzhuangtaiValue;
			}






				//级联表的get和set jiaju

					/**
					* 获取：家具 的 用户
					*/
					public Integer getJiajuYonghuId() {
						return jiajuYonghuId;
					}
					/**
					* 设置：家具 的 用户
					*/
					public void setJiajuYonghuId(Integer jiajuYonghuId) {
						this.jiajuYonghuId = jiajuYonghuId;
					}


					/**
					* 获取： 家具编号
					*/
					public String getJiajuUuidNumber() {
						return jiajuUuidNumber;
					}
					/**
					* 设置： 家具编号
					*/
					public void setJiajuUuidNumber(String jiajuUuidNumber) {
						this.jiajuUuidNumber = jiajuUuidNumber;
					}

					/**
					* 获取： 家具名称
					*/
					public String getJiajuName() {
						return jiajuName;
					}
					/**
					* 设置： 家具名称
					*/
					public void setJiajuName(String jiajuName) {
						this.jiajuName = jiajuName;
					}

					/**
					* 获取： 家具照片
					*/
					public String getJiajuPhoto() {
						return jiajuPhoto;
					}
					/**
					* 设置： 家具照片
					*/
					public void setJiajuPhoto(String jiajuPhoto) {
						this.jiajuPhoto = jiajuPhoto;
					}

					/**
					* 获取： 家具类型
					*/
					public Integer getJiajuTypes() {
						return jiajuTypes;
					}
					/**
					* 设置： 家具类型
					*/
					public void setJiajuTypes(Integer jiajuTypes) {
						this.jiajuTypes = jiajuTypes;
					}


						/**
						* 获取： 家具类型的值
						*/
						public String getJiajuValue() {
							return jiajuValue;
						}
						/**
						* 设置： 家具类型的值
						*/
						public void setJiajuValue(String jiajuValue) {
							this.jiajuValue = jiajuValue;
						}

					/**
					* 获取： 区域
					*/
					public Integer getQuyuTypes() {
						return quyuTypes;
					}
					/**
					* 设置： 区域
					*/
					public void setQuyuTypes(Integer quyuTypes) {
						this.quyuTypes = quyuTypes;
					}


						/**
						* 获取： 区域的值
						*/
						public String getQuyuValue() {
							return quyuValue;
						}
						/**
						* 设置： 区域的值
						*/
						public void setQuyuValue(String quyuValue) {
							this.quyuValue = quyuValue;
						}

					/**
					* 获取： 家具介绍
					*/
					public String getJiajuContent() {
						return jiajuContent;
					}
					/**
					* 设置： 家具介绍
					*/
					public void setJiajuContent(String jiajuContent) {
						this.jiajuContent = jiajuContent;
					}

					/**
					* 获取： 状态
					*/
					public Integer getZhuangtaiTypes() {
						return zhuangtaiTypes;
					}
					/**
					* 设置： 状态
					*/
					public void setZhuangtaiTypes(Integer zhuangtaiTypes) {
						this.zhuangtaiTypes = zhuangtaiTypes;
					}


						/**
						* 获取： 状态的值
						*/
						public String getZhuangtaiValue() {
							return zhuangtaiValue;
						}
						/**
						* 设置： 状态的值
						*/
						public void setZhuangtaiValue(String zhuangtaiValue) {
							this.zhuangtaiValue = zhuangtaiValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getJiajuDelete() {
						return jiajuDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setJiajuDelete(Integer jiajuDelete) {
						this.jiajuDelete = jiajuDelete;
					}






}
