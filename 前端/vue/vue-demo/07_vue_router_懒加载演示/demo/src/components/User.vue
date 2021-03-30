<!--  -->
<template>
  <div>{{ username }}</div>
</template>

<script>
export default {
  data() {
    return {
      username: this.$route.params.username
    };
  }
};
</script>