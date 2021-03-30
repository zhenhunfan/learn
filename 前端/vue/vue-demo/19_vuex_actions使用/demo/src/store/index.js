import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    counter: 0
  },
  mutations: {
    increment(state) {
      state.counter++
    }
  },
  actions: {
    incre(context) {
      return new Promise((resolve) => {
        setTimeout(() => {
          context.commit("increment")
          resolve("我完成了")
        }, 1000);
      })
    }
  },
  modules: {}
})