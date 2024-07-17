package com.thread;

import com.entity.JiajuEntity;
import com.entity.RenwuEntity;
import com.entity.view.RenwuView;
import com.service.JiajuService;
import com.service.RenwuService;
import com.utils.PageUtils;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 线程执行方法（做一些项目启动后 一直要执行的操作，比如根据时间自动更改订单状态，比如订单签收30天自动收货功能，比如根据时间来更改状态）
 */
public class MyThreadMethod extends Thread  {
    private RenwuService renwuService;
    private JiajuService jiajuService;
    public void run() {
        while (!this.isInterrupted()) {// 线程未中断执行循环

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            Calendar instance = Calendar.getInstance();
            instance.setTime(date);
            instance.add(Calendar.SECOND,5);
            Date endTime = instance.getTime();

            instance.add(Calendar.SECOND,-10);
            Date stateTime = instance.getTime();

            Map<String, Object> params = new HashMap<>();
            params.put("renwuDeleteStart",1);params.put("renwuDeleteEnd",1);
            params.put("zhixingTimeStart",sdf.format(stateTime));
            params.put("zhixingTimeEnd",sdf.format(endTime));
            params.put("renwuzhuangtaiTypes",1);
            params.put("page","1");
            params.put("limit","10");
            if(params.get("orderBy")==null || params.get("orderBy")==""){
                params.put("orderBy","id");
            }
            PageUtils page = renwuService.queryPage(params);
            List<RenwuView> list = (List<RenwuView>)page.getList();
            if(list != null && list.size()>0){
                List jiajuEntityList = new ArrayList<JiajuEntity>();
                List renwuEntityList = new ArrayList<RenwuEntity>();

                for(RenwuView r:list){
                    RenwuEntity renwuEntity = new RenwuEntity();
                    renwuEntity.setId(r.getId());
                    renwuEntity.setRenwuzhuangtaiTypes(2);

                    renwuEntityList.add(renwuEntity);

                    JiajuEntity jiajuEntity = new JiajuEntity();
                    jiajuEntity.setId(r.getJiajuId());
                    jiajuEntity.setZhuangtaiTypes(r.getZhixingzhuangtaiTypes());
                    jiajuEntityList.add(jiajuEntity);
                }

                jiajuService.updateBatchById(jiajuEntityList);//更新家具
                renwuService.updateBatchById(renwuEntityList);//更新任务

            }



            try {
                Thread.sleep(1000); //每隔1000ms执行一次
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//			 ------------------ 开始执行 ---------------------------
//            System.out.println("线程执行中:" + System.currentTimeMillis());
        }
    }

    public RenwuService getRenwuService() {
        return renwuService;
    }

    public void setRenwuService(RenwuService renwuService) {
        this.renwuService = renwuService;
    }

    public JiajuService getJiajuService() {
        return jiajuService;
    }

    public void setJiajuService(JiajuService jiajuService) {
        this.jiajuService = jiajuService;
    }
}
