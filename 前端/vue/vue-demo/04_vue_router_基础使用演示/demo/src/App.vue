<template>
  <div id="app" class="app">
    <h3>首页</h3>
    <router-link to="/home">home</router-link>
    <router-link to="/about">about</router-link>
    <router-view></router-view>
  </div>
</template>

<style scoped>
.app {
  text-align: center;
}
</style>
