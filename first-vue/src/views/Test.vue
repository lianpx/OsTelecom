<template>
    <div class="Test">
        <h1>考试信息</h1>
        <div class='search'>
            <mt-field label="考试名称：" placeholder="请输入考试名" v-model="exam_name"></mt-field>
        </div>

        <div class="btns">
            <mt-button @click="func()" type="default" class="returnButton">返回</mt-button>
            <mt-button @click="search()" type="default" class="button">查询</mt-button>
        </div>
        
        
        <br><br><br>
        <ul id="scoreTable" v-for="item in lists" v-bind:key="item">
            <table>
                <tr>
                    <th>考试编码</th>
                    <td>{{ item.examId }}</td>
                </tr>
                <tr>
                    <th>考试名称</th>
                    <td>{{ item.examName }}</td>
                </tr>
                <tr>
                    <th>考试科目</th>
                    <td>{{ item.examSubject }}</td>
                </tr>
                <tr>
                    <th>考试省份</th>
                    <td>{{ item.examProvince }}</td>
                </tr>
                <tr>
                    <th>考试开始时间</th>
                    <td>{{ item.examStartDate | formatDate  }}</td>
                </tr>
                <tr>
                    <th>考试结束时间</th>
                    <td>{{ item.examEndDate | formatDate }}</td>
                </tr>
                <tr>
                    <th>考试结束时间</th>
                    <td>{{ item.examDeadlineTime | formatDate }}</td>
                </tr>
                <tr>
                    <th>考试信息</th>
                    <td>{{ item.examRemark }}</td>
                </tr>
            </table>
            <br>
            <br>
        </ul>


        <!-- <mt-cell title="考试编码"> {{ examId }}</mt-cell>
        <mt-cell title="考试名称"> {{ examName }}</mt-cell>
        <mt-cell title="考试科目"> {{ examSubject }}</mt-cell>
        <mt-cell title="考试省份" > {{ examProvince }}</mt-cell>
        <mt-cell title="考试开始时间"> {{ examStartDate | formatDate }}</mt-cell>
        <mt-cell title="考试结束时间"> {{ examEndDate | formatDate }}</mt-cell>
        <mt-cell title="报名截止时间"> {{ examDeadlineTime | formatDate }}</mt-cell>
        <mt-cell title="考试信息">{{ examRemark }}</mt-cell> -->


    </div>
</template>

<script>
    export default {
        data() {
            return {
                lists: '',
                examId: '',
                examName: '',
                examSubject: '',
                examProvince: '',
                examStartDate: '',
                examEndDate: '',
                examDeadlineTime: '',
                examRemark: ''
            };
        },
        filters: {
            formatDate: function (value) {
                let date = new Date(value);
                let y = date.getFullYear();
                let MM = date.getMonth() + 1;
                MM = MM < 10 ? ('0' + MM) : MM;
                let d = date.getDate();
                d = d < 10 ? ('0' + d) : d;
                let h = date.getHours();
                h = h < 10 ? ('0' + h) : h;
                let m = date.getMinutes();
                m = m < 10 ? ('0' + m) : m;
                let s = date.getSeconds();
                s = s < 10 ? ('0' + s) : s;
                return y + '-' + MM + '-' + d + ' ' + h + ':' + m + ':' + s;
            }
        },
        methods: {
            search:function () {
                let exam_name = this.exam_name;
                var url= 'http://127.0.0.1:8888/exam/showExamByExamName?examName='+exam_name;
                // alert(url);
                fetch(url)
                .then((response) => {
                    return response.json()
                }).then((json) => {
                    this.lists = json
                    // this.examId = json.examId;
                    // this.examName = json.examName;
                    // this.examSubject = json.examSubject;
                    // this.examProvince = json.examProvince;
                    // this.examStartDate= json.examStartDate;
                    // this.examEndDate = json.examEndDate;
                    // this.examDeadlineTime = json.examDeadlineTime;
                    // this.examRemark = json.examRemark;
                })
            },
            func () {
                this.$router.push({name: 'Stumain'});
            } 
        } 
    };
</script>

<style>
    .btns{
    text-align: center;
    }
</style>

