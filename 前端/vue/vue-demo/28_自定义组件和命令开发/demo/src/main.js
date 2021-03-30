import Vue from 'vue'
import App from './App.vue'
import toast from './plugins/toast'
import rotate from "./plugins/rotate"

Vue.config.productionTip = false
Vue.use(toast)
Vue.use(rotate)

new Vue({
  render: function (h) {
    return h(App)
  },
}).$mount('#app')