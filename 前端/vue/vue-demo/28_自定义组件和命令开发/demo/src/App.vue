<template>
  <div id="app">
    <button @click="btnClick">按钮</button>

    <span v-rotate>啊</span>
  </div>
</template>

<script>
export default {
  name: "app",
  methods: {
    btnClick() {
      this.$toast.show("哈哈哈");
    },
  },
};
</script>
