<template>
  <div id="app">
  <!--<mt-button type="danger">销售汇报</mt-button>-->
  <!--<div class="test">China</div>-->
    <div id="nav">

            <!-- <router-link to="/">考生角色</router-link> 
            <router-link to="/about">管理员角色</router-link>
            <router-link to="/page1">page1</router-link> -->
    </div>
    <router-view />

  </div>
</template>

<script>
const echarts = require("echarts");
 import "whatwg-fetch";
  export default {
  props: {
  },
  
  mounted() {
   // this.draw();
    //this.getJson();
  },
  methods: {
    draw() {
      let myChart = echarts.init(document.getElementById("main"));
      myChart.setOption({
        title: {
          text: "ECharts 入门示例"
        },
        tooltip: {},
        xAxis: {
          data: ["衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子"]
        },
        yAxis: {},
        series: [
          {
            name: "销量",
            type: "bar",
            data: [5, 20, 36, 10, 10, 20]
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

</style>
