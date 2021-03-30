<template>
  <div id="app">
    {{ msg }}
    <br />
    <button @click="btnClick">按钮</button>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "app",
  data() {
    return {
      msg: {}
    };
  },
  methods: {
    btnClick() {
      axios({
        url:
          "http://localhost/oa/Extensions/InvokeCenter/WebServices/Framework/FrameworkWebServices.asmx/IsAuthenticateJSON",
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
