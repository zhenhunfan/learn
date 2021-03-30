<template>
  <div id="app">
    <button @click="homeClick">home</button>
    <button @click="aboutClick">about</button>
    <router-view />
  </div>
</template>
<script>
export default {
  name: "App",
  methods: {
    homeClick() {
      this.$router.push("/home");
    },
    aboutClick() {
      this.$router.push("/about");
    }
  }
};
</script>
<style>
</style>
