import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [{
    path: '/',
    redirect: '/home'
  },
  {
    path: '/home',
    component: () => import('../components/Home'),
    meta: {
      title: '首页'
    }
  },
  {
    path: '/profile',
    component: () => import('../components/Profile'),
    meta: {
      title: '我的'
    }
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

router.beforeEach((to, from, next) => {
  debugger;
  document.title = to.meta.title
  next()
})

export default router