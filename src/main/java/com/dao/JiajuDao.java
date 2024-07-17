package com.dao;

import com.entity.JiajuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiajuView;

/**
 * 家具 Dao 接口
 *
 * @author 
 */
public interface JiajuDao extends BaseMapper<JiajuEntity> {

   List<JiajuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
