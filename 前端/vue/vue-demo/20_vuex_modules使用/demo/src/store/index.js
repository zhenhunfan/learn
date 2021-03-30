import Vue from 'vue'
import Vuex from 'vuex'
import ModuleA from './moduleA'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    counter: 0,
    counter2: 100
  },
  mutations: {},
  actions: {},
  modules: {
    ModuleA
  },
  getters: {
    abc() {
      return 100;
    }
  }
})