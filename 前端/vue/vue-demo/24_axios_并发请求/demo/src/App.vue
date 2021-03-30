<template>
  <div id="app">
    <button @click="btnClick">按钮</button>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "app",
  methods: {
    btnClick() {
      axios
        .all([
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
          }),
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
        ])
        // .then(results => {
        //   for (let result of results) {
        //     console.log(result);
        //   }
        // });
        .then(
          axios.spread((res1, res2) => {
            console.log(res1);
            console.log(res2);
          })
        );
    }
  }
};
</script>
