import index from "./src/index.vue"
export default {
    install(Vue) {
        Vue.component(index.name, index)
    }
}