<template>
  <div>
    <p>我是Home</p>
    <router-link to="/home/news">new</router-link>
    <router-link to="/home/msg">msg</router-link>

    <router-view></router-view>
  </div>
</template>

<script>
export default {
  data() {
    return {};
  },
  created() {
    console.log("home created");
  },
  destroyed() {
    console.log("home destroyed");
  }
};
</script>
<style lang='scss' scoped>
</style>