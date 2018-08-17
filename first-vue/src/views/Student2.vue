<template>
    <div class="Student">
        <h1>考生信息</h1>
        <mt-field label="编号" :readonly="isReadOnly" > {{ this.$route.params.userId }}</mt-field>
        <!-- <mt-field label="姓名" :readonly="isReadOnly" @click="showToggle" >
            <input :readonly="isReadOnly" v-model="userName" v-show ="isShowInput">
            <p v-show="isShow" v-on:click="edit">{{ userName }}</p>
        </mt-field> -->
        <!-- 应覃姐姐要求屏蔽该字段 -->
        <!-- <mt-cell title="密码"> {{ userPwd }} </mt-cell> -->
        <!-- <mt-cell title="权限"> {{ userRole }}</mt-cell> -->
        <mt-field label="姓名" :readonly="isReadOnly" > {{ this.$route.params.userName }} </mt-field>
        <mt-field label="电话" :readonly="isReadOnly" > {{ this.$route.params.userPhone }}</mt-field>
        <mt-field label="邮箱" :readonly="isReadOnly" > {{ this.$route.params.userEmail }} </mt-field>
        <mt-field label="部门" :readonly="isReadOnly" > {{ this.$route.params.userDepartment }}</mt-field>
        <mt-field label="科室" :readonly="isReadOnly" > {{ this.$route.params.userJob }}</mt-field>
        <mt-field label="省份" :readonly="isReadOnly" > {{ this.$route.params.userProvince }}</mt-field>
        <div class="btns">
        <mt-button type="default">修改</mt-button> 
        <mt-button @click="func()" type="default">返回</mt-button>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            username: ""
        };
    },
    methods: {
        func () {
            this.$router.push({name: 'Check1'});
        } 
    } 
};
</script>
<style>
    .btns{
        text-align: center;
    }
</style>
