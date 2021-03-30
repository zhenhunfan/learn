import Vue from 'vue'
import Vuex from 'vuex'
import * as types from './mutations.types'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    counter: 0
  },
  mutations: {
    [types.INCREMENT](state) {
      state.counter++
    }
  },
  actions: {},
  modules: {}
})