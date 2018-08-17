<template>
<div class="inquiry"> 
    <mt-header title="考试成绩统计查询">
        <router-link to="/Admin" slot="left">
           <mt-button icon="back">返回</mt-button>
        </router-link>
    </mt-header>
        <mt-field label="考试名称" placeholder="请输入考试名称：" v-model="student_name"></mt-field>
<div class="btns">
        <mt-button @click = "pop()" type="danger">查询</mt-button>
</div>
</div>
</template> 
<script>
export default {
data() {
return {
student_name: "",
exam_id:"",
popupVisible:false
};
},
mounted() {
},
methods: {
pop(){
    this.$router.push({name: 'Total'});
}
}
};
</script>