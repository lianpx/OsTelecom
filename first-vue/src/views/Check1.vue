<template>
    <div class="inquiry"> 
        <mt-header title="考生信息维护">
            <router-link to="/Admin" slot="left">
            <mt-button icon="back">返回</mt-button>
            </router-link>
        </mt-header>

        <mt-field label="考生编号" placeholder="请输入考生编号" v-model="userId"></mt-field>
        <mt-field label="考生姓名" placeholder="请输入考生姓名" v-model="userName"></mt-field>

        <br><br><br>
        <div class="btns">
            <mt-button @click="loginget()" type="danger">查询</mt-button>
        </div>
    </div>
</template> 

<script>
export default {
    data() {
        return {
            userId: "",
            userName:"",
            popupVisible:false
        };
    },
    mounted() {
    
    },
    methods: {
        loginget:function() {
        let userId = this.userId;
        let userName = this.userName;
        //alert(user_pwd);
        var url = '';
        if (userId > 0 && userName != '') {
            url= 'http://127.0.0.1:8888/user/showUserInfo?userId='+userId+'&userName='+userName;
        } else if (userId > 0 && userName == '') {
            url= 'http://127.0.0.1:8888/user/showUser?userId='+userId;
        } else if (userId > 0 && userName == '') {
            url= 'http://127.0.0.1:8888/user/showUserByName?userName='+userName;
        } else {

        }
        //alert(url);
        fetch(url)
        .then((response) => {
            // console.log(response);
            // alert(response.get);
            // alert("response:"+data);
            return response.json()
        }).then((json) => {
            // this.$router.push({name: 'User',params:{ id:'User'}});
            // console.log(json.userId)
            // localStorage.setItem('userinfo', JSON.stringify(json))
            this.$router.push({name: 'Student2',
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
        pop(){
            this.$router.push({name: 'Student2'});
        }
    }
};
</script>