<template>
    <div>
        <mt-header title="学生主页"> 
        <router-link to="/UserSignUp" slot="left">
            <mt-button icon="back">返回</mt-button>
        </router-link>
        
        </mt-header>
        <br>
        <br><br>
        <mt-button id="btn" class="mycenter" @click="ToS" type="primary" size="large" plain>个人信息</mt-button>
<br>
<br>
        <mt-button id="btn" class="mycenter" @click="ToT" type="primary" size="large" plain>考试信息</mt-button>
<br>
<br>
        <mt-button  id="btn" class="mycenter" @click="ToC" type="primary" size="large" plain>成绩查询</mt-button>
            <div>
                <mt-popup
                    v-model="popupVisible"
                    popup-transition="popup-fade">
                    <div>12341</div>
                </mt-popup>
            </div>
    </div>
    
</template>
<script>
export default {
    name: 'Stumain',
    data () {
        return {
            popupVisible: false,
        }
    },
    methods: {
        ToS () {
                this.$router.push({name: 'Student'});
            },
        ToT () {
                this.$router.push({name: 'Test'});
            },
        ToC () {
                this.$router.push({name: 'Score'});
            } 
    } 

};


</script>
<style>
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


    
    



