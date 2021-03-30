import Vue from 'vue'
import App from './App.vue'
import  './assets/fonts/font.scss'
import ZhfButton from './components/button.vue'
import ZhfDialog from './components/dialog.vue'
import ZhfInput from './components/input.vue'
import ZhfSwitch from './components/switch.vue'
import ZhfRadio from './components/radio.vue'
import ZhfRadioGroup from './components/radio-group.vue'
import ZhfCheckbox from './components/checkbox.vue'
import ZhfCheckboxGroup from './components/checkbox-group.vue'
import ZhfForm from './components/form.vue'
import ZhfFormItem from './components/form-item.vue'

Vue.component(ZhfButton.name,ZhfButton)
Vue.component(ZhfDialog.name,ZhfDialog)
Vue.component(ZhfInput.name,ZhfInput)
Vue.component(ZhfSwitch.name,ZhfSwitch)
Vue.component(ZhfRadio.name,ZhfRadio)
Vue.component(ZhfRadioGroup.name,ZhfRadioGroup)
Vue.component(ZhfCheckbox.name,ZhfCheckbox)
Vue.component(ZhfCheckboxGroup.name,ZhfCheckboxGroup)
Vue.component(ZhfForm.name,ZhfForm)
Vue.component(ZhfFormItem.name,ZhfFormItem)

Vue.config.productionTip = false

new Vue({
  render: h => h(App),
}).$mount('#app')
