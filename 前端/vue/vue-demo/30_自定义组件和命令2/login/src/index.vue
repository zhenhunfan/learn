<template>
  <div>
    <div>
      <input
        type="text"
        name="username"
        :placeholder="usernamePlaceholder"
        v-model="username"
      />
    </div>
    <div>
      <input
        type="text"
        name="password"
        :placeholder="passwordPlaceholder"
        v-model="password"
      />
    </div>
    <div>
      <button @click="login">登录</button>
    </div>
  </div>
</template>

<script>
export default {
  name: "zhenhunfan-mmp-login",
  components: {},
  props: {
    usernamePlaceholder: {
      type: String,
      default: "",
      editor: {
        type: "el-input",
        label: "用户名输入框placehoder",
        require: true,
      },
    },
    passwordPlaceholder: {
      type: String,
      default: "",
      editor: {
        type: "el-input",
        label: "密码输入框placehoder",
        require: true,
      },
    },
  },
  events: {},
  data() {
    return {
      username: "",
      password: "",
    };
  },
  computed: {},
  watch: {},
  created() {},
  mounted() {},
  methods: {
    login() {
      alert(1);
    },
  },
  couldEditMehtod: ["login"],
};
</script>
<style scoped>
.table {
}
</style>