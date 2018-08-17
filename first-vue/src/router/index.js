import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/HelloWorld'
import Login from '@/views/login/login.vue'


Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Login',
      component: Login
    }
  ],
  dev : {
    env: require('./dev.env'),
    proxyTable: {
      '/api': {
        target: 'http://127.0.0.1:8888',
        changeOrigin: true,
        pathRewrite: {
          '^api': ''
        }
      }
    }

  }
})
