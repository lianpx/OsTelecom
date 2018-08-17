<template>
    <div class="Student">
        <h1>考生信息</h1>

        <mt-field label="编号" :readonly="isReadOnly" > {{ this.userInfo.userId }}</mt-field>
        <mt-field label="姓名" :readonly="isReadOnly" @click="showToggle" >
            <input :readonly="isReadOnly" v-model="userName" v-show ="isShowInput">
            <p v-show="isShow" v-on:click="edit">{{ userName }}</p>
        </mt-field>
        <!-- 应覃姐姐要求屏蔽该字段 -->
        <!-- <mt-cell title="密码"> {{ this.userInfo.userPwd }} </mt-cell> -->
        <!-- <mt-cell title="权限"> {{ this.userInfo.userRole }}</mt-cell> -->
        <!-- <mt-field label="姓名" :readonly="isReadOnly" > {{ this.userInfo.userName }} </mt-field> -->
        <mt-field label="电话" :readonly="isReadOnly" > {{ this.userInfo.userPhone }}</mt-field>
        <mt-field label="邮箱" :readonly="isReadOnly" > {{ this.userInfo.userEmail }} </mt-field>
        <mt-field label="部门" :readonly="isReadOnly" > {{ this.userInfo.userDepartment }}</mt-field>
        <mt-field label="科室" :readonly="isReadOnly" > {{ this.userInfo.userJob }}</mt-field>
        <mt-field label="省份" :readonly="isReadOnly" > {{ this.userInfo.userProvince }}</mt-field>
        <br>
        <br>    
        <div class="btns">
            <mt-button @click="showToggle()" type="default">修改</mt-button> 
            <mt-button @click="editSave()" type="default">保存</mt-button>
            <mt-button @click="returnUp()" type="default">返回</mt-button>
        </div>
    </div>
</template>


<script>
export default {
    data() {
        return {
            userName: '',
            isReadOnly: true,
            userInfo: {},
            isShow:true,
            isShowInput: false

            //username: ""
        };
    },
    mounted () {
        let userInfo = localStorage.getItem('userinfo');
        // console.log('text', userInfo)
        this.userInfo = JSON.parse(userInfo)
        console.log(this.userInfo)
        this.userName = this.userInfo.userName
        alert("userName= " + userName)
        console.log(this.userInfo.userName)
        //console.log('test', JSON.parse(userInfo))
    },
    methods: {
        
        showToggle:function(){
            // this.isShow = !this.isShow
            // if(this.isShow){
            //     this.btnText = "隐藏"
            // }else{
            //     this.btnText = "显示"
            // }
        },
        edit:function(){
            this.isShow = !this.isShow
            this.isShowInput = !this.isShowInput
            if(this.isShow){
                this.btnText = "隐藏"
            }else{
                this.btnText = "显示"
            }
        },


        handleEdit () {
            this.isReadOnly = false
            this.name.style = hidden
        },
        editSave () {
            Toast('保存成功！');
        },
        returnUp () {
            this.$router.push({name: 'Stumain'});
        } 
    } 
};
</script>
<style>
    .btns{
        text-align: center;
    }
    /* .inputKK {
        display: none;
    } */
</style>
