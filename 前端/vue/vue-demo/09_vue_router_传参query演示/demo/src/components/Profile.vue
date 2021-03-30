<!--  -->
<template>
  <div>
    我是profile
    <p>{{ $route.query.username }}</p>
    <p>{{ $route.query.age }}</p>
  </div>
</template>

<script>
export default {
  data() {
    return {};
  }
};
</script>
<style lang='scss' scoped>
</style>