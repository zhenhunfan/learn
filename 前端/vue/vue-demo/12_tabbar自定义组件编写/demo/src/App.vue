<template>
  <div id="app">
    <router-view></router-view>
    <Main-tab-bar></Main-tab-bar>
  </div>
</template>

<script>
import MainTabBar from "./components/MainTabBar";

export default {
  components: { MainTabBar }
};
</script>

<style>
</style>
