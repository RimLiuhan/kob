import NotFound from '@/views/error/NotFound.vue'
import PkIndexView from '@/views/pk/PkIndexView.vue'
import RanklistIndexView from '@/views/ranklist/RanklistIndexView.vue'
import RecordIndexView from '@/views/record/RecordIndexView.vue'
import UserAccountLogin from '@/views/user/account/UserAccountLogin.vue'
import UserAccountRegister from '@/views/user/account/UserAccountRegister.vue'
import UserBotIndexView from '@/views/user/bot/UserBotIndexView.vue'
import { createRouter, createWebHistory } from 'vue-router'

const routes = [
  {
    path: "/",
    name: "home",
    redirect: "/pk/"
  },
  {
    path: "/pk/",
    name: "pk_index",
    component: PkIndexView,
  },
  {
    path: "/record/",
    name: "record_index",
    component: RecordIndexView,
  },
  {
    path: "/ranklist/",
    name: "ranklist_index",
    component: RanklistIndexView,
  },
  {
    path: "/user/bot/",
    name: "user_bot_index",
    component: UserBotIndexView,
  },
  {
    path: "/404/",
    name: "404",
    component: NotFound,
  },
  {
    path: "/:catchAll(.*)",
    redirect: "/404/"
  },
  {
    path: "/user/account/login/",
    name: "user_account_login",
    component: UserAccountLogin
  },
  {
    path: "/user/account/register/",
    name: "user_account_register",
    component: UserAccountRegister
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
