<template>
  <div class="Load">
    <div class="logo">
      <br>
        <img src="@/assets/telecom.png" width="50%" height="40%">
      <br>
      <br>
    </div>

    <div class="laod">
      <mt-field class="mycenter" label="用户名：" placeholder="请输入用户名" v-model="user_name"></mt-field>
      <mt-field class="mycenter" label="密码：" placeholder="请输入密码" type="password" v-model="user_pwd"></mt-field>
      <!-- <mt-field label="用户名：" placeholder="请输入用户名" v-model="user_name"></mt-field>
      <mt-field label="密码" placeholder="请输入密码" type="password" v-model="user_pwd"></mt-field> -->
    </div>
    <br><br><br>
    <div>
      <mt-button class="mycenter" id="btn" @click="loginget()" type="primary" size="large">登录</mt-button>
      <br>
      <mt-button class="mycenter" id="btn" @click="returnHome()" type="primary" size="large">返回</mt-button>
      <!-- <mt-button @click="loginget()" type="primary" size="large" >登录</mt-button> -->
      <!-- <mt-button @click="returnHome()" type="primary" size="large">返回</mt-button> -->
    </div>
  </div>
  

</template>


<script>
export default {
  data(){
    return{
      user_name:"",
      user_pwd: "",
      value: "",
    };
  },
  methods: {
    loginget:function(){
      let user_name = this.user_name;
      let user_pwd = this.user_pwd;
      //alert(user_pwd);
      var url= 'http://127.0.0.1:8888/user/login1?userId='+user_name+'&userPwd='+user_pwd;
      //alert(url);
      fetch(url)
      .then((response) => {
          // console.log(response);
          // alert(response.get);
          // alert("response:"+data);
          return response.json()
      }).then((json) => {
        // this.$router.push({name: 'User',params:{ id:'User'}});
        console.log(json.userId)
        localStorage.setItem('userinfo', JSON.stringify(json))
        this.$router.push({name: 'Admin',
          params:{ 
            userId: json.userId,
            userName: json.userName,
            userPwd: json.userPwd,
            userRole: json.userRole,
            userPhone: json.userPhone,
            userEmail: json.userEmail,
            userDepartment: json.userDepartment,
            userJob: json.userJob,
            userProvince: json.userProvince,
          }
        });
      })
      .catch(function(e) {
        alert("Oops, error");
      });
    },
    returnHome () {
        this.$router.push({name: 'Home',params:{ id:'home'}});
    }
  }
};



</script>

<style>
.logo{
  text-align: center;
}
#btn{
    width: 50%;
   background: #33bdef;
  background-image: -webkit-linear-gradient(top, #33bdef, #019ad2);
  background-image: -moz-linear-gradient(top, #33bdef, #019ad2);
  background-image: -ms-linear-gradient(top, #33bdef, #019ad2);
  background-image: -o-linear-gradient(top, #33bdef, #019ad2);
  background-image: linear-gradient(to bottom, #33bdef, #019ad2);
  -webkit-border-radius: 6;
  -moz-border-radius: 6;
  border-radius: 6px;
  text-shadow: 0px -1px 0px #5b6178;
  -webkit-box-shadow: 0px 1px 0px 0px #f0f7fa;
  -moz-box-shadow: 0px 1px 0px 0px #f0f7fa;
  box-shadow: 0px 1px 0px 0px #f0f7fa;
  font-family: Arial;
  color: #ffffff;
  font-size: 16px;
  padding: 12px 30px 12px 30px;
  border: solid #057fd0 1px;
  text-decoration: none;
}
#btn:hover {
     color: #ffffff;
  background: #019ad2;
  text-decoration: none;
}
.mycenter {
  margin: 0 auto;
}
</style>