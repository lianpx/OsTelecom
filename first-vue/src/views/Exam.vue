<template> 
    <div class="exam">
        <mt-header title="考试信息发布">
            <router-link to="/Admin" slot="left">
                <mt-button icon="back">返回</mt-button>
            </router-link>
        </mt-header>
        <mt-field label="考试名称" placeholder="请输入考试编码" v-model="examid"></mt-field>
        <mt-field label="考试名称" placeholder="请输入考试名称" v-model="examname"></mt-field>
        <mt-field label="考试科目" placeholder="请输入科目" v-model="examsubject"></mt-field>
        <mt-field label="考试省份" placeholder="请输入省份" v-model="examProvince"></mt-field>
        <mt-field label="考试开始时间" placeholder="请输入开始时间" v-model="date1"></mt-field>
        <mt-field label="考试结束时间" placeholder="请输入结束时间" v-model="date2"></mt-field>
        <mt-field label="报名截止时间" placeholder="请输入截止时间" v-model="date3"></mt-field>
        <mt-field label="考试大纲" placeholder="请输入考试大纲" v-model="remark"></mt-field>
        <div class="btns">
            <mt-button type="default">修改</mt-button>
            <mt-button type="default">保存</mt-button>
            <mt-button  @click="submit()" type="default">发布</mt-button>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            examid: "",
            examname: "",
            examsubject:"",
            examProvince:"",
            date1:"",
            date2:"",
            date3:"",
            remark:""
        };
    },
    methods: {
        submit:function(){
            let examid = this.examid;
            let examname = this.examname;
            let examsubject = this.examsubject;
            let examProvince = this.examProvince;
            let date1 = this.date1;
            let date2 = this.date2;
            let date3 = this.date3;
            let remark = this.remark;
            //alert(user_pwd);
            var url= 'http://127.0.0.1:8888/exam/insertExam?examId='+examid
                    +'&examName='+examname
                    +'&examSubject='+examsubject
                    +'&examProvince='+examProvince
                    +'&examStartDate='+date1
                    +'&examEndDate='+date2
                    +'&examDeadlineTime='+date3
                    +'&examRemark='+remark;
            alert(url);
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
                // this.$router.push({name: 'Admin',
                //     params:{ 
                //         // userId: json.userId,
                //         // userName: json.userName,
                //         // userPwd: json.userPwd,
                //         // userRole: json.userRole,
                //         // userPhone: json.userPhone,
                //         // userEmail: json.userEmail,
                //         // userDepartment: json.userDepartment,
                //         // userJob: json.userJob,
                //         // userProvince: json.userProvince,
                //     }
                // });
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