export default {
    install(Vue,options){
        Vue.directive('rotate',{
            bind(){
                let [el,...other] =  arguments
                el.onmouseover = function(){
                    el.style.display = "inline-block"
                    el.style.transition = "all 0.5s"
                    el.style.transform = "rotateZ(360deg)"
                }
                el.onmouseleave = function(){
                    el.style.transform = "rotateZ(0deg)"
                }
            }
        })
        
    }
}