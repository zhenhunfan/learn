import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    counter: 0
  },
  mutations: {
    increment(state, payload) {
      state.counter += payload.count + payload.count2
    }
  },
  actions: {},
  modules: {}
})