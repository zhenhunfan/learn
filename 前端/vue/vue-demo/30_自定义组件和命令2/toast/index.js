import toast from './src/Toast'

const obj = {
    install(Vue) {
        console.log(Vue)
        //1.创建组件构造器
        const constructor = Vue.extend(toast);
        //2.new的方式创建出一个组件对象
        const Toast = new constructor();

        //3.将组件对象手动挂载到某个对象上
        Toast.$mount(document.createElement("div"));
        //4.Toast.$el就是对应div
        document.body.appendChild(Toast.$el);
        Vue.prototype.$toast = Toast
    }
}

export default obj