<!--  -->
<template>
  <div>
    {{ msg }}
    <router-link to="/home/news">新闻</router-link>
    <router-link to="/home/message">消息</router-link>
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  data() {
    return {
      msg: "我是Home"
    };
  }
};
</script>