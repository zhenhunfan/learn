export default {
    state: {
        counter1: 1
    },
    mutations: {
        increment(state) {
            state.counter1++
        }
    },
    actions: {
        incre(context) {
            return new Promise(resolve => {
                setTimeout(() => {
                    context.commit("increment")
                    resolve("我是actions里的incre")
                }, 1000);
            })
        }
    },
    getters: {
        powercounter(state) {
            return state.counter1 * 2
        },
        power2(state, getters, rootState) {
            return getters.powercounter + rootState.counter2
        }
    }
}