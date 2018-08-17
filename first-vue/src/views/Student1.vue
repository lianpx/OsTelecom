<template>
    <div class="Student">
        <h1>考生信息</h1>
        <mt-cell title="姓名" value="覃蕊"></mt-cell>
        <mt-cell title="电话" value="17789875774"></mt-cell>
        <mt-cell title="邮箱" value="17789875774@189.cn"></mt-cell>
        <mt-cell title="单位" value="海南电信"></mt-cell>
        <mt-cell title="部门" value="网络监控维护中心"></mt-cell>
        <mt-cell title="岗位" value="网络监控维护"></mt-cell>
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
                this.$router.push({name: 'Admin'});
            } 
    } 
};
</script>
<style>
.btns{
text-align: center;
}
</style>
