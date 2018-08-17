import Vue from 'vue'
import { Cell,Field,Button,Header,Popup } from 'mint-ui'
import { Radio } from 'mint-ui';
import 'mint-ui/lib/style.css'
import App from './App.vue'
import router from './router'
import store from './store'
import myDatepicker from 'vue-datepicker/vue-datepicker-es6.vue';



Vue.component(Radio.name, Radio);
Vue.component(Field.name, Field);
Vue.component(Cell.name,Cell);
Vue.component(Button.name, Button);
Vue.component(Header.name, Header)
Vue.component(Popup.name,Popup)

Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
