<template>
  <div class="home">
    我是home
    <router-link :to="profile">profile</router-link>
    <hr />
    <div>
      <router-view></router-view>
    </div>
  </div>
</template>

<script>
export default {
  name: "home",
  data() {
    return {
      profile: {
        path: "/home/profile",
        query: {
          username: "张鈜",
          age: 31
        }
      }
    };
  }
};
</script>
