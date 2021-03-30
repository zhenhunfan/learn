<template>
  <div id="app">
    {{ msg }}
    <br />
    <button @click="btnClick">按钮</button>
  </div>
</template>

<script>
import * as requests from "./network/request";

export default {
  name: "app",
  data() {
    return {
      msg: "我是初始数据"
    };
  },
  methods: {
    btnClick() {
      requests
        .framworkRequest({
          url: "/IsAuthenticateJSON",
          method: "get",
          params: {
            userName: "admin",
            passWord: "",
            esn: "",
            clientId: ""
          }
        })
        .then(result => {
          this.msg = result;
        })
        .catch(err => {
          this.msg = err;
        });
    }
  }
};
</script>
