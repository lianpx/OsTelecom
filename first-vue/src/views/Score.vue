<template>
    <div class="Score">
    <mt-header title="考试成绩查询">
    </mt-header>
    <div class='search'>
        <mt-field label="考试名称：" placeholder="请输入考试名" v-model="exam_name"></mt-field>
    </div>
    
    <br>
    <div class="btns">
        <mt-button @click="func()" type="default" class="returnButton">返回</mt-button>
        <mt-button @click="search()" type="default" class="button">查询</mt-button>
    </div>
        
    <br>
    <br>

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
                <th>考生姓名</th>
                <td>{{ item.userName }}</td>
            </tr>
            <tr>
                <th>考试成绩</th>
                <td>{{ item.score }}</td>
            </tr>
        </table>
    </ul>



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
            userName: '',
            scoreScore: '',
            userInfo: {}
        };
    },
    mounted () {
        let userInfo = localStorage.getItem('userinfo');
        // console.log('text', userInfo)
        this.userInfo = JSON.parse(userInfo)
        console.log(this.userInfo)
        //console.log('test', JSON.parse(userInfo))
    },
    methods: {
        search:function () {
            let exam_name = this.exam_name;
            let userId = this.userInfo.userId;
            var url= 'http://127.0.0.1:8888/score/showUserScore?userId='+userId+'&examName='+ exam_name;
            //alert(url);
            fetch(url)
            .then((response) => {
                return response.json()
            }).then((json) => {
                this.lists = json
                // alert(this.lists)
                // this.examId = json.examId;
                // this.examName = json.examName;
                // this.examSubject = json.examSubject;
                // this.examProvince = json.examProvince;
                // this.userName= json.userName;
                // this.scoreScore = json.scoreScore;
            })
        },
        func () {
                this.$router.push({name: 'Stumain'});
        } 
    },
};
</script>

<style>
    .btns{
        text-align: center;
    }
    .returnButton {
        position: absolute;
        left: 0px;
    }
    .button {
        position: absolute;
        right: 0px;
    }

</style>
