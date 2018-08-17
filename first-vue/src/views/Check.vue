<template>
<div class="inquiry"> 
    <mt-header title="考生成绩查询">
        <router-link to="/Admin" slot="left">
           <mt-button icon="back">返回</mt-button>
        </router-link>
    </mt-header>
        <mt-field label="考生姓名" placeholder="请输入考生姓名" v-model="student_name"></mt-field>
        <mt-field label="准考证号" placeholder="请输入准考证号" v-model="exam_id"></mt-field>
    <div class="btns">
        <mt-button @click = "loginget()" type="danger">查询</mt-button>
        <mt-popup v-model="popupVisible" popup-transition="popup-fade">
            <br>考生姓名：{{userName}}<br>
            <br>考试名称：{{examName}}<br>
            <br>考试项目：{{examSubject}}<br>
            <br>考试成绩：{{score}}分<br>
        </mt-popup>
    </div>
</div>
</template> 
<script>
    export default {
        data() {
            return {
                userName: "",
                examName:"",
                examSubject:"",
                score: "",
                popupVisible:false
            };
        },
        mounted() {
        
        },
        methods: {
            loginget(){

                this.popupVisible=true;
            }
        }
    };
</script>