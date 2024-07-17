import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import jiaju from '@/views/modules/jiaju/list'
    import renwu from '@/views/modules/renwu/list'
    import yonghu from '@/views/modules/yonghu/list'
    import dictionaryJiaju from '@/views/modules/dictionaryJiaju/list'
    import dictionaryQuyu from '@/views/modules/dictionaryQuyu/list'
    import dictionaryRenwuzhuangtai from '@/views/modules/dictionaryRenwuzhuangtai/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryZhixingzhuangtai from '@/views/modules/dictionaryZhixingzhuangtai/list'
    import dictionaryZhuangtai from '@/views/modules/dictionaryZhuangtai/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryJiaju',
        name: '家具类型',
        component: dictionaryJiaju
    }
    ,{
        path: '/dictionaryQuyu',
        name: '区域',
        component: dictionaryQuyu
    }
    ,{
        path: '/dictionaryRenwuzhuangtai',
        name: '任务状态',
        component: dictionaryRenwuzhuangtai
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryZhixingzhuangtai',
        name: '执行状态',
        component: dictionaryZhixingzhuangtai
    }
    ,{
        path: '/dictionaryZhuangtai',
        name: '状态',
        component: dictionaryZhuangtai
    }


    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/jiaju',
        name: '家具',
        component: jiaju
      }
    ,{
        path: '/renwu',
        name: '任务',
        component: renwu
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
