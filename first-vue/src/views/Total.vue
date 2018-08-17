<template>
<div id="app">
<div id="nav">
<mt-header title="考生成绩统计">
<router-link to="/Admin" slot="left">
<mt-button icon="back">返回</mt-button>
</router-link>
</mt-header>
<div id="main"></div>

</div>
</div>
</template>

<script>
const echarts = require("echarts");
import "whatwg-fetch";
export default {
mounted() {
this.draw();
this.getJson();
},
methods: {
draw() {
let myChart = echarts.init(document.getElementById("main"));
myChart.setOption({

tooltip: {},
xAxis: {
data: ["<60分", "60-69分", "70-79分", "80-89分", ">90分"]
},
yAxis: {},
series: [
{
name: "数量",
type: "bar",
data: [5, 20, 36, 10, 10]
}
]
});
},
getJson() {
fetch("http://172.20.155.152:3001/test") 
.then(function(response) {
return response.json();
})
.then(function(json) {
alert(json.msg);
console.log("json", json);
})
.catch(function(ex) {
console.log("parsing failed", ex);
});
}
}
}
</script>
<style>
#app {
font-family: 'Avenir', Helvetica, Arial, sans-serif;
-webkit-font-smoothing: antialiased;
-moz-osx-font-smoothing: grayscale;
text-align: left;
color: #2c3e50;
}
#nav {
padding: 30px;
}

#nav a {
font-weight: bold;
color: #2c3e50;
}

#main {
height: 200px;
width: 100%;
}

#nav a.router-link-exact-active {
color: #42b983;
}
</style>