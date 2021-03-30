import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    msg: '我是vuex'
  },
  mutations: {
    changeMsg(state) {
      state.msg = "我改变了";
    }
  },
  actions: {},
  modules: {}
})