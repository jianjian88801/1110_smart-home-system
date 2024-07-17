
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 家具
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/jiaju")
public class JiajuController {
    private static final Logger logger = LoggerFactory.getLogger(JiajuController.class);

    @Autowired
    private JiajuService jiajuService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private YonghuService yonghuService;



    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        params.put("jiajuDeleteStart",1);params.put("jiajuDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = jiajuService.queryPage(params);

        //字典表数据转换
        List<JiajuView> list =(List<JiajuView>)page.getList();
        for(JiajuView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JiajuEntity jiaju = jiajuService.selectById(id);
        if(jiaju !=null){
            //entity转view
            JiajuView view = new JiajuView();
            BeanUtils.copyProperties( jiaju , view );//把实体数据重构到view中

                //级联表
                YonghuEntity yonghu = yonghuService.selectById(jiaju.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody JiajuEntity jiaju, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,jiaju:{}",this.getClass().getName(),jiaju.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            jiaju.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<JiajuEntity> queryWrapper = new EntityWrapper<JiajuEntity>()
            .eq("yonghu_id", jiaju.getYonghuId())
            .eq("jiaju_uuid_number", jiaju.getJiajuUuidNumber())
            .eq("jiaju_name", jiaju.getJiajuName())
            .eq("jiaju_types", jiaju.getJiajuTypes())
            .eq("quyu_types", jiaju.getQuyuTypes())
            .eq("zhuangtai_types", jiaju.getZhuangtaiTypes())
            .eq("jiaju_delete", jiaju.getJiajuDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JiajuEntity jiajuEntity = jiajuService.selectOne(queryWrapper);
        if(jiajuEntity==null){
            jiaju.setJiajuDelete(1);
            jiaju.setCreateTime(new Date());
            jiajuService.insert(jiaju);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody JiajuEntity jiaju, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,jiaju:{}",this.getClass().getName(),jiaju.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            jiaju.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<JiajuEntity> queryWrapper = new EntityWrapper<JiajuEntity>()
            .notIn("id",jiaju.getId())
            .andNew()
            .eq("yonghu_id", jiaju.getYonghuId())
            .eq("jiaju_uuid_number", jiaju.getJiajuUuidNumber())
            .eq("jiaju_name", jiaju.getJiajuName())
            .eq("jiaju_types", jiaju.getJiajuTypes())
            .eq("quyu_types", jiaju.getQuyuTypes())
            .eq("zhuangtai_types", jiaju.getZhuangtaiTypes())
            .eq("jiaju_delete", jiaju.getJiajuDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JiajuEntity jiajuEntity = jiajuService.selectOne(queryWrapper);
        if("".equals(jiaju.getJiajuPhoto()) || "null".equals(jiaju.getJiajuPhoto())){
                jiaju.setJiajuPhoto(null);
        }
        if(jiajuEntity==null){
            jiajuService.updateById(jiaju);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        ArrayList<JiajuEntity> list = new ArrayList<>();
        for(Integer id:ids){
            JiajuEntity jiajuEntity = new JiajuEntity();
            jiajuEntity.setId(id);
            jiajuEntity.setJiajuDelete(2);
            list.add(jiajuEntity);
        }
        if(list != null && list.size() >0){
            jiajuService.updateBatchById(list);
        }
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<JiajuEntity> jiajuList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            JiajuEntity jiajuEntity = new JiajuEntity();
//                            jiajuEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            jiajuEntity.setJiajuUuidNumber(data.get(0));                    //家具编号 要改的
//                            jiajuEntity.setJiajuName(data.get(0));                    //家具名称 要改的
//                            jiajuEntity.setJiajuPhoto("");//详情和图片
//                            jiajuEntity.setJiajuTypes(Integer.valueOf(data.get(0)));   //家具类型 要改的
//                            jiajuEntity.setQuyuTypes(Integer.valueOf(data.get(0)));   //区域 要改的
//                            jiajuEntity.setJiajuContent("");//详情和图片
//                            jiajuEntity.setZhuangtaiTypes(Integer.valueOf(data.get(0)));   //状态 要改的
//                            jiajuEntity.setJiajuDelete(1);//逻辑删除字段
//                            jiajuEntity.setCreateTime(date);//时间
                            jiajuList.add(jiajuEntity);


                            //把要查询是否重复的字段放入map中
                                //家具编号
                                if(seachFields.containsKey("jiajuUuidNumber")){
                                    List<String> jiajuUuidNumber = seachFields.get("jiajuUuidNumber");
                                    jiajuUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> jiajuUuidNumber = new ArrayList<>();
                                    jiajuUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("jiajuUuidNumber",jiajuUuidNumber);
                                }
                        }

                        //查询是否重复
                         //家具编号
                        List<JiajuEntity> jiajuEntities_jiajuUuidNumber = jiajuService.selectList(new EntityWrapper<JiajuEntity>().in("jiaju_uuid_number", seachFields.get("jiajuUuidNumber")).eq("jiaju_delete", 1));
                        if(jiajuEntities_jiajuUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(JiajuEntity s:jiajuEntities_jiajuUuidNumber){
                                repeatFields.add(s.getJiajuUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [家具编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        jiajuService.insertBatch(jiajuList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
