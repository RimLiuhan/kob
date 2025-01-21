import NotFound from '@/views/error/NotFound.vue'
import PkIndexView from '@/views/pk/PkIndexView.vue'
import RanklistIndexView from '@/views/ranklist/RanklistIndexView.vue'
import RecordIndexView from '@/views/record/RecordIndexView.vue'
import UserAccountLogin from '@/views/user/account/UserAccountLogin.vue'
import UserAccountRegister from '@/views/user/account/UserAccountRegister.vue'
import UserBotIndexView from '@/views/user/bot/UserBotIndexView.vue'
import { createRouter, createWebHistory } from 'vue-router'
import store from '@/store/index'

const routes = [
  {
    path: "/",
    name: "home",
    redirect: "/pk/",
    meta: {
      requestAuth: true
    }
  },
  {
    path: "/pk/",
    name: "pk_index",
    component: PkIndexView,
    meta: {
      requestAuth: true
    }
  },
  {
    path: "/record/",
    name: "record_index",
    component: RecordIndexView,
    meta: {
      requestAuth: true
    }
  },
  {
    path: "/ranklist/",
    name: "ranklist_index",
    component: RanklistIndexView,
    meta: {
      requestAuth: true
    }
  },
  {
    path: "/user/bot/",
    name: "user_bot_index",
    component: UserBotIndexView,
    meta: {
      requestAuth: true
    }
  },
  {
    path: "/404/",
    name: "404",
    component: NotFound,
    meta: {
      requestAuth: false
    }
  },
  {
    path: "/:catchAll(.*)",
    redirect: "/404/",
  },
  {
    path: "/user/account/login/",
    name: "user_account_login",
    component: UserAccountLogin,
    meta: {
      requestAuth: false
    }
  },
  {
    path: "/user/account/register/",
    name: "user_account_register",
    component: UserAccountRegister,
    meta: {
      requestAuth: false
    }
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

// router.beforeEach((to, from, next) => {
//   if (to.meta.requestAuth && !store.state.user.is_login) {
//     next({name: "user_account_login"});
//   } else {
//     next();
//   }
// })

router.beforeEach((to,from,next)=>{
  const jwt_token = localStorage.getItem('jwt_token');
  if(jwt_token){
    store.commit('updateToken',jwt_token);
    store.dispatch('getinfo',{
      success(){
        next();
      },
      error(){
        // console.log(store.state.user);
        store.dispatch('logout');
        alert("token无效，请重新登录！");
        next({name:"user_account_login"});
      }
    })
  }else{
    if(to.meta.requestAuth && !store.state.user.is_login){
      next({name:"user_account_login"});
    }else{
      next();
    }
  }
})

export default router
