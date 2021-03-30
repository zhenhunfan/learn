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
    children: [{
        path: '',
        redirect: 'news'
      },
      {
        path: 'news',
        component: () => import('../components/News')
      },
      {
        path: 'message',
        component: () => import('../components/Message')
      }
    ]
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router