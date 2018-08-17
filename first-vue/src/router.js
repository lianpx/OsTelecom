import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'
import UserSignUp from './views/UserSignUp.vue'
import Manager from'./views/Manager.vue'
import Student from './views/Student.vue'
import Student1 from './views/Student1.vue'
import Student2 from './views/Student2.vue'
import Test from './views/Test.vue'
import Stumain from './views/Stumain'
import Score from './views/Score'
import Exam from './views/Exam'
import Admin from './views/Admin'
import Total from './views/Total'
import ManagerSignUp from './views/ManagerSignUp.vue'
import Check from './views/Check.vue'
import Check1 from './views/Check1.vue'
import Check2 from './views/Check2.vue'

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/Check2',
      name: 'Check2',
      component: Check2
    },
    {
      path: '/Check1',
      name: 'Check1',
      component: Check1
    },
    {
      path: '/Check',
      name: 'Check',
      component: Check
    },
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path: '/Total',
      name: 'Total',
      component: Total
    },
    {
      path: '/Admin',
      name: 'Admin',
      component: Admin
    },
    {
      path: '/Exam',
      name: 'Exam',
      component: Exam
    },
    {
      path: '/Score',
      name: 'Score',
      component: Score
    },
    {
      path: '/Stumain',
      name: 'Stumain',
      component: Stumain
    },
    {
      path: '/Test',
      name: 'Test',
      component: Test
    },
    {
      path: '/Student1',
      name: 'Student1',
      component: Student1
    },
    {
      path: '/Student2',
      name: 'Student2',
      component: Student2
    },
    {
      path: '/Student',
      name: 'Student',
      component: Student
    },
    {
      path: '/ManagerSignUp',
      name: 'ManagerSignUp',
      component: ManagerSignUp
    },
    {
      path: '/UserSignUp',
      name: 'UserSignUp',
      component: UserSignUp
    },
    {
      path: '/Manager',
      name: 'Manager',
      component: Manager
    },
    // {
    //   // path: '/about',
    //   // name: 'about',
    //   // route level code-splitting
    //   // this generates a separate chunk (about.[hash].js) for this route
    //   // which is lazy-loaded when the route is visited.
    //   // component: () => import(/* webpackChunkName: "about" */ './views/About.vue')
    // }
  ]
})
