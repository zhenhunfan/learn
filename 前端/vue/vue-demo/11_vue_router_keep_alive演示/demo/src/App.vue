<template>
  <div id="app">
    <div id="nav">
      <router-link to="/home">Home</router-link> |
      <router-link to="/profile">profile</router-link>
    </div>
    <keep-alive>
      <router-view />
    </keep-alive>
  </div>
</template>


