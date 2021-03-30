export const mi = {
    data() {
        return {
            msg: '我是混入的msg',
            meth: '',
            mou: ''
        }
    },
    methods: {
        show() {
            this.meth = "我是混入的方法";
        }
    },
    mounted() {
        this.mou = "我是混入的生命周期函数"
    }
}