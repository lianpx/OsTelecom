<template>
  <div class="Home">
      <br>
      <img src="@/assets/telecom.png" alt="logo" width="50%" height="40%">
      <br>
      <h1 id="title">开源考试助手</h1>
      <div id="d1">
          <br>
          <br>
          <mt-button id="btn" @click = "func()"  >学生登录</mt-button>
      </div>
      <br>
      <br>
    <div id="d1">
        <mt-button id="btn" @click = "funA()"  >管理员登录</mt-button>
    </div>    
  </div>
  
</template>

<script>
export default {
  data(){
    return{
        
    };
  },
  methods: {
            func () {
                this.$router.push({name: 'UserSignUp'});
            },
            funA () {
                this.$router.push({name: 'ManagerSignUp'});
            },

        }
};
</script>


<style>
.Home{
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
#title{
    color: transparent;
background-color : blue;
text-shadow : rgba(255,255,255,0.5) 0 5px 6px, rgba(255,255,255,0.2) 1px 3px 3px;
-webkit-background-clip : text;
}
</style>
