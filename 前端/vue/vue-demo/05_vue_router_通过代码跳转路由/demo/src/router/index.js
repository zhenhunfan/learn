import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [{
    path: '/home',
    name: 'home',
    component: function () {
      return import('../views/Home.vue')
    }
  },
  {
    path: '/about',
    name: 'about',
    component: function () {
      return import('../views/About.vue')
    }
  },
  {
    path: '/',
    redirect: '/home'
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router