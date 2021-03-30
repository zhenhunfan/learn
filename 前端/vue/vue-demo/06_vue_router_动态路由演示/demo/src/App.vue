<template>
  <div id="app">
    <router-link :to="'/user/' + username">用户</router-link>
    <router-view></router-view>
  </div>
</template>
<script>
export default {
  name: "App",
  data() {
    return {
      username: "张鈜"
    };
  }
};
</script>
<style>
</style>
